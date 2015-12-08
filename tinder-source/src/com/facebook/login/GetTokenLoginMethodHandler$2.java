// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            GetTokenLoginMethodHandler, LoginClient

final class b
    implements com.facebook.internal.
{

    final Bundle a;
    final c b;
    final GetTokenLoginMethodHandler c;

    public final void a(FacebookException facebookexception)
    {
        c.b.b(c(c.b.g, "Caught exception", facebookexception.getMessage()));
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
            c.b.b(c(c.b.g, "Caught exception", jsonobject.getMessage()));
        }
    }

    (GetTokenLoginMethodHandler gettokenloginmethodhandler, Bundle bundle,  )
    {
        c = gettokenloginmethodhandler;
        a = bundle;
        b = ;
        super();
    }
}
