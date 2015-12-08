// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.u;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ab

final class b
    implements com.android.volley.
{

    final String a;
    final u b;
    final ab c;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        try
        {
            if (((JSONObject) (obj)).getInt("status") == 200)
            {
                (new StringBuilder("Pass on ")).append(a).append(" SUCCESS");
                if (b != null)
                {
                    b.f();
                }
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).getMessage();
        }
    }

    (ab ab1, String s, u u1)
    {
        c = ab1;
        a = s;
        b = u1;
        super();
    }
}
