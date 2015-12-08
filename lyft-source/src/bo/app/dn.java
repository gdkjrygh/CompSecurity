// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.enums.ErrorType;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.InAppMessageEvent;
import com.appboy.models.ResponseError;
import com.appboy.support.AppboyLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            h, ev, ds, et, 
//            do, al, ck, cv, 
//            ct, ei, er, ej, 
//            be, em, cw, bk, 
//            bg, j, bf, cd

public final class dn
    implements Runnable
{

    private static final String a;
    private final ds b;
    private final be c;
    private final be d;
    private final Map e;
    private final j f;
    private final ei g;
    private final em h;
    private final cd i;

    public dn(ds ds1, h h1, j j1, be be1, be be2, ei ei1, cd cd, 
            em em1)
    {
        b = ds1;
        c = be1;
        d = be2;
        ds1 = new HashMap();
        ds1.put("Accept-Encoding", "gzip, deflate");
        ds1.put("Content-Type", "application/json");
        if (h1.b() != null)
        {
            ds1.put("X-Appboy-Api-Key", h1.b());
        }
        if (!ev.c(h1.a))
        {
            ds1.put("X-Appboy-User-Identifier", h1.a);
        }
        ds1.put("X-Appboy-Device-Identifier", h1.a());
        e = ds1;
        f = j1;
        g = ei1;
        i = cd;
        h = em1;
    }

    public final void run()
    {
        obj = et.a(b.f());
        do.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 1075
    //                   1 702
    //                   2 793;
           goto _L1 _L2 _L3
_L1:
        AppboyLogger.w(a, String.format("Received a request with an unknown Http verb: [%s]", new Object[] {
            b.a()
        }));
        obj = null;
_L23:
        if (obj == null) goto _L5; else goto _L4
_L4:
        ct ct1;
        ct1 = ((ck) (obj)).a;
        obj = ((ck) (obj)).b;
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj = ((cv) (obj)).a;
_L36:
        if (obj != null) goto _L9; else goto _L8
_L8:
        b.a(d);
_L28:
        if (ct1 == null) goto _L11; else goto _L10
_L10:
        obj1 = (String)e.get("X-Appboy-User-Identifier");
        obj = ct1.a;
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
        jsonarray = ct1.a;
        if (obj1 == null)
        {
            obj = "";
        } else
        {
            obj = obj1;
        }
        s = ((ei) (obj2)).b.getString("uid", "");
        if (!s.equals(obj)) goto _L15; else goto _L14
_L14:
        AppboyLogger.i(ei.a, (new StringBuilder("Updating offline feed for user with id: ")).append(((String) (obj1))).toString());
        l = er.a();
        obj = ((ei) (obj2)).b.edit();
        if (jsonarray == null) goto _L17; else goto _L16
_L16:
        if (jsonarray.length() != 0) goto _L18; else goto _L17
_L17:
        ((android.content.SharedPreferences.Editor) (obj)).remove("cards");
_L33:
        ((android.content.SharedPreferences.Editor) (obj)).putLong("cards_timestamp", l);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        ((ei) (obj2)).c.retainAll(ei.a(jsonarray));
        ((ei) (obj2)).a(((ei) (obj2)).c, ej.b);
        ((ei) (obj2)).d.retainAll(ei.a(jsonarray));
        ((ei) (obj2)).a(((ei) (obj2)).d, ej.a);
        obj = ((ei) (obj2)).a(jsonarray, ((String) (obj1)), false, l);
_L34:
        if (obj == null) goto _L13; else goto _L19
_L19:
        d.a(obj, com/appboy/events/FeedUpdatedEvent);
_L13:
        if (ct1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L21; else goto _L20
_L20:
        obj2 = h;
        obj = ct1.c;
        synchronized (((em) (obj2)).e)
        {
            obj2.d = ((cw) (obj));
        }
        obj1 = ((em) (obj2)).b.edit();
        if (((cw) (obj)).b != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_events", (new JSONArray(((cw) (obj)).b)).toString());
        }
        if (((cw) (obj)).c != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_attributes", (new JSONArray(((cw) (obj)).c)).toString());
        }
        if (((cw) (obj)).d != null)
        {
            ((android.content.SharedPreferences.Editor) (obj1)).putString("blacklisted_purchases", (new JSONArray(((cw) (obj)).d)).toString());
        }
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("config_time", ((cw) (obj)).a);
        ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("location_enabled", ((cw) (obj)).f);
        ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("location_enabled_set", ((cw) (obj)).e);
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("location_time", ((cw) (obj)).g);
        ((android.content.SharedPreferences.Editor) (obj1)).putFloat("location_distance", ((cw) (obj)).h);
        ((android.content.SharedPreferences.Editor) (obj1)).commit();
_L35:
        c.a(new bk(ct1.c), bo/app/bk);
_L21:
        if (ct1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L11; else goto _L22
_L22:
        d.a(new InAppMessageEvent(ct1.b, (String)e.get("X-Appboy-User-Identifier")), com/appboy/events/InAppMessageEvent);
_L11:
        b.b(c);
        c.a(new bg(b), bo/app/bg);
        return;
_L2:
        obj = new ck(f.a(((java.net.URI) (obj)), e), i);
          goto _L23
_L5:
        try
        {
            AppboyLogger.w(a, "Api response was null, failing task.");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AppboyLogger.w(a, "Experienced exception processing API response. Failing task.", ((Throwable) (obj)));
        }
        b.a(d, new ResponseError(ErrorType.UNRECOGNIZED_ERROR, "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
        c.a(new bf(b), bo/app/bf);
        return;
_L3:
        obj1 = b.c();
        if (obj1 != null) goto _L25; else goto _L24
_L24:
        AppboyLogger.e(a, "Could not parse request parameters for put request to [%s], canceling request.");
        obj = null;
          goto _L23
_L25:
        obj = new ck(f.a(((java.net.URI) (obj)), e, ((org.json.JSONObject) (obj1))), i);
          goto _L23
_L9:
        obj1 = ((ResponseError) (obj)).getType();
        if (obj1 != ErrorType.NO_DEVICE_IDENTIFIER) goto _L27; else goto _L26
_L26:
        AppboyLogger.e(a, "No device identifier. This should never happen. Please contact support@appboy.com");
_L31:
        b.a(d, ((ResponseError) (obj)));
          goto _L28
_L27:
        if (obj1 != ErrorType.INVALID_API_KEY) goto _L30; else goto _L29
_L29:
        AppboyLogger.e(a, "Invalid API key! Please update the API key in the appboy.xml file.");
          goto _L31
_L30:
        if (obj1 != ErrorType.UNRECOGNIZED_ERROR) goto _L31; else goto _L32
_L32:
        AppboyLogger.e(a, (new StringBuilder("Unrecognized server error: ")).append(((ResponseError) (obj)).getMessage()).toString());
          goto _L31
_L18:
        ((android.content.SharedPreferences.Editor) (obj)).putString("cards", jsonarray.toString());
          goto _L33
        obj;
        AppboyLogger.w(a, "Unable to update/publish feed.");
          goto _L13
_L15:
        AppboyLogger.i(ei.a, (new StringBuilder("The received cards are for user ")).append(((String) (obj1))).append(" and the current user is ").append(s).append(" , the cards will be discarded and no changes will be made.").toString());
        obj = null;
          goto _L34
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        AppboyLogger.w(em.a, "Could not persist server config to shared preferences.", ((Throwable) (obj)));
          goto _L35
_L7:
        obj = null;
          goto _L36
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dn.getName()
        });
    }
}
