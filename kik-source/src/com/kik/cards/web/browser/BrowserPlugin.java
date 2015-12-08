// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.browser;

import com.kik.cards.web.a.a;
import com.kik.cards.web.aw;
import com.kik.cards.web.picker.PickerRequest;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.f;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kik.android.util.cq;
import org.c.b;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.browser:
//            a

public class BrowserPlugin extends d
{
    public static interface a
    {

        public abstract p a(String s, PickerRequest pickerrequest);

        public abstract void a(int i1);

        public abstract void a(String s, boolean flag);

        public abstract void a(JSONObject jsonobject);

        public abstract p b(String s, PickerRequest pickerrequest);

        public abstract void b(boolean flag);

        public abstract boolean b(String s);

        public abstract void d(String s);

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean h();

        public abstract int n();

        public abstract void o();

        public abstract boolean p();

        public abstract void q();
    }


    private static long a = 0L;
    private static final b b = org.c.c.a("CardsWebDebug");
    private Map d;
    private a e;
    private ScheduledExecutorService f;
    private aw g;
    private String h;
    private boolean i;
    private boolean j;
    private final com.kik.cards.web.a.a k;
    private boolean l;

    public BrowserPlugin(ScheduledExecutorService scheduledexecutorservice, a a1, com.kik.cards.web.a.a a2, String s, aw aw1)
    {
        super("Browser");
        d = new HashMap();
        i = false;
        j = true;
        l = false;
        f = scheduledexecutorservice;
        e = a1;
        k = a2;
        h = s;
        g = aw1;
    }

    static Map a(BrowserPlugin browserplugin)
    {
        return browserplugin.d;
    }

    static a b(BrowserPlugin browserplugin)
    {
        return browserplugin.e;
    }

    public final void a(int i1)
    {
        String s = "free";
        i1;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 59
    //                   1 71
    //                   2 65;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_71;
_L5:
        try
        {
            a(new f("orientationChanged", (new JSONObject()).put("orientation", s)));
            return;
        }
        catch (JSONException jsonexception)
        {
            b.b("Error firing orientation change");
        }
        break MISSING_BLOCK_LABEL_88;
_L2:
        s = "free";
          goto _L5
_L4:
        s = "landscape";
          goto _L5
        s = "portrait";
          goto _L5
    }

    public final void a(boolean flag)
    {
        String s;
        s = "unpause";
        if (flag)
        {
            s = "pause";
        }
        if (!l || flag || j) goto _L2; else goto _L1
_L1:
        k.a();
_L4:
        l = flag;
        c(s);
        return;
_L2:
        if (!l && flag)
        {
            k.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c()
    {
        Object obj1;
        obj1 = UUID.randomUUID().toString();
        ScheduledFuture scheduledfuture = f.schedule(new com.kik.cards.web.browser.a(this, ((String) (obj1))), 2000L, TimeUnit.MILLISECONDS);
        synchronized (d)
        {
            d.put(obj1, scheduledfuture);
        }
        obj = null;
        obj1 = (new JSONObject()).put("requestToken", obj1);
        obj = obj1;
_L2:
        a(new f("back", ((JSONObject) (obj))));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        JSONException jsonexception;
        jsonexception;
        b.b((new StringBuilder("Error firing back event: ")).append(jsonexception).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public j closePopup(JSONObject jsonobject)
    {
        if (!e.e())
        {
            if (e.p())
            {
                e.a(null);
            } else
            {
                e.o();
            }
            return new j();
        } else
        {
            return new j(405);
        }
    }

    public final void d()
    {
        c("reveal");
    }

    public j getOrientationLock(JSONObject jsonobject)
    {
        int i1;
        i1 = e.n();
        jsonobject = "free";
        i1;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 61
    //                   1 73
    //                   2 67;
           goto _L1 _L2 _L3 _L4
_L1:
        return new j((new JSONObject()).put("position", jsonobject));
_L2:
        jsonobject = "free";
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject = "landscape";
        continue; /* Loop/switch isn't completed */
_L3:
        jsonobject = "portrait";
        if (true) goto _L1; else goto _L5
_L5:
    }

    public j handleBack(JSONObject jsonobject)
    {
        Object obj = jsonobject.optString("requestToken");
        boolean flag = jsonobject.optBoolean("override", false);
        synchronized (d)
        {
            obj = (ScheduledFuture)d.remove(obj);
        }
        if (obj != null && !Boolean.valueOf(flag).booleanValue())
        {
            e.q();
        }
        return new j();
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public j isDebugModeEnabled(JSONObject jsonobject)
    {
        return new j((new JSONObject()).put("enabled", e.h()));
    }

    public j isPopupMode(JSONObject jsonobject)
    {
        return new j((new JSONObject()).put("popup", true));
    }

    public j isStatusBarVisible(JSONObject jsonobject)
    {
        jsonobject = new JSONObject();
        jsonobject.put("visible", e.d());
        return new j(200, jsonobject);
    }

    public j openCard(JSONObject jsonobject)
    {
        return openPage(jsonobject);
    }

    public j openExternal(JSONObject jsonobject)
    {
        if (e.e())
        {
            return new j(405);
        }
        jsonobject = jsonobject.optString("url");
        if (jsonobject == null)
        {
            return new j(400);
        } else
        {
            e.d(jsonobject);
            a = System.currentTimeMillis();
            return new j();
        }
    }

    public j openPage(JSONObject jsonobject)
    {
        if (e.e())
        {
            return new j(405);
        }
        String s = com.kik.cards.util.b.c(jsonobject.getString("url"));
        if (cq.c(s))
        {
            return new j(400);
        } else
        {
            e.a(s, jsonobject.optBoolean("popup", false));
            return new j();
        }
    }

    public j pageLoaded(JSONObject jsonobject)
    {
        return new j();
    }

    public j performHttpsUpgradeCleanup(JSONObject jsonobject)
    {
        return new j();
    }

    public j refresh(JSONObject jsonobject)
    {
        return new j();
    }

    public j refreshPlanned(JSONObject jsonobject)
    {
        return new j();
    }

    public j setBacklightTimeoutEnabled(JSONObject jsonobject)
    {
        return new j();
    }

    public j setCardInfo(JSONObject jsonobject, String s)
    {
        if (g != null)
        {
            String s1 = jsonobject.optString("privacy", null);
            jsonobject = jsonobject.optString("terms", null);
            g.a(jsonobject, s1, s);
        }
        return new j(200);
    }

    public j setOrientationLock(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("position");
        if (jsonobject == null)
        {
            return new j(400);
        }
        int i1;
        if (jsonobject.equals("free"))
        {
            i1 = 0;
        } else
        if (jsonobject.equals("portrait"))
        {
            i1 = 1;
        } else
        if (jsonobject.equals("landscape"))
        {
            i1 = 2;
        } else
        {
            return new j(400);
        }
        e.a(i1);
        return new j();
    }

    public j setStatusBarVisible(JSONObject jsonobject)
    {
        boolean flag = jsonobject.getBoolean("visible");
        e.b(flag);
        return new j();
    }

}
