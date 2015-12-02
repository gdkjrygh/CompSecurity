// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;


// Referenced classes of package com.qihoo.security.service:
//            LoadingPermissionDataService

class a
    implements Runnable
{

    final LoadingPermissionDataService a;

    public void run()
    {
        LoadingPermissionDataService.a(a);
        a.stopSelf();
    }

    (LoadingPermissionDataService loadingpermissiondataservice)
    {
        a = loadingpermissiondataservice;
        super();
    }
}
