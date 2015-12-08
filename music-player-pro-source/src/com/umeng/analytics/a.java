// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.b.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.umeng.analytics:
//            g

class a
    implements Thread.UncaughtExceptionHandler
{

    private static final String d = "com_umeng__crash.cache";
    private Thread.UncaughtExceptionHandler a;
    private com.umeng.analytics.g b;
    private Context c;

    public a()
    {
    }

    private void a(Throwable throwable)
    {
        if (throwable == null)
        {
            Log.e("MobclickAgent", "Exception is null in handleException");
            return;
        } else
        {
            b.f(c);
            a(c, throwable);
            return;
        }
    }

    public void a(Context context)
    {
        if (Thread.getDefaultUncaughtExceptionHandler() == this)
        {
            Log.a("MobclickAgent", "can't call onError more than once!");
            return;
        } else
        {
            c = context.getApplicationContext();
            a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            return;
        }
    }

    void a(Context context, String s)
    {
        if (context == null || TextUtils.isEmpty(s))
        {
            return;
        }
        Object obj;
        Object obj1;
        try
        {
            obj1 = g.a();
            obj = ((String) (obj1)).split(" ")[0];
            String s1 = ((String) (obj1)).split(" ")[1];
            obj1 = new JSONObject();
            ((JSONObject) (obj1)).put("date", obj);
            ((JSONObject) (obj1)).put("time", s1);
            ((JSONObject) (obj1)).put("context", s);
            ((JSONObject) (obj1)).put("type", "error");
            ((JSONObject) (obj1)).put("version", com.umeng.common.b.d(context));
            obj = b(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "an error occured while writing report file...", context);
            context.printStackTrace();
            return;
        }
        s = ((String) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        s = new JSONArray();
        s.put(obj1);
        context = context.openFileOutput("com_umeng__crash.cache", 0);
        context.write(s.toString().getBytes());
        context.flush();
        context.close();
        return;
    }

    void a(Context context, Throwable throwable)
    {
        if (context == null || throwable == null)
        {
            return;
        }
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        throwable = throwable.getCause();
        do
        {
            if (throwable == null)
            {
                throwable = stringwriter.toString();
                printwriter.close();
                a(context, ((String) (throwable)));
                return;
            }
            throwable.printStackTrace(printwriter);
            throwable = throwable.getCause();
        } while (true);
    }

    public void a(com.umeng.analytics.g g1)
    {
        b = g1;
    }

    JSONArray b(Context context)
    {
        Exception exception = null;
        if (context != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        File file = new File(context.getFilesDir(), "com_umeng__crash.cache");
        if (!file.exists()) goto _L1; else goto _L3
_L3:
        StringBuffer stringbuffer;
        byte abyte0[];
        context = context.openFileInput("com_umeng__crash.cache");
        stringbuffer = new StringBuffer();
        abyte0 = new byte[1024];
_L4:
        int i = context.read(abyte0);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        context.close();
        context = exception;
        try
        {
            if (stringbuffer.length() != 0)
            {
                context = new JSONArray(stringbuffer.toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = exception;
        }
        try
        {
            file.delete();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
            return context;
        }
        return context;
        stringbuffer.append(new String(abyte0, 0, i));
          goto _L4
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        a(throwable);
        if (a != null)
        {
            a.uncaughtException(thread, throwable);
        }
    }
}
