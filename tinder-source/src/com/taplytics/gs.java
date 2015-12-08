// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.util.Log;
import android.util.Pair;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, shelduck, hi, j

public final class gs
{

    private static final gs a = new gs();
    private static boolean b = false;

    private gs()
    {
    }

    public static String a()
    {
        return "Taplytics";
    }

    public static void a(String s)
    {
        a(s, ((Date) (null)));
    }

    public static void a(String s, Exception exception)
    {
label0:
        {
            if (b)
            {
                if (exception == null)
                {
                    break label0;
                }
                Log.w("Taplytics", (new StringBuilder("WARNING: ")).append(s).append(", error: ").append(exception.toString()).toString());
            }
            return;
        }
        Log.w("Taplytics", (new StringBuilder("WARNING: ")).append(s).toString());
    }

    public static void a(String s, String s1, Exception exception)
    {
        j j1;
        if (b)
        {
            if (exception != null)
            {
                Log.e("Taplytics", (new StringBuilder("NETWORK ERROR: ")).append(s1).append(", error: ").append(exception.toString()).toString());
            } else
            {
                Log.e("Taplytics", (new StringBuilder("NETWORK ERROR: ")).append(s1).toString());
            }
        }
        if (!ci.b().l)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        j1 = ci.b().d;
        if (!ci.b().j || hi.a(shelduck.b) || hi.a(shelduck.z))
        {
            return;
        }
        JSONObject jsonobject = new JSONObject();
        StringWriter stringwriter;
        try
        {
            if (b)
            {
                a((new StringBuilder("Log request error: ")).append("tlRequestFailed").append(", value: ").append(s).toString(), ((Date) (null)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b("Track Event", s);
            return;
        }
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        if (exception.getMessage() == null || exception.getMessage().equals(""))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        jsonobject.put("message", exception.getMessage());
        stringwriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringwriter));
        jsonobject.put("stacktrace", stringwriter.toString());
_L1:
        jsonobject.put("logText", s1);
        s1 = j1.b("tlRequestFailed", Integer.valueOf(0), jsonobject);
        s1.put("gn", s);
        j1.a(s1);
        return;
        exception;
        c("Broke tracking request error.", exception);
          goto _L1
        if (exception != null)
        {
            b((new StringBuilder("Network Error:")).append(s1).append(", error: ").append(exception.toString()).toString(), null);
            return;
        } else
        {
            b((new StringBuilder("Network Error:")).append(s1).toString(), null);
            return;
        }
    }

    public static void a(String s, Date date)
    {
label0:
        {
            if (b)
            {
                if (date == null)
                {
                    break label0;
                }
                long l = (new Date()).getTime();
                long l1 = date.getTime();
                Log.d("Taplytics", d((new StringBuilder()).append(s).append(", time: ").append(l - l1).append("ms").toString()));
            }
            return;
        }
        Log.d("Taplytics", d(s));
    }

    public static void b(String s)
    {
        a(s, ((Exception) (null)));
    }

    public static void b(String s, Exception exception)
    {
        j j1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (b)
        {
            if (exception != null)
            {
                Log.e("Taplytics", (new StringBuilder("ERROR: ")).append(s).append(", error: ").append(exception.toString()).toString());
            } else
            {
                Log.e("Taplytics", (new StringBuilder("ERROR: ")).append(s).toString());
            }
        }
        j1 = ci.b().d;
        if (ci.b().j && !hi.a(shelduck.b) && !hi.a(shelduck.n)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i;
        try
        {
            obj = new JSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            c("Broke tracking error.", exception);
            return;
        }
        i = ((flag1) ? 1 : 0);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        i = ((flag1) ? 1 : 0);
        if (s.equals(""))
        {
            break MISSING_BLOCK_LABEL_247;
        }
        i = ((flag) ? 1 : 0);
        if (j.b.containsKey(s))
        {
            i = ((Integer)((Pair)j.b.get(s)).second).intValue() + 1;
            if (((Boolean)((Pair)j.b.get(s)).first).booleanValue())
            {
                j.b.put(s, new Pair(Boolean.valueOf(true), Integer.valueOf(i)));
                return;
            }
        }
        ((JSONObject) (obj)).put("taplyticsMessage", s);
        if (exception == null) goto _L4; else goto _L3
_L3:
        if (exception.getMessage() == null || exception.getMessage().equals("")) goto _L4; else goto _L5
_L5:
        ((JSONObject) (obj)).put("message", exception.getMessage());
        StringWriter stringwriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringwriter));
        ((JSONObject) (obj)).put("stacktrace", stringwriter.toString());
_L9:
        obj = j1.b("tlError", null, ((JSONObject) (obj)));
_L10:
        if (obj == null) goto _L1; else goto _L6
_L6:
        if (s == null) goto _L8; else goto _L7
_L7:
        j.b.put(s, new Pair(Boolean.valueOf(true), Integer.valueOf(i)));
        j1.a(((JSONObject) (obj)));
        return;
        Exception exception1;
        exception1;
        c("Broke tracking error.", exception1);
          goto _L9
_L4:
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        boolean flag2;
        if (exception.getMessage() == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        flag2 = exception.getMessage().equals("");
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_431;
        }
        obj = j1.b("tlError", null, ((JSONObject) (obj)));
          goto _L10
        obj;
        c("Broke tracking error.", ((Exception) (obj)));
        break MISSING_BLOCK_LABEL_431;
_L8:
        j1.a(((JSONObject) (obj)));
        return;
        obj = null;
          goto _L10
    }

    public static boolean b()
    {
        return b;
    }

    public static void c(String s)
    {
        b(s, null);
    }

    private static void c(String s, Exception exception)
    {
label0:
        {
            if (b)
            {
                if (exception == null)
                {
                    break label0;
                }
                Log.e("Taplytics", (new StringBuilder("SUPER ERROR: ")).append(s).append(", error: ").append(exception.toString()).toString());
            }
            return;
        }
        Log.e("Taplytics", (new StringBuilder("SUPER ERROR: ")).append(s).toString());
    }

    private static String d(String s)
    {
        Object obj = Thread.currentThread();
        if (((Thread) (obj)).getName() != null)
        {
            obj = ((Thread) (obj)).getName();
        } else
        {
            obj = (new StringBuilder()).append(((Thread) (obj)).getId()).toString();
        }
        return (new StringBuilder()).append(((String) (obj))).append(": ").append(s).toString();
    }

}
