// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.j;
import java.util.List;

// Referenced classes of package p.cx:
//            c

class .String extends Thread
{

    final int a;
    final int b;
    final c c;

    public void run()
    {
        List list = c.f();
        if (a >= list.size() || a < 0)
        {
            c.k((new StringBuilder()).append("Requesting PNDR_GET_GENRE_CATEGORY_NAMES with an out of bounds category start index (").append(a).append(")").toString());
            return;
        }
        int l = Math.min(list.size() - a, b);
        String as[] = new String[l];
        int k = a;
        int i1 = a;
        for (int i = 0; k < i1 + l; i++)
        {
            as[i] = ((j)list.get(k)).a();
            k++;
        }

        c.b(a, as);
    }

    .String(c c1, String s, int i, int k)
    {
        c = c1;
        a = i;
        b = k;
        super(s);
    }
}
