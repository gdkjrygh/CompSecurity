// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.i;
import com.facebook.ads.NativeAd;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.appbox.b.b;
import com.qihoo.security.appbox.b.c;
import com.qihoo.security.locale.d;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.appbox.core:
//            AppBoxResponse, c, b

public class com.qihoo.security.appbox.core.a
{
    public static class a
    {

        public String a;
        public long b;
        public long c;

        public String toString()
        {
            return (new StringBuilder()).append("AppBoxData [jsonData=").append(a).append(", updateTime=").append(b).append(", lastRequestTime=").append(c).append("]").toString();
        }

        public a()
        {
        }
    }

    private static class b
    {

        private boolean a;
        private int b;

        static boolean a(b b1)
        {
            return b1.a;
        }

        static int b(b b1)
        {
            return b1.b;
        }

        public String toString()
        {
            return (new StringBuilder()).append("AppBoxV5update [show=").append(a).append(", index=").append(b).append("]").toString();
        }

        public b(boolean flag, int i1)
        {
            a = flag;
            b = i1;
        }
    }

    private class c
        implements com.facebook.ads.d
    {

        NativeAd a;
        boolean b;
        com.qihoo.security.appbox.core.c c;
        String d;
        String e;
        final com.qihoo.security.appbox.core.a f;

        public void onAdClicked(com.facebook.ads.a a1)
        {
            if (a1 != a || c == null || c.q)
            {
                return;
            }
            c.q = true;
            a1 = new NativeAd(SecurityApplication.a(), d);
            a1.a(f. new c(a1, e, false, d));
            try
            {
                a1.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.facebook.ads.a a1)
            {
                return;
            }
        }

        public void onAdLoaded(com.facebook.ads.a a1)
        {
            if (a1 == a) goto _L2; else goto _L1
_L1:
            return;
_L2:
            c = new com.qihoo.security.appbox.core.c();
            a1 = a.f();
            com.facebook.ads.NativeAd.a a2 = a.e();
            com.facebook.ads.NativeAd.a a3 = a.d();
            String s1 = a.g();
            com.facebook.ads.NativeAd.b b1 = a.j();
            String s2 = a.h();
            if (a1 != null)
            {
                c.j = a1;
            }
            if (a2 != null)
            {
                c.e = a2.a();
            }
            if (a3 != null)
            {
                c.h = a3.a();
            }
            if (s1 != null)
            {
                c.b = s1;
            }
            if (b1 != null)
            {
                c.m = (float)b1.a();
            }
            if (s2 != null)
            {
                c.s = s2;
            }
            c.o = a;
            c.r = System.currentTimeMillis();
            synchronized (f)
            {
                com.qihoo.security.appbox.core.a.a(f, e).put(d, c);
            }
            if (!b || !com.qihoo360.common.e.b.b(SecurityApplication.a())) goto _L1; else goto _L3
_L3:
            com.qihoo.security.appbox.c.a.b.a().a(c.e);
            com.qihoo.security.appbox.c.a.b.a().a(c.h);
            return;
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onError(com.facebook.ads.a a1, com.facebook.ads.c c1)
        {
        }

        private c(NativeAd nativead, String s1, boolean flag, String s2)
        {
            f = com.qihoo.security.appbox.core.a.this;
            super();
            a = nativead;
            b = flag;
            d = s2;
            e = s1;
        }

    }


    private static final b a = new b(true, 0);
    private static com.qihoo.security.appbox.core.a h;
    private Map b;
    private Map c;
    private Handler d;
    private Handler e;
    private Context f;
    private long g;
    private AppBoxResponse i;
    private AppBoxResponse j;
    private AppBoxResponse k;
    private AppBoxResponse l;

    private com.qihoo.security.appbox.core.a()
    {
        g = 0L;
        b = new HashMap();
        i = new AppBoxResponse();
        j = new AppBoxResponse();
        k = new AppBoxResponse();
        l = new AppBoxResponse();
        c = new HashMap();
        d = new Handler(Looper.getMainLooper());
        HandlerThread handlerthread = new HandlerThread("appbox");
        handlerthread.start();
        e = new Handler(handlerthread.getLooper());
        f = SecurityApplication.a();
        h();
    }

    static AppBoxResponse a(com.qihoo.security.appbox.core.a a1)
    {
        return a1.i;
    }

    public static com.qihoo.security.appbox.core.a a()
    {
        com/qihoo/security/appbox/core/a;
        JVM INSTR monitorenter ;
        com.qihoo.security.appbox.core.a a1;
        if (h == null)
        {
            h = new com.qihoo.security.appbox.core.a();
        }
        a1 = h;
        com/qihoo/security/appbox/core/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    static Map a(com.qihoo.security.appbox.core.a a1, String s1)
    {
        return a1.c(s1);
    }

    public static void a(Context context)
    {
        context.sendBroadcast(new Intent("_qihoo_AppBox_APPLICATION_REFRESH"));
    }

    private void a(Context context, AppBoxResponse appboxresponse, String s1, com.qihoo.security.appbox.b.c c1)
    {
        if (c1 == null)
        {
            return;
        }
        if (appboxresponse == null || appboxresponse.errno != 0)
        {
            context = com.qihoo.security.locale.d.a().a(0x7f0c01c0);
            int i1;
            if (appboxresponse == null)
            {
                i1 = -1;
            } else
            {
                i1 = appboxresponse.errno;
            }
            c1.a(i1, context);
            return;
        } else
        {
            c1.a(appboxresponse);
            return;
        }
    }

    private void a(Context context, String s1, String s2, com.qihoo.security.appbox.b.c c1, long l1)
    {
        try
        {
            context = com.qihoo.security.appbox.b.b.a(context, new JSONObject(s2));
            context.lastRequestTime = l1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        a(c1, ((AppBoxResponse) (context)));
        a(((AppBoxResponse) (context)), s1);
        return;
    }

    public static void a(Context context, String s1, boolean flag)
    {
        if (flag)
        {
            com.qihoo.security.appbox.bi.a.a(s1);
        }
        Object obj;
        if (flag)
        {
            obj = "_qihoo_AppBox_APPLICATION_INSTALL";
        } else
        {
            obj = "_qihoo_AppBox_APPLICATION_UNINSTALL";
        }
        obj = new Intent(((String) (obj)));
        ((Intent) (obj)).putExtra("packageName", s1);
        context.sendBroadcast(((Intent) (obj)));
    }

    private void a(com.qihoo.security.appbox.b.c c1, AppBoxResponse appboxresponse)
    {
        if (c1 == null)
        {
            return;
        } else
        {
            b(new Runnable(c1, appboxresponse) {

                final com.qihoo.security.appbox.b.c a;
                final AppBoxResponse b;
                final com.qihoo.security.appbox.core.a c;

                public void run()
                {
                    a.a(b);
                }

            
            {
                c = com.qihoo.security.appbox.core.a.this;
                a = c1;
                b = appboxresponse;
                super();
            }
            });
            return;
        }
    }

    private void a(AppBoxResponse appboxresponse, String s1)
    {
        if ("1".equals(s1))
        {
            j = appboxresponse;
            return;
        }
        if ("0".equals(s1))
        {
            i = appboxresponse;
            return;
        } else
        {
            k = appboxresponse;
            return;
        }
    }

    static void a(com.qihoo.security.appbox.core.a a1, Context context, AppBoxResponse appboxresponse, String s1, com.qihoo.security.appbox.b.c c1)
    {
        a1.a(context, appboxresponse, s1, c1);
    }

    static void a(com.qihoo.security.appbox.core.a a1, Context context, String s1, String s2, com.qihoo.security.appbox.b.c c1, long l1)
    {
        a1.a(context, s1, s2, c1, l1);
    }

    static void a(com.qihoo.security.appbox.core.a a1, AppBoxResponse appboxresponse, String s1)
    {
        a1.a(appboxresponse, s1);
    }

    private void a(Map map, String s1)
    {
        JSONObject jsonobject;
        String s2;
        int i1;
        int j1;
        try
        {
            s1 = new JSONArray(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L2:
        if (i1 >= s1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = (JSONObject)s1.opt(i1);
        s2 = jsonobject.optString("country", "default");
        j1 = jsonobject.optInt("facebook_index", 0);
        map.put(s2, new b(jsonobject.optBoolean("show_facebook", true), j1));
        i1++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(com.qihoo.security.appbox.core.c c1, boolean flag)
    {
        boolean flag1 = true;
        if (c1 != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (c1.p)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (c1.q)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (System.currentTimeMillis() - c1.r <= 0x2932e0L)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (c1.q)
        {
            return true;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private AppBoxResponse b(String s1)
    {
        AppBoxResponse appboxresponse = null;
        if ("1".equals(s1))
        {
            appboxresponse = j;
        } else
        {
            if ("0".equals(s1))
            {
                return i;
            }
            if ("2".equals(s1))
            {
                return k;
            }
            if ("3".equals(s1))
            {
                return l;
            }
        }
        return appboxresponse;
    }

    private void b(AppBoxResponse appboxresponse, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        jsonobject.put("error", appboxresponse.errno);
        jsonobject.put("end_state", appboxresponse.end_state);
        jsonobject.put("updateTime", appboxresponse.updateTime);
        jsonobject.put("total", appboxresponse.total);
        obj = new JSONArray();
        if (appboxresponse.appItems == null || appboxresponse.appItems.size() == 0) goto _L2; else goto _L1
_L1:
        for (Iterator iterator = appboxresponse.appItems.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(com.qihoo.security.appbox.b.a.a((com.qihoo.security.appbox.core.c)iterator.next()))) { }
          goto _L3
_L2:
        com.qihoo.security.appbox.core.b.a(f, jsonobject.toString(), s1, appboxresponse.lastRequestTime, appboxresponse.updateTime);
        return;
_L3:
        try
        {
            jsonobject.put("data", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (true) goto _L2; else goto _L4
_L4:
    }

    static void b(com.qihoo.security.appbox.core.a a1, AppBoxResponse appboxresponse, String s1)
    {
        a1.b(appboxresponse, s1);
    }

    private void b(Runnable runnable)
    {
        d.post(runnable);
    }

    private Map c(String s1)
    {
        Map map = null;
        if ("3".equals(s1))
        {
            map = c;
        }
        return map;
    }

    private void d(String s1)
    {
        AppBoxResponse appboxresponse = b(s1);
        if (appboxresponse.appItems != null)
        {
            appboxresponse.lastRequestTime = 0L;
            appboxresponse.appItems = null;
        }
        if (com.qihoo.security.appbox.core.b.a(f, s1).a != null)
        {
            com.qihoo.security.appbox.core.b.a(f, null, s1, 0L, 0L);
        }
    }

    private b g()
    {
        Object obj = com.qihoo.security.locale.c.b(f);
        this;
        JVM INSTR monitorenter ;
        b b1 = (b)b.get(obj);
        obj = b1;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        b1 = (b)b.get("default");
        obj = b1;
        if (b1 == null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        return ((b) (obj));
        this;
        JVM INSTR monitorexit ;
        return a;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void h()
    {
        long l1 = s.e(f, "f_c.dat");
        if (g != l1)
        {
            e.post(new Runnable() {

                final com.qihoo.security.appbox.core.a a;

                public void run()
                {
                    a.d();
                }

            
            {
                a = com.qihoo.security.appbox.core.a.this;
                super();
            }
            });
        }
    }

    public ArrayList a(String s1)
    {
        ArrayList arraylist = new ArrayList();
        if ("3".equals(s1))
        {
            arraylist.add("521616881325172_523325181154342");
            arraylist.add("521616881325172_523325277820999");
            arraylist.add("521616881325172_523325364487657");
            arraylist.add("521616881325172_523325437820983");
            arraylist.add("521616881325172_523325644487629");
            arraylist.add("521616881325172_523329817820545");
            arraylist.add("521616881325172_523325784487615");
        }
        return arraylist;
    }

    public void a(Context context, com.qihoo.security.appbox.b.c c1)
    {
        if (c1 != null)
        {
            c1.a();
        }
        if (i.lastRequestTime > 0L)
        {
            c1.a(i);
            if (System.currentTimeMillis() - i.lastRequestTime > 0x5265c00L)
            {
                a(context, "appbox", c1);
            }
            return;
        } else
        {
            e.post(new Runnable(context, c1) {

                final Context a;
                final com.qihoo.security.appbox.b.c b;
                final com.qihoo.security.appbox.core.a c;

                public void run()
                {
                    a a1 = com.qihoo.security.appbox.core.b.a(a, "0");
                    boolean flag;
                    if (System.currentTimeMillis() - a1.c > 0x5265c00L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!TextUtils.isEmpty(a1.a))
                    {
                        com.qihoo.security.appbox.core.a.a(c, a, "0", a1.a, b, a1.c);
                    }
                    if (flag)
                    {
                        c.a(a, "appbox", b);
                    }
                }

            
            {
                c = com.qihoo.security.appbox.core.a.this;
                a = context;
                b = c1;
                super();
            }
            });
            return;
        }
    }

    public void a(Context context, com.qihoo.security.appbox.b.c c1, String s1, int i1, AtomicBoolean atomicboolean)
    {
        if (c1 != null)
        {
            c1.a();
        }
        AppBoxResponse appboxresponse = b(s1);
        if (appboxresponse.lastRequestTime > 0L)
        {
            c1.a(appboxresponse);
            if (System.currentTimeMillis() - appboxresponse.lastRequestTime > 0x5265c00L)
            {
                a(false, context, s1, i1, atomicboolean, appboxresponse.updateTime, c1);
            }
            return;
        } else
        {
            e.post(new Runnable(context, s1, c1, i1, atomicboolean) {

                final Context a;
                final String b;
                final com.qihoo.security.appbox.b.c c;
                final int d;
                final AtomicBoolean e;
                final com.qihoo.security.appbox.core.a f;

                public void run()
                {
                    a a1 = com.qihoo.security.appbox.core.b.a(a, b);
                    boolean flag;
                    if (System.currentTimeMillis() - a1.c > 0x5265c00L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!TextUtils.isEmpty(a1.a))
                    {
                        com.qihoo.security.appbox.core.a.a(f, a, b, a1.a, c, a1.c);
                    }
                    if (flag)
                    {
                        f.a(false, a, b, d, e, a1.b, c);
                    }
                }

            
            {
                f = com.qihoo.security.appbox.core.a.this;
                a = context;
                b = s1;
                c = c1;
                d = i1;
                e = atomicboolean;
                super();
            }
            });
            return;
        }
    }

    public void a(Context context, String s1, com.qihoo.security.appbox.b.c c1)
    {
        Object obj = com.qihoo.security.appbox.core.b.a(context, "0");
        obj = new com.qihoo.security.appbox.b.d(context, i, ((a) (obj)).b);
        c1 = new WeakReference(c1);
        com.qihoo.security.appbox.c.b.a.a(new i(1, "http://ifappbox.msafe.data.360safe.com/index/getPicksPageApps", ((com.qihoo.security.appbox.b.d) (obj)).a(), new com.android.volley.k.b(s1, ((com.qihoo.security.appbox.b.d) (obj)), context, c1) {

            final String a;
            final com.qihoo.security.appbox.b.d b;
            final Context c;
            final WeakReference d;
            final com.qihoo.security.appbox.core.a e;

            public volatile void a(Object obj1)
            {
                a((JSONObject)obj1);
            }

            public void a(JSONObject jsonobject)
            {
                jsonobject = b.a(jsonobject);
                if (jsonobject != null)
                {
                    jsonobject.lastRequestTime = System.currentTimeMillis();
                    com.qihoo.security.appbox.core.a.a(e, jsonobject, "0");
                    com.qihoo.security.appbox.core.a.b(e, jsonobject, "0");
                }
                com.qihoo.security.appbox.core.a.a(e, c, jsonobject, "0", (com.qihoo.security.appbox.b.c)d.get());
            }

            
            {
                e = com.qihoo.security.appbox.core.a.this;
                a = s1;
                b = d1;
                c = context;
                d = weakreference;
                super();
            }
        }, new com.android.volley.k.a(c1) {

            final WeakReference a;
            final com.qihoo.security.appbox.core.a b;

            public void a(VolleyError volleyerror)
            {
                volleyerror = (com.qihoo.security.appbox.b.c)a.get();
                if (volleyerror == null)
                {
                    return;
                }
                if (com.qihoo.security.appbox.core.a.a(b).lastRequestTime > 0L)
                {
                    volleyerror.a(com.qihoo.security.appbox.core.a.a(b));
                    return;
                } else
                {
                    volleyerror.b();
                    return;
                }
            }

            
            {
                b = com.qihoo.security.appbox.core.a.this;
                a = weakreference;
                super();
            }
        }), s1);
    }

    public void a(Runnable runnable)
    {
        e.post(runnable);
    }

    public void a(ArrayList arraylist, String s1, com.qihoo.security.appbox.b.c c1)
    {
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        if (c1 != null)
        {
            c1.a();
        }
        if (arraylist == null)
        {
            c1.a(404, "no ids");
        }
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        Map map = c(s1);
        this;
        JVM INSTR monitorenter ;
        arraylist = arraylist.iterator();
_L7:
        if (!arraylist.hasNext()) goto _L2; else goto _L1
_L1:
        String s3;
        com.qihoo.security.appbox.core.c c2;
        s3 = (String)arraylist.next();
        c2 = (com.qihoo.security.appbox.core.c)map.get(s3);
        if (c2 == null) goto _L4; else goto _L3
_L3:
        if (!arraylist3.contains(c2.j))
        {
            arraylist3.add(c2.j);
            arraylist1.add(c2);
            break MISSING_BLOCK_LABEL_322;
        }
          goto _L5
_L8:
        boolean flag;
        if (!a(c2, flag) || arraylist2.contains(s3)) goto _L7; else goto _L6
_L6:
        arraylist2.add(s3);
          goto _L7
        arraylist;
        this;
        JVM INSTR monitorexit ;
        throw arraylist;
_L5:
        arraylist2.add(s3);
        break MISSING_BLOCK_LABEL_322;
_L4:
        arraylist2.add(s3);
          goto _L7
_L2:
        this;
        JVM INSTR monitorexit ;
        if (c1 != null)
        {
            arraylist = b(s1);
            arraylist.faceBookItems = arraylist1;
            c1.a(arraylist);
        }
        for (arraylist = arraylist2.iterator(); arraylist.hasNext();)
        {
            String s2 = (String)arraylist.next();
            NativeAd nativead = new NativeAd(SecurityApplication.a(), s2);
            if (c1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            nativead.a(new c(nativead, s1, flag, s2));
            try
            {
                nativead.a();
            }
            catch (Exception exception) { }
        }

        return;
        if (c1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L8
    }

    public void a(boolean flag, Context context, String s1, int i1, AtomicBoolean atomicboolean, long l1, 
            com.qihoo.security.appbox.b.c c1)
    {
        AppBoxResponse appboxresponse = b(s1);
        com.qihoo.security.appbox.b.b b1 = new com.qihoo.security.appbox.b.b(context, appboxresponse, s1, l1);
        b1.a(i1);
        c1 = new WeakReference(c1);
        com.qihoo.security.appbox.c.b.a.a(new i(1, "http://ifappbox.msafe.data.360safe.com/index/getrecommendappsbytype", b1.a(), new com.android.volley.k.b(atomicboolean, b1, flag, appboxresponse, s1, context, c1) {

            final AtomicBoolean a;
            final com.qihoo.security.appbox.b.b b;
            final boolean c;
            final AppBoxResponse d;
            final String e;
            final Context f;
            final WeakReference g;
            final com.qihoo.security.appbox.core.a h;

            public volatile void a(Object obj)
            {
                a((JSONObject)obj);
            }

            public void a(JSONObject jsonobject)
            {
                a.set(false);
                jsonobject = b.a(jsonobject);
                if (jsonobject != null)
                {
                    if (c)
                    {
                        ArrayList arraylist = new ArrayList();
                        arraylist.addAll(d.appItems);
                        arraylist.addAll(((AppBoxResponse) (jsonobject)).appItems);
                        jsonobject.appItems = arraylist;
                        jsonobject.lastRequestTime = d.lastRequestTime;
                    } else
                    {
                        jsonobject.lastRequestTime = System.currentTimeMillis();
                    }
                    com.qihoo.security.appbox.core.a.a(h, jsonobject, e);
                    h.a(new Runnable(this, jsonobject) {

                        final AppBoxResponse a;
                        final _cls7 b;

                        public void run()
                        {
                            com.qihoo.security.appbox.core.a.b(b.h, a, b.e);
                        }

            
            {
                b = _pcls7;
                a = appboxresponse;
                super();
            }
                    });
                }
                com.qihoo.security.appbox.core.a.a(h, f, jsonobject, e, (com.qihoo.security.appbox.b.c)g.get());
            }

            
            {
                h = com.qihoo.security.appbox.core.a.this;
                a = atomicboolean;
                b = b1;
                c = flag;
                d = appboxresponse;
                e = s1;
                f = context;
                g = weakreference;
                super();
            }
        }, new com.android.volley.k.a(atomicboolean, s1, c1, appboxresponse) {

            final AtomicBoolean a;
            final String b;
            final WeakReference c;
            final AppBoxResponse d;
            final com.qihoo.security.appbox.core.a e;

            public void a(VolleyError volleyerror)
            {
                a.set(false);
                volleyerror = (com.qihoo.security.appbox.b.c)c.get();
                if (volleyerror == null)
                {
                    return;
                }
                if (d.lastRequestTime > 0L)
                {
                    volleyerror.a(d);
                    return;
                } else
                {
                    volleyerror.b();
                    return;
                }
            }

            
            {
                e = com.qihoo.security.appbox.core.a.this;
                a = atomicboolean;
                b = s1;
                c = weakreference;
                d = appboxresponse;
                super();
            }
        }), s1);
    }

    public boolean b()
    {
        b b1 = g();
        h();
        return b.a(b1);
    }

    public int c()
    {
        b b1 = g();
        h();
        return com.qihoo.security.appbox.core.b.b(b1);
    }

    public void d()
    {
        Object obj2;
        String s1;
        obj2 = null;
        s1 = null;
        Object obj;
        g = s.e(f, "f_c.dat");
        obj = s.b(f, "f_c.dat");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        Object obj1 = s.a(((InputStream) (obj)), NativeManager.a);
        obj = obj1;
        obj1 = obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj2 = new BufferedReader(new InputStreamReader(((InputStream) (obj))));
        obj1 = new StringBuffer();
_L5:
        s1 = ((BufferedReader) (obj2)).readLine();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        ((StringBuffer) (obj1)).append(s1);
          goto _L5
_L8:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        ((InputStream) (obj)).close();
_L7:
        return;
_L4:
        obj1 = ((StringBuffer) (obj1)).toString();
        this;
        JVM INSTR monitorenter ;
        b.clear();
        a(b, ((String) (obj1)));
        this;
        JVM INSTR monitorexit ;
        obj1 = obj;
_L2:
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        try
        {
            ((InputStream) (obj1)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj2;
        }
        finally { }
          goto _L8
_L10:
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj;
        return;
        obj1;
        obj = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = null;
        if (true) goto _L10; else goto _L9
_L9:
        obj;
        obj = null;
        obj1 = s1;
          goto _L8
        obj1;
        obj1 = s1;
          goto _L8
        obj1;
        obj1 = s1;
          goto _L8
        obj1 = obj;
          goto _L2
    }

    public void e()
    {
        if (l.faceBookItems != null)
        {
            l.faceBookItems = null;
        }
    }

    public void f()
    {
        d("0");
        d("1");
        d("2");
    }

}
