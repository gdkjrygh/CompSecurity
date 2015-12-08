// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cw

public class bq
{

    private final String a;
    final cw s;

    public bq(cw cw1)
    {
        this(cw1, "");
    }

    public bq(cw cw1, String s1)
    {
        s = cw1;
        a = s1;
    }

    public final void a(int i, int j, int k, int l, float f, int i1)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
            s.a("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public final void a(String s1)
    {
        try
        {
            s1 = (new JSONObject()).put("message", s1).put("action", a);
            s.a("onError", s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Error occurred while dispatching error event.", s1);
        }
    }

    public final void b(String s1)
    {
        try
        {
            s1 = (new JSONObject()).put("state", s1);
            s.a("onStateChanged", s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching state change.", s1);
        }
    }
}
