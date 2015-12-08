// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;


// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMRetryWorker

public interface GCMRegistrationListener
{

    public abstract GCMRetryWorker getGcmRetryWorker();

    public abstract void sendErrorMsg(String s, boolean flag);

    public abstract void sendToken(String s);
}
