// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.nuance.b.a.ae;
import com.nuance.b.b.a.c;
import com.nuance.b.b.a.d;
import com.nuance.b.b.a.t;
import com.nuance.b.b.a.u;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.al;
import com.nuance.dragon.toolkit.b.e;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            ax, ff, v, az, 
//            fg, fk, fr, gl, 
//            ft, as, gh, gm, 
//            fe, fd, b, fo, 
//            u

final class fc
{

    Locale a;
    ff b;
    private String c;
    private String d;
    private String e;
    private String f;
    private List g;
    private ax h;
    private ExecutorService i;
    private boolean j;
    private String k;
    private String l;

    fc()
    {
        d = null;
        e = null;
        f = null;
        g = null;
        h = new ax();
        i = Executors.newSingleThreadExecutor();
        j = false;
        k = null;
        l = null;
        b = new ff();
    }

    private static void a(e e1)
    {
        Object obj1 = v.r();
        Object obj = ((v) (obj1)).b();
        obj1 = ((v) (obj1)).j();
        String s = ((az) (obj1)).A();
        if (s != null)
        {
            e1.a("userID", s);
        }
        s = ((az) (obj1)).B();
        if (s != null)
        {
            e1.a("customerMobileAppName", s);
        }
        obj1 = ((az) (obj1)).C();
        if (obj1 != null)
        {
            e1.a("customerMobileAppVersion", ((String) (obj1)));
        }
        e1.a("UUIDEventGenerationCause", ((fg) (obj)).b().toString());
        e1.a("phone_OS", (new StringBuilder("Android-")).append(android.os.Build.VERSION.RELEASE).toString());
        obj = (new SimpleDateFormat("Z")).format(new Date());
        e1.a("region", String.format("GMT%s:%s", new Object[] {
            ((String) (obj)).substring(0, 3), ((String) (obj)).substring(3, 5)
        }));
        e1.a("dictation_language", "en_US");
    }

    private static void a(String s, String s1, ae ae1, String s2, String s3)
    {
        if (!f())
        {
            return;
        }
        String s4 = ae1.a.replaceAll("[\\W]", "_");
        String s5 = ae1.b.replaceAll("[\\W]", "_");
        ae1 = ae1.c.replaceAll("[\\W]", "_");
        com.nuance.b.b.fr.b(String.format("%sAPP_INFO", new Object[] {
            "<:?:>"
        }));
        com.nuance.b.b.fr.b(String.format("%sCN=%s", new Object[] {
            "<:?:>", s4
        }));
        com.nuance.b.b.fr.b(String.format("%sAN=%s", new Object[] {
            "<:?:>", s5
        }));
        com.nuance.b.b.fr.b(String.format("%sAV=%s", new Object[] {
            "<:?:>", ae1
        }));
        com.nuance.b.b.fr.b(String.format("%sDMS=%s", new Object[] {
            "<:?:>", s3
        }));
        com.nuance.b.b.fr.b(String.format("%sCCS=%s", new Object[] {
            "<:?:>", s1
        }));
        com.nuance.b.b.fr.b(String.format("%sCCJ=%s", new Object[] {
            "<:?:>", s
        }));
        com.nuance.b.b.fr.b(String.format("%sDMJ_BEGIN", new Object[] {
            "<:?:>"
        }));
        for (int i1 = 0; i1 < s2.length(); i1 += 1000)
        {
            com.nuance.b.b.fr.b(String.format("%sDMJ=%s", new Object[] {
                "<:?:>", s2.substring(i1, Math.min(i1 + 1000, s2.length()))
            }));
        }

        com.nuance.b.b.fr.b(String.format("%sDMJ_END", new Object[] {
            "<:?:>"
        }));
    }

