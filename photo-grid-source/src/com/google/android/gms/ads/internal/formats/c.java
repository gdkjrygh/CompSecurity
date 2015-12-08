// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.sb;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            b, zzh

final class c
    implements sb
{

    final Map a;
    final b b;

    c(b b1, Map map)
    {
        b = b1;
        a = map;
        super();
    }

    public final void a(ry ry, boolean flag)
    {
        zzh.a(b.a, (String)a.get("id"));
        ry = new JSONObject();
        try
        {
            ry.put("messageType", "htmlLoaded");
            ry.put("id", zzh.a(b.a));
            zzh.b(b.a).b("sendMessageToNativeJs", ry);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ry ry)
        {
            zzb.zzb("Unable to dispatch sendMessageToNativeJsevent", ry);
        }
    }
}
