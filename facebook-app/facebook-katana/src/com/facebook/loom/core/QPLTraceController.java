// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;

import com.facebook.loom.config.ControllerConfig;
import com.facebook.loom.config.QPLControllerConfig;
import com.facebook.loom.config.QPLTraceControlConfiguration;
import com.facebook.quicklog.QuickEvent;
import java.util.Random;

// Referenced classes of package com.facebook.loom.core:
//            TraceController

public class QPLTraceController
    implements TraceController
{

    private Random a;

    public QPLTraceController()
    {
        a = new Random();
    }

    public final int a(Object obj, ControllerConfig controllerconfig)
    {
        obj = ((QPLControllerConfig)controllerconfig).a(((QuickEvent)obj).h());
        int i;
        if (obj != null)
        {
            if ((i = ((QPLTraceControlConfiguration) (obj)).b()) != -1 && i != 0 && (i == 1 || a.nextInt(i) == 0))
            {
                return ((QPLTraceControlConfiguration) (obj)).c();
            }
        }
        return 0;
    }

    public final boolean a(Object obj, Object obj1)
    {
        return obj == obj1;
    }
}
