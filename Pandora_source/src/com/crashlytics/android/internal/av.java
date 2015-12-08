// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            cm, ba, ax, cj, 
//            au, am, bg, aw, 
//            ca, ay

public class av
{

    private ay a;
    private final ax b;
    private final bg c;
    private final am d;
    private final ca e;

    public av(ay ay, bg bg1, ax ax1, am am1, ca ca1)
    {
        a = ay;
        c = bg1;
        b = ax1;
        d = am1;
        e = ca1;
    }

    private void a(JSONObject jsonobject, String s)
        throws JSONException
    {
        JSONObject jsonobject1 = jsonobject;
        if (!ba.e(cm.a().w()))
        {
            jsonobject1 = b.a(jsonobject);
        }
        cm.a().b().a("Crashlytics", (new StringBuilder()).append(s).append(jsonobject1.toString()).toString());
    }

    private aw b(au au1)
    {
        if (au.b.equals(au1)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        Object obj = b.a(c, jsonobject);
        if (obj == null) goto _L6; else goto _L5
_L5:
        long l;
        long l1;
        a(jsonobject, "Loaded cached settings: ");
        l = c.a();
        if (au.c.equals(au1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        l1 = ((aw) (obj)).f;
        boolean flag;
        if (l1 < l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        cm.a().b().a("Crashlytics", "Returning cached settings.");
        return ((aw) (obj));
        cm.a().b().a("Crashlytics", "Cached settings have expired.");
          goto _L2
_L6:
        cm.a().b().a("Crashlytics", "Failed to transform cached settings data.", null);
        return null;
_L4:
        cm.a().b().a("Crashlytics", "No cached settings data found.");
          goto _L2
        obj;
        au1 = null;
_L7:
        cm.a().b().a("Crashlytics", "Failed to get cached settings", ((Throwable) (obj)));
        return au1;
        Exception exception;
        exception;
        au1 = ((au) (obj));
        obj = exception;
        if (true) goto _L7; else goto _L2
_L2:
        return null;
    }

    public aw a()
    {
        return a(au.a);
    }

    public aw a(au au1)
    {
        Object obj = null;
        if (!cm.a().g())
        {
            obj = b(au1);
        }
        Exception exception;
        au1 = ((au) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        au1 = ((au) (obj));
        JSONObject jsonobject;
        try
        {
            jsonobject = e.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        au1 = ((au) (obj));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        au1 = ((au) (obj));
        obj = b.a(c, jsonobject);
        au1 = ((au) (obj));
        d.a(((aw) (obj)).f, jsonobject);
        au1 = ((au) (obj));
        a(jsonobject, "Loaded settings: ");
        au1 = ((au) (obj));
        obj = au1;
        if (au1 != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = b(au.c);
        return ((aw) (obj));
        exception;
        au1 = null;
_L2:
        cm.a().b().a("Crashlytics", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return au1;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
