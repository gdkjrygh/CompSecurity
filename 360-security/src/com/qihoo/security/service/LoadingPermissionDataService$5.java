// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Intent;
import com.qihoo.security.h.f;

// Referenced classes of package com.qihoo.security.service:
//            LoadingPermissionDataService

class a
    implements Runnable
{

    final Intent a;
    final LoadingPermissionDataService b;

    public void run()
    {
        String as[] = a.getStringArrayExtra("pkgslist");
        f.a().a(as);
    }

    (LoadingPermissionDataService loadingpermissiondataservice, Intent intent)
    {
        b = loadingpermissiondataservice;
        a = intent;
        super();
    }
}
