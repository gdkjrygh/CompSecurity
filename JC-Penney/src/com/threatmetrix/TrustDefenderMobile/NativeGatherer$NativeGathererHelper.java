// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            am, NativeGatherer

class g
{

    boolean a;
    int b;
    int c;
    int d;
    String e;
    final NativeGatherer f;
    private final String g;

    native String[] checkURLs(String as[]);

    protected void finalize()
    {
        super.finalize();
        finit();
    }

    native int findPackages(int i, String s);

    native void finit();

    native String[] getFontList(String s);

    native String getRandomString(int i);

    native String hashFile(String s);

    native boolean init(int i);

    native String md5(String s);

    native String sha1(String s);

    native String urlEncode(String s);

    native String xor(String s, String s1);

    (NativeGatherer nativegatherer)
    {
        f = nativegatherer;
        super();
        g = com/threatmetrix/TrustDefenderMobile/NativeGatherer$NativeGathererHelper.getName();
        b = 0;
        c = 200;
        d = c;
        e = "/system/app";
        boolean flag;
        System.loadLibrary("trustdefender-jni");
        flag = init(am.a.intValue());
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        nativegatherer = g;
        b = findPackages(c, e);
        flag1 = flag;
_L2:
        a = flag1;
        nativegatherer = g;
        (new StringBuilder("NativeGatherer() complete, found ")).append(b);
        return;
        nativegatherer;
        flag1 = false;
        continue; /* Loop/switch isn't completed */
        nativegatherer;
        flag = false;
_L3:
        Log.e(g, "Native code:", nativegatherer);
        flag1 = flag;
        if (true) goto _L2; else goto _L1
_L1:
        nativegatherer;
          goto _L3
    }
}
