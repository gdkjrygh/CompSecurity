// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Bitmap;
import com.kik.cache.ProfileImageView;

// Referenced classes of package kik.android.chat.fragment:
//            ti, ViewPictureFragment

final class tj
    implements Runnable
{

    final Bitmap a;
    final ti b;

    tj(ti ti1, Bitmap bitmap)
    {
        b = ti1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        ViewPictureFragment.a(b.a, true);
        b.a.profImageView.setImageBitmap(a);
        b.a.a(null);
    }
}
