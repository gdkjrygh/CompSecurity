// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import com.kik.g.p;
import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import kik.android.gifs.a.d;
import kik.android.gifs.a.f;

// Referenced classes of package kik.android.widget:
//            au, GifWidgetFragment

final class bt extends r
{

    final List a;
    final p b;
    final au c;
    final GifWidgetFragment d;

    bt(GifWidgetFragment gifwidgetfragment, List list, p p1, au au)
    {
        d = gifwidgetfragment;
        a = list;
        b = p1;
        c = au;
        super();
    }

    public final void a(Object obj)
    {
        obj = (d)obj;
        a.clear();
        f f1;
        for (obj = ((d) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); a.add(f1))
        {
            f1 = (f)((Iterator) (obj)).next();
        }

        b.a(c);
    }

    public final void a(Throwable throwable)
    {
        b.a(throwable);
    }
}
