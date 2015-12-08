// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class NativeGatherer extends Enum
{

    public static final NativeGatherer a;
    private static final NativeGatherer d[];
    private final NativeGathererHelper b = new NativeGathererHelper();
    private final String c = com/threatmetrix/TrustDefenderMobile/NativeGatherer.getName();

    private NativeGatherer(String s, int i)
    {
        super(s, 0);
    }

    public static NativeGatherer valueOf(String s)
    {
        return (NativeGatherer)Enum.valueOf(com/threatmetrix/TrustDefenderMobile/NativeGatherer, s);
    }

    public static NativeGatherer[] values()
    {
        return (NativeGatherer[])d.clone();
    }

    public final String a(int i)
    {
        if (b.a)
        {
            return b.getRandomString(32);
        } else
        {
            return null;
        }
    }

    public final String a(String s)
    {
        if (b.a)
        {
            return b.hashFile(s);
        } else
        {
            return null;
        }
    }

    public final String a(String s, String s1)
    {
        if (b.a)
        {
            return b.xor(s, s1);
        } else
        {
            return null;
        }
    }

    public final boolean a()
    {
        return b.a;
    }

    public final String[] a(String as[])
    {
        Object obj = c;
        StringBuilder stringbuilder = new StringBuilder();
        if (b.a)
        {
            obj = " available ";
        } else
        {
            obj = "not available ";
        }
        stringbuilder.append(((String) (obj))).append(" Found ").append(b.b).append(" out of ").append(b.d);
        if (b.a)
        {
            if (b.b == b.c)
            {
                obj = c;
                (new StringBuilder("Finding more packages ")).append(b.b).append(" / ").append(b.d);
                obj = b;
                obj.d = ((NativeGathererHelper) (obj)).d + b.findPackages(b.c, b.e);
            }
            return b.checkURLs(as);
        } else
        {
            return null;
        }
    }

    public final String b(String s)
    {
        if (b.a)
        {
            return b.md5(s);
        } else
        {
            return null;
        }
    }

    public final String c(String s)
    {
        if (b.a)
        {
            return b.sha1(s);
        } else
        {
            return null;
        }
    }

    public final String d(String s)
    {
        if (b.a)
        {
            return b.urlEncode(s);
        } else
        {
            return null;
        }
    }

    public final List e(String s)
    {
        if (b.a)
        {
            s = b.getFontList(s);
            if (s != null)
            {
                return Arrays.asList(s);
            } else
            {
                return new ArrayList();
            }
        } else
        {
            return null;
        }
    }

    static 
    {
        a = new NativeGatherer("INSTANCE", 0);
        d = (new NativeGatherer[] {
            a
        });
    }

    private class NativeGathererHelper
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

        NativeGathererHelper()
        {
            f = NativeGatherer.this;
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
            Log.e(g, "Native code:", NativeGatherer.this);
            flag1 = flag;
            if (true) goto _L2; else goto _L1
_L1:
            nativegatherer;
              goto _L3
        }
    }

}
