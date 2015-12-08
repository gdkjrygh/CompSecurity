// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cg, cf, au

public final class bm
    implements cg
{

    private JSONObject a;
    private String b;

    public bm(au au1)
    {
        b = cf.a.a();
        try
        {
            a = (new JSONObject()).put("appID", au1.a()).put("deviceID", au1.c()).put("crPlatform", "android").put("crVersion", au1.d()).put("deviceModel", au1.j()).put("osName", "android").put("osVersion", au1.k()).put("carrier", au1.f()).put("mobileCountryCode", au1.g()).put("mobileNetworkCode", au1.h()).put("appVersion", au1.b()).put("locale", (new bw.k()).a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (au au1)
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
