// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.volley.AuthFailureError;
import com.android.volley.ParseError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.c;
import com.android.volley.k;
import com.android.volley.toolbox.l;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.appbox.c.a.b;
import com.qihoo.security.appbox.c.b.a;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.s;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.adv:
//            a, d, e, b, 
//            f

public class AdvDataManager
{
    public static final class AdvReportType extends Enum
    {

        public static final AdvReportType Click;
        public static final AdvReportType Install;
        public static final AdvReportType LaunchApp;
        public static final AdvReportType Request;
        public static final AdvReportType Show;
        private static final AdvReportType b[];
        private int a;

        public static AdvReportType valueOf(String s1)
        {
            return (AdvReportType)Enum.valueOf(com/qihoo/security/adv/AdvDataManager$AdvReportType, s1);
        }

        public static AdvReportType[] values()
        {
            return (AdvReportType[])b.clone();
        }

        public int getType()
        {
            return a;
        }

        public void setType(int i1)
        {
            a = i1;
        }

        static 
        {
            Request = new AdvReportType("Request", 0, 1);
            Show = new AdvReportType("Show", 1, 2);
            Click = new AdvReportType("Click", 2, 3);
            Install = new AdvReportType("Install", 3, 4);
            LaunchApp = new AdvReportType("LaunchApp", 4, 5);
            b = (new AdvReportType[] {
                Request, Show, Click, Install, LaunchApp
            });
        }

        private AdvReportType(String s1, int i1, int j1)
        {
            super(s1, i1);
            a = j1;
        }
    }

    public static final class AdvType extends Enum
    {

        public static final AdvType AppLockAdvData;
        public static final AdvType BatteryLifeAdvData;
        public static final AdvType BoosterResultAdvData;
        public static final AdvType CleanDeepResultAdvData;
        public static final AdvType CleanResultAdvData;
        public static final AdvType FaceBookAdvData;
        public static final AdvType GameBoosterAddRecmdAdvData;
        public static final AdvType GameBoosterFolderAllLikeData;
        public static final AdvType GameBoosterFolderHotAdvData;
        public static final AdvType PrepareAdvData;
        public static final AdvType VirusFullScanResultAdvData;
        public static final AdvType VirusResultAdvData;
        private static final AdvType e[];
        private boolean a;
        private boolean b;
        private int c;
        private int d;

        static boolean a(AdvType advtype)
        {
            return advtype.a;
        }

        static boolean b(AdvType advtype)
        {
            return advtype.b;
        }

        public static AdvType valueOf(String s1)
        {
            return (AdvType)Enum.valueOf(com/qihoo/security/adv/AdvDataManager$AdvType, s1);
        }

        public static AdvType[] values()
        {
            return (AdvType[])e.clone();
        }

        public int getMid()
        {
            return c;
        }

        public int getType()
        {
            return d;
        }

        public boolean isShouldCache()
        {
            return a;
        }

        public boolean isShouldPreLoadImg()
        {
            return b;
        }

        public void setMid(int i1)
        {
            c = i1;
        }

        public void setShouldCache(boolean flag)
        {
            a = flag;
        }

        public void setShouldPreLoadImg(boolean flag)
        {
            b = flag;
        }

        public void setType(int i1)
        {
            d = i1;
        }

        static 
        {
            PrepareAdvData = new AdvType("PrepareAdvData", 0, 36, 0, true, true);
            BoosterResultAdvData = new AdvType("BoosterResultAdvData", 1, 30, 0);
            BatteryLifeAdvData = new AdvType("BatteryLifeAdvData", 2, 21, 1);
            CleanResultAdvData = new AdvType("CleanResultAdvData", 3, 31, 0);
            CleanDeepResultAdvData = new AdvType("CleanDeepResultAdvData", 4, 34, 1);
            VirusResultAdvData = new AdvType("VirusResultAdvData", 5, 32, 0);
            VirusFullScanResultAdvData = new AdvType("VirusFullScanResultAdvData", 6, 33, 1);
            AppLockAdvData = new AdvType("AppLockAdvData", 7, 27, 0, true, true);
            FaceBookAdvData = new AdvType("FaceBookAdvData", 8, 35, 0, true);
            GameBoosterAddRecmdAdvData = new AdvType("GameBoosterAddRecmdAdvData", 9, 43, true);
            GameBoosterFolderAllLikeData = new AdvType("GameBoosterFolderAllLikeData", 10, 45, true);
            GameBoosterFolderHotAdvData = new AdvType("GameBoosterFolderHotAdvData", 11, 44, true);
            e = (new AdvType[] {
                PrepareAdvData, BoosterResultAdvData, BatteryLifeAdvData, CleanResultAdvData, CleanDeepResultAdvData, VirusResultAdvData, VirusFullScanResultAdvData, AppLockAdvData, FaceBookAdvData, GameBoosterAddRecmdAdvData, 
                GameBoosterFolderAllLikeData, GameBoosterFolderHotAdvData
            });
        }

