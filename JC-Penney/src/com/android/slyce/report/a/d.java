// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a;

import com.android.slyce.report.a.b.a;
import com.android.slyce.report.a.d.f;
import com.android.slyce.report.a.e.e;
import com.android.slyce.report.a.e.h;
import com.android.slyce.report.a.e.i;
import java.net.InetSocketAddress;

// Referenced classes of package com.android.slyce.report.a:
//            f, a

public abstract class d
    implements com.android.slyce.report.a.f
{

    public d()
    {
    }

    public i a(com.android.slyce.report.a.a a1, a a2, com.android.slyce.report.a.e.a a3)
    {
        return new e();
    }

    public String a(com.android.slyce.report.a.a a1)
    {
        a1 = a1.a();
        if (a1 == null)
        {
            throw new com.android.slyce.report.a.c.d("socket not bound");
        } else
        {
            StringBuffer stringbuffer = new StringBuffer(90);
            stringbuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringbuffer.append(a1.getPort());
            stringbuffer.append("\" /></cross-domain-policy>\0");
            return stringbuffer.toString();
        }
    }

    public void a(com.android.slyce.report.a.a a1, com.android.slyce.report.a.d.d d1)
    {
    }

    public void a(com.android.slyce.report.a.a a1, com.android.slyce.report.a.e.a a2)
    {
    }

    public void a(com.android.slyce.report.a.a a1, com.android.slyce.report.a.e.a a2, h h)
    {
    }

    public void b(com.android.slyce.report.a.a a1, com.android.slyce.report.a.d.d d1)
    {
        d1 = new f(d1);
        d1.a(com.android.slyce.report.a.d.e.e);
        a1.a(d1);
    }

    public void c(com.android.slyce.report.a.a a1, com.android.slyce.report.a.d.d d1)
    {
    }
}
