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
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            c

private final class  extends 
{

    String e;
    final c f;

    protected final void a(D d)
    {
        d = U.b(d.a, a);
        if (d != null)
        {
            d = d.optJSONObject("og_object");
            if (d != null)
            {
                e = d.optString("id");
            }
        }
    }

    protected final void a(r r1)
    {
        if (r1.a().contains("og_object"))
        {
            c = null;
            return;
        } else
        {
            K.a(G.a, c.f(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
                a, b, r1
            });
            return;
        }
    }

    (c c1, String s, com.facebook.share.widget.View.e e1)
    {
        f = c1;
        super(c1, s, e1);
        c1 = new Bundle();
        c1.putString("fields", "og_object.fields(id)");
        c1.putString("ids", s);
        a(new GraphRequest(AccessToken.a(), "", c1, E.a));
    }
}
