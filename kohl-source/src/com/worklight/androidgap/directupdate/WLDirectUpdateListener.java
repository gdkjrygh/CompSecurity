// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;


// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateStatus

public interface WLDirectUpdateListener
{

    public abstract void onFinish(WLDirectUpdateStatus wldirectupdatestatus);

    public abstract void onProgress(WLDirectUpdateStatus wldirectupdatestatus, long l, long l1);

    public abstract void onStart(long l);
}
