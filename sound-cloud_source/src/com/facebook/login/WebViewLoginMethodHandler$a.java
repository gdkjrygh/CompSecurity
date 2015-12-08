// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Z;

// Referenced classes of package com.facebook.login:
//            WebViewLoginMethodHandler

static final class  extends com.facebook.internal.
{

    String f;
    boolean g;

    public final Z a()
    {
        Bundle bundle = super.;
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("client_id", super.);
        bundle.putString("e2e", f);
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        if (g)
        {
            bundle.putString("auth_type", "rerequest");
        }
        return new Z(super., "oauth", bundle, super., super.);
    }

    public (Context context, String s, Bundle bundle)
    {
        super(context, s, "oauth", bundle);
    }
}
