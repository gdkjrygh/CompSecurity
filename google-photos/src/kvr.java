// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONException;
import org.json.JSONObject;

public final class kvr
{

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    kvr(kvs kvs1)
    {
        a = kvs1.a;
        b = kvs1.b;
        c = kvs1.c;
        d = kvs1.d;
        e = kvs1.e;
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
            b.a("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
