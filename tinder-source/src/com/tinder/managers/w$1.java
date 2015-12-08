// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.b.h;
import com.tinder.e.t;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            w, i

final class b
    implements com.android.volley.
{

    final Message a;
    final t b;
    final w c;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("jsonObjectResponse=")).append(obj);
        Object obj1;
        try
        {
            obj1 = a.getMatchId();
            String s = ((JSONObject) (obj)).getString("created_date");
            obj = new Message(((String) (obj1)), s, ((JSONObject) (obj)).getString("from"), ((JSONObject) (obj)).getString("message"), true, DateUtils.a(s));
            h.b(((Message) (obj)));
            obj1 = c.a.a(((Message) (obj)).getMatchId());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Error sending message", ((Throwable) (obj)));
            b.c(a);
            return;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        ((Match) (obj1)).addMessage(((Message) (obj)));
        b.b(((Message) (obj)));
        return;
    }

    (w w1, Message message, t t1)
    {
        c = w1;
        a = message;
        b = t1;
        super();
    }
}
