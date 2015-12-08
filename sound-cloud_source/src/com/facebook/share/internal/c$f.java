// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.D;
import com.facebook.E;
import com.facebook.G;
import com.facebook.GraphRequest;
import com.facebook.internal.K;
import com.facebook.internal.U;
import com.facebook.r;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            c

private final class  extends 
{

    boolean e;
    String f;
    final c g;

    protected final void a(D d)
    {
        d = U.c(d.a, "data");
        if (d != null)
        {
            for (int i = 0; i < d.length(); i++)
            {
                JSONObject jsonobject = d.optJSONObject(i);
                if (jsonobject == null)
                {
                    continue;
                }
                e = true;
                JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                AccessToken accesstoken = AccessToken.a();
                if (jsonobject1 != null && accesstoken != null && U.a(accesstoken.g, jsonobject1.optString("id")))
                {
                    f = jsonobject.optString("id");
                }
            }

        }
    }

    protected final void a(r r)
    {
        K.a(G.a, c.f(), "Error fetching like status for object '%s' with type '%s' : %s", new Object[] {
            a, b, r
        });
        c.a(g, "get_og_object_like", r);
    }

    (c c1, String s, com.facebook.share.widget.View.e e1)
    {
        g = c1;
        super(c1, s, e1);
        e = c.m(g);
        c1 = new Bundle();
        c1.putString("fields", "id,application");
        c1.putString("object", s);
        a(new GraphRequest(AccessToken.a(), "me/og.likes", c1, E.a));
    }
}
