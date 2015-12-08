// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android:
//            m, av, aB, ac, 
//            au, Crashlytics, ay, aw

class SettingsController
{

    private aw a;
    private final av b;
    private final ac c;
    private final m d;
    private final ay e;

    public SettingsController(aw aw, ac ac1, av av1, m m1, ay ay1)
    {
        a = aw;
        c = ac1;
        b = av1;
        d = m1;
        e = ay1;
    }

    private au b(CacheBehavior cachebehavior)
    {
        if (CacheBehavior.SKIP_CACHE_LOOKUP.equals(cachebehavior)) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = d.a();
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        Object obj = b.a(c, jsonobject);
        if (obj == null) goto _L6; else goto _L5
_L5:
        long l;
        long l1;
        aB.c((new StringBuilder("Loaded cached settings: ")).append(jsonobject.toString()).toString());
        l = c.a();
        if (CacheBehavior.IGNORE_CACHE_EXPIRATION.equals(cachebehavior))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        l1 = ((au) (obj)).a();
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
            break MISSING_BLOCK_LABEL_115;
        }
        aB.c("Returning cached settings.");
        return ((au) (obj));
        aB.c("Cached settings have expired.");
          goto _L2
_L6:
        aB.a("Failed to transform cached settings data.", null);
        return null;
_L4:
        aB.c("No cached settings data found.");
          goto _L2
        obj;
        cachebehavior = null;
_L7:
        aB.a("Failed to get cached settings", ((Throwable) (obj)));
        return cachebehavior;
        Exception exception;
        exception;
        cachebehavior = ((CacheBehavior) (obj));
        obj = exception;
        if (true) goto _L7; else goto _L2
_L2:
        return null;
    }

    public au a()
    {
        return a(CacheBehavior.USE_CACHE);
    }

    public au a(CacheBehavior cachebehavior)
    {
        Object obj = null;
        if (!Crashlytics.getInstance().getDebugMode())
        {
            obj = b(cachebehavior);
        }
        Exception exception;
        cachebehavior = ((CacheBehavior) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        cachebehavior = ((CacheBehavior) (obj));
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
        cachebehavior = ((CacheBehavior) (obj));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        cachebehavior = ((CacheBehavior) (obj));
        obj = b.a(c, jsonobject);
        cachebehavior = ((CacheBehavior) (obj));
        d.a(((au) (obj)).a(), jsonobject);
        cachebehavior = ((CacheBehavior) (obj));
        aB.c((new StringBuilder("Loaded settings: ")).append(jsonobject.toString()).toString());
        cachebehavior = ((CacheBehavior) (obj));
        obj = cachebehavior;
        if (cachebehavior != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = b(CacheBehavior.IGNORE_CACHE_EXPIRATION);
        return ((au) (obj));
        exception;
        cachebehavior = null;
_L2:
        aB.a("Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", exception);
        return cachebehavior;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private class CacheBehavior extends Enum
    {

        public static final CacheBehavior IGNORE_CACHE_EXPIRATION;
        public static final CacheBehavior SKIP_CACHE_LOOKUP;
        public static final CacheBehavior USE_CACHE;
        private static final CacheBehavior a[];

        public static CacheBehavior valueOf(String s)
        {
            return (CacheBehavior)Enum.valueOf(com/crashlytics/android/SettingsController$CacheBehavior, s);
        }

        public static CacheBehavior[] values()
        {
            return (CacheBehavior[])a.clone();
        }

        static 
        {
            USE_CACHE = new CacheBehavior("USE_CACHE", 0);
            SKIP_CACHE_LOOKUP = new CacheBehavior("SKIP_CACHE_LOOKUP", 1);
            IGNORE_CACHE_EXPIRATION = new CacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
            a = (new CacheBehavior[] {
                USE_CACHE, SKIP_CACHE_LOOKUP, IGNORE_CACHE_EXPIRATION
            });
        }

        private CacheBehavior(String s, int i)
        {
            super(s, i);
        }
    }

}
