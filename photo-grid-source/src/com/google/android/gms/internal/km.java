// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            kn

public final class km
{

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    private km(kn kn1)
    {
        a = kn.a(kn1);
        b = kn.b(kn1);
        c = kn.c(kn1);
        d = kn.d(kn1);
        e = kn.e(kn1);
    }

    km(kn kn1, byte byte0)
    {
        this(kn1);
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
            zzb.zzb("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
