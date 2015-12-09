// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.af;
import com.google.b.al;
import com.google.b.am;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.google.b.b.a:
//            x

public final class w extends al
{

    public static final am a = new x();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public w()
    {
    }

    private void a(d d1, Time time)
    {
        this;
        JVM INSTR monitorenter ;
        if (time != null) goto _L2; else goto _L1
_L1:
        time = null;
_L4:
        d1.b(time);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        time = b.format(time);
        if (true) goto _L4; else goto _L3
_L3:
        d1;
        throw d1;
    }

    private Time b(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1.f() != c.i) goto _L2; else goto _L1
_L1:
        a1.j();
        a1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L2:
        a1 = new Time(b.parse(a1.h()).getTime());
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        throw new af(a1);
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final volatile void a(d d1, Object obj)
    {
        a(d1, (Time)obj);
    }

}
