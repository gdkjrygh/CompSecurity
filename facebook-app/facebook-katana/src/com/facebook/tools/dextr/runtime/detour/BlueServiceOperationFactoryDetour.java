// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.fbservice.ops.ErrorPropagation;
import com.facebook.loom.logger.Logger;

public class BlueServiceOperationFactoryDetour
{

    public BlueServiceOperationFactoryDetour()
    {
    }

    public static com.facebook.fbservice.ops.BlueServiceOperationFactory.Operation a(BlueServiceOperationFactory blueserviceoperationfactory, String s, Bundle bundle, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i);
        return blueserviceoperationfactory.a(s, bundle);
    }

    public static com.facebook.fbservice.ops.BlueServiceOperationFactory.Operation a(BlueServiceOperationFactory blueserviceoperationfactory, String s, Bundle bundle, CallerContext callercontext, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i);
        return blueserviceoperationfactory.a(s, bundle, callercontext);
    }

    public static com.facebook.fbservice.ops.BlueServiceOperationFactory.Operation a(BlueServiceOperationFactory blueserviceoperationfactory, String s, Bundle bundle, ErrorPropagation errorpropagation, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i);
        return blueserviceoperationfactory.a(s, bundle, errorpropagation);
    }

    public static com.facebook.fbservice.ops.BlueServiceOperationFactory.Operation a(BlueServiceOperationFactory blueserviceoperationfactory, String s, Bundle bundle, ErrorPropagation errorpropagation, CallerContext callercontext, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i);
        return blueserviceoperationfactory.a(s, bundle, errorpropagation, callercontext);
    }
}
