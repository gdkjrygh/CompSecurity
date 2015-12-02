// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.a.a.a.c;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.service.SecurityService;
import com.qihoo.utils.a.a;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.m;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.opti.i.appclear.AppInfo;
import com.qihoo360.mobilesafe.opti.i.appclear.IClearApp;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.gamebooster:
//            LocalGamePkg, g, GameBoosterActivity, h

public class com.qihoo.security.gamebooster.b
{
    private static class a
    {

        public static final com.qihoo.security.gamebooster.b a = new com.qihoo.security.gamebooster.b();

    }

    private static class b
    {

        boolean a;
        boolean b;
        boolean c;
        String d;
        boolean e;
        String f;

        public b(boolean flag, boolean flag1, boolean flag2, String s1, boolean flag3, String s2)
        {
            a = flag;
            b = flag1;
            c = flag2;
            d = s1;
            e = flag3;
            f = s2;
        }
    }


    com.qihoo.security.service.a a;
    private Context b;
    private PackageManager c;
    private g d;
    private Handler e;
    private Handler f;
    private long g;
    private Hashtable h;
    private com.qihoo.security.receiver.a i;
    private final AtomicBoolean j;
    private String k;
    private final com.qihoo.security.receiver.a.b l;
    private final com.qihoo.security.service.c.a m;
    private final ServiceConnection n;