        private AdvType(String s1, int i1, int j1, int k1)
        {
            super(s1, i1);
            a = false;
            b = false;
            c = j1;
            d = k1;
        }

        private AdvType(String s1, int i1, int j1, int k1, boolean flag)
        {
            super(s1, i1);
            a = false;
            b = false;
            c = j1;
            d = k1;
            a = flag;
        }

        private AdvType(String s1, int i1, int j1, int k1, boolean flag, boolean flag1)
        {
            super(s1, i1);
            a = false;
            b = false;
            c = j1;
            d = k1;
            a = flag;
            b = flag1;
        }

        private AdvType(String s1, int i1, int j1, boolean flag)
        {
            super(s1, i1);
            a = false;
            b = false;
            c = j1;
            a = flag;
        }
    }

    public static class a
    {

        public com.qihoo.security.adv.a a;
        public int b;

        public a(com.qihoo.security.adv.a a1, int i1)
        {
            a = a1;
            b = i1;
        }
    }

    private static class b
    {

        c a;
        long b;
        AdvType c;
        JSONObject d;
        com.qihoo.security.adv.a e;

        private b()
        {
        }

    }

    public static interface c
    {

        public abstract void a(Object obj, Object obj1);

        public abstract void a(Object obj, Object obj1, int i1);

        public abstract void a(Object obj, Object obj1, Object obj2);
    }


    private static final Map b;
    private static final Map c;
    private static AdvDataManager d;
    protected String a;
    private final Context e = SecurityApplication.a();
    private final HandlerThread f = new HandlerThread("adv-data");
    private final Handler g;
    private final Handler h = new Handler(Looper.getMainLooper());
    private final Map i = new Hashtable();
    private final Map j = new Hashtable();
    private final Map k = new HashMap();
    private final Map l = new HashMap();
    private float m;
    private int n;
    private int o;
    private final String p;
    private final int q;
    private long r;
    private final com.android.volley.c s = new com.android.volley.c() {

        final AdvDataManager a;

        public int a()
        {
            return 3000;
        }

        public int b()
        {
            return 3;
        }

            
            {
                a = AdvDataManager.this;
                super();
            }
    };

    private AdvDataManager()
    {
        r = 0L;
        Object obj = e.getResources();
        if (obj == null)
        {
            a(e);
        }
        m = ((Resources) (obj)).getDisplayMetrics().density;
        n = ((Resources) (obj)).getDisplayMetrics().widthPixels;
        o = ((Resources) (obj)).getDisplayMetrics().heightPixels;
        q = com.qihoo360.mobilesafe.b.i.e(e, "com.qihoo.security.lite");
        p = com.qihoo360.mobilesafe.b.s.a(com.qihoo360.mobilesafe.b.o.b(e));
        obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        k.put(Integer.valueOf(AdvType.AppLockAdvData.getMid()), obj);
        k.put(Integer.valueOf(AdvType.BoosterResultAdvData.getMid()), arraylist);
        k.put(Integer.valueOf(AdvType.BatteryLifeAdvData.getMid()), arraylist);
        k.put(Integer.valueOf(AdvType.CleanResultAdvData.getMid()), arraylist1);
        k.put(Integer.valueOf(AdvType.CleanDeepResultAdvData.getMid()), arraylist1);
        k.put(Integer.valueOf(AdvType.VirusResultAdvData.getMid()), arraylist2);
        k.put(Integer.valueOf(AdvType.VirusFullScanResultAdvData.getMid()), arraylist2);
        f.start();
        g = new Handler(f.getLooper()) {

            final AdvDataManager a;

            public void handleMessage(Message message)
            {
                Object obj1;
                super.handleMessage(message);
                obj1 = message.obj;
                message.what;
                JVM INSTR tableswitch 0 2: default 40
            //                           0 41
            //                           1 100
            //                           2 129;
                   goto _L1 _L2 _L3 _L4
_L1:
                return;
_L2:
                message = (b)obj1;
                if (com.qihoo.security.adv.AdvType.a(((b) (message)).c))
                {
                    com.qihoo.security.adv.AdvDataManager.a(a, ((b) (message)).c, ((b) (message)).d);
                }
                if (com.qihoo.security.adv.AdvType.b(((b) (message)).c) && ((b) (message)).e != null)
                {
                    com.qihoo.security.adv.AdvDataManager.a(a, ((b) (message)).e);
                    return;
                }
                  goto _L1
_L3:
                try
                {
                    message = com.qihoo.security.adv.f.a(com.qihoo.security.adv.AdvDataManager.a(a));
                    a.a = message.a();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    message.printStackTrace();
                }
                return;
_L4:
                obj1 = (b)obj1;
                long l1 = ((b) (obj1)).b;
                message = ((b) (obj1)).c;
                obj1 = ((b) (obj1)).a;
                com.qihoo.security.adv.a a1 = com.qihoo.security.adv.AdvDataManager.a(a, message);
                if (a1 != null)
                {
                    com.qihoo.security.adv.AdvDataManager.b(a).put(message, a1);
                    if (!com.qihoo.security.adv.AdvDataManager.b(a, a1))
                    {
                        a.a(((c) (obj1)), new a(a1, 3), message, l1);
                        return;
                    } else
                    {
                        com.qihoo.security.adv.AdvDataManager.a(a, l1, message, ((c) (obj1)));
                        return;
                    }
                } else
                {
                    com.qihoo.security.adv.AdvDataManager.a(a, l1, message, ((c) (obj1)));
                    return;
                }
            }

            
            {
                a = AdvDataManager.this;
                super(looper);
            }
        };
    }

