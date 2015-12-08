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
import com.facebook.share.a.g;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            j, a

final class n extends j
{

    String e;
    String f;
    String g;
    String h;
    final a i;

    n(a a1, String s, g g1)
    {
        i = a1;
        super(a1, s, g1);
        e = com.facebook.share.internal.a.b(i);
        f = com.facebook.share.internal.a.c(i);
        g = com.facebook.share.internal.a.d(i);
        h = com.facebook.share.internal.a.e(i);
        a1 = new Bundle();
        a1.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
        a(new GraphRequest(AccessToken.a(), s, a1, ak.a));
    }

    protected final void a(aj aj1)
    {
        aj1 = aw.a(aj1.b(), "engagement");
        if (aj1 != null)
        {
            e = aj1.optString("count_string_with_like", e);
            f = aj1.optString("count_string_without_like", f);
            g = aj1.optString("social_sentence_with_like", g);
            h = aj1.optString("social_sentence_without_like", h);
        }
    }

    protected final void a(com.facebook.n n1)
    {
        com.facebook.internal.ak.a(am.a, com.facebook.share.internal.a.e(), "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] {
            a, b, n1
        });
        com.facebook.share.internal.a.a(i, "get_engagement", n1);
    }
}
