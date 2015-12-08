// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            a, h, AppLogUploader, IAppNotifier, 
//            AppNative

class c
    implements Closeable
{

    public static final int A = 20;
    public static final int B = 21;
    public static final int C = 22;
    public static final int D = 23;
    public static final String E[] = {
        "Undefined error code", "Failed generating ping string due to error on parsing", "Failed to receive configuration file from Census", "Failed parsing the config file JSON string", "Failed parsing the play() JSON string", "Failed parsing the play() JSON string", "Failed creating ping before adding it to the UPLOAD table)", "Failed starting data processor thread. Normally, that means a product", "Failed processing data on a data processor. Normally, that means the input to a product", "Failed sending HTTP or HTTPS requests", 
        "Failed sending pings (on ANDROID, the ping on the UPLOAD table)", "Failed sending TSV requests", "Failed sending StationId requests", "Failed read/write from/to database table", "Device ID changed", "NUID changed", "Failed SDK initialization", "Failed SDK suspend", "Invalid parameters", "SDK called in incorrect state", 
        "Processing playhead position failed", "Failed processor stop", "Any other exception or error"
    };
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;
    public static final String K[] = {
        "Nielsen App SDK is initiated. ", "Nielsen App SDK has started up. ", "Nielsen App SDK is shutting down. ", "Nielsen App SDK could not load native library. ", "Any other event. "
    };
    public static final int L = 2000;
    public static final int M = 3000;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final char Q = 69;
    public static final char R = 87;
    public static final char S = 73;
    private static String V = "";
    private static IAppNotifier W = null;
    private static c X = null;
    private static char Y = 0;
    private static boolean Z = false;
    public static final String a = "Description";
    private static JSONObject aa = null;
    private static JSONObject ab = null;
    public static final String b = "Timestamp";
    public static final String c = "Stack";
    public static final String d = "Level";
    public static final String e = "Code";
    public static final String f = "AppSdk";
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static final int o = 8;
    public static final int p = 9;
    public static final int q = 10;
    public static final int r = 11;
    public static final int s = 12;
    public static final int t = 13;
    public static final int u = 14;
    public static final int v = 15;
    public static final int w = 16;
    public static final int x = 17;
    public static final int y = 18;
    public static final int z = 19;
    private h T;
    private String U;

    private c(Context context)
    {
        T = null;
        U = "";
        T = com.nielsen.app.sdk.a.m();
        String s1 = context.getFilesDir().getPath();
        if (s1.length() < 5)
        {
            a('W', "Invlalid log path", new Object[0]);
        } else
        {
            context = s1;
            if (!s1.endsWith(File.separator))
            {
                context = (new StringBuilder()).append(s1).append(File.separator).toString();
            }
            context = (new File((new StringBuilder()).append(context).append("log").toString())).getAbsoluteFile();
            if (!context.mkdirs() && !context.isDirectory())
            {
                a('W', "Invlalid log path", new Object[0]);
                return;
            }
            U = context.getPath();
            if (!U.endsWith(File.separator))
            {
                U = (new StringBuilder()).append(U).append(File.separator).toString();
                return;
            }
        }
    }

    public static char a()
    {
        return Y;
    }

    public static c a(Context context)
    {
        com/nielsen/app/sdk/c;
        JVM INSTR monitorenter ;
        if (X == null)
        {
            X = new c(context);
        }
        context = X;
        com/nielsen/app/sdk/c;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static String a(int i1)
    {
        return E[i1];
    }

    public static JSONObject a(int i1, char c1, long l1, String s1, Throwable throwable, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        ab = jsonobject;
        jsonobject.put("Timestamp", l1);
        ab.put("Level", String.valueOf(c1));
        String s3 = "";
        String s4 = s3;
        String s5 = s1;
        if (flag)
        {
            s4 = s3;
            s5 = s1;
            if (throwable != null)
            {
                s4 = throwable.getMessage();
                String s2 = s1;
                if (s4 != null)
                {
                    s2 = s1;
                    if (!s4.isEmpty())
                    {
                        s2 = s1;
                        if (s1 != null)
                        {
                            s2 = s1;
                            if (!s1.isEmpty())
                            {
                                s2 = (new StringBuilder()).append(s1).append(". ").toString();
                            }
                        }
                        s2 = (new StringBuilder()).append(s2).append(s4).toString();
                    }
                }
                throwable = throwable.getStackTrace();
                int j1 = 0;
                s1 = s3;
                do
                {
                    s4 = s1;
                    s5 = s2;
                    if (j1 >= throwable.length)
                    {
                        break;
                    }
                    s1 = (new StringBuilder()).append(s1).append(j1).append(":").append(throwable[j1].getFileName()).append("[").append(throwable[j1].getLineNumber()).append("] ").append(throwable[j1].getClassName()).append(".").append(throwable[j1].getMethodName()).append(" ").toString();
                    j1++;
                } while (true);
            }
        }
        l1 = i1;
        if (l1 > 0L && l1 < 23L)
        {
            ab.put("Code", l1);
        }
        if (!s5.isEmpty())
        {
            ab.put("Description", s5);
        }
        if (!s4.isEmpty())
        {
            ab.put("Stack", s4);
        }
        return ab;
    }

    public static void a(char c1)
    {
        Y = c1;
    }

    public static transient void a(char c1, String s1, Object aobj[])
    {
        a(((Throwable) (null)), false, 0, c1, s1, aobj);
    }

    public static transient void a(int i1, char c1, String s1, Object aobj[])
    {
        a(((Throwable) (null)), false, i1, c1, s1, aobj);
    }

    public static transient void a(int i1, String s1, Object aobj[])
    {
        if (X != null)
        {
            X.b(i1, s1, aobj);
        }
    }

    public static void a(IAppNotifier iappnotifier)
    {
        W = iappnotifier;
    }

    public static transient void a(Throwable throwable, boolean flag, char c1, String s1, Object aobj[])
    {
        a(throwable, flag, 22, c1, s1, aobj);
    }

    public static transient void a(Throwable throwable, boolean flag, int i1, char c1, String s1, Object aobj[])
    {
        if (X != null)
        {
            X.b(throwable, flag, i1, c1, s1, aobj);
        }
    }

    public static void a(boolean flag)
    {
        Z = flag;
    }

    public static long b()
    {
        return 0x100000L;
    }

    public static String b(int i1)
    {
        g();
        return (new StringBuilder()).append(K[i1]).append(V).toString();
    }

    private transient void b(int i1, String s1, Object aobj[])
    {
        if (X != null)
        {
            e(i1);
            if (Z)
            {
                String s3 = ">>>>> ";
                String s2 = s3;
                if (s1 != null)
                {
                    s2 = s3;
                    if (s1.length() > 0)
                    {
                        s2 = (new StringBuilder()).append(">>>>> ").append(String.format(s1, aobj)).toString();
                    }
                }
                a('I', (new StringBuilder()).append(s2).append("Event : ").append(aa.toString()).append(" <<<<<").toString());
                return;
            }
        }
    }

    private transient void b(Throwable throwable, boolean flag, int i1, char c1, String s1, Object aobj[])
    {
        if (i1 > 0 && i1 < 22)
        {
            c(i1);
        }
        if (Z || c1 == 'E') goto _L2; else goto _L1
_L1:
        return;
_L2:
        c1;
        JVM INSTR lookupswitch 3: default 64
    //                   69: 65
    //                   73: 241
    //                   87: 170;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L4:
        String s2;
        String s3;
        long l1;
        try
        {
            l1 = com.nielsen.app.sdk.h.g();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
        s3 = "";
        s2 = s3;
        if (s1 == null) goto _L8; else goto _L7
_L7:
        s2 = s3;
        if (s1.length() > 0)
        {
            s2 = (new StringBuilder()).append("").append(String.format(s1, aobj)).toString();
        }
_L8:
        a(i1, c1, l1, s2, throwable, flag);
        if (Z)
        {
            a(c1, ab.toString());
        }
        throwable = com.nielsen.app.sdk.a.r();
        if (throwable == null) goto _L1; else goto _L9
_L9:
        throwable.a(ab);
        return;
_L6:
        Y;
        JVM INSTR tableswitch 87 87: default 331
    //                   87 192;
           goto _L10 _L11
_L11:
        if (s1 == null) goto _L13; else goto _L12
_L12:
        if (s1.length() > 0)
        {
            (new StringBuilder()).append("").append(String.format(s1, aobj));
        }
_L13:
        a(c1, ab.toString());
        return;
_L5:
        Y;
        JVM INSTR lookupswitch 2: default 332
    //                   73: 272
    //                   87: 272;
           goto _L14 _L15 _L15
_L15:
        s2 = "";
        throwable = s2;
        if (s1 == null) goto _L17; else goto _L16
_L16:
        throwable = s2;
        if (s1.length() > 0)
        {
            throwable = (new StringBuilder()).append("").append(String.format(s1, aobj)).toString();
        }
_L17:
        a(c1, throwable);
        return;
_L10:
        return;
_L14:
    }

    public static void c(int i1)
    {
        if (X != null)
        {
            X.d(i1);
        }
    }

    public static JSONObject e()
    {
        return aa;
    }

    private JSONObject e(int i1)
    {
        String s1 = b(i1);
        long l1 = com.nielsen.app.sdk.h.g();
        i1 += 2000;
        if (W != null)
        {
            W.onAppSdkEvent(l1, i1, s1);
        }
        JSONObject jsonobject = new JSONObject();
        aa = jsonobject;
        jsonobject.put("Code", i1);
        aa.put("Description", s1);
        aa.put("Timestamp", l1);
        return aa;
    }

    public static JSONObject f()
    {
        return ab;
    }

    private static void g()
    {
        if (V.isEmpty())
        {
            try
            {
                V = com.nielsen.app.sdk.a.q().getVersion();
            }
            catch (Exception exception)
            {
                Log.e("AppSdk", "Nielsen AppSDK. Exception while accessing AppSdk Native object. Couldn't include native library version info in the event notification.");
            }
            if (!V.isEmpty())
            {
                V = (new StringBuilder(" | libAppSdk.so ")).append(V).toString();
            }
            V = (new StringBuilder("AppSdk.jar ")).append(com.nielsen.app.sdk.h.q()).append(V).toString();
        }
    }

    String a(int i1, char c1, String s1)
    {
        Object obj1;
        boolean flag;
        flag = false;
        obj1 = "";
        if (X != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
_L6:
        return ((String) (obj));
_L2:
        File file;
        obj = T.j();
        file = new File((new StringBuilder()).append(U).append("ErrorReport-").append(((String) (obj))).append(".txt").toString());
        obj = obj1;
        if (file.exists()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (!file.createNewFile()) goto _L6; else goto _L5
_L5:
        obj = (new StringBuilder()).append(T.i()).append(" : LOG FILE CREATED\n").toString();
        obj1 = new FileWriter(file, false);
        obj1;
        JVM INSTR monitorenter ;
        ((FileWriter) (obj1)).write(((String) (obj)));
        obj = "";
        ((FileWriter) (obj1)).close();
_L10:
        obj1;
        JVM INSTR monitorexit ;
_L4:
        i1;
        JVM INSTR tableswitch 1 2: default 180
    //                   1 243
    //                   2 251;
           goto _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_251;
_L7:
        boolean flag1;
        i1 = 1;
        flag1 = true;
_L11:
        if (i1 != 0)
        {
            if (file.length() > b())
            {
                file.delete();
                return ((String) (obj));
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_357;
        IOException ioexception;
        ioexception;
        Log.e("AppSdk", "Nielsen AppSDK. Exception while writing to file.");
        ((FileWriter) (obj1)).close();
          goto _L10
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        ((FileWriter) (obj1)).close();
        throw s1;
_L8:
        flag1 = false;
        i1 = 1;
          goto _L11
        flag1 = true;
        i1 = ((flag) ? 1 : 0);
          goto _L11
        if (flag1 && s1.isEmpty()) goto _L6; else goto _L12
_L12:
        synchronized (new FileWriter(file, flag1))
        {
            ((FileWriter) (obj)).write((new StringBuilder()).append(T.i()).append(" -").append(c1).append("- ").append(s1).append("\n").toString());
            ((FileWriter) (obj)).close();
        }
        return "";
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        obj1 = new FileReader(file);
        obj1;
        JVM INSTR monitorenter ;
        s1 = new char[((FileReader) (obj1)).read()];
        ((FileReader) (obj1)).read(s1);
        s1 = Arrays.toString(s1);
        ((FileReader) (obj1)).close();
_L13:
        obj1;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        Log.e("AppSdk", "Nielsen AppSDK. Exception while reading from file.");
        ((FileReader) (obj1)).close();
        s1 = ((String) (obj));
          goto _L13
        s1;
        ((FileReader) (obj1)).close();
        throw s1;
    }

    public void a(char c1, String s1)
    {
        if (X == null)
        {
            return;
        } else
        {
            a(0, c1, s1);
            return;
        }
    }

    public void c()
    {
        if (X == null)
        {
            return;
        } else
        {
            a(1, 'I', "");
            return;
        }
    }

    public void close()
    {
        X = null;
    }

    public String d()
    {
        if (X == null)
        {
            return "";
        } else
        {
            return a(2, 'I', "");
        }
    }

    public void d(int i1)
    {
    }

    static 
    {
        Y = 'W';
        Z = false;
    }
}
