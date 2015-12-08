// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.cmid.LoginService;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br, BaseShareActivity

final class bv
    implements FacebookCallback
{

    final br a;

    bv(br br1)
    {
        a = br1;
        super();
    }

    public final void onCancel()
    {
    }

    public final void onError(FacebookException facebookexception)
    {
        if (facebookexception != null)
        {
            an.a(br.c(a), facebookexception.getLocalizedMessage());
        }
    }

    public final void onSuccess(Object obj)
    {
        br.p(a);
        obj = new Intent(br.c(a), com/roidapp/photogrid/cmid/LoginService);
        ((Intent) (obj)).setAction("ACTION_LOGIN_BY_FACEBOOK");
        br.c(a).startService(((Intent) (obj)));
    }
}
