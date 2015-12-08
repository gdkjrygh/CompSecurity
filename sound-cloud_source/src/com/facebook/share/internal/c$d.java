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
    String f;
    String g;
    String h;
    final c i;

    protected final void a(D d1)
    {
        d1 = U.b(d1.a, "engagement");
        if (d1 != null)
        {
            e = d1.optString("count_string_with_like", e);
            f = d1.optString("count_string_without_like", f);
            g = d1.optString("social_sentence_with_like", g);
            h = d1.optString("social_sentence_without_like", h);
        }
    }

    protected final void a(r r)
    {
        K.a(G.a, c.f(), "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] {
            a, b, r
        });
        c.a(i, "get_engagement", r);
    }

    (c c1, String s, com.facebook.share.widget.View.e e1)
    {
        i = c1;
        super(c1, s, e1);
        e = c.c(i);
        f = c.d(i);
        g = c.e(i);
        h = c.f(i);
        c1 = new Bundle();
        c1.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
        a(new GraphRequest(AccessToken.a(), s, c1, E.a));
    }
}
