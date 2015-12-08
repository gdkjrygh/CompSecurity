// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import com.kik.g.r;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            au, GifSearchFragment

final class bm extends r
{

    final String a;
    final GifSearchFragment.b b;

    bm(GifSearchFragment.b b1, String s)
    {
        b = b1;
        a = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (au)obj;
        GifSearchFragment.b(b.a, a, ((au) (obj)).d().size());
    }
}