    static Context a(AdvDataManager advdatamanager)
    {
        return advdatamanager.e;
    }

    public static AdvDataManager a()
    {
        com/qihoo/security/adv/AdvDataManager;
        JVM INSTR monitorenter ;
        AdvDataManager advdatamanager;
        if (d == null)
        {
            d = new AdvDataManager();
        }
        advdatamanager = d;
        com/qihoo/security/adv/AdvDataManager;
        JVM INSTR monitorexit ;
        return advdatamanager;
        Exception exception;
        exception;
        throw exception;
    }

    static com.qihoo.security.adv.a a(AdvDataManager advdatamanager, AdvType advtype)
    {
        return advdatamanager.e(advtype);
    }

    public static void a(Context context)
    {
    }

    private void a(AdvReportType advreporttype, int i1, List list)
    {
        Object obj = b(advreporttype, i1, list);
        obj = (new StringBuilder()).append("statdata=").append(((JSONArray) (obj)).toString()).toString();
        if (advreporttype == AdvReportType.Click && list != null && list.size() > 0)
        {
            list = (AdvData)list.get(0);
            if (list != null)
            {
                a(((AdvData) (list)));
            }
        }
        list = new l(1, "http://l.a.mobimagic.com/statistics/", ((String) (obj)), new com.android.volley.k.b(advreporttype, i1) {

            final AdvReportType a;
            final int b;
            final AdvDataManager c;

            public volatile void a(Object obj1)
            {
                a((String)obj1);
            }

            public void a(String s1)
            {
            }

            
            {
                c = AdvDataManager.this;
                a = advreporttype;
                b = i1;
                super();
            }
        }, new com.android.volley.k.a(advreporttype, i1) {

            final AdvReportType a;
            final int b;
            final AdvDataManager c;

            public void a(VolleyError volleyerror)
            {
            }

            
            {
                c = AdvDataManager.this;
                a = advreporttype;
                b = i1;
                super();
            }
        }) {

            final AdvDataManager a;

            public Map i()
                throws AuthFailureError
            {
                HashMap hashmap = new HashMap();
                hashmap.put("ADAPPINFO", AdvDataManager.d(a));
                return hashmap;
            }

            
            {
                a = AdvDataManager.this;
                super(i1, s1, s2, b1, a1);
            }
        };
        list.a(s);
        com.qihoo.security.appbox.c.b.a.a(list, (new StringBuilder()).append("mid=").append(i1).append("-").append(advreporttype.name()).toString());
    }

    private void a(AdvType advtype, JSONObject jsonobject)
    {
        if (com.qihoo.security.adv.AdvType.a(advtype) && jsonobject != null)
        {
            advtype = c(advtype);
            boolean flag;
            try
            {
                flag = FileUtil.writeByteFile(jsonobject.toString().getBytes("UTF-8"), advtype);
            }
            // Misplaced declaration of an exception variable
            catch (AdvType advtype)
            {
                return;
            }
            if (flag)
            {
                return;
            }
        }
    }

    static void a(AdvDataManager advdatamanager, long l1, AdvType advtype, c c1)
    {
        advdatamanager.b(l1, advtype, c1);
    }

    static void a(AdvDataManager advdatamanager, AdvType advtype, JSONObject jsonobject)
    {
        advdatamanager.a(advtype, jsonobject);
    }

    static void a(AdvDataManager advdatamanager, com.qihoo.security.adv.a a1)
    {
        advdatamanager.b(a1);
    }

    static void a(AdvDataManager advdatamanager, String s1, long l1)
    {
        advdatamanager.a(s1, l1);
    }

    static void a(AdvDataManager advdatamanager, List list)
    {
        advdatamanager.a(list);
    }

