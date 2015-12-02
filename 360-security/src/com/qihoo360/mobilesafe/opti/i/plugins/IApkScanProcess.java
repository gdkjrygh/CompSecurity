// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.plugins;


// Referenced classes of package com.qihoo360.mobilesafe.opti.i.plugins:
//            ApkInfo

public interface IApkScanProcess
{

    public abstract int create();

    public abstract int destroy();

    public abstract ApkInfo scanApk(String s);
}
