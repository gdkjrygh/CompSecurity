// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.imagelib.filter:
//            b, c

public final class a
    implements s
{

    private final Context a;
    private r b;
    private c c;

    public a(Context context)
    {
        a = context;
    }

    private void b(String s1)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj = c;
        if (obj != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        s1 = new JSONArray(s1);
        if (s1.length() <= 0) goto _L2; else goto _L4
_L4:
        obj = new ArrayList();
        int i = 0;
_L5:
        CloudGroupInfo cloudgroupinfo;
        int l;
        if (i >= s1.length())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        JSONObject jsonobject = s1.optJSONObject(i);
        l = jsonobject.optInt("position");
        cloudgroupinfo = new CloudGroupInfo(jsonobject.optLong("id"));
        JSONObject jsonobject1 = jsonobject.optJSONObject("name");
        cloudgroupinfo.b = jsonobject1.optString(a.getResources().getConfiguration().locale.getLanguage(), jsonobject1.optString("default"));
        cloudgroupinfo.g = Color.parseColor(jsonobject.optString("bg"));
        cloudgroupinfo.d = jsonobject.optString("img_url");
        cloudgroupinfo.c = jsonobject.optString("package_name");
        cloudgroupinfo.e = jsonobject.optInt("version");
        int k = j;
        if (cloudgroupinfo.e > 3)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        b b1 = new b(this);
        b1.a = cloudgroupinfo;
        b1.b = l;
        b1.c = j;
        ((List) (obj)).add(b1);
        k = j + 1;
        break MISSING_BLOCK_LABEL_266;
        c.a(((List) (obj)));
          goto _L2
        s1;
        s1.printStackTrace();
          goto _L2
        s1;
        throw s1;
        i++;
        j = k;
          goto _L5
    }

    public final CloudGroupInfo a(String s1)
    {
        int i;
        Object obj2 = com.roidapp.baselib.d.a.a(new File(a.getExternalCacheDir(), "filterGroupJsonKey"), "UTF-8");
        Object obj = obj2;
        if (obj2 == null)
        {
            obj = a.getAssets();
            try
            {
                obj = com.roidapp.baselib.d.a.a(((AssetManager) (obj)).open("info"), "utf-8");
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                ioexception = ((IOException) (obj2));
            }
        }
        obj2 = new JSONArray(((String) (obj)));
        i = 0;
_L2:
        if (i >= ((JSONArray) (obj2)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((JSONArray) (obj2)).optJSONObject(i);
        ((JSONObject) (obj)).optInt("position");
        if (!((JSONObject) (obj)).optString("package_name").equalsIgnoreCase(s1))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        s1 = new CloudGroupInfo(((JSONObject) (obj)).optLong("id"));
        obj2 = ((JSONObject) (obj)).optJSONObject("name");
        s1.b = ((JSONObject) (obj2)).optString(a.getResources().getConfiguration().locale.getLanguage(), ((JSONObject) (obj2)).optString("default"));
        s1.g = Color.parseColor(((JSONObject) (obj)).optString("bg"));
        s1.d = ((JSONObject) (obj)).optString("img_url");
        s1.c = ((JSONObject) (obj)).optString("package_name");
        s1.e = ((JSONObject) (obj)).optInt("version");
        return s1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
        Object obj1;
        obj1;
        s1 = null;
_L6:
        ((JSONException) (obj1)).printStackTrace();
        return s1;
        obj1;
        s1 = null;
_L4:
        ((NullPointerException) (obj1)).printStackTrace();
        return s1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a()
    {
        String s1;
        Object obj;
        if (a == null)
        {
            return;
        }
        if (b != null)
        {
            b.f();
            b = null;
        }
        s1 = com.roidapp.baselib.d.a.a(new File(a.getExternalCacheDir(), "filterGroupJsonKey"), "UTF-8");
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = a.getAssets();
        obj = com.roidapp.baselib.d.a.a(((AssetManager) (obj)).open("info"), "utf-8");
        s1 = ((String) (obj));
_L2:
        if (s1 != null)
        {
            b(s1);
        }
        b = new r(ImageLibrary.a().h(), this);
        t.a().execute(b);
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(int i, Exception exception)
    {
    }

    public final void a(c c1)
    {
        c = c1;
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        if (a != null)
        {
            com.roidapp.baselib.d.a.a(((String) (obj)), new File(a.getExternalCacheDir(), "filterGroupJsonKey"), "UTF-8");
            b(((String) (obj)));
        }
    }
}
