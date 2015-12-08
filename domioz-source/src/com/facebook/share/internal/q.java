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
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            j, a

final class q extends j
{

    String e;
    boolean f;
    final a g;

    q(a a1, String s, g g1)
    {
        g = a1;
        super(a1, s, g1);
        a1 = new Bundle();
        a1.putString("fields", "id");
        a1.putString("ids", s);
        a(new GraphRequest(AccessToken.a(), "", a1, ak.a));
    }

    protected final void a(aj aj1)
    {
        aj1 = aw.a(aj1.b(), a);
        if (aj1 != null)
        {
            e = aj1.optString("id");
            boolean flag;
            if (!aw.a(e))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
        }
    }

    protected final void a(n n)
    {
        com.facebook.internal.ak.a(am.a, com.facebook.share.internal.a.e(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
            a, b, n
        });
    }
}
