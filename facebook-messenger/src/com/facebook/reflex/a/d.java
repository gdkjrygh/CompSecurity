// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.a;

import com.facebook.analytics.cb;
import com.facebook.reflex.ae;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.reflex.a:
//            a

public class d extends a
{

    private String a;
    private String b;
    private String c;
    private String d;

    public d(com.facebook.prefs.shared.d d1)
    {
        super(d1);
    }

    com.facebook.prefs.shared.ae a()
    {
        return ae.d;
    }

    public List a(long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        String as[];
        ArrayNode arraynode;
        int j;
        b(l);
        s = new cb("gl_info");
        s.b("vendor", a);
        s.b("device", b);
        s.b("version", c);
        as = d.split(" ");
        arraynode = new ArrayNode(JsonNodeFactory.instance);
        j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraynode.add(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s.a("extensions", arraynode);
        s = Collections.singletonList(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void a(String s, String s1, String s2, String s3)
    {
        this;
        JVM INSTR monitorenter ;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public boolean a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        String s = a;
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = super.a(l);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    long b()
    {
        return 0x240c8400L;
    }
}
