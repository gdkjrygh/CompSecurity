// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import java.io.File;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, tm, tn

final class tl extends r
{

    final ViewPictureFragment a;

    tl(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (File)obj;
        a.a(null);
        ViewPictureFragment.a(a, true);
        ViewPictureFragment.a(a, ((File) (obj)));
        ViewPictureFragment.a(a, ((File) (obj)).getPath());
        ViewPictureFragment.a(a, ((File) (obj)), ViewPictureFragment.e(a));
        a.b(new tm(this));
    }

    public final void b(Throwable throwable)
    {
        a.a(null);
        ViewPictureFragment.a(a, false);
        a.b(new tn(this, throwable));
    }
}
