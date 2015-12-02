// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.clearengine.sdk.b;
import com.qihoo.security.clearengine.sdk.c;
import com.qihoo.security.clearengine.service.ClearEngineService;
import com.qihoo360.i.v1.main.pt.IPtManager;
import com.qihoo360.mobilesafe.opti.i.IFunctionManager;
import com.qihoo360.mobilesafe.opti.i.cloudquery.ICloudQuery;
import com.qihoo360.mobilesafe.opti.i.plugins.IApkScanProcess;
import com.qihoo360.mobilesafe.opti.i.plugins.ISharedPreferences;
import com.qihoo360.mobilesafe.opti.i.plugins.IUpdate;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashClearCategory;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.qihoo.security.clearengine.b:
//            b

public class com.qihoo.security.clearengine.b.a
{
    public static interface a
    {

        public abstract void a(int i1, int j1);
    }

    class b extends Handler
    {

        final com.qihoo.security.clearengine.b.a a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 7: default 166
        //                       1 48
        //                       2 102
        //                       3 110
        //                       4 127
        //                       5 135
        //                       6 150
        //                       7 158;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
            com.qihoo.security.clearengine.b.a.k(a);
            com.qihoo.security.clearengine.b.a.l(a);
            return;
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
_L3:
            try
            {
                com.qihoo.security.clearengine.b.a.m(a);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                message.printStackTrace();
                synchronized (com.qihoo.security.clearengine.b.a.b(a))
                {
                    com.qihoo.security.clearengine.b.a.a(a, false);
                    com.qihoo.security.clearengine.b.a.b(a, false);
                }
                return;
            }
_L4:
            message = (List)message.obj;
            com.qihoo.security.clearengine.b.a.a(a, message);
            return;
_L5:
            com.qihoo.security.clearengine.b.a.n(a);
            return;
_L6:
            com.qihoo.security.clearengine.b.a.a(a, (IBinder)message.obj);
            return;
_L7:
            com.qihoo.security.clearengine.b.a.o(a);
            return;
_L8:
            com.qihoo.security.clearengine.b.a.p(a);
            return;
_L1:
        }

