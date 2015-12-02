// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.lib.resl.ExtResources;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.locale:
//            LocaleManagerService, d, LocaleInfo, b

class a
    implements Runnable
{

    final ndEmptyMessage a;

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
        LocaleManagerService.a(a.a).ndEmptyMessage(4);
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

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/locale/LocaleManagerService$3

/* anonymous class */
    class LocaleManagerService._cls3 extends a.a
    {

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
            (new Thread(new LocaleManagerService._cls3._cls1(this))).start();
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
                a = localemanagerservice;
                super();
            }
    }

}
