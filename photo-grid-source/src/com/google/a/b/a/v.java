// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.an;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.google.a.b.a:
//            w

public final class v extends am
{

    public static final an a = new w();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public v()
    {
    }

    private void a(f f1, Time time)
    {
        this;
        JVM INSTR monitorenter ;
        if (time != null) goto _L2; else goto _L1
_L1:
        time = null;
_L4:
        f1.b(time);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        time = b.format(time);
        if (true) goto _L4; else goto _L3
_L3:
        f1;
        throw f1;
    }

    private Time b(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1.f() != e.i) goto _L2; else goto _L1
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
        throw new ag(a1);
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final volatile void a(f f1, Object obj)
    {
        a(f1, (Time)obj);
    }

}
