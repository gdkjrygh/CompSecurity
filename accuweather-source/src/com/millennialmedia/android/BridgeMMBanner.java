// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMSDK, MMWebView, MMJSResponse, 
//            DTOResizeParameters

class BridgeMMBanner extends MMJSObject
{

    static final String RESIZE = "resize";

    BridgeMMBanner()
    {
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if ("resize".equals(s))
        {
            mmjsresponse = resize(map);
        }
        return mmjsresponse;
    }

    int getScreenHeight(Context context)
    {
        return Integer.parseInt(MMSDK.getDpiHeight(context));
    }

    int getScreenWidth(Context context)
    {
        return Integer.parseInt(MMSDK.getDpiWidth(context));
    }

    public MMJSResponse resize(Map map)
    {
        MMWebView mmwebview = (MMWebView)mmWebViewRef.get();
        if (mmwebview != null)
        {
            if (mmwebview.isMraidResized())
            {
                return MMJSResponse.responseWithError("State is currently resized");
            }
            String s = (String)map.get("width");
            Object obj = (String)map.get("height");
            int i = 0;
            int j = 0;
            if (!TextUtils.isEmpty(s))
            {
                i = (int)Float.parseFloat(s);
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                j = (int)Float.parseFloat(((String) (obj)));
            }
            s = (String)map.get("customClosePosition");
            obj = (String)map.get("offsetX");
            String s1 = (String)map.get("offsetY");
            int k = 0;
            int l = 0;
            if (!TextUtils.isEmpty(s1))
            {
                k = (int)Float.parseFloat(s1);
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                l = (int)Float.parseFloat(((String) (obj)));
            }
            boolean flag = Boolean.parseBoolean((String)map.get("allowOffscreen"));
            map = mmwebview.getContext();
            obj = map.getResources().getDisplayMetrics();
            int i1 = getScreenWidth(map);
            int j1 = getScreenHeight(map);
            mmwebview.setMraidResize(new DTOResizeParameters(((DisplayMetrics) (obj)).density, i, j, s, l, k, flag, i1, j1));
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }
}
