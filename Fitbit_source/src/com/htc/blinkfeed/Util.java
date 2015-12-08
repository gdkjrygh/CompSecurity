// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed;

import android.util.Log;
import java.lang.reflect.ParameterizedType;

public class Util
{
    public static class DebugLoger
    {

        private static boolean debug_flag = false;

        public static void d(String s, String s1)
        {
            if (debug_flag)
            {
                Log.d(s, s1);
            }
        }

        public static void d(String s, String s1, Throwable throwable)
        {
            if (debug_flag)
            {
                Log.d(s, s1, throwable);
            }
        }

        public static void setDebug(boolean flag)
        {
            debug_flag = flag;
            if (debug_flag)
            {
                Log.d("BLINKFEED_DEBUG", "debug enabled");
            }
        }


        public DebugLoger()
        {
        }
    }


    public Util()
    {
    }

    public static String bytesToHex(byte abyte0[])
    {
        char ac[] = new char[16];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '1';
        ac[2] = '2';
        ac[3] = '3';
        ac[4] = '4';
        ac[5] = '5';
        ac[6] = '6';
        ac[7] = '7';
        ac[8] = '8';
        ac[9] = '9';
        ac[10] = 'A';
        ac[11] = 'B';
        ac[12] = 'C';
        ac[13] = 'D';
        ac[14] = 'E';
        ac[15] = 'F';
        char ac1[] = new char[abyte0.length * 2];
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return new String(ac1);
            }
            int j = abyte0[i] & 0xff;
            ac1[i * 2] = ac[j >>> 4];
            ac1[i * 2 + 1] = ac[j & 0xf];
            i++;
        } while (true);
    }

    public static com.htc.blinkfeed.data.Timeline.LoadType getProviderLoadType(Class class1)
    {
        class1 = class1.getGenericInterfaces();
        int j = class1.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return com.htc.blinkfeed.data.Timeline.LoadType.UNKNOWN;
            }
            java.lang.reflect.Type atype[] = class1[i];
            if (atype instanceof ParameterizedType)
            {
                atype = ((ParameterizedType)atype).getActualTypeArguments();
                if (atype != null && atype.length > 0)
                {
                    if (java/lang/String.equals(atype[0]))
                    {
                        return com.htc.blinkfeed.data.Timeline.LoadType.TOKEN;
                    }
                    if (java/lang/Long.equals(atype[0]) || Long.TYPE.equals(atype[0]))
                    {
                        return com.htc.blinkfeed.data.Timeline.LoadType.TIME;
                    }
                    if (java/lang/Void.equals(atype[0]))
                    {
                        return com.htc.blinkfeed.data.Timeline.LoadType.NO_LOADMORE;
                    }
                }
            }
            i++;
        } while (true);
    }
}
