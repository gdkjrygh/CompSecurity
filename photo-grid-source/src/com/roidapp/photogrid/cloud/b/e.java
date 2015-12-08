// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.b;

import android.content.Context;
import android.text.TextUtils;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.c.x;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import com.roidapp.cloudlib.al;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.cloud.b:
//            d

public final class e extends Observable
    implements s
{

    private static boolean a;
    private final File b;
    private final r c;

    protected e(Context context)
    {
        c = new r(al.e, this);
        b = context.getFileStreamPath("cloud_push");
    }

    private static List a(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((s1 = new JSONObject(s1)).optInt("version", 0x7fffffff) > 1 || (s1 = s1.optJSONArray("data")) == null) goto _L1; else goto _L3
_L3:
        ArrayList arraylist;
        d d1;
        Object obj;
        Object obj1;
        String as[];
        int i;
        int j;
        try
        {
            arraylist = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i = 0;
        if (i >= s1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s1.optJSONObject(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        d1 = new d();
        d1.a = ((JSONObject) (obj)).optInt("id");
        d1.c = ((JSONObject) (obj)).optLong("stime");
        d1.d = ((JSONObject) (obj)).optLong("etime");
        d1.e = ((JSONObject) (obj)).optString("title");
        d1.f = ((JSONObject) (obj)).optString("action");
        d1.g = ((JSONObject) (obj)).optString("url");
        d1.i = ((JSONObject) (obj)).optInt("mode");
        d1.h = ((JSONObject) (obj)).optString("resource");
        obj1 = ((JSONObject) (obj)).optJSONArray("blackcountry");
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        d1.j = new HashSet();
        j = 0;
_L6:
        if (j >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        d1.j.add(((JSONArray) (obj1)).optString(j).toUpperCase());
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        obj1 = ((JSONObject) (obj)).optJSONArray("whitecountry");
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        d1.k = new HashSet();
        j = 0;
_L9:
        if (j >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        d1.k.add(((JSONArray) (obj1)).optString(j).toUpperCase());
        j++;
        if (true) goto _L9; else goto _L8
_L8:
        obj = ((JSONObject) (obj)).optJSONArray("code");
        if (obj == null) goto _L11; else goto _L10
_L10:
        d1.b = new ArrayList();
        j = 0;
_L12:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        as = ((JSONArray) (obj)).optString(j).split("#");
        as = new x(Integer.valueOf(Integer.valueOf(as[0]).intValue()), Integer.valueOf(Integer.valueOf(as[1]).intValue()));
        d1.b.add(as);
        j++;
        if (true) goto _L12; else goto _L11
_L11:
        arraylist.add(d1);
        i++;
        if (true) goto _L14; else goto _L13
_L14:
        break MISSING_BLOCK_LABEL_52;
_L13:
        return arraylist;
    }

    public final List a()
    {
        if (b.exists())
        {
            return a(com.roidapp.baselib.d.a.a(b, "UTF-8"));
        } else
        {
            return null;
        }
    }

    public final void a(int i, Exception exception)
    {
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        List list = a(((String) (obj)));
        if (list != null && !list.isEmpty())
        {
            com.roidapp.baselib.d.a.a(((String) (obj)), b, "UTF-8");
            setChanged();
            notifyObservers(list);
        }
    }

    public final void a(Observer observer)
    {
        if (a)
        {
            return;
        }
        if (observer != null)
        {
            addObserver(observer);
        }
        a = true;
        t.a().execute(c);
    }
}
