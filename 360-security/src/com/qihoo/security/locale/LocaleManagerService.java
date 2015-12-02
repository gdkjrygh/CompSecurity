// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.lib.resl.ExtResources;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.locale:
//            LocaleInfo, d, b

public class LocaleManagerService extends Service
{
    private final class a extends Handler
    {

        final LocaleManagerService a;
        private boolean b;
        private boolean c;
        private String d;
        private String e;
        private String f;

        public void handleMessage(Message message)
        {
            int i;
            int j;
            int k;
            boolean flag;
            i = 0;
            k = 0;
            flag = false;
            j = 0;
            message.what;
            JVM INSTR tableswitch 0 8: default 64
        //                       0 65
        //                       1 139
        //                       2 158
        //                       3 392
        //                       4 455
        //                       5 257
        //                       6 512
        //                       7 569
        //                       8 625;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            return;
_L2:
            LocaleManagerService.h(a).beginBroadcast();
            message = (b)message.obj;
            LocaleManagerService.h(a).register(message);
            try
            {
                message.a(c, b, d, e, f);
                message.a();
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            LocaleManagerService.h(a).finishBroadcast();
            return;
_L3:
            LocaleManagerService.h(a).unregister((b)message.obj);
            return;
_L4:
            try
            {
                message = ((Message) ((Object[])(Object[])message.obj));
                c = ((Boolean)message[0]).booleanValue();
                b = ((Boolean)message[1]).booleanValue();
                d = (String)message[2];
                e = (String)message[3];
                f = (String)message[4];
                com.qihoo.security.locale.d.a(c, b, d, e, f);
                sendEmptyMessage(5);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                return;
            }
_L7:
            k = LocaleManagerService.h(a).beginBroadcast();
            i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                try
                {
                    ((b)LocaleManagerService.h(a).getBroadcastItem(i)).a(c, b, d, e, f);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    break;
                }
                i++;
            } while (true);
            LocaleManagerService.h(a).finishBroadcast();
            k = LocaleManagerService.h(a).beginBroadcast();
            i = j;
            do
            {
                if (i >= k)
                {
                    break;
                }
                try
                {
                    ((b)LocaleManagerService.h(a).getBroadcastItem(i)).a();
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    break;
                }
                i++;
            } while (true);
            LocaleManagerService.h(a).finishBroadcast();
            return;
_L5:
            j = LocaleManagerService.h(a).beginBroadcast();
            try
            {
                message = (String)message.obj;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                break; /* Loop/switch isn't completed */
            }
_L12:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            ((b)LocaleManagerService.h(a).getBroadcastItem(i)).a(message);
            i++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L12; else goto _L11
_L11:
            LocaleManagerService.h(a).finishBroadcast();
            return;
_L6:
            j = LocaleManagerService.h(a).beginBroadcast();
            i = k;
            do
            {
                if (i >= j)
                {
                    break;
                }
                try
                {
                    ((b)LocaleManagerService.h(a).getBroadcastItem(i)).c();
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    break;
                }
                i++;
            } while (true);
            LocaleManagerService.h(a).finishBroadcast();
            return;
_L8:
            j = LocaleManagerService.h(a).beginBroadcast();
            i = ((flag) ? 1 : 0);
            do
            {
                if (i >= j)
                {
                    break;
                }
                try
                {
                    ((b)LocaleManagerService.h(a).getBroadcastItem(i)).b();
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    break;
                }
                i++;
            } while (true);
            LocaleManagerService.h(a).finishBroadcast();
            return;
_L9:
            j = LocaleManagerService.h(a).beginBroadcast();
            i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                try
                {
                    ((b)LocaleManagerService.h(a).getBroadcastItem(i)).d();
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    break;
                }
                i++;
            } while (true);
            LocaleManagerService.h(a).finishBroadcast();
            return;
_L10:
            try
            {
                LocaleManagerService.a(a, LocaleManagerService.d(a).a());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                LocaleManagerService.a(a).sendEmptyMessage(5);
            }
            return;
        }

