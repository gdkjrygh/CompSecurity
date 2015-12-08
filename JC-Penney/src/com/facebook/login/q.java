// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.a.a;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            m

class q
{

    private final a a;
    private String b;

    q(Context context, String s)
    {
        b = s;
        a = com.facebook.a.a.b(context, s);
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

    public String a()
    {
        return b;
    }

    public void a(String s, String s1)
    {
        s = a(s);
        s.putString("3_method", s1);
        a.a("fb_mobile_login_method_start", null, s);
    }

    public void a(String s, String s1, String s2)
    {
        Bundle bundle = a("");
        bundle.putString("2_result", m.c.a());
        bundle.putString("5_error_message", s1);
        bundle.putString("3_method", s2);
        a.a(s, null, bundle);
    }

    public void a(String s, String s1, String s2, String s3, String s4, Map map)
    {
        s = a(s);
        if (s2 != null)
        {
            s.putString("2_result", s2);
        }
        if (s3 != null)
        {
            s.putString("5_error_message", s3);
        }
        if (s4 != null)
        {
            s.putString("4_error_code", s4);
        }
        if (map != null && !map.isEmpty())
        {
            s.putString("6_extras", (new JSONObject(map)).toString());
        }
        s.putString("3_method", s1);
        a.a("fb_mobile_login_method_complete", null, s);
    }
}
