// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;


// Referenced classes of package com.google.android.gms.gcm:
//            OneoffTask

public static final class isPersisted extends isPersisted
{

    public long windowEndSeconds;
    public long windowStartSeconds;

    public final OneoffTask build()
    {
        checkConditions();
        return new OneoffTask(this, (byte)0);
    }

    protected final void checkConditions()
    {
        super.onditions();
        if (windowStartSeconds == -1L || windowEndSeconds == -1L)
        {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }
        if (windowStartSeconds >= windowEndSeconds)
        {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        } else
        {
            return;
        }
    }

    public final windowEndSeconds setService(String s)
    {
        gcmTaskService = s;
        return this;
    }

    public final gcmTaskService setTag(String s)
    {
        tag = s;
        return this;
    }

    public ()
    {
        windowStartSeconds = -1L;
        windowEndSeconds = -1L;
        isPersisted = false;
    }
}
