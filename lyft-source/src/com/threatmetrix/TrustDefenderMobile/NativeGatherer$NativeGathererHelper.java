// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            NativeGatherer, StringUtils, TrustDefenderMobileVersion

class b
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

    native int findPackages(int i, int j, String as[], int k);

    native String[] findRunningProcs();

    native void finit();

    native String getBinaryArch();

    native String getConfig(String s);

    native String[] getFontList(String s);

    native String[] getNetworkInfo();

    native String getRandomString(int i);

    native String hashFile(String s);

    native boolean init(int i, String s);

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

    (NativeGatherer nativegatherer)
    {
        e = nativegatherer;
        super();
        a = false;
        b = 0;
    }
}
