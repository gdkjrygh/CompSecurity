// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;


// Referenced classes of package com.worklight.location.internal:
//            AcquisitionCallback, RuntimeTriggerContainer

public abstract class GenericRTCLinker
    implements AcquisitionCallback
{

    protected final RuntimeTriggerContainer rtc;

    public GenericRTCLinker(RuntimeTriggerContainer runtimetriggercontainer)
    {
        rtc = runtimetriggercontainer;
    }
}
