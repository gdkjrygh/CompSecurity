// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.engine.a:
//            b

public class c
{

    private static final String a = com/qihoo/security/engine/a/c.getSimpleName();
    private final Context b;
    private b c[];
    private boolean d;
    private long e;

    c(Context context)
    {
        c = null;
        d = false;
        e = 0L;
        b = context;
    }

    private void a(JSONObject jsonobject, long l)
        throws JSONException
    {
        jsonobject.getInt("version");
        e = l;
        if (c() != e)
        {
            d = true;
        }
    }

    private long c()
    {
        return b.getSharedPreferences("adblock_pref", 0).getLong("key_ad_data_ts", 0L);
    }

    void a(String s, long l)
    {
        b b1;
        int i;
        int j;
        try
        {
            s = new JSONObject(s);
            a(s.getJSONObject("head"), l);
            s = s.optJSONArray("ads");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        j = s.length();
        c = new b[j];
        i = 0;
          goto _L3
_L4:
        b1 = com.qihoo.security.engine.a.b.a(s.getJSONObject(i));
        if (b1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        c[i] = b1;
        i++;
_L3:
        if (i < j) goto _L4; else goto _L2
_L2:
    }

    public b[] a()
    {
        return c;
    }

    void b()
    {
        if (c != null)
        {
            c = null;
        }
    }

}
