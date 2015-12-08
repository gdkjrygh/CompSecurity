// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.widget.SkypeAvatarView;
import java.util.ArrayList;

public class HeartsDialogAdapter extends ArrayAdapter
{
    private final class a
    {

        private SkypeAvatarView avatarView;
        private TextView description;
        private TextView fullName;
        final HeartsDialogAdapter this$0;

        public final SkypeAvatarView getAvatarView()
        {
            return avatarView;
        }

        public final TextView getDescription()
        {
            return description;
        }

        public final TextView getFullName()
        {
            return fullName;
        }

        public a(View view)
        {
            this$0 = HeartsDialogAdapter.this;
            super();
            avatarView = (SkypeAvatarView)view.findViewById(0x7f10030c);
            fullName = (TextView)view.findViewById(0x7f10031a);
            description = (TextView)view.findViewById(0x7f10031b);
        }
    }


    private ContactUtil contactUtil;
    private ImageCache imageCache;

    public HeartsDialogAdapter(ContactUtil contactutil, Context context, ArrayList arraylist, ImageCache imagecache)
    {
        super(context, 0, arraylist);
        contactUtil = contactutil;
        imageCache = imagecache;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Contact contact;
        if (view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(0x7f030063, viewgroup, false);
            viewgroup = new a(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        contact = (Contact)getItem(i);
        if (contact != null)
        {
            setAvatarView(contact, viewgroup);
            viewgroup.getFullName().setText(contact.getFullnameProp());
            viewgroup.getDescription().setVisibility(8);
        }
        return view;
    }

    public void setAvatarView(final Contact contact, a a1)
    {
        a1.getAvatarView().setImageDrawable(contactUtil.a(contact, null));
        contactUtil.a(a1.getAvatarView().b(), contact.getType(), contact.getAvailabilityProp());
        imageCache.a(contact, a1.getAvatarView(), new AsyncCallback() {

            final HeartsDialogAdapter this$0;
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
                this$0 = HeartsDialogAdapter.this;
                contact = contact1;
                super();
            }
        });
    }

}
