// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.SharedPreferences;
import com.appboy.c.c;
import com.appboy.d.j;
import com.appboy.f;
import com.appboy.f.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package a.a:
//            ga, dm, ck, dk, 
//            cg, k, bf, bq, 
//            bo, db, dj, dc, 
//            aa, df, br, ag, 
//            ac, ic, ab, az

public final class cf
    implements Runnable
{

    private static final String a;
    private final ck b;
    private final aa c;
    private final aa d;
    private final Map e;
    private final ic f;
    private final db g;
    private final df h;
    private final az i;

    public cf(ck ck1, ga ga1, ic ic1, aa aa1, aa aa2, db db1, az az, 
            df df1)
    {
        b = ck1;
        c = aa1;
        d = aa2;
        ck1 = new HashMap();
        ck1.put("Accept-Encoding", "gzip, deflate");
        ck1.put("Content-Type", "application/json");
        if (ga1.b() != null)
        {
            ck1.put("X-Appboy-Api-Key", ga1.b());
        }
        if (!a.a.dm.c(ga1.a))
        {
            ck1.put("X-Appboy-User-Identifier", ga1.a);
        }
        ck1.put("X-Appboy-Device-Identifier", ga1.a());
        e = ck1;
        f = ic1;
        g = db1;
        i = az;
        h = df1;
    }

    public final void run()
    {
        obj = a.a.dk.a(b.f());
        a.a.cg.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 1075
    //                   1 702
    //                   2 793;
           goto _L1 _L2 _L3
_L1:
        com.appboy.f.a.c(a, String.format("Received a request with an unknown Http verb: [%s]", new Object[] {
            b.a()
        }));
        obj = null;
_L23:
        if (obj == null) goto _L5; else goto _L4
_L4:
        bo bo1;
        bo1 = ((bf) (obj)).a;
        obj = ((bf) (obj)).b;
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj = ((bq) (obj)).a;
_L36:
        if (obj != null) goto _L9; else goto _L8
_L8:
        b.a(d);
_L28:
        if (bo1 == null) goto _L11; else goto _L10
_L10:
        obj1 = (String)e.get("X-Appboy-User-Identifier");
        obj = bo1.a;
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
        jsonarray = bo1.a;
        if (obj1 == null)
        {
            obj = "";
        } else
        {
            obj = obj1;
        }
        s = ((db) (obj2)).b.getString("uid", "");
        if (!s.equals(obj)) goto _L15; else goto _L14
_L14:
        com.appboy.f.a.b(a.a.db.a, (new StringBuilder("Updating offline feed for user with id: ")).append(((String) (obj1))).toString());
        l = a.a.dj.a();
        obj = ((db) (obj2)).b.edit();
        if (jsonarray == null) goto _L17; else goto _L16
_L16:
        if (jsonarray.length() != 0) goto _L18; else goto _L17
_L17:
        ((android.content.SharedPreferences.Editor) (obj)).remove("cards");
_L33:
        ((android.content.SharedPreferences.Editor) (obj)).putLong("cards_timestamp", l);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        ((db) (obj2)).c.retainAll(a.a.db.a(jsonarray));
        ((db) (obj2)).a(((db) (obj2)).c, dc.b);
        ((db) (obj2)).d.retainAll(a.a.db.a(jsonarray));
        ((db) (obj2)).a(((db) (obj2)).d, a.a.dc.a);
        obj = ((db) (obj2)).a(jsonarray, ((String) (obj1)), false, l);
_L34:
        if (obj == null) goto _L13; else goto _L19
_L19:
        d.a(obj, com/appboy/c/a);
_L13:
        if (bo1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L21; else goto _L20
_L20:
        obj2 = h;
        obj = bo1.c;
        synchronized (((df) (obj2)).e)
        {
            obj2.d = ((br) (obj));
        }
        obj1 = ((df) (obj2)).b.edit();
        if (((br) (obj)).b != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_events", (new JSONArray(((br) (obj)).b)).toString());
        }
        if (((br) (obj)).c != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_attributes", (new JSONArray(((br) (obj)).c)).toString());
        }
        if (((br) (obj)).d != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_purchases", (new JSONArray(((br) (obj)).d)).toString());
        }
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("config_time", ((br) (obj)).a);
        ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("location_enabled", ((br) (obj)).f);
        ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("location_enabled_set", ((br) (obj)).e);
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("location_time", ((br) (obj)).g);
        ((android.content.SharedPreferences.Editor) (obj1)).putFloat("location_distance", ((br) (obj)).h);
        ((android.content.SharedPreferences.Editor) (obj1)).commit();
_L35:
        c.a(new ag(bo1.c), a/a/ag);
_L21:
        if (bo1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L11; else goto _L22
_L22:
        d.a(new c(bo1.b, (String)e.get("X-Appboy-User-Identifier")), com/appboy/c/c);
_L11:
        b.b(c);
        c.a(new ac(b), a/a/ac);
        return;
_L2:
        obj = new bf(f.a(((java.net.URI) (obj)), e), i);
          goto _L23
_L5:
        try
        {
            com.appboy.f.a.c(a, "Api response was null, failing task.");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.appboy.f.a.b(a, "Experienced exception processing API response. Failing task.", ((Throwable) (obj)));
        }
        b.a(d, new j(com.appboy.b.c.f, "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
        c.a(new ab(b), a/a/ab);
        return;
_L3:
        obj1 = b.c();
        if (obj1 != null) goto _L25; else goto _L24
_L24:
        com.appboy.f.a.d(a, "Could not parse request parameters for put request to [%s], canceling request.");
        obj = null;
          goto _L23
_L25:
        obj = new bf(f.a(((java.net.URI) (obj)), e, ((org.json.JSONObject) (obj1))), i);
          goto _L23
_L9:
        obj1 = ((j) (obj)).a();
        if (obj1 != com.appboy.b.c.c) goto _L27; else goto _L26
_L26:
        com.appboy.f.a.d(a, "No device identifier. This should never happen. Please contact support@appboy.com");
_L31:
        b.a(d, ((j) (obj)));
          goto _L28
_L27:
        if (obj1 != com.appboy.b.c.d) goto _L30; else goto _L29
_L29:
        com.appboy.f.a.d(a, "Invalid API key! Please update the API key in the appboy.xml file.");
          goto _L31
_L30:
        if (obj1 != com.appboy.b.c.f) goto _L31; else goto _L32
_L32:
        com.appboy.f.a.d(a, (new StringBuilder("Unrecognized server error: ")).append(((j) (obj)).b()).toString());
          goto _L31
_L18:
        ((android.content.SharedPreferences.Editor) (obj)).putString("cards", jsonarray.toString());
          goto _L33
        obj;
        com.appboy.f.a.c(a, "Unable to update/publish feed.");
          goto _L13
_L15:
        com.appboy.f.a.b(a.a.db.a, (new StringBuilder("The received cards are for user ")).append(((String) (obj1))).append(" and the current user is ").append(s).append(" , the cards will be discarded and no changes will be made.").toString());
        obj = null;
          goto _L34
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        com.appboy.f.a.b(a.a.df.a, "Could not persist server config to shared preferences.", ((Throwable) (obj)));
          goto _L35
_L7:
        obj = null;
          goto _L36
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/cf.getName()
        });
    }
}
