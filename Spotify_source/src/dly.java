// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class dly
{

    private static final gip a = gip.a("device_discovery_configuration");
    private static final ObjectMapper b;

    public static com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration a(Context context)
    {
        Object obj;
        boolean flag;
        if ("debug".equals("release") || "canary".equals("release"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration.a();
        }
        obj = ((giq)dmz.a(giq)).a(context);
        if (!((gin) (obj)).f(a)) goto _L2; else goto _L1
_L1:
        obj = ((gin) (obj)).e(a);
        obj = (com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration)b.readValue(((JSONObject) (obj)).toString(), com/spotify/mobile/android/connect/DiscoveryClient$DiscoveryConfiguration);
        boq.a(((com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration) (obj)).b.a);
        return ((com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration) (obj));
        Object obj1;
        obj1;
_L4:
        ((giq)dmz.a(giq)).a(context).g(a);
_L2:
        return com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration.a();
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        b = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        (new cuq()).c(new dli("E0206B5C", "Fergal Dev")).c(new dli("35F2B265", "Isak Dev")).c(new dli("DA5472FD", "Rickard Dev")).a();
    }
}
