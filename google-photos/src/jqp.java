// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class jqp extends jqe
{

    private static List i = new ArrayList();
    public boolean c;
    public boolean d;
    volatile boolean e;
    public boolean f;

    public jqp(jrk jrk1)
    {
        super(jrk1);
        new HashSet();
    }

    public static jqp a(Context context)
    {
        return jrk.a(context).d();
    }

    public static void b()
    {
        jqp;
        JVM INSTR monitorenter ;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        jqp;
        JVM INSTR monitorexit ;
        throw exception;
        i = null;
        jqp;
        JVM INSTR monitorexit ;
    }

    public final jqt a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new jqt(super.a, s, null);
        s.s();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

}
