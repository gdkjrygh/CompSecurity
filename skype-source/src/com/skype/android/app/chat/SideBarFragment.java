// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.Navigation;
import com.skype.android.app.media.OnMediaGroupAvatarLoaded;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.CallActionSpinner;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            ChangeGroupPictureDialog, ParticipantActivity

public class SideBarFragment extends SkypeFragment
    implements android.support.v7.internal.view.menu.f.a, android.view.View.OnClickListener
{

    AccessibilityUtil accessibility;
    PathClippedImageView avatarImage;
    ImageView avatarImageProtection;
    CallActionSpinner callButton;
    ViewGroup callButtonContainer;
    TextView chatName;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    DefaultAvatars defaultAvatars;
    GroupAvatarUtil groupAvatarUtil;
    ImageCache imageCache;
    Button joinCallButton;
    TextView locationText;
    private f menuBuilder;
    ImageButton menuButton;
    TextView moodMessage;
    Navigation navigation;
    private k popupMenuCompat;
    ViewGroup presenceMoodContainer;
    SymbolView presenceView;
    ImageButton videoCallButton;

    public SideBarFragment()
    {
    }

    private void addCommaAndSpace(StringBuilder stringbuilder)
    {
        if (stringbuilder.length() > 0)
        {
            stringbuilder.append(',');
            stringbuilder.append(' ');
        }
    }

    private void updateActions()
    {
        boolean flag = false;
        boolean flag1 = conversationUtil.i(conversation);
        Object obj;
        int i;
        int j;
        int l;
        if (conversationUtil.f(conversation) && callButton.getAdapter().getCount() > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (conversation.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = videoCallButton;
        if (flag1 && i == 0)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        ((ImageButton) (obj)).setVisibility(l);
        obj = callButton;
        if (j != 0 && i == 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((CallActionSpinner) (obj)).setVisibility(j);
        obj = joinCallButton;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
    }

    private void updateAvatar()
    {
        Object obj;
        UiCallback uicallback;
        if (contact != null)
        {
            obj = contactUtil.c(contact);
        } else
        {
            obj = defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.c, conversation.getIdentityProp());
        }
        avatarImage.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        avatarImage.a(false);
        if (avatarImageProtection != null)
        {
            avatarImageProtection.setVisibility(8);
        }
        uicallback = new UiCallback(this, new AsyncCallback() {

            final SideBarFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
                PathClippedImageView pathclippedimageview1 = (PathClippedImageView)asyncresult.b();
                if (asyncresult.a() != null)
                {
                    pathclippedimageview1.setImageBitmap((Bitmap)asyncresult.a());
                    pathclippedimageview1.a(true);
                    if (avatarImageProtection != null)
                    {
                        avatarImageProtection.setVisibility(0);
                    }
                }
            }

            
            {
                this$0 = SideBarFragment.this;
                super();
            }
        });
        if (contact != null)
        {
            PathClippedImageView pathclippedimageview = avatarImage;
            if (ContactUtil.p(contact))
            {
                obj = PathType.b;
            } else
            {
                obj = PathType.c;
            }
            pathclippedimageview.setPathType(((PathType) (obj)));
            imageCache.b(contact, avatarImage, uicallback);
            return;
        } else
        {
            avatarImage.setPathType(PathType.c);
            groupAvatarUtil.a(conversation, avatarImage, uicallback);
            return;
        }
    }

    private void updateContentDescriptions()
    {
        String s1 = chatName.getText().toString();
        String s2 = moodMessage.getText().toString();
        String s;
        if (presenceView.b() == com.skype.android.widget.SymbolElement.SymbolCode.eC)
        {
            s = getString(0x7f0800df);
        } else
        {
            s = getString(0x7f0800de);
        }
        s = String.format(getString(0x7f080092), new Object[] {
            s1, s2, s
        });
        chatName.setContentDescription(s);
        presenceMoodContainer.setContentDescription(s);
        s = String.format(getString(0x7f080091), new Object[] {
            s1
        });
        menuButton.setContentDescription(s);
    }

    private void updateInfo()
    {
        Object obj;
        TextView textview;
        int i;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            CharSequence charsequence = contactUtil.d(contact);
            obj = charsequence;
            if (TextUtils.isEmpty(charsequence))
            {
                obj = charsequence;
                if (ContactUtil.a(contact.getAvailabilityProp()))
                {
                    obj = getString(0x7f0802f8);
                }
            }
        } else
        {
            i = ConversationUtil.b(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS);
            obj = getResources().getString(0x7f0802fb, new Object[] {
                Integer.valueOf(i)
            });
        }
        textview = moodMessage;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        textview.setVisibility(i);
        moodMessage.setText(((CharSequence) (obj)));
        chatName.setText(conversationUtil.m(conversation));
        chatName.setOnClickListener(this);
        updateContentDescriptions();
        obj = null;
        if (contact != null)
        {
            obj = contact.getCityProp();
            String s = contactUtil.m(contact);
            StringBuilder stringbuilder = new StringBuilder();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(((String) (obj)));
            }
            if (!TextUtils.isEmpty(s))
            {
                addCommaAndSpace(stringbuilder);
                stringbuilder.append(s);
            }
            obj = stringbuilder.toString();
            contactUtil.a(presenceView, contact.getTypeProp(), contact.getAvailabilityProp());
            contactUtil.a(chatName, contact.getType());
        } else
        {
            presenceView.setVisibility(8);
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            locationText.setVisibility(8);
            return;
        } else
        {
            locationText.setVisibility(0);
            locationText.setText(((CharSequence) (obj)));
            return;
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getSender().getObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_PICTURE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_PICTURE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_DISPLAYNAME.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 4: default 64
    //                   1 66
    //                   2 66
    //                   3 66
    //                   4 66;
           goto _L2 _L3 _L3 _L3 _L3
_L2:
        return false;
_L3:
        return true;
    }

    public void onClick(View view)
    {
        if (view != menuButton) goto _L2; else goto _L1
_L1:
        int i = 0x7f110014;
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            i = 0x7f110010;
        }
        menuBuilder.clear();
        getActionBarActivity().getMenuInflater().inflate(i, menuBuilder);
        getActionBarActivity().onPrepareOptionsMenu(menuBuilder);
        MenuItem menuitem = menuBuilder.findItem(0x7f1005cb);
        if (menuitem != null)
        {
            menuitem.setVisible(false);
        }
        menuitem = menuBuilder.findItem(0x7f1005cd);
        if (menuitem != null)
        {
            menuitem.setVisible(false);
        }
        menuitem = menuBuilder.findItem(0x7f1005cc);
        if (menuitem != null)
        {
            menuitem.setVisible(false);
        }
        menuitem = menuBuilder.findItem(0x7f1005e0);
        if (menuitem != null)
        {
            menuitem.setVisible(false);
        }
        popupMenuCompat.a(view);
        popupMenuCompat.e();
_L4:
        return;
_L2:
        if (view == videoCallButton)
        {
            navigation.placeCallWithVideo(conversation);
            return;
        }
        if (view != avatarImage)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ConversationUtil.z(conversation))
        {
            ((ChangeGroupPictureDialog)SkypeDialogFragment.create(conversation, com/skype/android/app/chat/ChangeGroupPictureDialog)).show(getFragmentManager());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view == chatName)
        {
            if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                navigation.profile(contact);
                return;
            } else
            {
                navigation.startIntentFor(conversation, com/skype/android/app/chat/ParticipantActivity);
                return;
            }
        }
        if (view == joinCallButton)
        {
            navigation.joinCall(conversation);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            contact = conversationUtil.r(conversation);
        }
        menuBuilder = new f(getActivity());
        popupMenuCompat = new k(getActivity(), menuBuilder);
        menuBuilder.a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030048, viewgroup, false);
    }

    void onEvent(OnMediaGroupAvatarLoaded onmediagroupavatarloaded)
    {
        updateAvatar();
    }

    void onEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
