// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Bitmap;
import com.kik.cache.ProfileImageView;

// Referenced classes of package kik.android.chat.fragment:
//            tg, ViewPictureFragment

final class th
    implements Runnable
{

    final Bitmap a;
    final tg b;

    th(tg tg1, Bitmap bitmap)
    {
        b = tg1;
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
