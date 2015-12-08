// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.a.a;

final class n
{

    final a a;
    String b;

    n(Context context, String s)
    {
        b = s;
        a = com.facebook.a.a.a(context, s);
    }

    static Bundle a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", s);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public final void a(String s, String s1, String s2)
    {
        Bundle bundle = a("");
        bundle.putString("2_result", LoginClient.Result.a.c.d);
        bundle.putString("5_error_message", s1);
        bundle.putString("3_method", s2);
        a.a(s, bundle, true);
    }
}