    private void a(com.qihoo.security.adv.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        Object obj;
        return;
_L2:
        if ((obj = a1.c()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((List) (obj)).iterator();
_L4:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_91;
            }
            obj1 = (d)((Iterator) (obj)).next();
        } while (obj1 == null);
        obj1 = ((d) (obj1)).i();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (!com.qihoo360.mobilesafe.b.o.a(e, ((e) (obj1)).f())) goto _L4; else goto _L5
_L5:
        a(((e) (obj1)).f(), ((e) (obj1)).c());
          goto _L4
        a1;
        throw a1;
        a1 = a1.d();
        if (a1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a1 = a1.iterator();
_L7:
        do
        {
            if (!a1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (e)a1.next();
        } while (obj == null);
        if (!com.qihoo360.mobilesafe.b.o.a(e, ((e) (obj)).f())) goto _L7; else goto _L6
_L6:
        a(((e) (obj)).f(), ((e) (obj)).c());
        if (true) goto _L7; else goto _L8
_L8:
        if (true) goto _L1; else goto _L9
_L9:
    }

    private void a(String s1, long l1)
    {
        j.put(s1, Long.valueOf(l1));
    }

    private void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            if (!TextUtils.isEmpty(s1))
            {
                com.qihoo.security.appbox.c.a.b.a().a(s1);
            }
        } while (true);
    }

    private boolean a(d d1)
    {
        while (d1 == null || d1.i() == null) 
        {
            return false;
        }
        return true;
    }

    private static final String b(AdvType advtype)
    {
        return com.qihoo360.mobilesafe.b.s.a(advtype.name());
    }

    private String b(String s1, String s2)
    {
        int i1 = s1.lastIndexOf("/") + 1;
        if (i1 >= s1.length())
        {
            return s1;
        } else
        {
            String s3 = s1.substring(0, i1);
            s1 = s1.substring(i1, s1.length());
            return (new StringBuilder()).append(s3).append(s2).append(s1).toString();
        }
    }

    static Map b(AdvDataManager advdatamanager)
    {
        return advdatamanager.i;
    }

