// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class aac
    implements aax
{

    private JSONObject a;
    private String b;

    public aac(ZL zl)
    {
        b = aaw.a.a();
        try
        {
            a = (new JSONObject()).put("appID", zl.a()).put("deviceID", zl.c()).put("crPlatform", "android").put("crVersion", zl.d()).put("deviceModel", zl.j()).put("osName", "android").put("osVersion", zl.k()).put("carrier", zl.f()).put("mobileCountryCode", zl.g()).put("mobileNetworkCode", zl.h()).put("appVersion", zl.b()).put("locale", (new aan.l()).a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ZL zl)
        {
            return;
        }
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(a.toString().getBytes());
    }

    public final String e()
    {
        return b;
    }
}
