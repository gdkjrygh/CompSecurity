// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync;

import com.facebook.common.w.m;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync:
//            SyncQuickExperimentParams

public class a
{

    public a()
    {
    }

    public static String a(SyncQuickExperimentParams syncquickexperimentparams)
    {
        return m.a("/testexpt:qe:%s", new Object[] {
            syncquickexperimentparams.a()
        });
    }

    public static String b(SyncQuickExperimentParams syncquickexperimentparams)
    {
        return m.a("/testexpt:qe:%s/members/%s", new Object[] {
            syncquickexperimentparams.a(), syncquickexperimentparams.b()
        });
    }
}
