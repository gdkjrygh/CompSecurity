// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp;

import com.android.slyce.f.b;
import com.jcp.util.ae;

// Referenced classes of package com.jcp:
//            JCP

class a
    implements b
{

    final JCP a;

    a(JCP jcp)
    {
        a = jcp;
        super();
    }

    public void a()
    {
        ae.d(JCP.D(), "Slyce opened successfully");
    }

    public void a(String s)
    {
        ae.a(JCP.D(), (new StringBuilder()).append("Slyce failed to open: ").append(s).toString());
    }
}
