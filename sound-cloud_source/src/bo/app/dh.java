// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.SharedPreferences;
import com.appboy.c.a;
import com.appboy.c.c;
import com.appboy.d;
import com.appboy.d.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            h, eq, dm, en, 
//            di, ag, ce, cp, 
//            cn, ec, el, ed, 
//            az, eg, cq, be, 
//            bb, j, ba, bx

public final class dh
    implements Runnable
{

    private static final String a;
    private final dm b;
    private final az c;
    private final az d;
    private final Map e;
    private final j f;
    private final ec g;
    private final eg h;
    private final bx i;

    public dh(dm dm1, h h1, j j1, az az1, az az2, ec ec1, bx bx, 
            eg eg1)
    {
        b = dm1;
        c = az1;
        d = az2;
        dm1 = new HashMap();
        dm1.put("Accept-Encoding", "gzip, deflate");
        dm1.put("Content-Type", "application/json");
        if (h1.b() != null)
        {
            dm1.put("X-Appboy-Api-Key", h1.b());
        }
        if (!bo.app.eq.c(h1.a))
        {
            dm1.put("X-Appboy-User-Identifier", h1.a);
        }
        dm1.put("X-Appboy-Device-Identifier", h1.a());
        e = dm1;
        f = j1;
        g = ec1;
        i = bx;
        h = eg1;
    }

    public final void run()
    {
        obj = bo.app.en.a(b.f());
        bo.app.di.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 960
    //                   1 676
    //                   2 756;
           goto _L1 _L2 _L3
_L1:
        String.format("Received a request with an unknown Http verb: [%s]", new Object[] {
            b.a()
        });
        obj = null;
_L23:
        if (obj == null) goto _L5; else goto _L4
_L4:
        cn cn1;
        cn1 = ((ce) (obj)).a;
        obj = ((ce) (obj)).b;
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj = ((cp) (obj)).a;
_L30:
        if (obj != null) goto _L9; else goto _L8
_L8:
        b.a(d);
_L26:
        if (cn1 == null) goto _L11; else goto _L10
_L10:
        obj1 = (String)e.get("X-Appboy-User-Identifier");
        obj = cn1.a;
        Object obj2;
        JSONArray jsonarray;
        String s;
        boolean flag;
        long l;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L13; else goto _L12
_L12:
        obj2 = g;
        jsonarray = cn1.a;
        if (obj1 == null)
        {
            obj = "";
        } else
        {
            obj = obj1;
        }
        s = ((ec) (obj2)).b.getString("uid", "");
        if (!s.equals(obj)) goto _L15; else goto _L14
_L14:
        obj = bo.app.ec.a;
        l = bo.app.el.a();
        obj = ((ec) (obj2)).b.edit();
        if (jsonarray == null) goto _L17; else goto _L16
_L16:
        if (jsonarray.length() != 0) goto _L18; else goto _L17
_L17:
        ((android.content.SharedPreferences.Editor) (obj)).remove("cards");
_L27:
        ((android.content.SharedPreferences.Editor) (obj)).putLong("cards_timestamp", l);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        ((ec) (obj2)).c.retainAll(bo.app.ec.a(jsonarray));
        ((ec) (obj2)).a(((ec) (obj2)).c, ed.b);
        ((ec) (obj2)).d.retainAll(bo.app.ec.a(jsonarray));
        ((ec) (obj2)).a(((ec) (obj2)).d, bo.app.ed.a);
        obj = ((ec) (obj2)).a(jsonarray, ((String) (obj1)), false, l);
_L28:
        if (obj == null) goto _L13; else goto _L19
_L19:
        try
        {
            d.a(obj, com/appboy/c/a);
        }
        catch (JSONException jsonexception) { }
_L13:
        if (cn1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L21; else goto _L20
_L20:
        obj2 = h;
        obj = cn1.c;
        synchronized (((eg) (obj2)).e)
        {
            obj2.d = ((cq) (obj));
        }
        obj1 = ((eg) (obj2)).b.edit();
        if (((cq) (obj)).b != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_events", (new JSONArray(((cq) (obj)).b)).toString());
        }
        if (((cq) (obj)).c != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_attributes", (new JSONArray(((cq) (obj)).c)).toString());
        }
        if (((cq) (obj)).d != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_purchases", (new JSONArray(((cq) (obj)).d)).toString());
        }
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("config_time", ((cq) (obj)).a);
        ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("location_enabled", ((cq) (obj)).f);
        ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("location_enabled_set", ((cq) (obj)).e);
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("location_time", ((cq) (obj)).g);
        ((android.content.SharedPreferences.Editor) (obj1)).putFloat("location_distance", ((cq) (obj)).h);
        ((android.content.SharedPreferences.Editor) (obj1)).commit();
_L29:
        c.a(new be(cn1.c), bo/app/be);
_L21:
        if (cn1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L11; else goto _L22
_L22:
        d.a(new c(cn1.b, (String)e.get("X-Appboy-User-Identifier")), com/appboy/c/c);
_L11:
        b.b(c);
        c.a(new bb(b), bo/app/bb);
        return;
_L2:
        obj = new ce(f.a(((java.net.URI) (obj)), e), i);
          goto _L23
        obj;
_L5:
        b.a(d, new m(com.appboy.b.c.f, "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
        c.a(new ba(b), bo/app/ba);
        return;
_L3:
        obj1 = b.c();
        if (obj1 != null) goto _L25; else goto _L24
_L24:
        obj = null;
          goto _L23
_L25:
        obj = new ce(f.a(((java.net.URI) (obj)), e, ((org.json.JSONObject) (obj1))), i);
          goto _L23
_L9:
        obj1 = ((m) (obj)).a;
        if (obj1 != com.appboy.b.c.c && obj1 != com.appboy.b.c.d && obj1 == com.appboy.b.c.f)
        {
            (new StringBuilder("Unrecognized server error: ")).append(((m) (obj)).b);
        }
        b.a(d, ((m) (obj)));
          goto _L26
_L18:
        ((android.content.SharedPreferences.Editor) (obj)).putString("cards", jsonarray.toString());
          goto _L27
_L15:
        obj = bo.app.ec.a;
        (new StringBuilder("The received cards are for user ")).append(((String) (obj1))).append(" and the current user is ").append(s).append(" , the cards will be discarded and no changes will be made.");
        obj = null;
          goto _L28
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj = bo.app.eg.a;
          goto _L29
_L7:
        obj = null;
          goto _L30
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/dh.getName()
        });
    }
}
