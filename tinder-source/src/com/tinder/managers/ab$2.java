// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.d.a;
import com.tinder.e.al;
import com.tinder.enums.RateType;
import com.tinder.model.User;
import com.tinder.parse.g;
import com.tinder.utils.v;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ab

public final class c
    implements com.android.volley.
{

    final User a;
    final al b;
    final String c;
    final ab d;

    public final void a(Object obj)
    {
        Object obj1 = (JSONObject)obj;
        (new StringBuilder("superlikeOnRec: ")).append(obj1);
        boolean flag = ((JSONObject) (obj1)).optBoolean("limit_exceeded");
        obj = g.a(((JSONObject) (obj1)));
        obj1 = ((JSONObject) (obj1)).optJSONObject("match");
        d.i = ((com.tinder.model.SuperlikeStatus) (obj));
        if (obj1 != null && a != null)
        {
            d.n.h(a.getId());
            try
            {
                obj1 = com.tinder.managers.ab.a(d, ((JSONObject) (obj1)), a);
                b.a(((com.tinder.model.Match) (obj1)));
            }
            catch (Exception exception)
            {
                b.a(a);
                v.a("Failed to parse match from like: ", exception);
            }
        }
        if (flag)
        {
            b.b(((com.tinder.model.SuperlikeStatus) (obj)));
            return;
        } else
        {
            d.c.put(c, RateType.SUPERLIKE);
            b.a(((com.tinder.model.SuperlikeStatus) (obj)));
            return;
        }
    }

    public (ab ab1, User user, al al1, String s)
    {
        d = ab1;
        a = user;
        b = al1;
        c = s;
        super();
    }
}
