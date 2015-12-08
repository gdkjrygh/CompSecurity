// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Vector;

public final class ajo
{

    public ahn a;
    public String b;
    ajx c;
    aic d;
    public aib e;
    public boolean f;
    public boolean g;
    public aju h;
    private ajq i;

    ajo(ahn ahn1, String s, ajx ajx1)
    {
        i = null;
        d = null;
        e = null;
        f = true;
        g = false;
        h = null;
        a = ahn1;
        b = s;
        c = ajx1;
    }

    private Field a(String s, Class class1)
    {
        Field field = null;
        Field field1 = class1.getDeclaredField(s);
        field = field1;
        field1.setAccessible(true);
        field = field1;
_L2:
        return field;
        NoSuchFieldException nosuchfieldexception;
        nosuchfieldexception;
        class1 = class1.getSuperclass();
        if (class1 != null)
        {
            return a(s, class1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void c()
    {
        if (d == null)
        {
            throw new IllegalStateException("Attempting to attach port while not in attachment stage!");
        } else
        {
            return;
        }
    }

    public final ahs a()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            throw new IllegalStateException("Cannot pull frame from closed input port!");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        ahs ahs1 = e.a.c();
        if (ahs1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (i != null)
        {
            i.a(this, ahs1);
        }
        a.a(ahs1);
        if (ahs1.c() != -1L)
        {
            ahn ahn1 = a;
            long l = ahs1.c();
            if (l > ahn1.mCurrentTimestamp || ahn1.mCurrentTimestamp == -1L)
            {
                ahn1.mCurrentTimestamp = l;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return ahs1;
    }

    final void a(aic aic1)
    {
        d = aic1;
        d.a = c.a;
        a.b(this);
    }

    public final void a(ajq ajq1)
    {
        c();
        i = ajq1;
    }

    public final void a(aju aju1)
    {
        c();
        a.b(aju1);
        aic aic1 = d;
        aju1 = aju1.e;
        aic1.c.add(aju1);
    }

    public final void a(String s)
    {
        Field field = a(s, a.getClass());
        if (field == null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 39)).append("Attempting to bind to unknown field '").append(s).append("'!").toString());
        } else
        {
            c();
            i = new ajp(this, field);
            return;
        }
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null) goto _L2; else goto _L1
_L1:
        boolean flag = e.a.a();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final String toString()
    {
        String s = a.mName;
        String s1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(":").append(s1).toString();
    }
}
