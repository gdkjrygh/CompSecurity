// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;


// Referenced classes of package com.google.android.gms.gcm:
//            OneoffTask

public static final class arC extends arC
{

    private long arB;
    private long arC;

    static long a(arC arc)
    {
        return arc.arB;
    }

    static long b(arB arb)
    {
        return arb.arC;
    }

    public final OneoffTask build()
    {
        checkConditions();
        return new OneoffTask(this, null);
    }

    protected final void checkConditions()
    {
        super.onditions();
        if (arB == -1L || arC == -1L)
        {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }
        if (arB >= arC)
        {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        } else
        {
            return;
        }
    }

    public final arC setExecutionWindow(long l, long l1)
    {
        arB = l;
        arC = l1;
        return this;
    }

    public final arC setService(Class class1)
    {
        gcmTaskService = class1.getName();
        return this;
    }

    public final gcmTaskService setTag(String s)
    {
        tag = s;
        return this;
    }

    public final tag setUpdateCurrent(boolean flag)
    {
        updateCurrent = flag;
        return this;
    }

    public ()
    {
        arB = -1L;
        arC = -1L;
    }
}
