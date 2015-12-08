// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.l;
import com.tinder.events.EventNewMatch;
import com.tinder.model.User;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ab

final class c
    implements com.android.volley.
{

    final String a;
    final l b;
    final User c;
    final ab d;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response= ")).append(obj);
        if (((JSONObject) (obj)).optInt("status", 200) == 200)
        {
            (new StringBuilder("Like on")).append(a).append(" SUCCESS");
            d.g = ((JSONObject) (obj)).optInt("likes_remaining", 100);
            d.h = ((JSONObject) (obj)).optLong("rate_limited_until", 0L);
            b.a(d.g);
            obj = ((JSONObject) (obj)).optJSONObject("match");
            if (obj != null && c != null)
            {
                try
                {
                    obj = ab.a(d, ((JSONObject) (obj)), c);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    v.a("Failed to parse match from like: ", ((Throwable) (obj)));
                    obj = null;
                }
                if (obj != null)
                {
                    d.l.c(new EventNewMatch(((com.tinder.model.Match) (obj))));
                }
            }
        }
    }

    wMatch(ab ab1, String s, l l1, User user)
    {
        d = ab1;
        a = s;
        b = l1;
        c = user;
        super();
    }
}
