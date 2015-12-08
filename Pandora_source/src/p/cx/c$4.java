// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.cx:
//            c

class .String extends Thread
{

    final int a;
    final c b;

    public void run()
    {
        List list = b.f();
        if (a >= list.size() || a < 0)
        {
            b.k((new StringBuilder()).append("Requesting PNDR_GET_GENRE_CATEGORY_STATION_COUNT with an out of bounds categoryIndex (").append(a).append(")").toString());
            return;
        } else
        {
            int i = ((j)list.get(a)).d().size();
            b.b(a, i);
            return;
        }
    }

    .String(c c1, String s, int i)
    {
        b = c1;
        a = i;
        super(s);
    }
}
