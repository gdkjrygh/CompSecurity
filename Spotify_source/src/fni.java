// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class fni
{

    public boolean a;
    private final Collection b = new LinkedHashSet(8);
    private final String c;

    public fni(String s)
    {
        a = false;
        c = s;
    }

    public void J_()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = true;
        Logger.a("%s: enabled", new Object[] {
            c
        });
        Iterator iterator = b.iterator();
        while (iterator.hasNext()) 
        {
            ((fnl)iterator.next()).a();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void a()
    {
    }

    public final void a(fnl fnl1)
    {
        b.add(fnl1);
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = false;
        Logger.a("%s: disabled", new Object[] {
            c
        });
        Iterator iterator = b.iterator();
        while (iterator.hasNext()) 
        {
            ((fnl)iterator.next()).b();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        return !a;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(c);
        String s;
        if (a)
        {
            s = ":enabled";
        } else
        {
            s = ":disabled";
        }
        return stringbuilder.append(s).toString();
    }
}
