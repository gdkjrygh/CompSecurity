// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import com.google.android.apps.wallet.p2p.people.UserProfilePhotoEvent;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.roundedimage.RoundedImage;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import java.io.FileNotFoundException;

public class P2pHeaderFragment extends WalletFragment
{
    public static final class PaymentDirection extends Enum
    {

        private static final PaymentDirection $VALUES[];
        public static final PaymentDirection FROM_CONTACT_TO_USER;
        public static final PaymentDirection FROM_USER_TO_CONTACT;
        final int scaleX;

        private static PaymentDirection fromAttributes(TypedArray typedarray)
        {
            if (typedarray != null && typedarray.getInt(com.google.android.apps.walletnfcrel.R.styleable.P2pHeaderFragment_paymentDirection, 0) == 1)
            {
                return FROM_CONTACT_TO_USER;
            } else
            {
                return FROM_USER_TO_CONTACT;
            }
        }

        public static PaymentDirection valueOf(String s)
        {
            return (PaymentDirection)Enum.valueOf(com/google/android/apps/wallet/transfer/ui/P2pHeaderFragment$PaymentDirection, s);
        }

        public static PaymentDirection[] values()
        {
            return (PaymentDirection[])$VALUES.clone();
        }

        static 
        {
            FROM_USER_TO_CONTACT = new PaymentDirection("FROM_USER_TO_CONTACT", 0, 1);
            FROM_CONTACT_TO_USER = new PaymentDirection("FROM_CONTACT_TO_USER", 1, -1);
            $VALUES = (new PaymentDirection[] {
                FROM_USER_TO_CONTACT, FROM_CONTACT_TO_USER
            });
        }


        private PaymentDirection(String s, int i, int j)
        {
            super(s, i);
            scaleX = j;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/transfer/ui/P2pHeaderFragment.getSimpleName();
    private Optional contactEmailOptional;
    private Optional contactPhotoOptional;
    RoundedImage contactProfilePhoto;
    ContactsUtil contactsUtil;
    EventBus eventBus;
    private PaymentDirection paymentDirection;
    RoundedImage userProfilePhoto;

    public P2pHeaderFragment()
    {
        contactPhotoOptional = Optional.absent();
        contactEmailOptional = Optional.absent();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.p2p_header, viewgroup, false);
        userProfilePhoto = (RoundedImage)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.UserProfilePhoto);
        contactProfilePhoto = (RoundedImage)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ContactProfilePhoto);
        viewgroup = getArguments();
        if (viewgroup != null && viewgroup.containsKey("paymentDirection"))
        {
            paymentDirection = (PaymentDirection)viewgroup.getSerializable("paymentDirection");
        }
        Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Arrow).setScaleX(paymentDirection.scaleX);
        if (contactPhotoOptional.isPresent())
        {
            updateContactPhoto((String)contactPhotoOptional.get());
        } else
        if (contactEmailOptional.isPresent())
        {
            updateContactPhotoFromEmail((String)contactEmailOptional.get());
            return layoutinflater;
        }
        return layoutinflater;
    }

    public final void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        activity = activity.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.P2pHeaderFragment);
        paymentDirection = PaymentDirection.fromAttributes(activity);
        activity.recycle();
    }

    void onNewUserProfilePhoto(UserProfilePhotoEvent userprofilephotoevent)
    {
        Bitmap bitmap = null;
        if (userprofilephotoevent.getPhoto().isPresent())
        {
            bitmap = ((Bitmap)userprofilephotoevent.getPhoto().get()).copy(android.graphics.Bitmap.Config.ARGB_8888, false);
        }
        userProfilePhoto.setImage(bitmap);
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
    }

    public final void setContactEmailOptional(String s)
    {
        contactEmailOptional = Optional.fromNullable(s);
    }

    public final void updateContactPhoto(String s)
    {
        contactPhotoOptional = Optional.fromNullable(s);
        contactEmailOptional = Optional.absent();
        if (contactProfilePhoto == null)
        {
            return;
        }
        if (!Strings.isNullOrEmpty(s))
        {
            s = ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, Long.parseLong(s));
            try
            {
                s = BitmapFactory.decodeStream(getActivity().getContentResolver().openInputStream(s));
                contactProfilePhoto.setImage(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                contactProfilePhoto.setImage(null);
            }
            WLog.e(TAG, "Failed to retrieve contact photo");
            return;
        } else
        {
            contactProfilePhoto.setImage(null);
            return;
        }
    }

    public final void updateContactPhotoFromEmail(String s)
    {
        contactEmailOptional = Optional.fromNullable(s);
        contactPhotoOptional = Optional.absent();
        if (contactProfilePhoto == null)
        {
            return;
        }
        if (!Strings.isNullOrEmpty(s))
        {
            contactProfilePhoto.setImage(contactsUtil.getProfilePhotoFor(s));
            return;
        } else
        {
            contactProfilePhoto.setImage(null);
            return;
        }
    }

}
