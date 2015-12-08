// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import com.kik.g.p;
import com.kik.g.r;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            au, GifSearchFragment, bl

final class bk extends r
{

    final String a;
    final p b;
    final GifSearchFragment c;

    bk(GifSearchFragment gifsearchfragment, String s, p p1)
    {
        c = gifsearchfragment;
        a = s;
        b = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (au)obj;
        if (((au) (obj)).d().size() == 0)
        {
            c.a(c._noSearchResultsText, a);
        } else
        {
            ((au) (obj)).c();
            c.a(GifWidget.a.d);
        }
        b.a(obj);
    }

    public final void b(Throwable throwable)
    {
        c.b(new bl(this));
    }
}
