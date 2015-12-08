// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Mf;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.ProfilePictureView;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.squareup.otto.Bus;
import java.io.File;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class cation extends SaveImageToGalleryTask
{

    private ProfileFragment a;

    protected final void a()
    {
        Timber.c("ProfileFragment", "profile images - shared image failed to be inserted into media store", new Object[0]);
        a.e.b(false);
        Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.alogType.TOAST, 0x7f0800ea));
    }

    protected final void a(String s)
    {
        Timber.c("ProfileFragment", (new StringBuilder("profile images - shared image was inserted into media store successfully! ")).append(s).toString(), new Object[0]);
        a.e.b(false);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(s)));
        intent.setType("image/jpeg");
        a.startActivity(Intent.createChooser(intent, ProfileFragment.u(a)));
    }

    cation(ProfileFragment profilefragment, Context context, Bitmap bitmap, com.snapchat.android.util.save.Task.SaveLocation savelocation)
    {
        a = profilefragment;
        super(context, bitmap, savelocation);
    }
}
