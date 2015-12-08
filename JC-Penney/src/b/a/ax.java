// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            cz, cy, l, bw

public final class ax
    implements cz
{

    private JSONObject a;
    private String b;

    public ax(l l1)
    {
        b = cy.a.a();
        try
        {
            a = (new JSONObject()).put("appID", l1.a()).put("deviceID", l1.c()).put("crPlatform", "android").put("crVersion", l1.d()).put("deviceModel", l1.j()).put("osName", "android").put("osVersion", l1.k()).put("carrier", l1.f()).put("mobileCountryCode", l1.g()).put("mobileNetworkCode", l1.h()).put("appVersion", l1.b()).put("locale", (new bw()).a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            return;
        }
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(a.toString().getBytes());
    }

    public final String j()
    {
        return b;
    }
}
