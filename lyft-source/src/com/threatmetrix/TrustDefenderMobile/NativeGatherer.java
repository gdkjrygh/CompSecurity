// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class NativeGatherer
{

    static final boolean a;
    private static volatile NativeGatherer b;
    private static final String c = StringUtils.a(com/threatmetrix/TrustDefenderMobile/NativeGatherer);
    private static final Lock d = new ReentrantLock();
    private NativeGathererHelper e;
    private String f[];
    private long g;

    private NativeGatherer()
    {
        f = null;
        g = 0L;
        e = new NativeGathererHelper();
    }

    public static NativeGatherer a()
    {
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        d.lock();
        if (b == null)
        {
            b = new NativeGatherer();
        }
        d.unlock();
        return b;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    private String[] b(Context context)
    {
        if (f != null && TimeUnit.SECONDS.convert(System.nanoTime() - g, TimeUnit.NANOSECONDS) < 60L)
        {
            return f;
        }
        Log.d(c, "Starting path find for apk");
        g = System.nanoTime();
        Object obj = context.getPackageManager().getInstalledApplications(0);
        context = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ApplicationInfo applicationinfo = (ApplicationInfo)((Iterator) (obj)).next();
            if (!applicationinfo.sourceDir.startsWith("/system/app") && !applicationinfo.sourceDir.startsWith("/system/priv-app"))
            {
                context.add(applicationinfo.sourceDir);
            }
        } while (true);
        context.add("/system/app");
        context.add("/system/priv-app");
        Log.d(c, (new StringBuilder()).append("findAPKPaths found : ").append(context.size()).toString());
        f = (String[])context.toArray(new String[context.size()]);
        return f;
    }

    public int a(Context context, int j, int k, int l)
    {
        int i1;
        boolean flag;
        if (!a && context == null)
        {
            throw new AssertionError();
        }
        flag = false;
        i1 = 0;
        if (e.a)
        {
            e.c = b(context);
            i1 = e.findPackages(k, l, e.c, j);
        }
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_153;
        context;
        Log.e(c, "Native code:", context);
        i1 = ((flag) ? 1 : 0);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_153;
        context;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw context;
        }
        return i1;
    }

    public int a(String s, String s1)
    {
        if (!e.a || s == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        int j = e.setConfig(s, s1);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_136;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_134;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_134;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        j = -1;
        return j;
    }

    public String a(int j)
    {
        if (!e.a || j <= 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        Object obj = e.getRandomString(j);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_131;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        obj;
        Log.e(c, "Native code:", ((Throwable) (obj)));
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        obj;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw obj;
        }
        obj = null;
        return ((String) (obj));
    }

    public String a(String s)
    {
        if (!e.a || s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = e.hashFile(s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_131;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public boolean a(Context context)
    {
        return e.a(context);
    }

    public String[] a(String as[])
    {
        String s1;
        StringBuilder stringbuilder;
        s1 = c;
        stringbuilder = new StringBuilder();
        String s;
        if (e.a)
        {
            s = " available ";
        } else
        {
            s = "not available ";
        }
        Log.d(s1, stringbuilder.append(s).append(" Found ").append(e.b).toString());
        if (!e.a || as == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        as = e.checkURLs(as);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_192;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_190;
        as;
        Log.e(c, "Native code:", as);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_190;
        as;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw as;
        }
        as = null;
        return as;
    }

    public String b(String s)
    {
        if (!e.a || s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = e.md5(s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_131;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public String b(String s, String s1)
    {
        if (!e.a || s1 == null || s == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (s1.length() <= 0 || s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s = e.xor(s, s1);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_150;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_148;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_148;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public boolean b()
    {
        return e.a;
    }

    public int c()
    {
        int j;
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        j = e.cancel();
        return j;
        Throwable throwable;
        throwable;
        Log.e(c, "Native code:", throwable);
        return -1;
    }

    public String c(String s)
    {
        if (!e.a || s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = e.getConfig(s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_131;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public int d()
    {
        int j;
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        j = e.waitUntilCancelled();
        return j;
        Throwable throwable;
        throwable;
        Log.e(c, "Native code:", throwable);
        return -1;
    }

    public String d(String s)
    {
        if (!e.a || s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = e.sha1(s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_131;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public String e(String s)
    {
        if (!e.a || s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = e.urlEncode(s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_131;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_129;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public String[] e()
    {
        Object obj;
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = e.findRunningProcs();
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_126;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_124;
        obj;
        Log.e(c, "Native code:", ((Throwable) (obj)));
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_124;
        obj;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw obj;
        }
        obj = null;
        return ((String []) (obj));
    }

    public List f(String s)
    {
        if (!e.a || s == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s = e.getFontList(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        s = Arrays.asList(s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_171;
        s = new ArrayList();
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_171;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_169;
        s;
        Log.e(c, "Native code:", s);
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_169;
        s;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw s;
        }
        s = null;
        return s;
    }

    public String[] f()
    {
        Object obj;
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = e.findInstalledProcs();
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_126;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_124;
        obj;
        Log.e(c, "Native code:", ((Throwable) (obj)));
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_124;
        obj;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw obj;
        }
        obj = null;
        return ((String []) (obj));
    }

    public String[] g()
    {
        Object obj;
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = e.findAllProcs();
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_126;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_124;
        obj;
        Log.e(c, "Native code:", ((Throwable) (obj)));
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_124;
        obj;
        if (Thread.interrupted())
        {
            Log.d(c, "Thread interrupt detected, throwing");
            throw new InterruptedException();
        } else
        {
            throw obj;
        }
        obj = null;
        return ((String []) (obj));
    }

    public String h()
    {
        String s;
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        s = e.getBinaryArch();
        return s;
        Throwable throwable;
        throwable;
        Log.e(c, "Native code:", throwable);
        return null;
    }

    public String[] i()
    {
        String as[];
        if (!e.a)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        as = e.getNetworkInfo();
        return as;
        Throwable throwable;
        throwable;
        Log.e(c, "Native code:", throwable);
        return null;
    }

    static 
    {
        boolean flag;
        if (!com/threatmetrix/TrustDefenderMobile/NativeGatherer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private class NativeGathererHelper
    {

        static final boolean d;
        boolean a;
        int b;
        String c[] = {
            "/system/app", "/system/priv-app"
        };
        final NativeGatherer e;
        private final String f = StringUtils.a(com/threatmetrix/TrustDefenderMobile/NativeGatherer$NativeGathererHelper);
        private final Lock g = new ReentrantLock();

        boolean a(Context context)
        {
            if (!d && context == null)
            {
                throw new AssertionError();
            }
            if (a)
            {
                return a;
            }
            boolean flag;
            g.lock();
            if (!a)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            flag = a;
            g.unlock();
            return flag;
            System.loadLibrary("tdm-3.2-83-jni");
            context = context.getFilesDir().getAbsolutePath();
            a = init(TrustDefenderMobileVersion.a.intValue(), context);
_L1:
            Log.d(f, (new StringBuilder()).append("NativeGatherer() complete, found ").append(b).toString());
            g.unlock();
            return a;
            context;
            a = false;
              goto _L1
            context;
            g.unlock();
            throw context;
            context;
            Log.e(f, "Native code:", context);
              goto _L1
        }

        native int cancel();

        native String[] checkURLs(String as[]);

        protected void finalize()
        {
            super.finalize();
            finit();
        }

        native String[] findAllProcs();

        native String[] findInstalledProcs();

        native int findPackages(int j, int k, String as[], int l);

        native String[] findRunningProcs();

        native void finit();

        native String getBinaryArch();

        native String getConfig(String s);

        native String[] getFontList(String s);

        native String[] getNetworkInfo();

        native String getRandomString(int j);

        native String hashFile(String s);

        native boolean init(int j, String s);

        native String md5(String s);

        native int setConfig(String s, String s1);

        native String sha1(String s);

        native String urlEncode(String s);

        native int waitUntilCancelled();

        native String xor(String s, String s1);

        static 
        {
            boolean flag;
            if (!com/threatmetrix/TrustDefenderMobile/NativeGatherer.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
        }

        NativeGathererHelper()
        {
            e = NativeGatherer.this;
            super();
            a = false;
            b = 0;
        }
    }

}