    private static void a(String s, JSONObject jsonobject)
    {
        if (gl.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.nuance.b.b.fr.e(s);
        int i1;
        int j1;
        try
        {
            s = jsonobject.toString(4).split("\n");
            j1 = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.nuance.b.b.fr.e((new StringBuilder("JSONException creating pretty string -- ")).append(s.toString()).toString());
            return;
        }
        i1 = 0;
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.nuance.b.b.fr.e(s[i1]);
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_41;
_L4:
        break MISSING_BLOCK_LABEL_27;
        if (true) goto _L1; else goto _L5
_L5:
    }

    static boolean a(b b1, JSONArray jsonarray)
    {
        com.nuance.b.b.fr.c((new StringBuilder("sendAgentCommandDict (")).append(b1.b()).append(")").toString());
        Object obj = new JSONObject();
        ft ft1;
        gh gh1;
        try
        {
            ((JSONObject) (obj)).put("messages", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            fr.a(jsonarray.toString());
            fr.a(jsonarray.getStackTrace());
            b1.b(new x(b1.b(), y.h, null, "Unable to create request"));
            return false;
        }
        jsonarray = ax.a(b1.b());
        ft1 = new ft(b1, "Set Agent Value", com.nuance.b.b.as.c);
        obj = ((JSONObject) (obj)).toString();
        gh1 = v.r().a();
        if (gh1 == null)
        {
            b1.b(new x(b1.b(), y.h, null, "No NMT Manager available"));
            return false;
        } else
        {
            gh1.a("NINA_CLOUD_SMS_CMD", jsonarray, ft1, new al[] {
                ax.a(((String) (obj)))
            });
            return true;
        }
    }

    static boolean b(b b1, JSONArray jsonarray)
    {
        com.nuance.b.b.fr.c((new StringBuilder("sendCloudSMS (")).append(b1.b()).append(")").toString());
        Object obj = new JSONObject();
        gm gm1;
        gh gh1;
        try
        {
            ((JSONObject) (obj)).put("messages", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            fr.a(jsonarray.toString());
            fr.a(jsonarray.getStackTrace());
            b1.b(new t(b1.b(), u.f, jsonarray, jsonarray.getMessage()));
            return false;
        }
        jsonarray = ax.a(b1.b());
        gm1 = new gm(b1);
        obj = ((JSONObject) (obj)).toString();
        gh1 = v.r().a();
        if (gh1 == null)
        {
            b1.b(new t(b1.b(), u.d, null, ""));
            return false;
        } else
        {
            gh1.a("NINA_CLOUD_SMS_CMD", jsonarray, gm1, new al[] {
                ax.a(((String) (obj)))
            });
            return true;
        }
    }

    private static boolean f()
    {
        SharedPreferences sharedpreferences;
        sharedpreferences = null;
        Context context = v.r().c;
        if (context != null)
        {
            sharedpreferences = context.getSharedPreferences("Nina.AppCtrl", 0);
        }
        if (sharedpreferences == null || !sharedpreferences.getBoolean("exportAlwaysFromSim", true))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (Build.FINGERPRINT != null && Build.FINGERPRINT.toUpperCase().contains("GENERIC"))
        {
            return true;
        }
        boolean flag;
        if (Build.PRODUCT == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        flag = Build.PRODUCT.toUpperCase().contains("SDK");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
_L2:
        if (sharedpreferences == null || !sharedpreferences.getBoolean("exportInfo", false))
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_108;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
        return true;
    }

    private static boolean g()
    {
        com.nuance.b.b.fr.e("Starting NMT...");
        try
        {
            v.r().q();
        }
        catch (Exception exception)
        {
            fr.a((new StringBuilder("Error starting NMT subsystem: ")).append(exception).toString());
            fr.a(exception.getStackTrace());
            return false;
        }
        return true;
    }

    final void a()
    {
        g = null;
    }

    final void a(long l1, gh gh1, Runnable runnable)
    {
        gh1 = new fe(this, l1, gh1);
        i.submit(gh1);
        i.submit(runnable);
    }

    final void a(b b1, String s, String s1, com.nuance.b.b.u u1, ae ae1)
    {
        b1 = new fd(this, b1, s, s1, u1, ae1);
        i.submit(b1);
    }

    final void a(String s)
    {
        f = s;
    }

    public final void a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        } else
        {
            g = list;
            return;
        }
    }

    final void a(boolean flag)
    {
        j = flag;
    }

    final boolean a(b b1, com.nuance.b.b.u u1, ae ae1, fo fo1)
    {
        com.nuance.b.b.fr.c((new StringBuilder("sendStartSessionFullDialogModel (")).append(b1.b()).append(")").toString());
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("locale", ae1.a(Locale.getDefault()).toString());
            ae1 = ae1.a();
            jsonobject.put("dialogModelDNA", ae1);
            jsonobject.put("dialogModelSHA1", gl.a(ae1.getBytes("UTF-8")));
            ae1 = new com.nuance.b.b.b();
            ae1.a(c);
            ae1.a(u1);
            u1 = ae1.a();
            jsonobject.put("cloudConfigurationDNA", u1);
            jsonobject.put("cloudConfigurationSHA1", gl.a(u1.getBytes("UTF-8")));
            a("StartSession-FullDialogModel post data -- ", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException("Should be unreachable", b1);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException("Should be unreachable", b1);
        }
        b1 = ax.a(b1.b());
        a(((e) (b1)));
        com.nuance.b.b.fr.e("connect about to post Transaction to CloudServices");
        u1 = v.r().a();
        if (u1 == null)
        {
            return false;
        } else
        {
            ae1 = ax.a(jsonobject.toString());
            com.nuance.b.b.fr.e((new StringBuilder("StartSession Dictionary: ")).append(b1.toString()).toString());
            u1.a("NINA_START_SESSION_WITH_DIALOG_MODEL_CMD", b1, fo1, new al[] {
                ae1
            });
            return true;
        }
    }

    final boolean a(b b1, String s, com.nuance.b.b.u u1, ae ae1)
    {
        com.nuance.b.b.fr.c((new StringBuilder("sendStartSession (")).append(b1.b()).append(")").toString());
        if (!g())
        {
            b1.b(new c(b1.b(), d.e, null, "Unable to start NMT"));
            return false;
        }
        v v1 = v.r();
        c = s;
        d = null;
        s = new JSONObject();
        String s1;
        String s2;
        com.nuance.b.b.b b2;
        boolean flag;
        try
        {
            a = Locale.getDefault();
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException("Should be unreachable", b1);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException("Should be unreachable", b1);
        }
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        a = ae1.a(Locale.getDefault());
        ae1.c();
        s1 = ae1.a();
        s2 = gl.a(s1.getBytes("UTF-8"));
        s.put("dialogModelSHA1", s2);
        flag = v1.j().o();
        if (k != null && flag)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        b2 = new com.nuance.b.b.b();
        b2.a(c);
        b2.a(u1);
        k = b2.a();
        l = gl.a(k.getBytes("UTF-8"));
        s.put("cloudConfigurationSHA1", l);
        u1 = new JSONObject();
        u1.put("companyName", ae1.a);
        u1.put("applicationName", ae1.b);
        u1.put("applicationVersion", ae1.c);
        s.put("application", u1);
        a(k, l, ae1, s1, s2);
        s.put("locale", a.toString());
        a("StartSession post data --", ((JSONObject) (s)));
        u1 = ax.a(b1.b());
        a(((e) (u1)));
        ae1 = new fo(b1);
        com.nuance.b.b.fr.e("connect about to post Transaction to CloudServices");
        gh gh1 = v1.a();
        if (gh1 == null)
        {
            b1.b(new c(b1.b(), d.h, null, "de-initialized while attempting connect."));
            return false;
        } else
        {
            b1 = ax.a(s.toString());
            com.nuance.b.b.fr.e((new StringBuilder("StartSession Dictionary: ")).append(u1.toString()).toString());
            gh1.a("NINA_START_SESSION_CMD", u1, ae1, new al[] {
                b1
            });
            return true;
        }
    }

    public final List b()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableList(g);
        }
    }

    final void b(String s)
    {
        boolean flag1 = true;
        e = s;
        ff ff1 = b;
        boolean flag;
        if (gl.a(s, "2.0.0") > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ff1.b = flag;
        ff1 = b;
        if (gl.a(s, "2.0.3") > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ff1.a = flag;
    }

    final String c()
    {
        return d;
    }

    final void c(String s)
    {
        d = s;
    }

    final boolean d()
    {
        return j;
    }

    final String e()
    {
        return c;
    }
}
