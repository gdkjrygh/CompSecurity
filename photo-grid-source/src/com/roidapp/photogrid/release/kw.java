// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.release:
//            kt, kz

final class kw
    implements Runnable
{

    final kt a;

    kw(kt kt1)
    {
        a = kt1;
        super();
    }

    public final void run()
    {
        JSONArray jsonarray;
        int i;
        jsonarray = m.a(kt.a(a));
        i = 0;
_L3:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        String s;
        kz kz1;
        s = jsonarray.getJSONObject(i).getString("folder");
        if (kt.g(a).containsKey(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        kz1 = kt.a(a, s);
        if (kz1 != null)
        {
            try
            {
                kt.g(a).put(s, kz1);
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
        }
        i++;
          goto _L3
_L2:
        String as[] = new String[kt.g(a).size()];
        String as1[] = new String[kt.g(a).size()];
        Integer ainteger[] = new Integer[kt.g(a).size()];
        Object obj = kt.g(a).keySet().iterator();
        for (int j = 0; ((Iterator) (obj)).hasNext(); j++)
        {
            String s1 = (String)((Iterator) (obj)).next();
            as[j] = s1;
            ainteger[j] = Integer.valueOf(((kz)kt.g(a).get(s1)).b);
            as1[j] = ((kz)kt.g(a).get(s1)).a;
        }

        kt.a(a, 60);
        obj = new HashMap();
        ((HashMap) (obj)).put("folders_array", as);
        ((HashMap) (obj)).put("first_pics", as1);
        ((HashMap) (obj)).put("count", ainteger);
        Message message = Message.obtain();
        message.what = 22;
        message.obj = obj;
        kt.b(a).sendMessage(message);
        kt.f(a);
        return;
    }
}
