// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.app.contacts.ContactRequestDeclineDialog;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.ChatText;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, SyntheticTypes, MessageViewAdapterComponent, MessageHolder, 
//            j

final class com.skype.android.app.chat.a extends MessageViewAdapter
    implements android.view.View.OnClickListener
{
    private static final class a extends j
    {

        Button acceptButton;
        ImageView badgeImage;
        ViewGroup buttonContainer;
        PathClippedImageView contactImage;
        Button declineButton;
        Future imageFuture;
        TextView messageText;
        TextView titleText;

        public a(View view)
        {
            super(view);
            contactImage = (PathClippedImageView)view.findViewById(0x7f10031d);
            badgeImage = (ImageView)view.findViewById(0x7f10031e);
            titleText = (TextView)view.findViewById(0x7f10031f);
            messageText = (TextView)view.findViewById(0x7f100320);
            acceptButton = (Button)view.findViewById(0x7f100274);
            declineButton = (Button)view.findViewById(0x7f100275);
            buttonContainer = (ViewGroup)view.findViewById(0x7f100321);
        }
    }


    private static final int supportedMessageTypes[];
    ChatText chatText;
    ContactUtil contactUtil;
    ImageCache imageCache;
    AsyncCallback imageCallback;
    private long lastShowingButtonTimestamp;
    SkyLib lib;
    FormattedMessageCache messageCache;
    NotificationManager notificationManager;
    private a previousButtonHolder;

    com.skype.android.app.chat.a(Activity activity)
    {
        super(activity);
        imageCallback = new AsyncCallback() {

            final com.skype.android.app.chat.a this$0;

            public final void done(AsyncResult asyncresult)
            {
                a a1;
label0:
                {
                    if (!asyncresult.d())
                    {
                        a1 = (a)asyncresult.b();
                        if (asyncresult.a() != null)
                        {
                            break label0;
                        }
                        asyncresult = contactUtil.b(a1.getContact());
                        a1.contactImage.setImageDrawable(asyncresult);
                        a1.contactImage.a(false);
                    }
                    return;
                }
                a1.contactImage.setImageBitmap((Bitmap)asyncresult.a());
                a1.contactImage.a(true);
            }

            
            {
                this$0 = com.skype.android.app.chat.a.this;
                super();
            }
        };
        getComponent().inject(this);
    }

    private void determineButtons(a a1, Contact contact, Message message)
    {
        boolean flag1 = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_WAITING_MY_AUTHORIZATION);
        boolean flag = flag1;
        if (flag1)
        {
            if (message != null && ((long)message.getTimestampProp() & 0xffffffffL) < lastShowingButtonTimestamp)
            {
                flag = false;
            } else
            if (message == null && ((long)contact.getAuthreqTimestampProp() & 0xffffffffL) < lastShowingButtonTimestamp)
            {
                flag = false;
            } else
            {
                if (message != null)
                {
                    lastShowingButtonTimestamp = (long)message.getTimestampProp() & 0xffffffffL;
                } else
                {
                    lastShowingButtonTimestamp = contact.getAuthreqTimestampProp();
                }
                if (previousButtonHolder != null)
                {
                    showButtons(previousButtonHolder, false);
                }
                previousButtonHolder = a1;
                flag = flag1;
            }
        }
        showButtons(a1, flag);
    }

    private View fillGrantedAuthView(View view, Contact contact, String s)
    {
        a a1 = (a)view.getTag();
        setBadgeAccepted(a1.badgeImage, true);
        a1.setContact(contact);
        a1.imageFuture = imageCache.a(a1.getContact(), a1, imageCallback);
        contact = getContext().getString(0x7f080474);
        a1.titleText.setText(contact);
        showButtons(a1, false);
        setAuthrequestMessage(s, a1.messageText);
        return view;
    }

    private View fillRequestedAuthView(View view, Contact contact, Message message)
    {
        a a1 = (a)view.getTag();
        setBadgeAccepted(a1.badgeImage, false);
        a1.setContact(contact);
        Object obj;
        PathClippedImageView pathclippedimageview;
        if (message != null && !messageCache.g(message))
        {
            obj = getContext().getString(0x7f080476);
        } else
        {
            obj = getContext().getString(0x7f080477);
        }
        a1.titleText.setText(((CharSequence) (obj)));
        determineButtons(a1, contact, message);
        a1.imageFuture = imageCache.a(a1.getContact(), a1, imageCallback);
        pathclippedimageview = a1.contactImage;
        if (ContactUtil.p(contact))
        {
            obj = PathType.b;
        } else
        {
            obj = PathType.a;
        }
        pathclippedimageview.setPathType(((PathType) (obj)));
        if (message != null && !TextUtils.isEmpty(message.getBodyXmlProp()))
        {
            contact = message.getBodyXmlProp();
        } else
        {
            contact = contact.getReceivedAuthrequestProp();
        }
        setAuthrequestMessage(contact, a1.messageText);
        return view;
    }

    private a findHolder(View view)
    {
        do
        {
            if (view.getTag() instanceof a)
            {
                return (a)view.getTag();
            }
            if (view.getParent() instanceof View)
            {
                view = (View)view.getParent();
            } else
            {
                return null;
            }
        } while (true);
    }

    private Contact getContactFromIdentity(String s)
    {
        ContactImpl contactimpl = new ContactImpl();
        lib.getContact(s, contactimpl);
        return contactimpl;
    }

    private void setAuthrequestMessage(String s, TextView textview)
    {
        if (!TextUtils.isEmpty(s) && s.trim().length() > 0)
        {
            textview.setText(chatText.b(s));
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    private void setBadgeAccepted(ImageView imageview, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0200f5;
        } else
        {
            i = 0x7f0200f1;
        }
        imageview.setImageResource(i);
    }

    private void showButtons(a a1, boolean flag)
    {
        Object obj = a1.buttonContainer;
        Button button;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ViewGroup) (obj)).setVisibility(i);
        button = a1.acceptButton;
        if (flag)
        {
            obj = this;
        } else
        {
            obj = null;
        }
        button.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        obj = a1.declineButton;
        if (flag)
        {
            a1 = this;
        } else
        {
            a1 = null;
        }
        ((Button) (obj)).setOnClickListener(a1);
    }

    protected final void bindContentView(j j, MessageHolder messageholder)
    {
        a a1 = (a)j;
        a1.itemView.setTag(a1);
        if (messageholder.getTypeOrdinal() == SyntheticTypes.CONTACT_REQUEST.getType())
        {
            j = (Contact)messageholder.getMessageObject();
            fillRequestedAuthView(a1.itemView, j, null);
            return;
        }
        messageholder = (Message)messageholder.getMessageObject();
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];

            static 
            {
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.REQUESTED_AUTH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.GRANTED_AUTH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.Message.TYPE[messageholder.getTypeProp().ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder("Wrong view type: ")).append(messageholder.getTypeProp().name()).toString());

        case 1: // '\001'
            if (messageCache.g(messageholder))
            {
                j = getContactFromIdentity(messageholder.getIdentitiesProp());
            } else
            {
                j = getContactFromIdentity(messageholder.getAuthorProp());
            }
            fillRequestedAuthView(a1.itemView, j, messageholder);
            return;

        case 2: // '\002'
            break;
        }
        if (messageCache.g(messageholder))
        {
            j = getContactFromIdentity(messageholder.getIdentitiesProp());
        } else
        {
            j = getContactFromIdentity(messageholder.getAuthorProp());
        }
        fillGrantedAuthView(a1.itemView, j, messageholder.getBodyXmlProp());
    }

    protected final j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    protected final CharSequence getDefaultContentDescription(j j, MessageHolder messageholder)
    {
        j = (a)j;
        messageholder = new StringBuilder();
        messageholder.append(ViewUtil.b(((a) (j)).titleText));
        messageholder.append(", ");
        messageholder.append(ViewUtil.b(((a) (j)).messageText));
        return messageholder.toString();
    }

    protected final int getLayoutId(int i)
    {
        return 0x7f030065;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    public final boolean isStandalone(MessageHolder messageholder)
    {
        return true;
    }

    public final void onClick(View view)
    {
        int i = view.getId();
        view = findHolder(view);
        if (i == 0x7f100274)
        {
            ContactUtil.o(view.getContact());
            ((a) (view)).buttonContainer.setVisibility(8);
            notificationManager.cancel(view.getContact().getObjectID());
            return;
        } else
        {
            SkypeDialogFragment.create(view.getContact(), com/skype/android/app/contacts/ContactRequestDeclineDialog).show(((SkypeActivity)getContext()).getSupportFragmentManager());
            return;
        }
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.REQUESTED_AUTH.toInt(), com.skype.Message.TYPE.GRANTED_AUTH.toInt(), SyntheticTypes.CONTACT_REQUEST.getType()
        });
    }
}
