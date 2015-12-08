// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import java.util.TimerTask;

// Referenced classes of package com.worklight.common:
//            Logger

static final class  extends TimerTask
{

    public void run()
    {
        if (Logger.access$1400() == null || Logger.access$1400().booleanValue())
        {
            Logger.send();
            Logger.sendAnalytics(null);
        }
    }

    ()
    {
    }
}
