// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.an;
import com.google.a.d.a;
import com.google.a.d.f;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.google.a.b.a:
//            f

public final class e extends am
{

    public static final an a = new com.google.a.b.a.f();
    private final DateFormat b;
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d;

    public e()
    {
        b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        d = simpledateformat;
    }

    private Date a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Date date = c.parse(s);
        s = date;
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
        ParseException parseexception;
        parseexception;
        parseexception = b.parse(s);
        s = parseexception;
          goto _L1
        parseexception;
        parseexception = d.parse(s);
        s = parseexception;
          goto _L1
        parseexception;
        throw new ag(s, parseexception);
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void a(f f1, Date date)
    {
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        f1.f();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f1.b(b.format(date));
        if (true) goto _L4; else goto _L3
_L3:
        f1;
        throw f1;
    }

    public final Object a(a a1)
    {
        if (a1.f() == com.google.a.d.e.i)
        {
            a1.j();
            return null;
        } else
        {
            return a(a1.h());
        }
    }

    public final volatile void a(f f1, Object obj)
    {
        a(f1, (Date)obj);
    }

}
