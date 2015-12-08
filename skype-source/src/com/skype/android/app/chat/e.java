// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.util.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, f, MessageHolder, j

abstract class e extends MessageViewAdapter
{

    public e(Activity activity)
    {
        super(activity);
    }

    private void bindInlineContentParentViewHolder(j j1, MessageHolder messageholder)
    {
        j1 = (f)j1;
        final Contact contact = j1.getContact();
        if (contact == null)
        {
            throw new RuntimeException("This view holder requires the conversation and contact");
        }
        boolean flag = j1.isOutgoing();
        boolean flag1 = messageholder.isConference();
        if (j1.isChained())
        {
            showChained(j1);
        } else
        {
            showUnchained(j1, flag);
        }
        if (flag1 && !flag)
        {
            if (!accessibility.a())
            {
                if (((f) (j1)).avatar.getVisibility() == 0)
                {
                    ((f) (j1)).avatar.setClickable(true);
                    ((f) (j1)).avatar.setOnClickListener(new android.view.View.OnClickListener() {

                        final e this$0;
                        final Contact val$contact;

                        public final void onClick(View view)
                        {
                            navigation.chatWithUpAsBack(contact.getIdentity(), false);
                        }

            
            {
                this$0 = e.this;
                contact = contact1;
                super();
            }
                    });
                }
                if (((f) (j1)).authorText.getVisibility() == 0)
                {
                    ((f) (j1)).authorText.setClickable(true);
                    ((f) (j1)).authorText.setOnClickListener(new android.view.View.OnClickListener() {

                        final e this$0;
                        final Contact val$contact;

                        public final void onClick(View view)
                        {
                            navigation.chatWithUpAsBack(contact.getIdentity(), false);
                        }

            
            {
                this$0 = e.this;
                contact = contact1;
                super();
            }
                    });
                }
            }
        } else
        {
            ((f) (j1)).authorText.setVisibility(8);
            ((f) (j1)).avatar.setOnClickListener(null);
            ((f) (j1)).avatar.setClickable(false);
            ((f) (j1)).authorText.setOnClickListener(null);
            ((f) (j1)).authorText.setClickable(false);
        }
        alignTimestampView(j1, flag);
    }

    private String getMessageAuthorString(j j1)
    {
        if (j1.isOutgoing())
        {
            return getContext().getString(0x7f0802d5);
        } else
        {
            return contactUtil.l(j1.getContact());
        }
    }

    private void showChained(f f1)
    {
        Resources resources = getContext().getResources();
        f1.avatar.setVisibility(4);
        f1.authorText.setVisibility(8);
        f1.itemView.setPadding(f1.itemView.getPaddingLeft(), 0, f1.itemView.getPaddingRight(), resources.getDimensionPixelSize(0x7f0c0079));
    }

    private void showUnchained(f f1, boolean flag)
    {
        Resources resources;
        if (!f1.isChatItemExpanded())
        {
            f1.authorText.setVisibility(0);
        } else
        {
            f1.authorText.setVisibility(8);
        }
        resources = getContext().getResources();
        if (!flag)
        {
            f1.avatar.setVisibility(0);
            contactUtil.a(f1.getContact(), f1.avatar, PathType.a);
        } else
        {
            f1.avatar.setVisibility(4);
        }
        f1.authorText.setText(getMessageAuthorString(f1));
        contactUtil.a(f1.authorText, f1.getContact().getTypeProp());
        f1.itemView.setPadding(f1.itemView.getPaddingLeft(), resources.getDimensionPixelSize(0x7f0c007c), f1.itemView.getPaddingRight(), resources.getDimensionPixelSize(0x7f0c0079));
    }

    public void bindViewHolder(j j1, MessageHolder messageholder, a a)
    {
        bindInlineContentParentViewHolder(j1, messageholder);
        super.bindViewHolder(j1, messageholder, a);
    }

    public j createMessageViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03003b, null);
        getView((ViewGroup)ViewUtil.a(viewgroup, 0x7f100286), getLayoutId(i), true);
        return createMessageViewHolder(((View) (viewgroup)));
    }

    protected CharSequence getDefaultContentDescription(j j1, MessageHolder messageholder)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = (f)j1;
        boolean flag = messageholder.isConference();
        messageholder = getMessageAuthorString(((j) (obj)));
        stringbuilder.append(messageholder);
        stringbuilder.append(", ");
        stringbuilder.append(ViewUtil.b(j1.getTimestampView()));
        if (((f) (obj)).messageContent != null)
        {
            obj = ((f) (obj)).messageContent.getContentDescription();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(", ");
                stringbuilder.append(((CharSequence) (obj)));
            }
        }
        if (flag && !j1.isOutgoing())
        {
            stringbuilder.append(", ");
            stringbuilder.append(getContext().getString(0x7f080087, new Object[] {
                messageholder
            }));
        }
        return stringbuilder.toString();
    }

    protected void setDefaultViewClickListener(j j1, final MessageHolder contact)
    {
        if (accessibility.a() && !j1.isOutgoing() && contact.isConference())
        {
            contact = j1.getContact();
            j1.itemView.setOnClickListener(new android.view.View.OnClickListener() {

                final e this$0;
                final Contact val$contact;

                public final void onClick(View view)
                {
                    navigation.chatWithUpAsBack(contact.getIdentity(), false);
                }

            
            {
                this$0 = e.this;
                contact = contact1;
                super();
            }
            });
            return;
        } else
        {
            super.setDefaultViewClickListener(j1, contact);
            return;
        }
    }
}
