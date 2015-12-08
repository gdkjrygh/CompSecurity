// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SkypeAvatarView;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;

public class ParticipantAdapter extends DataAdapter
    implements android.view.View.OnClickListener
{
    public class ParticipantViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final ParticipantAdapter this$0;

        protected int getItemId(Contact contact)
        {
            return contact.getObjectID();
        }

        protected volatile int getItemId(Object obj)
        {
            return getItemId((Contact)obj);
        }

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300c9, viewgroup, false);
        }

        protected b onCreateViewHolder(View view)
        {
            return new b(view);
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        public ParticipantViewAdapter()
        {
            this$0 = ParticipantAdapter.this;
            super();
        }
    }

    private final class a
        implements Comparator
    {

        private Collator collator;
        final ParticipantAdapter this$0;

        public final int compare(Contact contact, Contact contact1)
        {
            contact = contactUtil.l(contact);
            contact1 = contactUtil.l(contact1);
            return collator.compare(contact, contact1);
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((Contact)obj, (Contact)obj1);
        }

        public a()
        {
            this$0 = ParticipantAdapter.this;
            super();
            collator = Collator.getInstance();
            collator.setStrength(0);
        }
    }

    final class b extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        SkypeAvatarView avatarView;
        TextView fullNameText;
        ImageView removeIcon;
        TextView statusText;
        final ParticipantAdapter this$0;

        protected final void onSetData(Contact contact)
        {
            contactUtil.a(fullNameText, contact);
            statusText.setText(contactUtil.d(contact));
            ImageView imageview = removeIcon;
            int i;
            if (removable)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
            removeIcon.setOnClickListener(this);
            avatarView.setImageDrawable(contactUtil.a(contact, null));
            contactUtil.a(avatarView.b(), contact.getType(), contact.getAvailabilityProp());
            imageCache.a(contact, avatarView, contact. new AsyncCallback() {

                final b this$1;
                final Contact val$contact;

                public final void done(AsyncResult asyncresult)
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    asyncresult = (SkypeAvatarView)asyncresult.b();
                    if (bitmap != null)
                    {
                        asyncresult.setImageDrawable(contactUtil.a(contact, bitmap));
                        contactUtil.a(asyncresult.b(), contact.getType(), contact.getAvailabilityProp());
                    }
                }

            
            {
                this$1 = final_b1;
                contact = Contact.this;
                super();
            }
            });
        }

        protected final volatile void onSetData(Object obj)
        {
            onSetData((Contact)obj);
        }

        public b(View view)
        {
            this$0 = ParticipantAdapter.this;
            super(view);
            avatarView = (SkypeAvatarView)ViewUtil.a(view, 0x7f100240);
            removeIcon = (ImageView)ViewUtil.a(view, 0x7f100486);
            fullNameText = (TextView)ViewUtil.a(view, 0x7f100241);
            statusText = (TextView)ViewUtil.a(view, 0x7f10025a);
        }
    }


    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    ImageCache imageCache;
    private boolean removable;

    public ParticipantAdapter()
    {
        setItemViewAdapter(0, new ParticipantViewAdapter());
    }

    public void onClick(View view)
    {
    }

    public void setParticipantsRemovable(boolean flag)
    {
        removable = flag;
    }

    public void update(Conversation conversation)
    {
        conversation = conversationUtil.c(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS);
        Collections.sort(conversation, new a());
        setData(conversation);
    }

}
