// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.bb;
import com.facebook.l;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            GetTokenLoginMethodHandler, LoginClient

final class d
    implements bb
{

    final Bundle a;
    final LoginClient.Request b;
    final GetTokenLoginMethodHandler c;

    d(GetTokenLoginMethodHandler gettokenloginmethodhandler, Bundle bundle, LoginClient.Request request)
    {
        c = gettokenloginmethodhandler;
        a = bundle;
        b = request;
        super();
    }

    public final void a(l l1)
    {
        c.b.b(LoginClient.Result.a(c.b.g, "Caught exception", l1.getMessage()));
    }

    public final void a(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("id");
            a.putString("com.facebook.platform.extra.USER_ID", jsonobject);
            c.b(b, a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            c.b.b(LoginClient.Result.a(c.b.g, "Caught exception", jsonobject.getMessage()));
        }
    }
}