        private a()
        {
            a = LocaleManagerService.this;
            super();
        }

    }


    private Context a;
    private List b;
    private RemoteCallbackList c;
    private a d;
    private File e;
    private ExtResources f;
    private final BroadcastReceiver g = new BroadcastReceiver() {

        final LocaleManagerService a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.LOCALE_CHANGED") && LocaleManagerService.a(a) != null)
            {
                LocaleManagerService.a(a).sendEmptyMessage(8);
            }
        }

            
            {
                a = LocaleManagerService.this;
                super();
            }
    };
    private final a.a h = new a.a() {

        final LocaleManagerService a;

        public String a()
            throws RemoteException
        {
            return SharedPref.b(LocaleManagerService.e(a), "language", "");
        }

        public void a(b b1)
            throws RemoteException
        {
            LocaleManagerService.a(a).sendMessage(LocaleManagerService.a(a).obtainMessage(0, b1));
        }

        public void a(String s)
            throws RemoteException
        {
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            SharedPref.a(LocaleManagerService.e(a), "language", s1);
            LocaleManagerService.a(a, s1);
        }

        public void b()
            throws RemoteException
        {
            (new Thread(new Runnable(this) {

                final _cls3 a;

                public void run()
                {
                    List list1;
                    list1 = LocaleManagerService.b(a.a);
                    LocaleManagerService.b(a.a, list1);
                    synchronized (LocaleManagerService.c(a.a))
                    {
                        LocaleManagerService.c(a.a).clear();
                        LocaleManagerService.c(a.a).addAll(list1);
                        LocaleManagerService.a(a.a, LocaleManagerService.d(a.a).a());
                    }
_L2:
                    LocaleManagerService.a(a.a).sendEmptyMessage(4);
                    return;
                    exception;
                    list;
                    JVM INSTR monitorexit ;
                    try
                    {
                        throw exception;
                    }
                    catch (RemoteException remoteexception) { }
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                a = _pcls3;
                super();
            }
            })).start();
        }

        public void b(b b1)
            throws RemoteException
        {
            LocaleManagerService.a(a).sendMessage(LocaleManagerService.a(a).obtainMessage(1, b1));
        }

        public void b(String s)
            throws RemoteException
        {
            String as[];
            PackageInfo packageinfo;
            int i;
            try
            {
                as = com.qihoo.security.locale.d.a(LocaleManagerService.e(a), s);
                packageinfo = LocaleManagerService.e(a).getPackageManager().getPackageInfo(s, 0);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
            if (as == null)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            i = as.length;
            if (i >= 2)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            return;
            LocaleManagerService.a(a, LocaleManagerService.c(a), packageinfo.versionCode, s, as, null);
            LocaleManagerService.a(a).sendMessage(LocaleManagerService.a(a).obtainMessage(3, as[0]));
            return;
        }

        public List c()
            throws RemoteException
        {
            return LocaleManagerService.c(a);
        }

        public void c(String s)
            throws RemoteException
        {
            try
            {
                Iterator iterator = LocaleManagerService.c(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    LocaleInfo localeinfo = (LocaleInfo)iterator.next();
                    if (localeinfo.buildin || !s.equals(localeinfo.pkg))
                    {
                        continue;
                    }
                    localeinfo.state = 2;
                    if (TextUtils.isEmpty(localeinfo.url))
                    {
                        LocaleManagerService.c(a).remove(localeinfo);
                    }
                    if (com.qihoo.security.locale.d.a(a(), localeinfo.locale))
                    {
                        LocaleManagerService.a(a).sendMessage(LocaleManagerService.a(a).obtainMessage(2, ((Object) (new Object[] {
                            Boolean.valueOf(false), Boolean.valueOf(true), "", ""
                        }))));
                    }
                    LocaleManagerService.a(a).sendEmptyMessage(6);
                    break;
                } while (true);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }

        public void d(String s)
            throws RemoteException
        {
            Object obj = new ExtResources(LocaleManagerService.e(a));
            String as[];
            int i;
            int j;
            try
            {
                ((ExtResources) (obj)).initResources(s);
                ((ExtResources) (obj)).loadInfo();
                i = ((ExtResources) (obj)).getVersionCode().intValue();
                as = ((ExtResources) (obj)).getPkgInfo().split(";");
                obj = ((ExtResources) (obj)).getPkgName();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
            if (as == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            j = as.length;
            if (j >= 2)
            {
                LocaleManagerService.a(a, LocaleManagerService.c(a), i, ((String) (obj)), as, s);
                if (com.qihoo.security.locale.d.a(LocaleManagerService.d(a).a(), as[0]))
                {
                    LocaleManagerService.a(a, LocaleManagerService.d(a).a());
                    return;
                }
            }
        }

        public boolean d()
            throws RemoteException
        {
            return false;
        }

        public void e()
            throws RemoteException
        {
            LocaleManagerService.a(a, a());
        }

        public void e(String s)
            throws RemoteException
        {
            LocaleManagerService.a(a, s);
        }

        public void f()
            throws RemoteException
        {
            LocaleManagerService.a(a).sendEmptyMessage(7);
        }

        public String g()
            throws RemoteException
        {
            if (LocaleManagerService.g(a) != null)
            {
                return LocaleManagerService.g(a).getPath();
            }
            File file = LocaleManagerService.e(a).getFilesDir();
            LocaleManagerService.a(a, new File(file, "lang"));
            if (!LocaleManagerService.g(a).exists())
            {
                LocaleManagerService.g(a).mkdirs();
            }
            return LocaleManagerService.g(a).getPath();
        }

            
            {
                a = LocaleManagerService.this;
                super();
            }
    };

    public LocaleManagerService()
    {
    }

    static a a(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.d;
    }

    static File a(LocaleManagerService localemanagerservice, File file)
    {
        localemanagerservice.e = file;
        return file;
    }

    private List a()
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList(15);
        String as[] = a.getResources().getStringArray(0x7f0e0000);
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(new LocaleInfo(as[i]));
            }

        }
        iterator = Utils.openConfigFile(a, "locale.dat").iterator();
_L2:
        boolean flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (String)iterator.next();
        obj = new LocaleInfo(a, ((String) (obj)));
        if (b(((LocaleInfo) (obj)).locale) || !((LocaleInfo) (obj)).cfgMatched)
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator1 = arraylist.iterator();
        LocaleInfo localeinfo;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_247;
            }
            localeinfo = (LocaleInfo)iterator1.next();
        } while (!((LocaleInfo) (obj)).locale.equals(localeinfo.locale));
        if (localeinfo.isAllVersionMatch())
        {
            flag = false;
        } else
        if (((LocaleInfo) (obj)).pkgVersion > localeinfo.pkgVersion)
        {
            arraylist.remove(localeinfo);
            flag = true;
        } else
        {
            flag = false;
        }
