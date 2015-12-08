// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.android.volley.w;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, sz, sy

final class sx
    implements com.kik.cache.ad.d
{

    final ViewPictureFragment a;

    sx(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void a(w w)
    {
        ViewPictureFragment.d(a).post(new sz(this));
    }

    public final void a(com.kik.cache.ad.c c, boolean flag)
    {
        c = c.b();
        if (c != null)
        {
            a.a(null);
            ViewPictureFragment.d(a).post(new sy(this, c));
        } else
        if (!flag)
        {
            ViewPictureFragment.a(a, true);
            return;
        }
    }
}
