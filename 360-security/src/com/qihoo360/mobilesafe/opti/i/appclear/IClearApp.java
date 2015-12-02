// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.appclear;

import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.appclear:
//            AppInfo

public interface IClearApp
{

    public abstract int clearApkTrash(List list);

    public abstract int clearUninstalledAppTrash(List list);

    public abstract AppInfo getAppInfo(String s);

    public abstract List pickClearableApk(List list);

    public abstract List scanApkTrash(List list);

    public abstract List scanUninstalledAppTrash(List list);
}