_L3:
        if (flag && ((LocaleInfo) (obj)).isAppBuildMatch())
        {
            arraylist.add(obj);
        }
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
        flag = true;
          goto _L3
    }

    static List a(LocaleManagerService localemanagerservice, List list)
    {
        localemanagerservice.b = list;
        return list;
    }

    static void a(LocaleManagerService localemanagerservice, String s)
    {
        localemanagerservice.a(s);
    }

    static void a(LocaleManagerService localemanagerservice, List list, int i, String s, String as[], String s1)
    {
        localemanagerservice.a(list, i, s, as, s1);
    }

    private void a(String s)
    {
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = com.qihoo.security.locale.d.a(Locale.getDefault());
        }
        s = b.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            LocaleInfo localeinfo = (LocaleInfo)s.next();
            if (!com.qihoo.security.locale.d.a(s1, localeinfo.locale))
            {
                continue;
            }
            if (localeinfo.buildin)
            {
                d.sendMessage(d.obtainMessage(2, ((Object) (new Object[] {
                    Boolean.valueOf(false), Boolean.valueOf(false), localeinfo.locale, "", ""
                }))));
                return;
            }
            if (localeinfo.state == 2)
            {
                SharedPref.a(a, "language", "");
            } else
            {
                if (localeinfo.state == 0);
                try
                {
                    d.sendMessage(d.obtainMessage(2, ((Object) (new Object[] {
                        Boolean.valueOf(true), Boolean.valueOf(false), localeinfo.locale, localeinfo.pkg, localeinfo.path
                    }))));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            break;
        } while (true);
        d.sendMessage(d.obtainMessage(2, ((Object) (new Object[] {
            Boolean.valueOf(false), Boolean.valueOf(true), "", "", ""
        }))));
    }

    private void a(List list)
    {
        File file;
        File afile[];
        File file1;
        Exception exception;
        String s;
        String s1;
        int i;
        int j;
        int k;
        try
        {
            file = new File(h.g());
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return;
        }
        afile = file.listFiles();
        if (afile == null)
        {
            return;
        }
        j = afile.length;
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = afile[i];
        f.unloadAll();
        f.initResources(file1.getPath());
        f.loadInfo();
        k = f.getVersionCode().intValue();
        s = f.getPkgInfo();
        s1 = f.getPkgName();
        if (s != null && s1 != null)
        {
            a(list, k, s1, s.split(";"), file1.getPath());
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        f.unloadAll();
        return;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(List list, int i, String s, String as[], String s1)
    {
        if (as != null && as.length >= 2)
        {
            String s2;
            LocaleInfo localeinfo;
            if (as.length > 2)
            {
                s2 = as[2];
            } else
            {
                s2 = "";
            }
            localeinfo = new LocaleInfo(as[0], as[1], i, s, s2, s1);
            if (localeinfo.cfgMatched)
            {
                for (Iterator iterator = list.iterator(); iterator.hasNext();)
                {
                    LocaleInfo localeinfo1 = (LocaleInfo)iterator.next();
                    if (!localeinfo1.buildin && s.toLowerCase(Locale.US).equals(localeinfo1.pkg.toLowerCase(Locale.US)))
                    {
                        if (localeinfo1.pkgVersion <= i)
                        {
                            localeinfo1.state = 0;
                        } else
                        {
                            localeinfo1.state = 1;
                        }
                        localeinfo1.allVersion = as[1];
                        localeinfo1.path = s1;
                        localeinfo1.pkgVersion = i;
                        localeinfo1.translator = s2;
                        return;
                    }
                }

                list.add(localeinfo);
                return;
            }
        }
    }

    static List b(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.a();
    }

    private void b()
    {
        if (b != null)
        {
            ArrayList arraylist = new ArrayList();
            Object obj = b.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                LocaleInfo localeinfo = (LocaleInfo)((Iterator) (obj)).next();
                if (localeinfo != null && !localeinfo.buildin && localeinfo.path != null)
                {
                    arraylist.add(localeinfo.path);
                }
            } while (true);
            File afile[];
            try
            {
                obj = new File(h.g());
            }
            catch (Exception exception)
            {
                return;
            }
            afile = ((File) (obj)).listFiles();
            if (afile != null && afile.length > 0)
            {
                int j = afile.length;
                int i = 0;
                while (i < j) 
                {
                    Object obj1 = afile[i];
                    if (obj1 != null)
                    {
                        String s = ((File) (obj1)).getPath();
                        if (s != null && !arraylist.contains(s))
                        {
                            ((File) (obj1)).delete();
                            if (s.endsWith(".apk"))
                            {
                                obj1 = ((File) (obj1)).getName();
                                obj1 = ((String) (obj1)).substring(0, ((String) (obj1)).length() - 4);
                                obj1 = new File(a.getFilesDir(), (new StringBuilder()).append(((String) (obj1))).append(".dex").toString());
                                if (((File) (obj1)).exists())
                                {
                                    ((File) (obj1)).delete();
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    static void b(LocaleManagerService localemanagerservice, List list)
    {
        localemanagerservice.a(list);
    }

    private boolean b(String s)
    {
        return true;
    }

    static List c(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.b;
    }

    static a.a d(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.h;
    }

    static Context e(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.a;
    }

    static void f(LocaleManagerService localemanagerservice)
    {
        localemanagerservice.b();
    }

    static File g(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.e;
    }

    static RemoteCallbackList h(LocaleManagerService localemanagerservice)
    {
        return localemanagerservice.c;
    }

    public IBinder onBind(Intent intent)
    {
        return h;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        a = getApplicationContext();
        c = new RemoteCallbackList();
        d = new a();
        f = new ExtResources(a);
        registerReceiver(g, new IntentFilter("android.intent.action.LOCALE_CHANGED"), "com.qihoo.security.lite.PERMISSION", null);
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            try
            {
                Notification notification = new Notification();
                notification.setLatestEventInfo(this, null, null, PendingIntent.getActivity(this, 0, new Intent(), 0));
                startForeground(256, notification);
            }
            catch (Exception exception) { }
        }
        (new Thread(new Runnable() {

            final LocaleManagerService a;

            public void run()
            {
                System.currentTimeMillis();
                LocaleManagerService.a(a, LocaleManagerService.b(a));
                List list = LocaleManagerService.c(a);
                list;
                JVM INSTR monitorenter ;
                String s;
                LocaleManagerService.b(a, LocaleManagerService.c(a));
                s = LocaleManagerService.d(a).a();
                boolean flag;
                boolean flag1;
                flag1 = false;
                flag = false;
                if (LocaleManagerService.c(a) == null) goto _L2; else goto _L1
_L1:
                Iterator iterator = LocaleManagerService.c(a).iterator();
_L3:
                flag1 = flag;
                LocaleInfo localeinfo;
                if (!iterator.hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                localeinfo = (LocaleInfo)iterator.next();
                if (s == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (s.equals(localeinfo.locale))
                {
                    flag = true;
                }
                if (true) goto _L3; else goto _L2
_L2:
                if (flag1)
                {
                    break MISSING_BLOCK_LABEL_148;
                }
                SharedPref.a(LocaleManagerService.e(a), "language", "");
                LocaleManagerService.a(a, LocaleManagerService.d(a).a());
                LocaleManagerService.f(a);
                list;
                JVM INSTR monitorexit ;
_L5:
                if (LocaleManagerService.a(a) != null)
                {
                    LocaleManagerService.a(a).sendEmptyMessage(4);
                }
                return;
                Exception exception1;
                exception1;
                list;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception1;
                }
                catch (RemoteException remoteexception) { }
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                a = LocaleManagerService.this;
                super();
            }
        })).start();
    }

    public void onDestroy()
    {
        try
        {
            unregisterReceiver(g);
        }
        catch (Exception exception) { }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        super.onStartCommand(intent, i, j);
        return 1;
    }
}
