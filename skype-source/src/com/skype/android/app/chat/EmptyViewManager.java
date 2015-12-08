// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactSendAuthRequestActivity;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;

public class EmptyViewManager
    implements android.view.View.OnClickListener
{

    private static final int LAYOUT_ADD_CONTACT = 0x7f030049;
    private static final int LAYOUT_NO_HISTORY = 0x7f03004a;
    private static final int LAYOUT_SUGGESTED_CONTACT = 0x7f03004b;
    private AccessibilityUtil accessibility;
    private Contact contact;
    private ContactUtil contactUtil;
    private View emptyView;
    private Fragment fragment;
    private ImageCache imageCache;
    private Navigation navigation;

    public EmptyViewManager(Fragment fragment1, AccessibilityUtil accessibilityutil, Navigation navigation1, ContactUtil contactutil, ImageCache imagecache)
    {
        fragment = fragment1;
        accessibility = accessibilityutil;
        navigation = navigation1;
        contactUtil = contactutil;
        imageCache = imagecache;
        resetEmptyView();
    }

    private View inflateViewStub(ViewStub viewstub, int i)
    {
        viewstub.setLayoutResource(i);
        viewstub = viewstub.inflate();
        viewstub.bringToFront();
        viewstub.setVisibility(0);
        return viewstub;
    }

    private void modifyButton(int i)
    {
        Button button = (Button)ViewUtil.a(emptyView, i);
        ViewUtil.a(this, new View[] {
            button
        });
        accessibility.b(button, 12);
    }

    private void modifyDescription(int i, int j)
    {
        TextView textview = (TextView)emptyView.findViewById(i);
        if (contact != null)
        {
            textview.setText(textview.getContext().getString(j, new Object[] {
                contactUtil.l(contact)
            }));
            return;
        } else
        {
            textview.setText("");
            return;
        }
    }

    private void setDefaultAvatar(PathClippedImageView pathclippedimageview)
    {
        pathclippedimageview.setImageDrawable(contactUtil.b(contact));
    }

    private void updateAvatar(PathClippedImageView pathclippedimageview)
    {
        if (pathclippedimageview != null)
        {
            PathType pathtype;
            if (ContactUtil.p(contact))
            {
                pathtype = PathType.b;
            } else
            {
                pathtype = PathType.a;
            }
            pathclippedimageview.setPathType(pathtype);
            pathclippedimageview.setBorderWidth(0);
            imageCache.a(contact, pathclippedimageview, new UiCallback(fragment, new AsyncCallback() {

                final EmptyViewManager this$0;

                public final void done(AsyncResult asyncresult)
                {
                    if (!asyncresult.d())
                    {
                        PathClippedImageView pathclippedimageview1 = (PathClippedImageView)asyncresult.b();
                        asyncresult = (Bitmap)asyncresult.a();
                        if (asyncresult != null)
                        {
                            pathclippedimageview1.setImageBitmap(asyncresult);
                            pathclippedimageview1.a(true);
                        } else
                        {
                            setDefaultAvatar(pathclippedimageview1);
                            pathclippedimageview1.a(false);
                        }
                        pathclippedimageview1.setVisibility(0);
                    }
                }

            
            {
                this$0 = EmptyViewManager.this;
                super();
            }
            }));
        }
    }

    public void inflateEmptyView(ViewStub viewstub, Contact contact1)
    {
        contact = contact1;
        if (viewstub.getParent() != null && contact1 != null)
        {
            if (isSuggestedContact())
            {
                emptyView = inflateViewStub(viewstub, 0x7f03004b);
                modifyButton(0x7f1002c9);
                modifyDescription(0x7f1002c8, 0x7f08048e);
                updateAvatar((PathClippedImageView)emptyView.findViewById(0x7f1002c7));
                return;
            }
            if (isAddContact())
            {
                emptyView = inflateViewStub(viewstub, 0x7f030049);
                modifyButton(0x7f1002c4);
                modifyDescription(0x7f1002c3, 0x7f0801af);
                updateAvatar((PathClippedImageView)emptyView.findViewById(0x7f1002c2));
                return;
            }
            emptyView = inflateViewStub(viewstub, 0x7f03004a);
            modifyDescription(0x7f1002c6, 0x7f080473);
            updateAvatar((PathClippedImageView)emptyView.findViewById(0x7f1002c5));
            if (ContactUtil.p(contact1))
            {
                emptyView.findViewById(0x7f1002c6).setVisibility(8);
                return;
            }
        }
    }

    public boolean isAddContact()
    {
        return contact != null && !ContactUtil.g(contact) && !ContactUtil.a(contact) && !contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_AUTHORIZED_BY_ME) && !contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_WAITING_MY_AUTHORIZATION) && !contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.UNKNOWN_OR_PENDINGAUTH_BUDDIES);
    }

    public boolean isInflated()
    {
        return emptyView != null;
    }

    public boolean isSuggestedContact()
    {
        return ContactUtil.r(contact);
    }

    public void onClick(View view)
    {
        if (contact != null)
        {
            navigation.startIntentFor(contact, com/skype/android/app/contacts/ContactSendAuthRequestActivity);
        }
    }

    public void resetEmptyView()
    {
        emptyView = null;
    }

    public void setVisibility(int i)
    {
        if (isInflated())
        {
            emptyView.setVisibility(i);
        }
    }

}
