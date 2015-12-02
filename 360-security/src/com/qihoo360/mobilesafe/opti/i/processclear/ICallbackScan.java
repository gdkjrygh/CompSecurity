// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.processclear;


// Referenced classes of package com.qihoo360.mobilesafe.opti.i.processclear:
//            AppPackageInfo

public interface ICallbackScan
{

    public abstract void onFinished(int i);

    public abstract void onFoundItem(AppPackageInfo apppackageinfo);

    public abstract void onProgress(int i, int j, String s);

    public abstract void onStart();
}
