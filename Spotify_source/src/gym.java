// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class gym
{

    public gym()
    {
    }

    protected abstract Object a();

    public final Object a(Context context, gyo gyo1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a();
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = gyo1.a(context);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        throw new NullPointerException();
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
    }

    protected abstract void a(Object obj);
}
