// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Log;
import com.facebook.b.al;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ad, an, d

class f
    implements ad
{

    final AtomicBoolean a;
    final Set b;
    final Set c;
    final d d;

    f(d d1, AtomicBoolean atomicboolean, Set set, Set set1)
    {
        d = d1;
        a = atomicboolean;
        b = set;
        c = set1;
        super();
    }

    public void a(an an1)
    {
        an1 = an1.b();
        if (an1 != null)
        {
            if ((an1 = an1.optJSONArray("data")) != null)
            {
                a.set(true);
                int i = 0;
                while (i < an1.length()) 
                {
                    Object obj = an1.optJSONObject(i);
                    if (obj != null)
                    {
                        String s = ((JSONObject) (obj)).optString("permission");
                        obj = ((JSONObject) (obj)).optString("status");
                        if (!al.a(s) && !al.a(((String) (obj))))
                        {
                            obj = ((String) (obj)).toLowerCase(Locale.US);
                            if (((String) (obj)).equals("granted"))
                            {
                                b.add(s);
                            } else
                            if (((String) (obj)).equals("declined"))
                            {
                                c.add(s);
                            } else
                            {
                                Log.w("AccessTokenManager", (new StringBuilder()).append("Unexpected status: ").append(((String) (obj))).toString());
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }
}
