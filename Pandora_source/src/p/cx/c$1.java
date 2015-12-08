// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.y;
import p.dd.as;
import p.ds.f;

// Referenced classes of package p.cx:
//            c

class <init> extends <init>
{

    final as a;
    final String b;
    final c c;

    public void a()
    {
        boolean flag = false;
        String s = a.a.c();
        int i = ((flag) ? 1 : 0);
        if (p.cx.c.a(c).length == 2)
        {
            c.c(p.cx.c.a(c)[0].c(), 0);
            i = ((flag) ? 1 : 0);
        }
        do
        {
            if (i >= p.cx.c.a(c).length || s.equals(p.cx.c.a(c)[i].c()))
            {
                c.j(b);
                c.i("0");
                c.c(s, i);
                return;
            }
            i++;
        } while (true);
    }

    .String(c c1, as as1, String s)
    {
        c = c1;
        a = as1;
        b = s;
        super();
    }
}
