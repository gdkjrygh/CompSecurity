// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import com.cardinalblue.android.b.k;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            FbLoginActivity

class a
    implements FacebookCallback
{

    final FbLoginActivity a;

    public void a(LoginResult loginresult)
    {
        FbLoginActivity.a(a);
        a.finish();
    }

    public void onCancel()
    {
        a.setResult(0);
        a.finish();
    }

    public void onError(FacebookException facebookexception)
    {
        k.a(a, 0x7f070209, 1);
        a.setResult(0);
        a.finish();
    }

    public void onSuccess(Object obj)
    {
        a((LoginResult)obj);
    }

    (FbLoginActivity fbloginactivity)
    {
        a = fbloginactivity;
        super();
    }
}
