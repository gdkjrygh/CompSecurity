// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.bd;
import com.facebook.internal.bi;

final class t extends bi
{

    private String a;
    private boolean b;

    public t(Context context, String s, Bundle bundle)
    {
        super(context, s, "oauth", bundle);
    }

    public final bd a()
    {
        Bundle bundle = e();
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("client_id", b());
        bundle.putString("e2e", a);
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        if (b)
        {
            bundle.putString("auth_type", "rerequest");
        }
        return new bd(c(), "oauth", bundle, d(), f());
    }

    public final t a(String s)
    {
        a = s;
        return this;
    }

    public final t a(boolean flag)
    {
        b = flag;
        return this;
    }
}