    private JSONArray b(AdvReportType advreporttype, int i1, List list)
    {
        JSONArray jsonarray = new JSONArray();
        static class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[AdvReportType.values().length];
                try
                {
                    a[AdvReportType.Request.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AdvReportType.Click.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AdvReportType.Show.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.qihoo.security.adv._cls6.a[advreporttype.ordinal()];
        JVM INSTR tableswitch 1 3: default 366
    //                   1 44
    //                   2 105
    //                   3 105;
           goto _L1 _L2 _L3 _L3
_L2:
        list = new JSONObject();
        list.put("type", advreporttype.getType());
        list.put("mid", i1);
        list.put("p1", "");
        list.put("p2", "");
        jsonarray.put(list);
        return jsonarray;
_L3:
        if (list == null) goto _L1; else goto _L4
_L4:
        boolean flag;
        String s1;
        StringBuilder stringbuilder;
        AdvData advdata;
        JSONObject jsonobject;
        try
        {
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (AdvReportType advreporttype)
        {
            return jsonarray;
        }
        i1 = 0;
_L17:
        if (i1 >= list.size()) goto _L1; else goto _L5
_L5:
        stringbuilder.delete(0, stringbuilder.length());
        advdata = (AdvData)list.get(i1);
        if (advdata != null) goto _L7; else goto _L6
_L7:
        jsonobject = new JSONObject();
        jsonobject.put("type", advreporttype.getType());
        jsonobject.put("mid", advdata.mid);
        if (!TextUtils.isEmpty(advdata.adid)) goto _L9; else goto _L8
_L8:
        s1 = "1";
_L15:
        jsonobject.put("adid", s1);
        jsonobject.put("pid", advdata.pid);
        jsonobject.put("p1", advdata.p1);
        jsonobject.put("p2", advdata.p2);
        if (advdata.nativeAd != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L11; else goto _L10
_L10:
        if (advdata.c1 != null) goto _L11; else goto _L12
_L12:
        s1 = "1";
_L14:
        jsonobject.put("c1", s1);
        jsonobject.put("c2", advdata.c2);
        jsonobject.put("c3", advdata.c3);
        jsonarray.put(jsonobject);
        break; /* Loop/switch isn't completed */
_L9:
        s1 = advdata.adid;
        continue; /* Loop/switch isn't completed */
_L11:
        s1 = advdata.c1;
        if (true) goto _L14; else goto _L13
_L13:
        break; /* Loop/switch isn't completed */
_L1:
        return jsonarray;
        if (true) goto _L15; else goto _L6
_L6:
        i1++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    private void b(long l1, AdvType advtype, c c1)
    {
        if (!com.qihoo360.common.e.b.a(e))
        {
            if (c1 != null)
            {
                c1.a(advtype, Long.valueOf(l1), 10004);
            }
            return;
        } else
        {
            a(l1, advtype, c1);
            return;
        }
    }

    private void b(com.qihoo.security.adv.a a1)
    {
        if (com.qihoo360.common.e.b.b(e) && a1 != null)
        {
            Object obj = a1.c();
            if (obj != null)
            {
                ArrayList arraylist = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj1 = (d)((Iterator) (obj)).next();
                    if (obj1 != null && !b(((d) (obj1))) && a(((d) (obj1))))
                    {
                        obj1 = ((d) (obj1)).i();
                        if (obj1 != null)
                        {
                            arraylist.add(((e) (obj1)).j());
                            arraylist.add(((e) (obj1)).i());
                        }
                    }
                } while (true);
                a1 = a1.d();
                if (a1 != null)
                {
                    a1 = a1.iterator();
                    do
                    {
                        if (!a1.hasNext())
                        {
                            break;
                        }
                        Object obj2 = (e)a1.next();
                        if (obj2 != null)
                        {
                            String s1 = ((e) (obj2)).j();
                            obj2 = ((e) (obj2)).i();
                            arraylist.add(s1);
                            arraylist.add(obj2);
                        }
                    } while (true);
                    h.post(new Runnable(arraylist) {

                        final List a;
                        final AdvDataManager b;

                        public void run()
                        {
                            com.qihoo.security.adv.AdvDataManager.a(b, a);
                        }

            
            {
                b = AdvDataManager.this;
                a = list;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    private boolean b(AdvType advtype, String s1)
    {
        if (advtype == null)
        {
            return false;
        }
        if (j.containsKey(s1))
        {
            long l1 = ((Long)j.get(s1)).longValue();
            if (System.currentTimeMillis() > l1)
            {
                j.remove(s1);
                return false;
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    static boolean b(AdvDataManager advdatamanager, com.qihoo.security.adv.a a1)
    {
        return advdatamanager.c(a1);
    }

    private boolean b(d d1)
    {
        while (d1 == null || d1.e() == 0) 
        {
            return true;
        }
        return false;
    }

    static Handler c(AdvDataManager advdatamanager)
    {
        return advdatamanager.g;
    }

    private File c(AdvType advtype)
    {
        File file = com.qihoo.security.appbox.c.b.a.a(e, "adv");
        if (!file.exists())
        {
            file.mkdirs();
        }
        return new File(file, b(advtype));
    }

    static void c(AdvDataManager advdatamanager, com.qihoo.security.adv.a a1)
    {
        advdatamanager.a(a1);
    }

    private boolean c(com.qihoo.security.adv.a a1)
    {
        boolean flag;
        if (a1.b() * 1000L + a1.a() < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag || a1.a() + 0x240c8400L < System.currentTimeMillis();
    }

    static String d(AdvDataManager advdatamanager)
    {
        return advdatamanager.f();
    }

    static Map d()
    {
        return c;
    }

    private boolean d(AdvType advtype)
    {
        if (com.qihoo.security.adv.AdvType.a(advtype))
        {
            if ((advtype = c(advtype)) != null)
            {
                return advtype.exists();
            }
        }
        return false;
    }

    private com.qihoo.security.adv.a e(AdvType advtype)
    {
        if (com.qihoo.security.adv.AdvType.a(advtype))
        {
            advtype = FileUtil.readFileByte(c(advtype));
            if (advtype != null)
            {
                try
                {
                    advtype = new String(advtype, "UTF-8");
                }
                // Misplaced declaration of an exception variable
                catch (AdvType advtype)
                {
                    advtype = null;
                }
            } else
            {
                advtype = null;
            }
            if (!TextUtils.isEmpty(advtype))
            {
                try
                {
                    advtype = new JSONObject(advtype);
                }
                // Misplaced declaration of an exception variable
                catch (AdvType advtype)
                {
                    advtype = null;
                }
                if (advtype != null)
                {
                    return com.qihoo.security.adv.b.a(advtype);
                }
            }
        }
        return null;
    }

    static Map e()
    {
        return b;
    }

    private String f()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("9");
        stringbuilder.append("|");
        stringbuilder.append("ILOVE360SECohmgd");
        stringbuilder.append("|");
        stringbuilder.append(q);
        stringbuilder.append("|");
        Object obj = Locale.getDefault();
        if (obj == null)
        {
            obj = Locale.US;
        }
        stringbuilder.append(((Locale) (obj)).getLanguage());
        stringbuilder.append("|");
        stringbuilder.append(android.os.Build.VERSION.SDK_INT);
        stringbuilder.append("|");
        stringbuilder.append(p);
        stringbuilder.append("|");
        String s1 = ((TelephonyManager)e.getSystemService("phone")).getSimCountryIso();
        obj = ((Locale) (obj)).getCountry();
        if (!TextUtils.isEmpty(s1))
        {
            obj = s1.toUpperCase(Locale.US);
        }
        stringbuilder.append(((String) (obj)));
        return stringbuilder.toString();
    }

    private String f(AdvType advtype)
    {
        this;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        advtype = (List)k.get(Integer.valueOf(advtype.getMid()));
        if (advtype == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        Iterator iterator = advtype.iterator();
        boolean flag = true;
_L2:
        String s2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = (String)iterator.next();
        if (TextUtils.isEmpty(s2))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        stringbuilder.append(",");
        stringbuilder.append(s2);
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        advtype.clear();
_L6:
        advtype = new ArrayList();
        iterator = l.entrySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = (java.util.Map.Entry)iterator.next();
        s2 = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (String)((java.util.Map.Entry) (obj)).getValue();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        stringbuilder.append(",");
        if (com.qihoo360.mobilesafe.b.o.a(e, s2))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        advtype.add(s2);
          goto _L5
        advtype;
        throw advtype;
        stringbuilder.append(((String) (obj)));
        flag = false;
          goto _L5
_L4:
        if (advtype.size() > 0)
        {
            String s1;
            for (advtype = advtype.iterator(); advtype.hasNext(); l.remove(s1))
            {
                s1 = (String)advtype.next();
            }

        }
        advtype = stringbuilder.toString();
        this;
        JVM INSTR monitorexit ;
        return advtype;
        flag = true;
          goto _L6
    }

    private String g(AdvType advtype)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        String s2;
        if (g())
        {
            s1 = "yes";
        } else
        {
            s1 = "no";
        }
        if (com.qihoo360.mobilesafe.b.o.g(e))
        {
            s2 = "yes";
        } else
        {
            s2 = "no";
        }
        stringbuilder.append((new StringBuilder()).append("gp=").append(s1).toString());
        stringbuilder.append((new StringBuilder()).append("&mid=").append(advtype.getMid()).toString());
        stringbuilder.append("&pids=");
        stringbuilder.append((new StringBuilder()).append("&fb=").append(s2).toString());
        if (!TextUtils.isEmpty(a))
        {
            stringbuilder.append((new StringBuilder()).append("&gaid=").append(a).toString());
        }
        return stringbuilder.toString();
    }

    private boolean g()
    {
        return com.qihoo360.mobilesafe.b.o.a(e, "com.android.vending");
    }

    public com.qihoo.security.adv.a a(AdvType advtype)
    {
        return (com.qihoo.security.adv.a)i.get(advtype);
    }

    public String a(int i1, String s1)
    {
        String s2;
        if (TextUtils.isEmpty(s1))
        {
            return "";
        }
        s2 = "";
        if ((double)m > 1.5D) goto _L2; else goto _L1
_L1:
        if (i1 == 0)
        {
            s2 = "108_108";
        } else
        {
            s2 = "516_264";
        }
_L4:
        return b(s1, (new StringBuilder()).append("re-").append(s2).append("-").toString());
_L2:
        if ((double)m > 1.5D && m <= 2.0F)
        {
            if (i1 == 0)
            {
                s2 = "144_144";
            } else
            {
                s2 = "688_352";
            }
        } else
        if (m > 2.0F && m <= 3F)
        {
            if (i1 == 0)
            {
                s2 = "216_216";
            } else
            {
                s2 = "1032_528";
            }
        } else
        if (m > 3F)
        {
            if (i1 == 0)
            {
                s2 = "288_288";
            } else
            {
                s2 = "1376_704";
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(long l1, AdvType advtype, c c1)
    {
        Object obj = new WeakReference(c1);
        String s1 = g(advtype);
        s1 = (new StringBuilder()).append("http://a.mobimagic.com/ads/?").append(s1).toString();
        if (b(advtype, s1))
        {
            if (c1 != null)
            {
                c1.a(advtype, Long.valueOf(l1), 10005);
            }
            return;
        }
        obj = new com.android.volley.toolbox.i(0, (new StringBuilder()).append(s1).append("&ex=").append(f(advtype)).toString(), "", new com.android.volley.k.b(advtype, ((WeakReference) (obj)), s1, l1) {

            final AdvType a;
            final WeakReference b;
            final String c;
            final long d;
            final AdvDataManager e;

            public volatile void a(Object obj1)
            {
                a((JSONObject)obj1);
            }

            public void a(JSONObject jsonobject)
            {
                Object obj1 = (c)b.get();
                if (jsonobject != null)
                {
                    com.qihoo.security.adv.a a1;
                    int i1;
                    try
                    {
                        jsonobject.put("responseTime", System.currentTimeMillis());
                    }
                    catch (JSONException jsonexception) { }
                    i1 = jsonobject.optInt("result", -1);
                    if (AdvDataManager.d().containsKey(Integer.valueOf(i1)))
                    {
                        long l2 = (long)(jsonobject.optInt("expired") * 1000) + System.currentTimeMillis();
                        com.qihoo.security.adv.AdvDataManager.a(e, c, l2);
                        if (obj1 != null)
                        {
                            ((c) (obj1)).a(a, Long.valueOf(l2), i1);
                        }
                        return;
                    }
                }
                a1 = com.qihoo.security.adv.b.a(jsonobject);
                if (a1 != null && com.qihoo.security.adv.AdvType.a(a))
                {
                    com.qihoo.security.adv.AdvDataManager.b(e).put(a, a1);
                }
                com.qihoo.security.adv.AdvDataManager.c(e, a1);
                e.a(((c) (obj1)), new a(a1, 1), a, d);
                obj1 = new b();
                obj1.c = a;
                obj1.b = d;
                obj1.d = jsonobject;
                obj1.e = a1;
                com.qihoo.security.adv.AdvDataManager.c(e).sendMessage(com.qihoo.security.adv.AdvDataManager.c(e).obtainMessage(0, obj1));
            }

            
            {
                e = AdvDataManager.this;
                a = advtype;
                b = weakreference;
                c = s1;
                d = l1;
                super();
            }
        }, new com.android.volley.k.a(((WeakReference) (obj)), s1, advtype, l1) {

            final WeakReference a;
            final String b;
            final AdvType c;
            final long d;
            final AdvDataManager e;

            public void a(VolleyError volleyerror)
            {
                c c2 = (c)a.get();
                char c3 = '\u2710';
                if (volleyerror instanceof ParseError)
                {
                    long l2 = System.currentTimeMillis();
                    com.qihoo.security.adv.AdvDataManager.a(e, b, 0L + l2);
                    c3 = '\u2713';
                }
                if (volleyerror instanceof TimeoutError)
                {
                    c3 = '\u2711';
                }
                if (c2 != null)
                {
                    c2.a(c, Long.valueOf(d), c3);
                }
            }

            
            {
                e = AdvDataManager.this;
                a = weakreference;
                b = s1;
                c = advtype;
                d = l1;
                super();
            }
        }, s1) {

            final String a;
            final AdvDataManager b;

            protected k a(com.android.volley.i i1)
            {
                if (i1 != null && AdvDataManager.e().containsKey(Integer.valueOf(i1.a)))
                {
                    long l2 = ((Integer)AdvDataManager.e().get(Integer.valueOf(i1.a))).intValue();
                    long l3 = System.currentTimeMillis();
                    com.qihoo.security.adv.AdvDataManager.a(b, a, l2 + l3);
                }
                return super.a(i1);
            }

            public Map i()
                throws AuthFailureError
            {
                HashMap hashmap = new HashMap();
                hashmap.put("ADAPPINFO", AdvDataManager.d(b));
                return hashmap;
            }

            
            {
                b = AdvDataManager.this;
                a = s3;
                super(i1, s1, s2, b1, a1);
            }
        };
        if (c1 != null)
        {
            c1.a(advtype, Long.valueOf(l1));
        }
        ((com.android.volley.toolbox.i) (obj)).a(s);
        com.qihoo.security.appbox.c.b.a.a(((com.android.volley.Request) (obj)), advtype.name());
    }

    public void a(AdvReportType advreporttype, List list)
    {
        AdvData advdata;
        if (list != null && list.size() != 0)
        {
            if ((advdata = (AdvData)list.get(0)) != null)
            {
                a(advreporttype, advdata.mid, list);
                return;
            }
        }
    }

    public void a(AdvType advtype, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        advtype = (List)k.get(Integer.valueOf(advtype.getMid()));
        if (advtype != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!advtype.contains(s1))
        {
            advtype.add(s1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        advtype;
        throw advtype;
    }

    public void a(c c1, AdvType advtype, long l1)
    {
        while (c() || advtype == null) 
        {
            return;
        }
        if (com.qihoo.security.adv.AdvType.a(advtype))
        {
            com.qihoo.security.adv.a a1 = (com.qihoo.security.adv.a)i.get(advtype);
            if (a1 != null)
            {
                if (c(a1))
                {
                    b(l1, advtype, c1);
                    return;
                } else
                {
                    a(c1, new a(a1, 2), advtype, l1);
                    return;
                }
            }
            if (!d(advtype))
            {
                b(l1, advtype, c1);
                return;
            } else
            {
                b b1 = new b();
                b1.c = advtype;
                b1.a = c1;
                b1.b = l1;
                g.sendMessage(g.obtainMessage(2, b1));
                return;
            }
        } else
        {
            b(l1, advtype, c1);
            return;
        }
    }

    public void a(c c1, a a1, AdvType advtype, long l1)
    {
        if (c1 == null)
        {
            return;
        } else
        {
            a(new Runnable(c1, a1, advtype, l1) {

                final c a;
                final a b;
                final AdvType c;
                final long d;
                final AdvDataManager e;

                public void run()
                {
                    a.a(b, c, Long.valueOf(d));
                }

            
            {
                e = AdvDataManager.this;
                a = c1;
                b = a1;
                c = advtype;
                d = l1;
                super();
            }
            });
            return;
        }
    }

    public void a(AdvData advdata)
    {
        if (advdata != null)
        {
            String s2 = advdata.pkg;
            int i1 = advdata.pid;
            String s3 = advdata.adid;
            String s4 = advdata.p1;
            String s5 = advdata.p2;
            String s1;
            String s6;
            String s7;
            boolean flag;
            if (advdata.nativeAd != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && advdata.c1 == null)
            {
                s1 = "1";
            } else
            {
                s1 = advdata.c1;
            }
            s6 = advdata.c2;
            s7 = advdata.c3;
            com.qihoo.security.installreport.a.a(s2, 0, advdata.mid, i1, s3, s4, s5, s1, s6, s7);
        }
    }

    public void a(Runnable runnable)
    {
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            runnable.run();
            return;
        } else
        {
            h.post(runnable);
            return;
        }
    }

    public void a(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        l.put(s1, s2);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void a(JSONArray jsonarray, c c1)
    {
        if (jsonarray == null)
        {
            if (c1 != null)
            {
                c1.a(Long.valueOf(0L), Long.valueOf(0L), 0);
            }
            return;
        } else
        {
            jsonarray = new l(1, "http://l.a.mobimagic.com/statistics/", (new StringBuilder()).append("statdata=").append(jsonarray.toString()).toString(), new com.android.volley.k.b(c1) {

                final c a;
                final AdvDataManager b;

                public volatile void a(Object obj)
                {
                    a((String)obj);
                }

                public void a(String s1)
                {
                    if (a == null)
                    {
                        return;
                    }
                    if (TextUtils.isEmpty(s1))
                    {
                        break MISSING_BLOCK_LABEL_102;
                    }
                    int i1 = (new JSONObject(s1)).optInt("result");
                    if (1 == i1)
                    {
                        try
                        {
                            a.a(s1, Long.valueOf(0L), Long.valueOf(0L));
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s1)
                        {
                            a.a(Long.valueOf(-1L), Long.valueOf(-1L), 10003);
                        }
                        return;
                    }
                    a.a(Long.valueOf(-1L), Long.valueOf(-1L), i1);
                    return;
                    a.a(Long.valueOf(-1L), Long.valueOf(-1L), 10000);
                    return;
                }

            
            {
                b = AdvDataManager.this;
                a = c1;
                super();
            }
            }, new com.android.volley.k.a(c1) {

                final c a;
                final AdvDataManager b;

                public void a(VolleyError volleyerror)
                {
                    if (a != null)
                    {
                        a.a(Long.valueOf(-1L), Long.valueOf(-1L), 10000);
                    }
                }

            
            {
                b = AdvDataManager.this;
                a = c1;
                super();
            }
            }) {

                final AdvDataManager a;

                public Map i()
                    throws AuthFailureError
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put("ADAPPINFO", AdvDataManager.d(a));
                    return hashmap;
                }

            
            {
                a = AdvDataManager.this;
                super(i1, s1, s2, b1, a1);
            }
            };
            jsonarray.a(s);
            com.qihoo.security.appbox.c.b.a.a(jsonarray, "adv-install");
            return;
        }
    }

    public void b()
    {
        long l1 = System.currentTimeMillis();
        if (l1 - r > 0x1b77400L)
        {
            r = l1;
            g.sendEmptyMessage(1);
        }
    }

    public boolean c()
    {
        while (m <= 1.0F || android.os.Build.VERSION.SDK_INT <= 10) 
        {
            return true;
        }
        return false;
    }

    static 
    {
        b = new HashMap();
        b.put(Integer.valueOf(500), Integer.valueOf(0x6ddd00));
        b.put(Integer.valueOf(504), Integer.valueOf(0x6ddd00));
        c = new HashMap();
        c.put(Integer.valueOf(4000), "params error");
        c.put(Integer.valueOf(4001), "no mid");
        c.put(Integer.valueOf(4002), "no seesion id");
        c.put(Integer.valueOf(4003), "no adv in the area");
        c.put(Integer.valueOf(4004), "server error");
        c.put(Integer.valueOf(4005), "no adv in server");
        c.put(Integer.valueOf(4006), "can not read config");
        c.put(Integer.valueOf(4007), "area config error");
    }
}
