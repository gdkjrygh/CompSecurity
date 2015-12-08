// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Bitmap;
import com.kik.cache.ContentImageView;

// Referenced classes of package kik.android.chat.fragment:
//            sx, ViewPictureFragment

final class sy
    implements Runnable
{

    final Bitmap a;
    final sx b;

    sy(sx sx1, Bitmap bitmap)
    {
        b = sx1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        ViewPictureFragment.a(b.a, true);
        b.a.contentImageView.d(a);
    }
}
