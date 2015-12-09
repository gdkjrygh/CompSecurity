// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ci, fj

public final class ch
{

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    private ch(ci ci1)
    {
        a = ci.a(ci1);
        b = ci.b(ci1);
        c = ci.c(ci1);
        d = ci.d(ci1);
        e = ci.e(ci1);
    }

    ch(ci ci1, byte byte0)
    {
        this(ci1);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", a).put("tel", b).put("calendar", c).put("storePicture", d).put("inlineVideo", e);
        }
        catch (JSONException jsonexception)
        {
            fj.b("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
