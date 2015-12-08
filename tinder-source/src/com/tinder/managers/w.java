// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.c;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.b.h;
import com.tinder.e.n;
import com.tinder.e.t;
import com.tinder.f.ak;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, d, i

public final class w
{

    private static h c;
    i a;
    com.tinder.managers.d b;
    private f d;

    public w(i i, com.tinder.managers.d d1, f f1)
    {
        a = i;
        b = d1;
        d = f1;
        com.tinder.managers.ManagerApp.h().a(this);
        c = new h();
    }

    public final void a(t t, Message message)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("message", message.getText());
        }
        catch (JSONException jsonexception)
        {
            v.b(jsonexception.toString());
        }
        t = new d(1, (new StringBuilder()).append(d.h).append(message.getMatchId()).toString(), jsonobject, new com.android.volley.i.b(message, t) {

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

            
            {
                c = w.this;
                a = message;
                b = t1;
                super();
            }
        }, new com.android.volley.i.a(t, message) {

            final t a;
            final Message b;
            final w c;

            public final void a(VolleyError volleyerror)
            {
                v.b((new StringBuilder("error sending message: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).toString());
                c.b.a(volleyerror.getMessage(), new n(this) {

                    final _cls2 a;

                    public final void a()
                    {
                    }

                    public final void b()
                    {
                    }

                    public final void c()
                    {
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
                a.c(b);
            }

            
            {
                c = w.this;
                a = t1;
                b = message;
                super();
            }
        }, com.tinder.managers.d.b());
        t.j = new c(20000, 0, 1.0F);
        ManagerApp.b().a(t);
    }
}
