// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.aj;
import com.facebook.ak;
import com.facebook.am;
import com.facebook.internal.aw;
import com.facebook.n;
import com.facebook.share.a.g;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            j, a

final class p extends j
{

    boolean e;
    String f;
    final a g;

    p(a a1, String s, g g1)
    {
        g = a1;
        super(a1, s, g1);
        e = com.facebook.share.internal.a.j(g);
        a1 = new Bundle();
        a1.putString("fields", "id,application");
        a1.putString("object", s);
        a(new GraphRequest(AccessToken.a(), "me/og.likes", a1, ak.a));
    }

    protected final void a(aj aj1)
    {
        aj1 = aw.b(aj1.b(), "data");
        if (aj1 != null)
        {
            for (int i = 0; i < aj1.length(); i++)
            {
                JSONObject jsonobject = aj1.optJSONObject(i);
                if (jsonobject == null)
                {
                    continue;
                }
                e = true;
                JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                AccessToken accesstoken = AccessToken.a();
                if (jsonobject1 != null && accesstoken != null && aw.a(accesstoken.f(), jsonobject1.optString("id")))
                {
                    f = jsonobject.optString("id");
                }
            }

        }
    }

    protected final void a(n n)
    {
        com.facebook.internal.ak.a(am.a, com.facebook.share.internal.a.e(), "Error fetching like status for object '%s' with type '%s' : %s", new Object[] {
            a, b, n
        });
        com.facebook.share.internal.a.a(g, "get_og_object_like", n);
    }
}
