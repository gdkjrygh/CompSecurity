// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.processclear;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.processclear:
//            ICallbackClear, ICallbackScan

public interface IProcessCleaner
{

    public abstract void cancelClear();

    public abstract void cancelScan();

    public abstract void clearByPid(List list, int i, ICallbackClear icallbackclear);

    public abstract void clearByPkg(List list, int i, ICallbackClear icallbackclear);

    public abstract void destroy();

    public abstract List getClearableInstalledAppList();

    public abstract void init(Context context, boolean flag);

    public abstract void scan(int i, ICallbackScan icallbackscan);

    public abstract void setOption(String s, String s1);

    public abstract List syncScan(int i);

    public abstract void updateConfigure();
}
