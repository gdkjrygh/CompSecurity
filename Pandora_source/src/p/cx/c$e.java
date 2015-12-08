// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import p.dm.m;
import p.dr.a;

// Referenced classes of package p.cx:
//            c

private class b extends Thread
{

    m a;
    String b;
    final c c;

    public void run()
    {
        try
        {
            m.l((new StringBuilder()).append("Attempting connection to ").append(b).append(":").append(61319).toString());
            p.dm.b b1 = p.dr.a.a("AndroidLink Client Socket : 61319", b, 61319);
            c.a(b1);
            return;
        }
        catch (Exception exception)
        {
            m.l((new StringBuilder()).append(exception.getMessage()).append(" to Accessory").toString());
        }
        ((c)a).k();
    }

    .String(c c1, m m1, String s)
    {
        c = c1;
        super();
        a = m1;
        b = s;
    }
}
