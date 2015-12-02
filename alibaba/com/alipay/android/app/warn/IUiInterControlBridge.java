// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.warn;

import com.alipay.android.app.transfer.NetWrapperInterface;

// Referenced classes of package com.alipay.android.app.warn:
//            IActivityAdapter, ICashierWebInterFace

public interface IUiInterControlBridge
{

    public abstract void clearUiRes();

    public abstract IActivityAdapter getActivtyAdapter();

    public abstract ICashierWebInterFace getCashierWebInterImp();

    public abstract NetWrapperInterface getNetWrapperImp();

    public abstract String getUiWinVersion();

    public abstract void initial();

    public abstract void startPay(String s);
}
