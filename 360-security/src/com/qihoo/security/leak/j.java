// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.leak:
//            c, d

class j extends c
{

    private static final String e = new String(Utils.hexStringToBytes("636f6d2e616e64726f69642e6d6d732e7472616e73616374696f6e2e536d73526563656976657253657276696365"));

    j(d d1)
    {
        super(d1);
    }

    public String a()
    {
        return "leak_sms_service";
    }

    boolean b()
    {
        boolean flag1 = false;
        PackageManager packagemanager = a.getPackageManager();
        ServiceInfo aserviceinfo[];
        ServiceInfo serviceinfo;
        int i;
        int k;
        boolean flag;
        try
        {
            aserviceinfo = packagemanager.getPackageInfo("com.android.mms", 4).services;
        }
        catch (Exception exception)
        {
            return false;
        }
        flag = flag1;
        if (aserviceinfo == null) goto _L2; else goto _L1
_L1:
        k = aserviceinfo.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= k) goto _L2; else goto _L3
_L3:
        serviceinfo = aserviceinfo[i];
        if (!e.equals(serviceinfo.name)) goto _L5; else goto _L4
_L4:
        flag = serviceinfo.exported;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Drawable d()
    {
        return a.getResources().getDrawable(0x7f0200ae);
    }

    int e()
    {
        return 0x7f0e000d;
    }

    public boolean f()
    {
        super.f();
        return true;
    }

}
