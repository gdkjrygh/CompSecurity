// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class aoc extends asi
{

    public String a;
    public boolean b;

    public aoc(Context context, String s, Bundle bundle)
    {
        super(context, s, "oauth", bundle);
    }

    public final ash a()
    {
        Bundle bundle = super.g;
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("client_id", super.d);
        bundle.putString("e2e", a);
        bundle.putString("response_type", "token");
        bundle.putString("return_scopes", "true");
        if (b && !aph.h())
        {
            bundle.putString("auth_type", "rerequest");
        }
        return new ash(super.c, "oauth", bundle, super.e, super.f);
    }
}
