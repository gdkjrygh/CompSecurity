// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.roidapp.baselib.d.a;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.LocalFilterInfo;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
{

    private static Map a;

    public r()
    {
    }

    public static Context a(Context context, String s)
    {
        a = new HashMap();
        Context context1 = null;
        if (a.containsKey(s))
        {
            context1 = (Context)((WeakReference)a.get(s)).get();
        } else
        {
            try
            {
                context = context.createPackageContext(s, 2);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                context = context1;
            }
            context1 = context;
            if (context != null)
            {
                a.put(s, new WeakReference(context));
                return context;
            }
        }
        return context1;
    }

    public static void a()
    {
        if (a != null)
        {
            a.clear();
            a = null;
        }
    }

    public static IFilterInfo[] b(Context context, String s)
    {
        Context context1 = a(context, s);
        if (context1 == null)
        {
            return null;
        }
        JSONArray jsonarray = (new JSONObject(com.roidapp.baselib.d.a.a(context1.getAssets().open("plugin"), "utf-8"))).optJSONArray("infos");
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        if (jsonarray.length() == 0)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        IFilterInfo aifilterinfo[];
        int j;
        aifilterinfo = new IFilterInfo[jsonarray.length()];
        j = aifilterinfo.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        CloudFilterInfo cloudfilterinfo;
        Bundle bundle;
        JSONObject jsonobject = jsonarray.optJSONObject(i);
        cloudfilterinfo = new CloudFilterInfo();
        cloudfilterinfo.b = jsonobject.optInt("type");
        cloudfilterinfo.a = jsonobject.optInt("id");
        cloudfilterinfo.e = jsonobject.optString("icon");
        Object obj = jsonobject.optJSONObject("name");
        cloudfilterinfo.c = ((JSONObject) (obj)).optString(context.getResources().getConfiguration().locale.getLanguage(), ((JSONObject) (obj)).optString("default"));
        cloudfilterinfo.d = s;
        jsonobject = jsonobject.optJSONObject("extra");
        obj = jsonobject.keys();
        bundle = new Bundle();
        String s1;
        for (; ((Iterator) (obj)).hasNext(); bundle.putString(s1, jsonobject.optString(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        cloudfilterinfo.f = bundle;
        aifilterinfo[i] = cloudfilterinfo;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        context = new IFilterInfo[jsonarray.length() + 1];
        context[0] = new LocalFilterInfo(0, f.aH, "Original", 1024);
        System.arraycopy(aifilterinfo, 0, context, 1, j);
        return context;
        context;
        break MISSING_BLOCK_LABEL_306;
        return null;
        context;
        return null;
    }
}
