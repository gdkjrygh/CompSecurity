// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import IO;
import JH;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.ProfilePictureView;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import qx;
import rr;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class <init>
    implements qx
{

    final ProfileFragment a;

    public final void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            ProfileFragment.s(a).a(new ShowDialogEvent(com.snapchat.android.util.eventbus.alogType.TOAST, 0x7f0800eb));
            a.w();
            a.l();
            return;
        }
        (new JH(bitmap, BitmapFactory.decodeResource(a.getResources(), 0x7f020162), ProfileFragment.t(a))).executeOnExecutor(IO.HIGH_PRIORITY_EXECUTOR, new Void[0]);
        bitmap = a.e;
        bitmap.f = new AnimatorSet();
        ((ProfilePictureView) (bitmap)).f.play(ObjectAnimator.ofFloat(((ProfilePictureView) (bitmap)).b, "alpha", new float[] {
            0.0F, 1.0F
        }));
        ((ProfilePictureView) (bitmap)).f.setDuration(150L);
        ((ProfilePictureView) (bitmap)).f.addListener(new com.snapchat.android.ui.._cls5(bitmap));
        ((ProfilePictureView) (bitmap)).f.start();
        ProfileFragment.C(a);
        if (ProfileFragment.t(a) >= 5)
        {
            a.w();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                private ProfileFragment.d a;

                public final void run()
                {
                    Timber.c("ProfileFragment", (new StringBuilder("profile images - Capturing profile photo at index ")).append(ProfileFragment.t(a.a)).toString(), new Object[0]);
                    ProfileFragment.c(a.a).a(new ProfileFragment.d(a.a, (byte)0));
                }

            
            {
                a = ProfileFragment.d.this;
                super();
            }
            }, 1000L);
            return;
        }
    }

    private _cls1.a(ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }

    a(ProfileFragment profilefragment, byte byte0)
    {
        this(profilefragment);
    }
}