    private com.qihoo.security.gamebooster.b()
    {
        j = new AtomicBoolean(false);
        l = new com.qihoo.security.receiver.a.b() {

            final com.qihoo.security.gamebooster.b a;

            public void a()
            {
            }

            public void b()
            {
            }

            public void c()
            {
                if (com.qihoo.security.gamebooster.b.j(a) != null && com.qihoo.security.gamebooster.b.j(a).size() > 0)
                {
                    com.qihoo.security.gamebooster.b.j(a).clear();
                }
            }

            
            {
                a = com.qihoo.security.gamebooster.b.this;
                super();
            }
        };
        m = new com.qihoo.security.service.c.a() {

            final com.qihoo.security.gamebooster.b a;

            public void a(boolean flag, boolean flag1, boolean flag2, String s1)
                throws RemoteException
            {
                a.a(flag, flag1, flag2, s1);
            }

            
            {
                a = com.qihoo.security.gamebooster.b.this;
                super();
            }
        };
        n = new ServiceConnection() {

            final com.qihoo.security.gamebooster.b a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                a.a = com.qihoo.security.service.a.a.a(ibinder);
                if (a.a == null)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                a.a.a(com.qihoo.security.gamebooster.b.k(a));
                return;
                componentname;
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                a.a = null;
            }

            
            {
                a = com.qihoo.security.gamebooster.b.this;
                super();
            }
        };
        b = SecurityApplication.a();
        c = b.getPackageManager();
        f = new Handler(Looper.getMainLooper());
        HandlerThread handlerthread = new HandlerThread("game-booster");
        handlerthread.start();
        e = new Handler(handlerthread.getLooper()) {

            final com.qihoo.security.gamebooster.b a;

            public void handleMessage(Message message)
            {
                boolean flag;
                boolean flag2;
                boolean flag3;
                boolean flag4;
                flag3 = true;
                flag2 = true;
                flag4 = false;
                flag = false;
                if (message != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                message.what;
                JVM INSTR tableswitch 1 12: default 84
            //                           1 85
            //                           2 102
            //                           3 248
            //                           4 256
            //                           5 456
            //                           6 307
            //                           7 180
            //                           8 571
            //                           9 579
            //                           10 630
            //                           11 788
            //                           12 976;
                   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L15:
                continue; /* Loop/switch isn't completed */
_L3:
                return;
_L4:
                message = (b)message.obj;
                a.a(message);
                return;
_L5:
                if (com.qihoo.security.gamebooster.b.a(a) == null)
                {
                    com.qihoo.security.gamebooster.b.b(a).sendMessage(com.qihoo.security.gamebooster.b.b(a).obtainMessage(7, message.obj));
                    return;
                }
                com.qihoo.security.gamebooster.b.c(a);
                g g1 = com.qihoo.security.gamebooster.b.a(a).e();
                message = (h)message.obj;
                if (message != null)
                {
                    com.qihoo.security.gamebooster.b.a(a, message, g1);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L10:
                com.qihoo.security.gamebooster.b.a(a, com.qihoo.security.gamebooster.b.d(a));
                if (com.qihoo.security.gamebooster.b.a(a) == null)
                {
                    com.qihoo.security.gamebooster.b.e(a);
                }
                if (message.obj != null)
                {
                    g g2 = com.qihoo.security.gamebooster.b.a(a).e();
                    message = (h)message.obj;
                    com.qihoo.security.gamebooster.b.a(a, message, g2);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L6:
                com.qihoo.security.gamebooster.b.f(a);
                return;
_L7:
                com.qihoo.security.gamebooster.b.a(a, (g)message.obj);
                com.qihoo.security.gamebooster.b.b(a, com.qihoo.security.gamebooster.b.a(a));
                message = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
                com.qihoo.security.gamebooster.b.g(a).sendBroadcast(message);
                return;
_L9:
                Object obj = (String)message.obj;
                message = com.qihoo.security.gamebooster.b.d(a);
                if (message != null)
                {
                    Object obj1 = new HashSet();
                    ((Set) (obj1)).add(obj);
                    obj1 = com.qihoo.security.gamebooster.b.a(a, ((Set) (obj1)));
                    if (((List) (obj1)).size() > 0)
                    {
                        obj1 = (LocalGamePkg)((List) (obj1)).get(0);
                        List list2 = message.c();
                        if (com.qihoo.security.gamebooster.b.a(list2, ((String) (obj))) == null)
                        {
                            list2.add(obj1);
                        }
                        obj1 = message.a();
                        obj = com.qihoo.security.gamebooster.b.a(((List) (obj1)), ((String) (obj)));
                        if (obj != null)
                        {
                            ((List) (obj1)).remove(obj);
                        }
                        com.qihoo.security.gamebooster.b.a(a, message);
                        com.qihoo.security.gamebooster.b.b(a, message);
                        com.qihoo.security.gamebooster.b.g(a).sendBroadcast(new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate"));
                        return;
                    }
                }
                continue; /* Loop/switch isn't completed */
_L8:
                List list1;
                Object obj2;
                obj2 = (String)message.obj;
                message = com.qihoo.security.gamebooster.b.d(a);
                if (message == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                List list = message.c();
                list1 = message.a();
                LocalGamePkg localgamepkg2 = com.qihoo.security.gamebooster.b.a(list, ((String) (obj2)));
                obj2 = com.qihoo.security.gamebooster.b.a(list1, ((String) (obj2)));
                if (localgamepkg2 == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                list.remove(localgamepkg2);
_L17:
                com.qihoo.security.gamebooster.b.a(a, message);
                com.qihoo.security.gamebooster.b.b(a, message);
                com.qihoo.security.gamebooster.b.g(a).sendBroadcast(new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate"));
                return;
                if (obj2 == null) goto _L1; else goto _L16
_L16:
                list1.remove(obj2);
                  goto _L17
_L11:
                com.qihoo.security.gamebooster.b.h(a);
                return;
_L12:
                if (com.qihoo.security.gamebooster.b.i(a).compareAndSet(false, true))
                {
                    (new Thread(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
                            com.qihoo.security.gamebooster.b.a(a.a, false);
                            com.qihoo.security.gamebooster.b.i(a.a).set(false);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    })).start();
                    return;
                } else
                {
                    com.qihoo.security.gamebooster.b.b(a).sendEmptyMessageDelayed(9, 3000L);
                    return;
                }
_L13:
                message = (String)message.obj;
                if (com.qihoo.security.gamebooster.b.a(a) == null)
                {
                    com.qihoo.security.gamebooster.b.e(a);
                }
                LocalGamePkg localgamepkg = new LocalGamePkg(message, LocalGamePkg.State.UserAdd, System.currentTimeMillis());
                if (com.qihoo.security.gamebooster.b.a(com.qihoo.security.gamebooster.b.a(a).c(), message) == null)
                {
                    com.qihoo.security.gamebooster.b.a(a).c().add(localgamepkg);
                    flag = true;
                }
                message = com.qihoo.security.gamebooster.b.a(com.qihoo.security.gamebooster.b.a(a).a(), message);
                if (message != null)
                {
                    com.qihoo.security.gamebooster.b.a(a).a().remove(message);
                    flag = flag2;
                }
                if (flag)
                {
                    com.qihoo.security.gamebooster.b.b(a, com.qihoo.security.gamebooster.b.a(a));
                    message = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
                    com.qihoo.security.gamebooster.b.g(a).sendBroadcast(message);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L14:
                message = (String)message.obj;
                if (com.qihoo.security.gamebooster.b.a(a) == null)
                {
                    com.qihoo.security.gamebooster.b.e(a);
                }
                LocalGamePkg localgamepkg1 = com.qihoo.security.gamebooster.b.a(com.qihoo.security.gamebooster.b.a(a).c(), message);
                boolean flag1 = flag4;
                if (localgamepkg1 != null)
                {
                    com.qihoo.security.gamebooster.b.a(a).c().remove(localgamepkg1);
                    flag1 = true;
                }
                if (com.qihoo.security.gamebooster.b.a(com.qihoo.security.gamebooster.b.a(a).a(), message) == null)
                {
                    if (localgamepkg1 != null)
                    {
                        com.qihoo.security.gamebooster.b.a(a).a().add(localgamepkg1);
                        flag1 = flag3;
                    } else
                    {
                        com.qihoo.security.gamebooster.b.a(a).a().add(new LocalGamePkg(message, LocalGamePkg.State.UserAdd, System.currentTimeMillis()));
                        flag1 = flag3;
                    }
                }
                if (flag1)
                {
                    com.qihoo.security.gamebooster.b.b(a, com.qihoo.security.gamebooster.b.a(a));
                    message = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
                    com.qihoo.security.gamebooster.b.g(a).sendBroadcast(message);
                    return;
                }
                continue; /* Loop/switch isn't completed */
                if (!SharedPref.b(com.qihoo.security.gamebooster.b.g(a), "game_booster_first_exit_home_actvity", false)) goto _L1; else goto _L18
_L18:
                message = SharedPref.b(com.qihoo.security.gamebooster.b.g(a), "sp_key_has_create_game_booster_shortcut", "");
                if (TextUtils.isEmpty(message) || !"1.0.8.3742".equals(message))
                {
                    com.qihoo.security.gamebooster.b.h(a);
                    return;
                }
                if (true) goto _L1; else goto _L19
_L19:
            }

            
            {
                a = com.qihoo.security.gamebooster.b.this;
                super(looper);
            }
        };
        e.sendEmptyMessage(7);
    }


    private Bitmap a(List list, int i1)
    {
        Resources resources = b.getResources();
        Drawable drawable1 = resources.getDrawable(i1);
        Drawable drawable = resources.getDrawable(0x7f02008f);
        int j1 = com.qihoo360.mobilesafe.b.r.a(b, 48F);
        int j2 = com.qihoo360.mobilesafe.b.r.a(b, 16F);
        int k2 = com.qihoo360.mobilesafe.b.r.a(b, 2.0F);
        i1 = com.qihoo360.mobilesafe.b.r.a(b, 7F);
        drawable1.setBounds(0, 0, j1, j1);
        drawable.setBounds(0, 0, j1, j1);
        Bitmap bitmap = Bitmap.createBitmap(j1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        int l2 = Math.min(list.size(), 4);
        drawable1.draw(canvas);
        if (l2 == 0)
        {
            list = resources.getDrawable(0x7f02008c);
            list.setBounds(0, 0, j1, j1);
            list.draw(canvas);
        } else
        {
            int k1 = 0;
            while (k1 < l2) 
            {
                Object obj = (LocalGamePkg)list.get(k1);
                obj = com.qihoo.utils.a.a.a().a(((LocalGamePkg) (obj)).getPkgName());
                if (obj != null)
                {
                    int l1;
                    int i2;
                    if (k1 == 0 || k1 == 1)
                    {
                        l1 = i1;
                    } else
                    {
                        l1 = i1 + k2 + j2;
                    }
                    if (k1 == 0 || k1 == 2)
                    {
                        i2 = i1;
                    } else
                    {
                        i2 = i1 + k2 + j2;
                    }
                    ((Drawable) (obj)).setBounds(i2, l1, i2 + j2, l1 + j2);
                    ((Drawable) (obj)).draw(canvas);
                }
                k1++;
            }
        }
        drawable.draw(canvas);
        return bitmap;
    }

    public static LocalGamePkg a(List list, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        if (list == null)
        {
            return null;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            LocalGamePkg localgamepkg = (LocalGamePkg)list.next();
            if (localgamepkg != null && s1.equals(localgamepkg.getPkgName()))
            {
                return localgamepkg;
            }
        }

        return null;
    }

    public static com.qihoo.security.gamebooster.b a()
    {
        return com.qihoo.security.gamebooster.a.a;
    }

    static g a(com.qihoo.security.gamebooster.b b1)
    {
        return b1.d;
    }

    static g a(com.qihoo.security.gamebooster.b b1, g g1)
    {
        b1.d = g1;
        return g1;
    }

    static List a(com.qihoo.security.gamebooster.b b1, Set set)
    {
        return b1.a(set);
    }

    private List a(Set set)
    {
        long l1 = System.currentTimeMillis();
        IClearApp iclearapp = com.qihoo.a.a.a.c.e(b);
        ArrayList arraylist = new ArrayList();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            String s1 = (String)set.next();
            AppInfo appinfo = iclearapp.getAppInfo(s1);
            if (appinfo != null && appinfo.appType == 1)
            {
                arraylist.add(new LocalGamePkg(s1, LocalGamePkg.State.CleanRecmd, l1));
            }
        } while (true);
        System.currentTimeMillis();
        return arraylist;
    }

    static void a(com.qihoo.security.gamebooster.b b1, h h1, g g1)
    {
        b1.a(h1, g1);
    }

    static void a(com.qihoo.security.gamebooster.b b1, boolean flag)
    {
        b1.a(flag);
    }

    private void a(h h1, g g1)
    {
        f.post(new Runnable(h1, g1) {

            final h a;
            final g b;
            final com.qihoo.security.gamebooster.b c;

            public void run()
            {
                a.a(b, null);
            }

            
            {
                c = com.qihoo.security.gamebooster.b.this;
                a = h1;
                b = g1;
                super();
            }
        });
    }

    private void a(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            LocalGamePkg localgamepkg = (LocalGamePkg)list.next();
            if (a(list1, localgamepkg.getPkgName()) == null && com.qihoo360.mobilesafe.b.o.a(b, localgamepkg.getPkgName()))
            {
                arraylist.add(localgamepkg);
            }
        } while (true);
        list1.addAll(arraylist);
    }

    private static void a(List list, Set set)
    {
        if (list != null && set != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                String s1 = ((LocalGamePkg)list.next()).getPkgName();
                if (set.contains(s1))
                {
                    set.remove(s1);
                }
            }
        }
    }

    private void a(boolean flag)
    {
        Object obj1 = m();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = com.qihoo.security.gamebooster.g.d();
        }
        obj1 = l();
        a(((g) (obj)).c(), ((Set) (obj1)));
        a(((g) (obj)).a(), ((Set) (obj1)));
        g g1;
        if (flag)
        {
            obj1 = b(((Set) (obj1)));
            ((g) (obj)).a(com.qihoo360.mobilesafe.b.s.e(b, "b_g.dat"));
            obj = obj1;
        } else
        {
            obj = a(((Set) (obj1)));
        }
        g1 = m();
        obj1 = g1;
        if (g1 == null)
        {
            obj1 = com.qihoo.security.gamebooster.g.d();
        }
        if (((List) (obj)).size() > 0)
        {
            a(((List) (obj)), ((g) (obj1)).c());
            obj = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
            b.sendBroadcast(((Intent) (obj)));
        }
        if (Looper.myLooper() == e.getLooper())
        {
            d = ((g) (obj1));
            b(d);
            obj = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
            b.sendBroadcast(((Intent) (obj)));
            return;
        } else
        {
            e.sendMessage(e.obtainMessage(4, obj1));
            return;
        }
    }

    static Handler b(com.qihoo.security.gamebooster.b b1)
    {
        return b1.e;
    }

    private List b(Set set)
    {
        Object obj2;
        String s1;
        Object obj7;
        ArrayList arraylist;
        long l1;
        s1 = null;
        obj7 = null;
        obj2 = null;
        arraylist = new ArrayList();
        l1 = System.currentTimeMillis();
        Object obj = com.qihoo360.mobilesafe.b.s.b(b, "b_g.dat");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = com.qihoo360.mobilesafe.b.s.a(((InputStream) (obj)), NativeManager.a);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj2 = new BufferedReader(new InputStreamReader(((InputStream) (obj1))));
        Object obj3 = new com.qihoo.security.json.a(((java.io.Reader) (obj2)));
        ((com.qihoo.security.json.a) (obj3)).a();
label0:
        do
        {
            do
            {
                if (!((com.qihoo.security.json.a) (obj3)).c())
                {
                    break label0;
                }
                s1 = ((com.qihoo.security.json.a) (obj3)).e();
            } while (!set.contains(s1));
            arraylist.add(new LocalGamePkg(s1, LocalGamePkg.State.V5Recmd, l1));
            set.remove(s1);
        } while (set.size() != 0);
        ((com.qihoo.security.json.a) (obj3)).b();
        set = ((Set) (obj3));
_L13:
        if (set != null)
        {
            try
            {
                set.close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set)
            {
                return arraylist;
            }
        }
_L6:
        return arraylist;
        set;
        set = null;
        obj = null;
        obj1 = null;
        obj2 = s1;
_L11:
        if (set != null)
        {
            try
            {
                set.close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return arraylist;
        }
        return arraylist;
        set;
        set = null;
        obj2 = null;
        obj1 = null;
        obj = null;
_L10:
        if (set != null)
        {
            try
            {
                set.close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Set set) { }
        }
        if (obj == null) goto _L6; else goto _L7
_L7:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return arraylist;
        }
        return arraylist;
        set;
        obj2 = null;
        obj1 = null;
        obj = null;
        obj3 = obj7;
_L9:
        if (obj3 != null)
        {
            try
            {
                ((com.qihoo.security.json.a) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
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
        throw set;
        set;
        obj2 = null;
        obj1 = null;
        obj3 = obj7;
        continue; /* Loop/switch isn't completed */
        set;
        obj2 = null;
        obj3 = obj7;
        continue; /* Loop/switch isn't completed */
        set;
        obj3 = obj7;
        continue; /* Loop/switch isn't completed */
        set;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        set = null;
        obj2 = null;
        obj1 = null;
          goto _L10
        set;
        set = null;
        obj2 = null;
          goto _L10
        set;
        set = null;
          goto _L10
        set;
        set = ((Set) (obj3));
          goto _L10
        set;
        set = null;
        obj3 = null;
        obj1 = obj;
        obj2 = s1;
        obj = obj3;
          goto _L11
        set;
        set = null;
        obj3 = obj;
        obj2 = s1;
        obj = obj1;
        obj1 = obj3;
          goto _L11
        set;
        set = null;
        obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L11
        set;
        Object obj6 = obj;
        set = ((Set) (obj3));
        obj = obj1;
        obj1 = obj6;
          goto _L11
_L4:
        Object obj4 = null;
        set = ((Set) (obj2));
        obj2 = obj4;
        continue; /* Loop/switch isn't completed */
_L2:
        Object obj5 = null;
        obj1 = null;
        set = ((Set) (obj2));
        obj2 = obj5;
        if (true) goto _L13; else goto _L12
_L12:
    }

    static void b(com.qihoo.security.gamebooster.b b1, g g1)
    {
        b1.b(g1);
    }

    private void b(g g1)
    {
        g1 = com.qihoo.security.gamebooster.g.a(g1);
        SharedPref.a(b, "sp_key_local_game_package", g1);
        long l1 = System.currentTimeMillis();
        g = l1;
        SharedPref.a(b, "sp_key_local_game_package_time", l1);
    }

    static void c(com.qihoo.security.gamebooster.b b1)
    {
        b1.o();
    }

    static g d(com.qihoo.security.gamebooster.b b1)
    {
        return b1.m();
    }

    private void d(String s1)
    {
        SharedPref.a(b, "sp_key_has_create_game_booster_shortcut", s1);
        SharedPref.a(b, "sp_key_create_game_booster_time", System.currentTimeMillis());
    }

    static void e(com.qihoo.security.gamebooster.b b1)
    {
        b1.p();
    }

    private boolean e(String s1)
    {
        if (TextUtils.isEmpty(k))
        {
            k = s1;
        } else
        if (!k.equals(s1))
        {
            k = s1;
            return true;
        }
        return false;
    }

    static void f(com.qihoo.security.gamebooster.b b1)
    {
        b1.n();
    }

    static Context g(com.qihoo.security.gamebooster.b b1)
    {
        return b1.b;
    }

    public static String h()
    {
        int i1 = (int)(30D + Math.random() * 10D);
        return (new StringBuilder()).append(String.valueOf(i1)).append("%").toString();
    }

    static void h(com.qihoo.security.gamebooster.b b1)
    {
        b1.q();
    }

    static AtomicBoolean i(com.qihoo.security.gamebooster.b b1)
    {
        return b1.j;
    }

    static Hashtable j(com.qihoo.security.gamebooster.b b1)
    {
        return b1.h;
    }

    static com.qihoo.security.service.c.a k(com.qihoo.security.gamebooster.b b1)
    {
        return b1.m;
    }

    private boolean k()
    {
        return SharedPref.b(b, "sp_key_local_game_package_time", -1L) != g;
    }

    private Set l()
    {
        Object obj = new Intent("android.intent.action.MAIN", null);
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        Object obj1 = c.queryIntentActivities(((Intent) (obj)), 0);
        obj = new HashSet();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Set) (obj)).add(((ResolveInfo)((Iterator) (obj1)).next()).activityInfo.packageName)) { }
        return ((Set) (obj));
    }

    static void l(com.qihoo.security.gamebooster.b b1)
    {
        b1.s();
    }

    private g m()
    {
        String s1 = SharedPref.b(b, "sp_key_local_game_package", "");
        if (TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            g = SharedPref.b(b, "sp_key_local_game_package_time", -1L);
            d = com.qihoo.security.gamebooster.g.a(s1);
            return d;
        }
    }

    private void n()
    {
        while (d == null || d.b() == com.qihoo360.mobilesafe.b.s.e(b, "b_g.dat")) 
        {
            return;
        }
        a(true);
    }

    private void o()
    {
        if (SharedPref.b(b, "sp_key_local_game_package_time", -1L) != g)
        {
            d = m();
        }
        if (d == null)
        {
            p();
        }
    }

    private void p()
    {
        a(true);
    }

    private void q()
    {
        Object obj = m();
        if (obj != null)
        {
            if ((obj = ((g) (obj)).c()) != null)
            {
                com.qihoo360.mobilesafe.b.m.a(b, com/qihoo/security/gamebooster/GameBoosterActivity, 0x7f0c0082);
                obj = a(((List) (obj)), 0x7f02008e);
                com.qihoo360.mobilesafe.b.m.a(b, com/qihoo/security/gamebooster/GameBoosterActivity, 0, 0x7f0c0082, ((Bitmap) (obj)));
                d("1.0.8.3742");
                return;
            }
        }
    }

    private void r()
    {
        Intent intent = new Intent("com.qihoo.security.lite.gamebooster.CreateGameShortActivity");
        intent.setFlags(0x50040000);
        b.startActivity(intent);
    }

    private void s()
    {
        e.sendEmptyMessage(9);
    }

    protected void a(b b1)
    {
        boolean flag1 = true;
        if (b1 != null && !TextUtils.isEmpty(b1.d))
        {
            long l1 = System.currentTimeMillis();
            o();
            if (System.currentTimeMillis() - l1 <= 3000L)
            {
                boolean flag2 = f();
                long l2 = SharedPref.b(b, "sp_key_last_recommend_create_shortcut_time", 0L);
                boolean flag;
                if ((long)SharedPref.b(b, "sp_key_last_recommend_create_shortcut_times", 0) >= 3L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (System.currentTimeMillis() - l2 <= 0x240c8400L)
                {
                    flag1 = false;
                }
                if (b1.a && g() && a(d.c(), b1.f) != null)
                {
                    q();
                }
                if (b1.a && !flag2 && flag1 && !flag)
                {
                    if (a(d.c(), b1.f) != null && !com.qihoo360.mobilesafe.b.i.a())
                    {
                        r();
                        return;
                    }
                } else
                {
                    com.qihoo.security.installreport.a.a(b1.d);
                    return;
                }
            }
        }
    }

    public void a(g g1)
    {
        g1 = g1.e();
        g1 = e.obtainMessage(4, g1);
        e.sendMessage(g1);
    }

    public void a(h h1)
    {
        if (h1 == null)
        {
            return;
        }
        byte byte0;
        if (k())
        {
            byte0 = 7;
        } else
        {
            byte0 = 2;
        }
        e.sendMessage(e.obtainMessage(byte0, h1));
    }

    public void a(String s1)
    {
        e.sendMessage(e.obtainMessage(5, s1));
    }

    public void a(boolean flag, boolean flag1, boolean flag2, String s1)
    {
        String s2 = k;
        boolean flag3 = e(s1);
        if (!flag3)
        {
            return;
        } else
        {
            s1 = new b(flag, flag1, flag2, s1, flag3, s2);
            s1 = e.obtainMessage(1, s1);
            e.sendMessage(s1);
            return;
        }
    }

    public List b()
    {
        o();
        return d.c();
    }

    public void b(String s1)
    {
        e.sendMessage(e.obtainMessage(6, s1));
    }

    public void c()
    {
        e.sendEmptyMessage(8);
    }

    public void c(String s1)
    {
        e.sendMessage(e.obtainMessage(10, s1));
    }

    public Bitmap d()
    {
        Object obj = d;
        if (obj == null)
        {
            obj = m();
        }
        List list = null;
        if (obj != null)
        {
            list = ((g) (obj)).c();
        }
        obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        return a(((List) (obj)), 0x7f020090);
    }

    public int e()
    {
        g g2 = d;
        g g1 = g2;
        if (g2 == null)
        {
            g1 = m();
        }
        if (g1 != null)
        {
            return g1.c().size();
        } else
        {
            return 0;
        }
    }

    public boolean f()
    {
        return !TextUtils.isEmpty(SharedPref.b(b, "sp_key_has_create_game_booster_shortcut", ""));
    }

    public boolean g()
    {
        for (String s1 = SharedPref.b(b, "sp_key_has_create_game_booster_shortcut", ""); TextUtils.isEmpty(s1) || "1.0.8.3742".equals(s1);)
        {
            return false;
        }

        return true;
    }

    public void i()
    {
        e.sendEmptyMessageDelayed(3, 10000L);
    }

    public void j()
    {
        i = new com.qihoo.security.receiver.a(b);
        i.a(l);
        com.qihoo360.mobilesafe.b.s.a(b, com/qihoo/security/service/SecurityService, "com.qihoo.security.service.INTERNAL_CONTROL", n, 1);
        BroadcastReceiver broadcastreceiver = new BroadcastReceiver() {

            final com.qihoo.security.gamebooster.b a;

            public void onReceive(Context context, Intent intent)
            {
                if ("clear_cloud_query_success".equals(intent.getAction()))
                {
                    com.qihoo.security.gamebooster.b.l(a);
                }
            }

            
            {
                a = com.qihoo.security.gamebooster.b.this;
                super();
            }
        };
        IntentFilter intentfilter = new IntentFilter("clear_cloud_query_success");
        b.registerReceiver(broadcastreceiver, intentfilter);
    }
}
