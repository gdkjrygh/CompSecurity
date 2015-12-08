// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bn;

import android.util.Log;

public class e
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bn/e$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("Info", 0);
            b = new a("Warning", 1);
            c = new a("Error", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static boolean a = true;

    public static void a(String s, String s1)
    {
        if (a)
        {
            a(a.a, s, s1);
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (a)
        {
            Log.e(s, s1, throwable);
        }
    }

    private static void a(a a1, String s, String s1)
    {
        int j = 0;
        if (s1 != null && s1.length() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L9:
        String s2;
        int k;
        if (j >= s1.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = Math.min(4000, s1.length() - j);
        s2 = s1.substring(j, j + k);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 210
    //                   1 138
    //                   2 148
    //                   3 158;
           goto _L3 _L4 _L5 _L6
_L3:
        if (i < s2.length())
        {
            Log.e("SyncProxy", (new StringBuilder()).append("Calling Log.e: msg length=").append(s2.length()).append(", bytesWritten=").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_213;
_L4:
        try
        {
            i = Log.i(s, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SyncProxy", (new StringBuilder()).append("Failure writing ").append(a1.name()).append(" fragments to android log:").append(s.toString()).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i = Log.w(s, s2);
        continue; /* Loop/switch isn't completed */
_L6:
        i = Log.e(s, s2);
        if (true) goto _L3; else goto _L7
_L7:
        j += k;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L1; else goto _L10
_L10:
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            a(a.b, s, s1);
        }
    }

    public static void c(String s, String s1)
    {
        if (a)
        {
            a(a.c, s, s1);
        }
    }

}
