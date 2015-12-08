// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.ao;
import com.tinder.model.User;
import com.tinder.parse.g;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ab

final class c
    implements com.android.volley.
{

    final ao a;
    final User b;
    final String c;
    final ab d;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("undo superlike: ")).append(obj);
        if (((JSONObject) (obj)).optInt("status") == 200)
        {
            obj = g.a(((JSONObject) (obj)));
            d.i = ((com.tinder.model.SuperlikeStatus) (obj));
            a.a(b, ((com.tinder.model.SuperlikeStatus) (obj)));
            return;
        } else
        {
            a.a(c);
            return;
        }
    }

    (ab ab1, ao ao1, User user, String s)
    {
        d = ab1;
        a = ao1;
        b = user;
        c = s;
        super();
    }
}
