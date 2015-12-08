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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Referenced classes of package com.google.a.b.a:
//            u

public final class t extends am
{

    public static final an a = new u();
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    public t()
    {
    }

    private void a(f f1, Date date)
    {
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        date = null;
_L4:
        f1.b(date);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        date = b.format(date);
        if (true) goto _L4; else goto _L3
_L3:
        f1;
        throw f1;
    }

    private Date b(a a1)
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
        a1 = new Date(b.parse(a1.h()).getTime());
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
        a(f1, (Date)obj);
    }

}
