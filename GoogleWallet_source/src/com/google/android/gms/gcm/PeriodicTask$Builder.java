// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;


// Referenced classes of package com.google.android.gms.gcm:
//            PeriodicTask

public static final class isPersisted extends isPersisted
{

    private long arF;
    private long arG;

    static long a(isPersisted ispersisted)
    {
        return ispersisted.arF;
    }

    static long b(arF arf)
    {
        return arf.arG;
    }

    public final PeriodicTask build()
    {
        checkConditions();
        return new PeriodicTask(this, null);
    }

    protected final void checkConditions()
    {
        super.ditions();
        if (arF == -1L)
        {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        }
        if (arG == -1L)
        {
            arG = (long)((float)arF * 0.1F);
        }
    }

    public final arF setFlex(long l)
    {
        arG = l;
        return this;
    }

    public final arG setPeriod(long l)
    {
        arF = l;
        return this;
    }

    public final arF setPersisted(boolean flag)
    {
        isPersisted = flag;
        return this;
    }

    public final isPersisted setService(Class class1)
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
        arF = -1L;
        arG = -1L;
        isPersisted = true;
    }
}
