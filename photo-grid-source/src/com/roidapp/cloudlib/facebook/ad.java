// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbLoginActivity

final class ad
    implements FacebookCallback
{

    final FbLoginActivity a;

    ad(FbLoginActivity fbloginactivity)
    {
        a = fbloginactivity;
        super();
    }

    public final void onCancel()
    {
        a.setResult(0);
        a.finish();
    }

    public final void onError(FacebookException facebookexception)
    {
        FbLoginActivity.a(a, facebookexception);
    }

    public final void onSuccess(Object obj)
    {
label0:
        {
            obj = (LoginResult)obj;
            if (!a.isFinishing() && obj != null && ((LoginResult) (obj)).getAccessToken() != null)
            {
                if (!FbLoginActivity.a(a))
                {
                    break label0;
                }
                FbLoginActivity.b(a);
            }
            return;
        }
        a.setResult(-1, a.getIntent());
        a.finish();
    }
}
