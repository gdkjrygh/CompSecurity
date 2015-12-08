// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.api:
//            ApiHttpClient

final class istener extends StringRequest
{

    final boolean a;
    final String b;
    final Map c;

    public final Map getHeaders()
    {
        Object obj;
        if (a)
        {
            obj = new HashMap();
        } else
        {
            obj = ApiHttpClient.getRequestHeaders(b);
        }
        if (c != null)
        {
            java.util.lient._cls1 _lcls1;
            for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); ((Map) (obj)).put((String)_lcls1.(), (String)_lcls1.ue()))
            {
                _lcls1 = (java.util.ue)iterator.next();
            }

        }
        return ((Map) (obj));
    }

    Listener(String s, com.android.volley.r r, com.android.volley.stener stener, com.android.volley.istener istener, boolean flag, String s1, Map map)
    {
        a = flag;
        b = s1;
        c = map;
        super(s, r, stener, istener);
    }
}
