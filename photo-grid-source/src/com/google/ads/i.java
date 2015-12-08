// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            f, a, c, g, 
//            h

public abstract class i extends f
{

    private AdListener a;
    private Context b;
    private h c;

    public i(Context context, h h, AdListener adlistener)
    {
        super(h, adlistener);
        a = adlistener;
        b = context;
        c = h;
    }

    private String[] a(JSONObject jsonobject, String s)
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int j = 0; j < jsonobject.length(); j++)
        {
            s[j] = jsonobject.getString(j);
        }

        return s;
    }

    protected Object a(JSONObject jsonobject)
    {
        return c(jsonobject);
    }

    protected void a(String s, Future future)
    {
        boolean flag1 = TextUtils.isEmpty(s);
        boolean flag;
        if (future.get() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 != flag)
        {
            throw new JSONException("Encountered malformed attribution block.");
        } else
        {
            return;
        }
    }

    protected abstract c b(JSONObject jsonobject);

    protected final c c(JSONObject jsonobject)
    {
        String as[];
        Object obj;
        Object obj1;
        obj = jsonobject.getJSONObject("tracking_urls_and_actions");
        as = a(((JSONObject) (obj)), "impression_tracking_urls");
        obj1 = com.google.ads.a.a(b, c, ((JSONObject) (obj)).optString("base_url"), new String[] {
            "http://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.js"
        });
        obj = b(jsonobject);
        obj1 = (a)((Future) (obj1)).get();
        if (obj != null && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        Log.e("Ads", "Failed to retrieve ad assets.");
        return null;
        ((c) (obj)).a(a, c, ((a) (obj1)), jsonobject, as);
        return ((c) (obj));
        jsonobject;
        Log.e("Ads", "Error parsing ad JSON.", jsonobject);
_L2:
        a(0);
        return null;
        jsonobject;
        continue; /* Loop/switch isn't completed */
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected Future d(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new g(null);
        } else
        {
            return a(jsonobject, "image", false);
        }
    }

    protected String e(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return "";
        } else
        {
            return jsonobject.optString("text");
        }
    }
}
