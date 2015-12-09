// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient;


public final class Log
{
    private static class PrintStackTrace extends Throwable
    {

        private PrintStackTrace()
        {
        }

    }


    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final int LOGCAT_ENTRY_MAX_LEN = 4000;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static boolean debug = false;

    private Log()
    {
    }

    public static int d(String s, String s1)
    {
        if (debug)
        {
            return android.util.Log.d(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int d(String s, String s1, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.d(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static void dumpVerbose(String s, String s1)
    {
        if (s1 != null)
        {
            if (s1.length() > 4000)
            {
                int k = s1.length() / 4000;
                int j = 0;
                while (j <= k) 
                {
                    int l = (j + 1) * 4000;
                    if (l >= s1.length())
                    {
                        v(s, s1.substring(j * 4000));
                    } else
                    {
                        v(s, s1.substring(j * 4000, l));
                    }
                    j++;
                }
            } else
            {
                v(s, s1);
                return;
            }
        }
    }

    public static int e(String s, String s1)
    {
        if (debug)
        {
            return android.util.Log.e(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int e(String s, String s1, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.e(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static void handleException(String s, Exception exception)
    {
        e(s, exception.getMessage(), exception);
    }

    public static int i(String s, String s1)
    {
        if (debug)
        {
            return android.util.Log.i(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int i(String s, String s1, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.i(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static boolean isLoggable(String s, int j)
    {
        return debug;
    }

    public static void logByteArray(String s, String s1, byte abyte0[])
    {
label0:
        {
            if (debug)
            {
                if (abyte0 == null)
                {
                    break label0;
                }
                StringBuilder stringbuilder = new StringBuilder("[ ");
                boolean flag = true;
                int j = 0;
                while (j < abyte0.length) 
                {
                    if (flag)
                    {
                        flag = false;
                    } else
                    {
                        stringbuilder.append(", ");
                    }
                    stringbuilder.append(abyte0[j]);
                    j++;
                }
                stringbuilder.append("]");
                android.util.Log.d(s, (new StringBuilder()).append(s1).append(". Length ").append(abyte0.length).append(" bytes. Array: ").toString());
                android.util.Log.d(s, stringbuilder.toString());
            }
            return;
        }
        android.util.Log.d(s, (new StringBuilder()).append(s1).append(". null array ").toString());
    }

    public static void printStackTrace(String s)
    {
        v(s, android.util.Log.getStackTraceString(new PrintStackTrace()));
    }

    public static void printStackTrace(String s, Throwable throwable)
    {
        v(s, android.util.Log.getStackTraceString(throwable));
    }

    public static int v(String s, String s1)
    {
        if (debug)
        {
            return android.util.Log.v(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int v(String s, String s1, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.v(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, String s1)
    {
        if (debug)
        {
            return android.util.Log.w(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, String s1, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.w(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.w(s, throwable);
        } else
        {
            return 0;
        }
    }

    public static int wtf(String s, String s1)
    {
        return wtf(s, s1, null);
    }

    public static int wtf(String s, String s1, Throwable throwable)
    {
        if (debug)
        {
            return android.util.Log.wtf(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int wtf(String s, Throwable throwable)
    {
        return wtf(s, throwable.getMessage(), throwable);
    }

}
