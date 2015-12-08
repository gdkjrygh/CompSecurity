// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.PathType;
import com.skype.android.widget.SkypeAvatarView;
import java.util.HashMap;
import java.util.concurrent.Future;

public abstract class ImageItemViewHolder extends com.skype.android.app.data.DataAdapter.ItemViewHolder
{

    private static HashMap contactsCache = null;
    private static AsyncCallback imageCallback;
    private final SkypeAvatarView avatarView;
    private final ContactUtil contactUtil;
    private final DefaultAvatars defaultAvatars;
    private final GroupAvatarUtil groupAvatarUtil;
    private final ImageCache imageCache;
    private Future imageFuture;
    private final SkyLib lib;

    public ImageItemViewHolder(Activity activity, View view, SkypeAvatarView skypeavatarview, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, 
            SkyLib skylib)
    {
        super(view);
        avatarView = skypeavatarview;
        imageCache = imagecache;
        contactUtil = contactutil;
        lib = skylib;
        defaultAvatars = defaultavatars;
        groupAvatarUtil = groupavatarutil;
        if (contactsCache == null)
        {
            contactsCache = new HashMap();
        }
        if (imageCallback == null)
        {
            imageCallback = new UiCallback(activity, new AsyncCallback() {

                final ImageItemViewHolder this$0;

                public final void done(AsyncResult asyncresult)
                {
                    if (!asyncresult.d())
                    {
                        SkypeAvatarView skypeavatarview1 = (SkypeAvatarView)asyncresult.b();
                        asyncresult = (Bitmap)asyncresult.a();
                        if (asyncresult != null)
                        {
                            skypeavatarview1.setImageBitmap(asyncresult);
                            skypeavatarview1.a(true);
                        }
                    }
                }

            
            {
                this$0 = ImageItemViewHolder.this;
                super();
            }
            });
        }
    }

    private void bindConferenceImage(Conversation conversation)
    {
        if (imageFuture != null)
        {
            imageFuture.cancel(true);
        }
        setDefaultConferencePicture(conversation);
        imageFuture = groupAvatarUtil.a(conversation, avatarView, imageCallback);
    }

    private void bindDialogImage(Conversation conversation)
    {
        if (imageFuture != null)
        {
            imageFuture.cancel(true);
        }
        conversation = getContactFromIdentity(conversation.getIdentityProp());
        if (conversation != null)
        {
            setDefaultDialogPicture(conversation);
            imageFuture = imageCache.a(conversation, avatarView, imageCallback);
            avatarView.setPresenceVisible(true);
            contactUtil.a(avatarView.b(), conversation.getType(), conversation.getAvailabilityProp());
        }
    }

    private Contact getContactFromIdentity(String s)
    {
label0:
        {
            Contact contact = (Contact)contactsCache.get(s);
            Object obj = contact;
            if (contact == null)
            {
                obj = new ContactImpl();
                if (!lib.getContact(s, ((Contact) (obj))))
                {
                    break label0;
                }
                contactsCache.put(s, obj);
            }
            return ((Contact) (obj));
        }
        return null;
    }

    private void resetImage(Object obj)
    {
        avatarView.setTag(obj);
        avatarView.a(false);
        avatarView.setAlternativeShape(null);
        avatarView.setPresenceVisible(false);
    }

    private void setDefaultConferencePicture(Conversation conversation)
    {
        conversation = defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.a, conversation.getIdentityProp());
        avatarView.setImageDrawable(conversation);
    }

    private void setDefaultDialogPicture(Contact contact)
    {
        avatarView.setImageDrawable(contactUtil.b(contact));
        if (ContactUtil.p(contact))
        {
            avatarView.setAlternativeShape(PathType.b);
        }
    }

    protected void bindImage(Conversation conversation)
    {
        resetImage(conversation);
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            bindDialogImage(conversation);
            return;
        } else
        {
            bindConferenceImage(conversation);
            return;
        }
    }

    public void onViewRecycled()
    {
        super.onViewRecycled();
        if (imageFuture != null)
        {
            avatarView.setTag(null);
            imageFuture.cancel(true);
            imageFuture = null;
        }
    }

}
