// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.mopub.nativeads:
//            CustomEventNative, NativeErrorCode, r

public class MoPubCustomEventNative extends CustomEventNative
{

    public MoPubCustomEventNative()
    {
    }

    protected final void a(Context context, CustomEventNative.CustomEventNativeListener customeventnativelistener, Map map)
    {
        map = ((Map) (map.get("com_mopub_native_json")));
        if (!(map instanceof JSONObject))
        {
            customeventnativelistener.onNativeAdFailed(NativeErrorCode.INVALID_JSON);
            return;
        }
        context = new r(context.getApplicationContext(), (JSONObject)map, customeventnativelistener);
        try
        {
            context.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            customeventnativelistener.onNativeAdFailed(NativeErrorCode.UNSPECIFIED);
        }
    }
}