label0:
        {
            if (contact != null && onpropertychange.getSender().getObjectID() == contact.getObjectID())
            {
                if (onpropertychange.getPropKey() != PROPKEY.CONTACT_AVATAR_IMAGE)
                {
                    break label0;
                }
                updateAvatar();
            }
            return;
        }
        updateInfo();
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnParticipantListChange onparticipantlistchange)
    {
        if (conversation != null && conversation.getObjectID() == onparticipantlistchange.getSender().getObjectID())
        {
            updateInfo();
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (conversation == null || onpropertychange.getSender().getObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        _cls2..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 4: default 68
    //                   1 69
    //                   2 74
    //                   3 74
    //                   4 95;
           goto _L2 _L3 _L4 _L4 _L5
_L2:
        return;
_L3:
        updateActions();
        return;
_L4:
        imageCache.b(conversation.getIdentityProp());
        updateAvatar();
        return;
_L5:
        updateInfo();
        return;
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        return getActionBarActivity().onOptionsItemSelected(menuitem);
    }

    public void onMenuModeChange(f f1)
    {
    }

    public void onResume()
    {
        super.onResume();
        updateActions();
        updateInfo();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ViewUtil.a(this, new View[] {
            avatarImage, menuButton, videoCallButton, joinCallButton
        });
        callButton.setContact(contact, conversation, conversationUtil, contactUtil);
        if (getActivity() instanceof android.widget.AdapterView.OnItemSelectedListener)
        {
            view = (android.widget.AdapterView.OnItemSelectedListener)getActivity();
            callButton.setOnItemSelectedListener(view);
        }
        updateAvatar();
        if (accessibility.a())
        {
            if (presenceMoodContainer != null && moodMessage != null)
            {
                presenceMoodContainer.post(accessibility.a(presenceMoodContainer, moodMessage, 12));
                accessibility.a(presenceMoodContainer);
            }
            if (callButtonContainer != null)
            {
                callButtonContainer.post(accessibility.a(callButtonContainer, true));
                accessibility.a(callButtonContainer);
            }
            if (presenceMoodContainer != null && moodMessage != null)
            {
                accessibility.a(moodMessage, presenceMoodContainer);
            }
        }
    }
}
