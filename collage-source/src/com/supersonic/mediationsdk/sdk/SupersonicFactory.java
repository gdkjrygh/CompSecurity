// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import com.supersonic.mediationsdk.SupersonicObject;

// Referenced classes of package com.supersonic.mediationsdk.sdk:
//            Supersonic

public class SupersonicFactory
{

    private static Supersonic mInsatnce;

    public SupersonicFactory()
    {
    }

    public static Supersonic getInstance()
    {
        com/supersonic/mediationsdk/sdk/SupersonicFactory;
        JVM INSTR monitorenter ;
        Supersonic supersonic;
        if (mInsatnce == null)
        {
            mInsatnce = new SupersonicObject();
        }
        supersonic = mInsatnce;
        com/supersonic/mediationsdk/sdk/SupersonicFactory;
        JVM INSTR monitorexit ;
        return supersonic;
        Exception exception;
        exception;
        throw exception;
    }
}
