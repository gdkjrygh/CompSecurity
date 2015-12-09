// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.slyce.k.h;
import com.android.slyce.k.l;
import com.android.slyce.report.mpmetrics.af;
import com.android.slyce.report.mpmetrics.ak;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            a

class b
    implements l
{

    final JSONObject a;
    final a b;

    b(a a1, JSONObject jsonobject)
    {
        b = a1;
        a = jsonobject;
        super();
    }

    public void a(String s)
    {
        try
        {
            a.put("GoogleAdvertisingID", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            h.b(com.android.slyce.a.j(), "Unable to report Google Advertising Id");
        }
        com.android.slyce.a.a(b).c().a(a);
        com.android.slyce.a.a(b).a(a);
    }
}
