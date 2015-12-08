// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.j;
import java.util.ArrayList;
import java.util.List;
import p.di.c;

// Referenced classes of package p.cx:
//            c

class .String extends Thread
{

    final int a;
    final int b;
    final p.cx.c c;

    public void run()
    {
        Object obj = c.f();
        if (a >= ((List) (obj)).size() || a < 0)
        {
            c.k((new StringBuilder()).append("Requesting PNDR_EVENT_GENRE_STATION_SELECT with an out of bounds categoryIndex (").append(a).append(")").toString());
            return;
        }
        if (b >= ((j)((List) (obj)).get(a)).d().size() || b < 0)
        {
            c.k((new StringBuilder()).append("Requesting PNDR_EVENT_GENRE_STATION_SELECT with an out of bounds station index (").append(b).append(")").toString());
            return;
        } else
        {
            obj = ((com.pandora.radio.data.tring)((j)((List) (obj)).get(a)).d().get(b)).c();
            (new c(p.cx.c.c(c), ((String) (obj)), null, false, e, null, null)).execute(new Object[0]);
            return;
        }
    }

    .String(p.cx.c c1, String s, int i, int k)
    {
        c = c1;
        a = i;
        b = k;
        super(s);
    }
}
