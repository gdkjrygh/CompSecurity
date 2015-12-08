// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal:
//            AcquisitionFailureCallback, ICallbackExecutor, AbstractAcquisitionError

public class GenericErrorLinker
    implements AcquisitionFailureCallback
{

    private final List callbacks;
    private ICallbackExecutor executor;

    public GenericErrorLinker(List list, ICallbackExecutor icallbackexecutor)
    {
        callbacks = list;
        executor = icallbackexecutor;
    }

    public void execute(AbstractAcquisitionError abstractacquisitionerror)
    {
        AcquisitionFailureCallback acquisitionfailurecallback;
        for (Iterator iterator = callbacks.iterator(); iterator.hasNext(); executor.executeFailureCallback(acquisitionfailurecallback, abstractacquisitionerror))
        {
            acquisitionfailurecallback = (AcquisitionFailureCallback)iterator.next();
        }

    }
}