        public b(Looper looper)
        {
            a = com.qihoo.security.clearengine.b.a.this;
            super(looper);
        }
    }


    private final Object A = new Object();
    private boolean B;
    com.qihoo.security.clearengine.b.b a;
    public Map b;
    protected HandlerThread c;
    private Context d;
    private com.qihoo.security.clearengine.a.a e;
    private com.qihoo.security.clearengine.surface.a f;
    private int g;
    private int h[];
    private ArrayList i;
    private com.qihoo.security.clearengine.sdk.b j;
    private final Object k = new Object();
    private TrashClearCategory l;
    private TrashClearCategory m;
    private TrashClearCategory n;
    private TrashClearCategory o;
    private TrashClearCategory p;
    private TrashClearCategory q;
    private TrashClearCategory r;
    private Map s;
    private final Object t = new Object();
    private b u;
    private ServiceConnection v;
    private com.qihoo.security.clearengine.a.c w;
    private com.qihoo.security.clearengine.a.b x;
    private boolean y;
    private boolean z;

    public com.qihoo.security.clearengine.b.a(Context context)
    {
        d = null;
        e = null;
        f = null;
        g = 11;
        j = new com.qihoo.security.clearengine.sdk.b();
        s = new ConcurrentHashMap();
        b = new HashMap();
        v = new ServiceConnection() {

            final com.qihoo.security.clearengine.b.a a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                componentname = Message.obtain();
                componentname.what = 5;
                componentname.obj = ibinder;
                com.qihoo.security.clearengine.b.a.a(a).sendMessage(componentname);
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                synchronized (com.qihoo.security.clearengine.b.a.b(a))
                {
                    com.qihoo.security.clearengine.b.a.a(a, false);
                    com.qihoo.security.clearengine.b.a.b(a, false);
                }
                com.qihoo.security.clearengine.b.a.a(a).sendEmptyMessage(6);
                return;
                exception;
                componentname;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = com.qihoo.security.clearengine.b.a.this;
                super();
            }
        };
        w = new com.qihoo.security.clearengine.a.c.a() {

            final com.qihoo.security.clearengine.b.a a;
            private int b;
            private String c;

            public void a()
                throws RemoteException
            {
                b = 0;
                com.qihoo.security.clearengine.b.a.c(a).clear();
                if (com.qihoo.security.clearengine.b.a.d(a) != null)
                {
                    com.qihoo.security.clearengine.b.a.d(a).a();
                }
            }

            public void a(int i1)
                throws RemoteException
            {
                synchronized (com.qihoo.security.clearengine.b.a.b(a))
                {
                    com.qihoo.security.clearengine.b.a.b(a, false);
                }
                if (!com.qihoo.security.clearengine.b.a.g(a)) goto _L2; else goto _L1
_L1:
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
_L2:
                Map map;
                try
                {
                    com.qihoo.security.clearengine.b.a.i(a);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((Exception) (obj1)).printStackTrace();
                }
                synchronized (com.qihoo.security.clearengine.b.a.h(a))
                {
                    map = com.qihoo.security.clearengine.d.a.b(com.qihoo.security.clearengine.b.a.c(a));
                }
                if (com.qihoo.security.clearengine.b.a.d(a) == null) goto _L1; else goto _L3
_L3:
                com.qihoo.security.clearengine.b.a.d(a).a(i1, map, com.qihoo.security.clearengine.b.a.j(a));
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            public void a(int i1, int j1, String s1)
                throws RemoteException
            {
label0:
                {
                    synchronized (com.qihoo.security.clearengine.b.a.b(a))
                    {
                        if (com.qihoo.security.clearengine.b.a.e(a))
                        {
                            break label0;
                        }
                    }
                    return;
                }
                obj;
                JVM INSTR monitorexit ;
                synchronized (com.qihoo.security.clearengine.b.a.f(a))
                {
                    if (!com.qihoo.security.clearengine.b.a.g(a))
                    {
                        break MISSING_BLOCK_LABEL_67;
                    }
                }
                return;
                s1;
                obj;
                JVM INSTR monitorexit ;
                throw s1;
                s1;
                obj;
                JVM INSTR monitorexit ;
                throw s1;
                obj;
                JVM INSTR monitorexit ;
                b = (i1 * 100) / j1;
                c = s1;
                Map map;
                synchronized (com.qihoo.security.clearengine.b.a.h(a))
                {
                    map = com.qihoo.security.clearengine.d.a.b(com.qihoo.security.clearengine.b.a.c(a));
                }
                if (com.qihoo.security.clearengine.b.a.d(a) != null)
                {
                    com.qihoo.security.clearengine.b.a.d(a).a(b, s1, map);
                    return;
                } else
                {
                    return;
                }
                s1;
                obj1;
                JVM INSTR monitorexit ;
                throw s1;
            }

            public void a(TrashInfo trashinfo)
                throws RemoteException
            {
label0:
                {
                    synchronized (com.qihoo.security.clearengine.b.a.b(a))
                    {
                        if (com.qihoo.security.clearengine.b.a.e(a))
                        {
                            break label0;
                        }
                    }
                    return;
                }
                obj;
                JVM INSTR monitorexit ;
                com.qihoo.security.clearengine.b.a.a(a, trashinfo);
                if (trashinfo.type != 35 || trashinfo.bundle.getString("overlapPath") == null)
                {
                    a.b(trashinfo);
                    synchronized (com.qihoo.security.clearengine.b.a.h(a))
                    {
                        obj = com.qihoo.security.clearengine.d.a.b(com.qihoo.security.clearengine.b.a.c(a));
                    }
                    if (com.qihoo.security.clearengine.b.a.d(a) != null)
                    {
                        com.qihoo.security.clearengine.b.a.d(a).a(b, c, ((Map) (obj)));
                        return;
                    }
                }
                break MISSING_BLOCK_LABEL_127;
                trashinfo;
                obj;
                JVM INSTR monitorexit ;
                throw trashinfo;
                exception;
                trashinfo;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = com.qihoo.security.clearengine.b.a.this;
                super();
                b = 0;
            }
        };
        x = new com.qihoo.security.clearengine.a.b.a() {

            final com.qihoo.security.clearengine.b.a a;

            public void a()
                throws RemoteException
            {
                if (com.qihoo.security.clearengine.b.a.d(a) != null)
                {
                    com.qihoo.security.clearengine.b.a.d(a).b();
                }
            }

            public void a(int i1)
                throws RemoteException
            {
                synchronized (com.qihoo.security.clearengine.b.a.b(a))
                {
                    com.qihoo.security.clearengine.b.a.a(a, false);
                }
                if (com.qihoo.security.clearengine.b.a.d(a) != null)
                {
                    com.qihoo.security.clearengine.b.a.d(a).a(i1);
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void a(int i1, int j1, TrashInfo trashinfo)
                throws RemoteException
            {
label0:
                {
                    synchronized (com.qihoo.security.clearengine.b.a.b(a))
                    {
                        if (com.qihoo.security.clearengine.b.a.e(a))
                        {
                            break label0;
                        }
                    }
                    return;
                }
                obj;
                JVM INSTR monitorexit ;
                a.c(trashinfo);
                Map map;
                synchronized (com.qihoo.security.clearengine.b.a.h(a))
                {
                    map = com.qihoo.security.clearengine.d.a.b(com.qihoo.security.clearengine.b.a.c(a));
                }
                if (com.qihoo.security.clearengine.b.a.d(a) != null)
                {
                    com.qihoo.security.clearengine.b.a.d(a).a(i1, j1, TrashType.getTrashType(trashinfo.type), trashinfo, map);
                    return;
                } else
                {
                    return;
                }
                trashinfo;
                obj;
                JVM INSTR monitorexit ;
                throw trashinfo;
                trashinfo;
                obj;
                JVM INSTR monitorexit ;
                throw trashinfo;
            }

            
            {
                a = com.qihoo.security.clearengine.b.a.this;
                super();
            }
        };
        y = false;
        z = false;
        B = false;
        d = context;
    }

    static b a(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.u;
    }

    private com.qihoo.security.clearengine.sdk.b a(List list, ArrayList arraylist, boolean flag)
    {
        com.qihoo.security.clearengine.sdk.b b1;
        HashMap hashmap;
        HashMap hashmap1;
        Object obj2;
        b1 = new com.qihoo.security.clearengine.sdk.b();
        hashmap = new HashMap();
        hashmap1 = new HashMap();
        obj2 = list.iterator();
_L14:
        if (((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        long l2;
        long l4;
        obj = new HashSet();
        obj1 = hashmap.keySet().iterator();
        l4 = 0L;
        l2 = 0L;
_L8:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        arraylist = ((HashSet) (obj)).iterator();
_L11:
        if (arraylist.hasNext()) goto _L6; else goto _L5
_L5:
        list = list.iterator();
_L12:
        if (!list.hasNext())
        {
            b1.a = b1.a - l2;
            b1.c = b1.c - l4;
            return b1;
        }
        break MISSING_BLOCK_LABEL_774;
_L2:
        obj = (TrashClearCategory)((Iterator) (obj2)).next();
        switch (((TrashClearCategory) (obj)).type)
        {
        case 32: // ' '
        case 33: // '!'
        case 36: // '$'
        case 323: 
            obj = ((TrashClearCategory) (obj)).trashInfoList.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (TrashInfo)((Iterator) (obj)).next();
                if (321 == ((TrashInfo) (obj1)).type || 33 == ((TrashInfo) (obj1)).type || 323 == ((TrashInfo) (obj1)).type || 368 == ((TrashInfo) (obj1)).type)
                {
                    ((TrashInfo) (obj1)).bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
                    ArrayList arraylist1 = ((TrashInfo) (obj1)).bundle.getParcelableArrayList("subList");
                    if (arraylist1 == null)
                    {
                        hashmap.put(((TrashInfo) (obj1)).path, obj1);
                    } else
                    {
                        obj1 = arraylist1.iterator();
                        while (((Iterator) (obj1)).hasNext()) 
                        {
                            TrashInfo trashinfo = (TrashInfo)((Iterator) (obj1)).next();
                            hashmap.put(trashinfo.path, trashinfo);
                        }
                    }
                }
            }
            break;

        case 34: // '"'
        case 35: // '#'
            Iterator iterator = ((TrashClearCategory) (obj)).trashInfoList.iterator();
            while (iterator.hasNext()) 
            {
                TrashInfo trashinfo2 = (TrashInfo)iterator.next();
                String s1 = trashinfo2.bundle.getString("overlapPath");
                if (s1 != null)
                {
                    obj1 = (ArrayList)hashmap1.get(s1);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = new ArrayList(3);
                    }
                    ((ArrayList) (obj)).add(trashinfo2);
                    hashmap1.put(s1, obj);
                }
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Object obj3;
        obj2 = (String)((Iterator) (obj1)).next();
        obj3 = (ArrayList)hashmap1.get(obj2);
        if (obj3 == null) goto _L8; else goto _L7
_L7:
        TrashInfo trashinfo1;
        long l1;
        long l5;
        trashinfo1 = (TrashInfo)hashmap.get(obj2);
        obj3 = ((ArrayList) (obj3)).iterator();
        l5 = l2;
        l1 = l4;
_L10:
        l4 = l1;
        l2 = l5;
        if (!((Iterator) (obj3)).hasNext()) goto _L8; else goto _L9
_L9:
        TrashInfo trashinfo3 = (TrashInfo)((Iterator) (obj3)).next();
        if (34 == trashinfo3.type && arraylist != null && arraylist.contains(obj2))
        {
            long l3;
            boolean flag1;
            if (trashinfo1.isSelected && !trashinfo1.isInWhiteList)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            trashinfo3.isSelected = flag1;
        } else
        if (35 != trashinfo3.type || flag || arraylist == null || !arraylist.contains(obj2));
        l5 += trashinfo3.size;
        l3 = l1;
        if (trashinfo1.isSelected)
        {
            l3 = l1;
            if (!trashinfo1.isInWhiteList)
            {
                l3 = l1;
                if (trashinfo3.isSelected)
                {
                    l3 = l1;
                    if (!trashinfo3.isInWhiteList)
                    {
                        l3 = l1 + trashinfo3.size;
                    }
                }
            }
        }
        ((HashSet) (obj)).add(Integer.valueOf(trashinfo3.type));
        l1 = l3;
          goto _L10
          goto _L8
_L6:
        com.qihoo.security.clearengine.sdk.c.a(f(((Integer)arraylist.next()).intValue()));
          goto _L11
        arraylist = (TrashClearCategory)list.next();
        b1.d = b1.d + ((TrashClearCategory) (arraylist)).selectedCount;
        b1.c = b1.c + ((TrashClearCategory) (arraylist)).selectedSize;
        b1.b = b1.b + ((TrashClearCategory) (arraylist)).count;
        b1.a = b1.a + ((TrashClearCategory) (arraylist)).size;
          goto _L12
        if (true) goto _L14; else goto _L13
_L13:
    }

    private final com.qihoo.security.clearengine.surface.b a(TrashType trashtype)
    {
        com.qihoo.security.clearengine.surface.b b2 = (com.qihoo.security.clearengine.surface.b)s.get(trashtype);
        com.qihoo.security.clearengine.surface.b b1 = b2;
        if (b2 == null)
        {
            b1 = new com.qihoo.security.clearengine.surface.b(trashtype);
            s.put(trashtype, b1);
        }
        return b1;
    }

    public static void a(Context context, String s1)
    {
        com.qihoo.a.a.a.c.a(s1, new IFunctionManager(context) {

            private final Context a;

            public Object query(Class class1)
            {
                class1 = class1.getName();
                if (class1.equals(com/qihoo360/i/v1/main/pt/IPtManager.getName()))
                {
                    return new com.qihoo.security.clearengine.sdk.a.b(a);
                }
                if (class1.equals(com/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences.getName()))
                {
                    return new com.qihoo.security.clearengine.sdk.a.c(a);
                }
                if (class1.equals(com/qihoo360/mobilesafe/opti/i/plugins/IApkScanProcess.getName()))
                {
                    return new com.qihoo.security.clearengine.sdk.a.a(a);
                } else
                {
                    class1.equals(com/qihoo360/mobilesafe/opti/i/plugins/IUpdate.getName());
                    Log.e("FunctionManagerImpl", (new StringBuilder("query interface is not supported ")).append(class1).toString());
                    return null;
                }
            }

            
            {
                a = context;
                super();
            }
        });
    }

    public static void a(Context context, List list, int i1, String s1, a a1)
    {
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = "en";
        }
        com.qihoo.security.clearengine.d.c.b(context, "cloud_data_language", s2);
        (new Thread(new Runnable(context, i1, list, a1) {

            private final Context a;
            private final int b;
            private final List c;
            private final a d;

            public void run()
            {
                Object obj = com.qihoo.a.a.a.c.c(a);
                if (obj == null) goto _L2; else goto _L1
_L1:
                int j1;
                boolean flag;
                flag = false;
                j1 = ((flag) ? 1 : 0);
                b;
                JVM INSTR tableswitch 1 8: default 68
            //                           1 196
            //                           2 229
            //                           3 72
            //                           4 284
            //                           5 72
            //                           6 72
            //                           7 72
            //                           8 334;
                   goto _L3 _L4 _L5 _L6 _L7 _L6 _L6 _L6 _L8
_L6:
                break; /* Loop/switch isn't completed */
_L3:
                j1 = ((flag) ? 1 : 0);
_L10:
                if (com.qihoo.security.clearengine.d.b.b(a))
                {
                    com.qihoo.security.clearengine.c.a a2 = new com.qihoo.security.clearengine.c.a(a);
                    List list1 = a2.a();
                    if (list1 != null && list1.size() > 0 && 1 == ((ICloudQuery) (obj)).cloudQuery(1, null, list1))
                    {
                        a2.b();
                    }
                }
                if (j1 == 1)
                {
                    com.qihoo.security.clearengine.d.c.b(a, "cloud_data_updated_time_stp", System.currentTimeMillis());
                    obj = new Intent();
                    ((Intent) (obj)).setAction("clear_cloud_query_success");
                    a.sendBroadcast(((Intent) (obj)));
                }
                if (d != null)
                {
                    d.a(j1, com.qihoo.security.clearengine.d.b.a(a));
                }
_L2:
                return;
_L4:
                j1 = ((flag) ? 1 : 0);
                if (com.qihoo.security.clearengine.d.c.a(a, "cloud_data_updated_time_stp", 0L) == 0L)
                {
                    j1 = ((ICloudQuery) (obj)).cloudQuery(1, null, null);
                }
                continue; /* Loop/switch isn't completed */
_L5:
                long l1 = com.qihoo.security.clearengine.d.c.a(a, "cloud_data_updated_time_stp", 0L);
                long l2 = System.currentTimeMillis();
                if (l2 - l1 <= 0x5265c00L)
                {
                    j1 = ((flag) ? 1 : 0);
                    if (l2 > l1)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                j1 = ((ICloudQuery) (obj)).cloudQuery(1, null, null);
                continue; /* Loop/switch isn't completed */
_L7:
                if (c == null || c.size() == 0)
                {
                    j1 = ((ICloudQuery) (obj)).cloudQuery(1, null, null);
                } else
                {
                    j1 = ((ICloudQuery) (obj)).cloudQuery(2, c, null);
                }
                continue; /* Loop/switch isn't completed */
_L8:
                j1 = ((ICloudQuery) (obj)).cloudQuery(1, null, null);
                if (true) goto _L10; else goto _L9
_L9:
            }

            
            {
                a = context;
                b = i1;
                c = list;
                d = a1;
                super();
            }
        })).start();
    }

    private final void a(IBinder ibinder)
    {
        e = com.qihoo.security.clearengine.a.a.a(ibinder);
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        e.a(g, h, i);
        e.a(w);
        e.a(x);
        if (f != null)
        {
            f.a(true);
        }
        a = new com.qihoo.security.clearengine.b.b(e);
        a.a();
        return;
        ibinder;
        if (f != null)
        {
            f.a(false);
        }
        ibinder.printStackTrace();
        return;
    }

    static void a(com.qihoo.security.clearengine.b.a a1, IBinder ibinder)
    {
        a1.a(ibinder);
    }

    static void a(com.qihoo.security.clearengine.b.a a1, TrashInfo trashinfo)
    {
        a1.f(trashinfo);
    }

    static void a(com.qihoo.security.clearengine.b.a a1, List list)
        throws RemoteException
    {
        a1.b(list);
    }

    static void a(com.qihoo.security.clearengine.b.a a1, boolean flag)
    {
        a1.z = flag;
    }

    private void a(ArrayList arraylist, boolean flag)
    {
        System.currentTimeMillis();
        synchronized (k)
        {
            j = a(e(), arraylist, flag);
        }
        return;
        arraylist;
        obj;
        JVM INSTR monitorexit ;
        throw arraylist;
    }

    static Object b(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.A;
    }

    static void b(com.qihoo.security.clearengine.b.a a1, boolean flag)
    {
        a1.y = flag;
    }

    private final void b(List list)
        throws RemoteException
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        list = list.iterator();
_L8:
        if (list.hasNext()) goto _L2; else goto _L1
_L1:
        if (e == null) goto _L4; else goto _L3
_L3:
        e.a(arraylist);
_L6:
        return;
_L2:
        TrashInfo trashinfo = (TrashInfo)list.next();
        trashinfo.bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
        Object obj = trashinfo.bundle.getParcelableArrayList("subList");
        if (obj == null || ((ArrayList) (obj)).size() < 1)
        {
            if (!trashinfo.isInWhiteList && (trashinfo.isSelected || trashinfo.type == 322))
            {
                arraylist.add(trashinfo);
            }
        } else
        {
            ArrayList arraylist1 = new ArrayList(((ArrayList) (obj)).size());
            obj = ((ArrayList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                TrashInfo trashinfo1 = (TrashInfo)((Iterator) (obj)).next();
                if (trashinfo1.isInWhiteList)
                {
                    arraylist1.add(trashinfo1);
                } else
                if (!trashinfo1.isSelected)
                {
                    arraylist1.add(trashinfo1);
                } else
                {
                    arraylist.add(trashinfo1);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        list;
        list.printStackTrace();
        return;
_L4:
        if (f == null) goto _L6; else goto _L5
_L5:
        f.b(3);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static Map c(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.s;
    }

    static com.qihoo.security.clearengine.surface.a d(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.f;
    }

    private ArrayList e(TrashInfo trashinfo)
    {
        ArrayList arraylist = new ArrayList(1);
        trashinfo.bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
        ArrayList arraylist1 = trashinfo.bundle.getParcelableArrayList("subList");
        if (arraylist1 != null)
        {
            trashinfo = arraylist1.iterator();
            do
            {
                if (!trashinfo.hasNext())
                {
                    return arraylist;
                }
                arraylist.add(((TrashInfo)trashinfo.next()).path);
            } while (true);
        } else
        {
            arraylist.add(trashinfo.path);
            return arraylist;
        }
    }

    private boolean e(int i1)
    {
        return 34 != i1 && 35 != i1;
    }

    static boolean e(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.k();
    }

    private TrashClearCategory f(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 321: 
            return m;

        case 322: 
            return n;

        case 33: // '!'
            return p;

        case 323: 
            return o;

        case 35: // '#'
            return r;

        case 34: // '"'
            return q;

        case 361: 
        case 362: 
        case 363: 
        case 364: 
        case 365: 
        case 366: 
        case 367: 
        case 368: 
            return l;
        }
    }

    static Object f(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.k;
    }

    private void f(TrashInfo trashinfo)
    {
        TrashClearCategory trashclearcategory;
        if (trashinfo != null)
        {
            if ((trashclearcategory = f(trashinfo.type)) != null)
            {
                trashclearcategory.trashInfoList.add(trashinfo);
                return;
            }
        }
    }

    static boolean g(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.B;
    }

    static Object h(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.t;
    }

    private final void h()
        throws RemoteException
    {
        if (e != null)
        {
            e.a();
        } else
        if (f != null)
        {
            f.b(1);
            return;
        }
    }

    private final void i()
    {
        e = null;
    }

    static void i(com.qihoo.security.clearengine.b.a a1)
    {
        a1.n();
    }

    static com.qihoo.security.clearengine.sdk.b j(com.qihoo.security.clearengine.b.a a1)
    {
        return a1.j;
    }

    private final void j()
    {
        try
        {
            d.unbindService(v);
            if (e != null)
            {
                e.b(x);
                e.b(w);
                e = null;
            }
            if (c != null)
            {
                c.quit();
                u = null;
                c = null;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    static void k(com.qihoo.security.clearengine.b.a a1)
    {
        a1.p();
    }

    private final boolean k()
    {
        return y || z;
    }

    private final void l()
        throws RemoteException
    {
        if (e != null)
        {
            e.b();
        } else
        if (f != null)
        {
            f.b(2);
            return;
        }
    }

    static void l(com.qihoo.security.clearengine.b.a a1)
        throws RemoteException
    {
        a1.h();
    }

    private final void m()
        throws RemoteException
    {
        if (e != null)
        {
            e.c();
        } else
        if (f != null)
        {
            f.b(4);
            return;
        }
    }

    static void m(com.qihoo.security.clearengine.b.a a1)
        throws RemoteException
    {
        a1.l();
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        arraylist.add(m);
        arraylist.add(p);
        com.qihoo.security.clearengine.d.a.b(arraylist);
        arraylist.add(n);
        arraylist.add(l);
        arraylist.add(o);
        arraylist.add(p);
        arraylist.add(q);
        arraylist.add(r);
        b = com.qihoo.security.clearengine.d.a.a(arraylist);
        q();
        a(((ArrayList) (null)), true);
        o();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void n(com.qihoo.security.clearengine.b.a a1)
        throws RemoteException
    {
        a1.m();
    }

    private final void o()
    {
        Iterator iterator = s.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            TrashType trashtype = (TrashType)iterator.next();
            List list = d(trashtype.toEnv());
            s.put(trashtype, com.qihoo.security.clearengine.d.a.a(trashtype, list));
        } while (true);
    }

    static void o(com.qihoo.security.clearengine.b.a a1)
    {
        a1.i();
    }

    private void p()
    {
        m = new TrashClearCategory(32);
        n = new TrashClearCategory(322);
        o = new TrashClearCategory(323);
        p = new TrashClearCategory(33);
        q = new TrashClearCategory(34);
        l = new TrashClearCategory(36);
        r = new TrashClearCategory(35);
        j = new com.qihoo.security.clearengine.sdk.b();
    }

    static void p(com.qihoo.security.clearengine.b.a a1)
    {
        a1.j();
    }

    private void q()
    {
        com.qihoo.security.clearengine.sdk.c.a(l.trashInfoList);
        if (n != null && n.trashInfoList != null && n.trashInfoList.size() > 0)
        {
            com.qihoo.security.clearengine.sdk.c.a(n);
            com.qihoo.security.clearengine.sdk.c.a(n.trashInfoList);
            TrashInfo trashinfo = (TrashInfo)l.trashInfoList.get(0);
            if (trashinfo == null || trashinfo.type != 322)
            {
                TrashInfo trashinfo1 = new TrashInfo();
                trashinfo1.desc = com.qihoo.security.clearengine.d.a.a(d, "trash_type_system_cache", "System caches");
                trashinfo1.type = 322;
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("subList", n.trashInfoList);
                trashinfo1.bundle = bundle;
                l.trashInfoList.add(0, trashinfo1);
            }
        }
        com.qihoo.security.clearengine.sdk.c.a(l);
        com.qihoo.security.clearengine.sdk.c.a(m.trashInfoList);
        com.qihoo.security.clearengine.sdk.c.a(m);
        com.qihoo.security.clearengine.sdk.c.a(o);
        com.qihoo.security.clearengine.sdk.c.a(o.trashInfoList);
        com.qihoo.security.clearengine.sdk.c.a(p);
        com.qihoo.security.clearengine.sdk.c.a(p.trashInfoList);
        a(r);
        a(q);
        q.trashInfoList = (new com.qihoo.security.clearengine.sdk.a()).a(q.trashInfoList);
        com.qihoo.security.clearengine.sdk.c.a(q);
        com.qihoo.security.clearengine.sdk.c.a(r);
        com.qihoo.security.clearengine.sdk.c.a(r.trashInfoList);
    }

    public List a(int i1)
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        List list = e.a(i1);
        return list;
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        return null;
    }

    public void a()
    {
        if (c == null)
        {
            c = new HandlerThread("TrashCleanManager");
            c.start();
            u = new b(c.getLooper());
        }
        Intent intent = new Intent(d, com/qihoo/security/clearengine/service/ClearEngineService);
        intent.setAction("ACTION_TRASH_CLEAR");
        if (!d.bindService(intent, v, 1))
        {
            synchronized (A)
            {
                z = false;
                y = false;
            }
            if (f != null)
            {
                f.a(false);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i1, UserBWRecord userbwrecord)
    {
        a(userbwrecord.value, false);
        a.b(userbwrecord.value);
        userbwrecord.flag = -1;
        try
        {
            e.b(userbwrecord);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UserBWRecord userbwrecord)
        {
            userbwrecord.printStackTrace();
        }
    }

    public void a(com.qihoo.security.clearengine.surface.a a1)
    {
        if (a1 != null)
        {
            f = a1;
        }
    }

    protected void a(TrashClearCategory trashclearcategory)
    {
        if (trashclearcategory != null && trashclearcategory.trashInfoList != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = trashclearcategory.trashInfoList.iterator();
        do
        {
label0:
            {
                if (iterator.hasNext())
                {
                    break label0;
                }
                if (hashmap.values() != null)
                {
                    trashclearcategory.trashInfoList = new ArrayList(hashmap.values());
                    return;
                }
            }
            if (true)
            {
                continue;
            }
            TrashInfo trashinfo = (TrashInfo)iterator.next();
            if (trashinfo != null && !TextUtils.isEmpty(trashinfo.path))
            {
                hashmap.put(trashinfo.path, trashinfo);
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void a(String s1, boolean flag)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if ((s1 = (List)b.get(s1)) != null)
            {
                s1 = s1.iterator();
                while (s1.hasNext()) 
                {
                    TrashInfo trashinfo = (TrashInfo)s1.next();
                    if (trashinfo != null)
                    {
                        trashinfo.isInWhiteList = flag;
                    }
                }
            }
        }
    }

    public void a(ArrayList arraylist)
    {
        i = arraylist;
    }

    public void a(List list)
    {
label0:
        {
            synchronized (A)
            {
                if (!k())
                {
                    break label0;
                }
            }
            return;
        }
        z = true;
        obj;
        JVM INSTR monitorexit ;
        obj = u.obtainMessage(3);
        obj.obj = list;
        u.sendMessage(((Message) (obj)));
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void a(int ai[])
    {
        h = ai;
    }

    public void a(TrashType atrashtype[])
    {
        HashMap hashmap = new HashMap();
        int j1 = atrashtype.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                atrashtype = com.qihoo.security.clearengine.d.a.a(hashmap);
                f.a(atrashtype);
                return;
            }
            TrashType trashtype = atrashtype[i1];
            List list = d(trashtype.toEnv());
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
            }
            hashmap.put(trashtype, obj);
            i1++;
        } while (true);
    }

    public boolean a(TrashInfo trashinfo)
    {
        return a.a(trashinfo);
    }

    public void b()
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        e.a(g, h, i);
        return;
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        return;
    }

    public void b(int i1)
    {
        g = i1;
    }

    protected void b(TrashInfo trashinfo)
    {
        com.qihoo.security.clearengine.surface.b b1;
        Object obj;
        try
        {
            b1 = a(TrashType.getTrashType(trashinfo.type));
            trashinfo.bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
            obj = (ArrayList)trashinfo.bundle.get("subList");
        }
        // Misplaced declaration of an exception variable
        catch (TrashInfo trashinfo)
        {
            trashinfo.printStackTrace();
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        trashinfo = ((List) (obj)).iterator();
_L2:
        if (!trashinfo.hasNext())
        {
            return;
        }
        obj = (TrashInfo)trashinfo.next();
        if (((TrashInfo) (obj)).isSelected)
        {
            b1.a = b1.a + ((TrashInfo) (obj)).size;
        }
        b1.b = b1.b + ((TrashInfo) (obj)).size;
        if (true) goto _L2; else goto _L1
_L1:
        if (trashinfo.isSelected)
        {
            b1.a = b1.a + trashinfo.size;
        }
        b1.b = b1.b + trashinfo.size;
        return;
    }

    public TrashClearCategory c(int i1)
    {
        if (y)
        {
            synchronized (A)
            {
                y = false;
            }
            Object obj1;
            try
            {
                n();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        obj = null;
        i1;
        JVM INSTR lookupswitch 6: default 88
    //                   32: 118
    //                   33: 126
    //                   34: 134
    //                   35: 142
    //                   36: 158
    //                   323: 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new TrashClearCategory(i1);
        }
        return ((TrashClearCategory) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        obj = m;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = p;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = q;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = r;
        continue; /* Loop/switch isn't completed */
_L7:
        obj = o;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = l;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void c()
    {
label0:
        {
            synchronized (A)
            {
                if (!k())
                {
                    break label0;
                }
            }
            return;
        }
        y = true;
        obj;
        JVM INSTR monitorexit ;
        u.sendEmptyMessage(1);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void c(TrashInfo trashinfo)
    {
        try
        {
            com.qihoo.security.clearengine.surface.b b1 = a(TrashType.getTrashType(trashinfo.type));
            if (trashinfo.isSelected)
            {
                b1.a = b1.a - trashinfo.size;
            }
            b1.b = b1.b - trashinfo.size;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrashInfo trashinfo)
        {
            trashinfo.printStackTrace();
        }
    }

    public List d(int i1)
    {
        TrashClearCategory trashclearcategory = c(i1);
        if (trashclearcategory != null)
        {
            return new ArrayList(trashclearcategory.trashInfoList);
        } else
        {
            return null;
        }
    }

    public void d()
    {
        u.sendEmptyMessage(2);
    }

    public void d(TrashInfo trashinfo)
    {
        if (trashinfo != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        UserBWRecord userbwrecord;
        Object obj;
        Object obj1;
        boolean flag;
        if (a.a(trashinfo))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        trashinfo.isInWhiteList = flag;
        a(trashinfo.path, trashinfo.isInWhiteList);
        com.qihoo.security.clearengine.sdk.c.a(f(trashinfo.type));
        if (e(trashinfo.type))
        {
            obj = e(trashinfo);
        } else
        {
            obj = null;
        }
        a(((ArrayList) (obj)), false);
        userbwrecord = com.qihoo.security.clearengine.sdk.c.b(trashinfo);
        obj1 = "";
        if (trashinfo.type == 321)
        {
            obj = obj1;
            if (trashinfo.bundle != null)
            {
                obj = obj1;
                if (trashinfo.bundle.containsKey("app_name"))
                {
                    obj = trashinfo.bundle.getString("app_name");
                }
            }
            obj1 = obj;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj1 = obj;
                if (d != null)
                {
                    obj1 = obj;
                    if (!TextUtils.isEmpty(trashinfo.packageName))
                    {
                        obj1 = com.qihoo.security.clearengine.sdk.c.a(trashinfo.packageName, d.getPackageManager());
                    }
                }
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj1 = new StringBuilder(String.valueOf(obj1));
                if (TextUtils.isEmpty(userbwrecord.desc))
                {
                    obj = "";
                } else
                {
                    obj = (new StringBuilder("(")).append(userbwrecord.desc).append(")").toString();
                }
                userbwrecord.desc = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
            }
        }
        if (a == null || e == null) goto _L1; else goto _L3
_L3:
        if (trashinfo.isInWhiteList)
        {
            a.a(userbwrecord.value);
            e.a(userbwrecord);
            return;
        }
        break MISSING_BLOCK_LABEL_311;
        trashinfo;
        trashinfo.printStackTrace();
        return;
        a.b(userbwrecord.value);
        e.b(userbwrecord);
        return;
    }

    public List e()
    {
        ArrayList arraylist = new ArrayList(6);
        if (l != null && l.count > 0L)
        {
            arraylist.add(l);
        }
        if (m != null && m.count > 0L)
        {
            arraylist.add(m);
        }
        if (o != null && o.count > 0L)
        {
            arraylist.add(o);
        }
        if (q != null && q.count > 0L)
        {
            arraylist.add(q);
        }
        if (p != null && p.count > 0L)
        {
            arraylist.add(p);
        }
        if (r != null && r.count > 0L)
        {
            arraylist.add(r);
        }
        return arraylist;
    }

    public boolean f()
    {
        return e != null;
    }

    public void g()
    {
        a(f);
        a();
    }
}
