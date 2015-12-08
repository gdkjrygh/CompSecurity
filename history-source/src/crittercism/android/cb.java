// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            ca, dx

public final class cb
    implements ca
{

    public cb()
    {
    }

    private static JSONArray a(InputStream inputstream)
    {
        JSONArray jsonarray;
        int i;
        jsonarray = new JSONArray();
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        i = 0;
_L2:
        String s = inputstream.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray.put(s);
        int j;
        j = i + 1;
        i = j;
        if (j <= 200) goto _L2; else goto _L1
_L1:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            dx.b();
            return jsonarray;
        }
        return jsonarray;
        IOException ioexception;
        ioexception;
        dx.b();
        dx.c();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            dx.b();
            return jsonarray;
        }
        return jsonarray;
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            dx.b();
        }
        throw exception;
    }

    public final JSONArray a()
    {
        Object obj;
        Object obj1;
        JSONArray jsonarray;
        jsonarray = new JSONArray();
        obj1 = null;
        obj = null;
        if (android.os.Build.VERSION.SDK_INT >= 10) goto _L2; else goto _L1
_L1:
        jsonarray.put("Logcat data is not collected for Android APIs before 10 (Gingerbread)");
        jsonarray.put((new StringBuilder("API level is ")).append(android.os.Build.VERSION.SDK_INT).append("(").append(android.os.Build.VERSION.CODENAME).append(")").toString());
        obj1 = jsonarray;
_L3:
        return ((JSONArray) (obj1));
_L2:
        Object obj2 = (new ProcessBuilder(new String[] {
            "logcat", "-t", Integer.toString(100), "-v", "time"
        })).redirectErrorStream(true).start();
        obj = obj2;
        obj1 = obj2;
        JSONArray jsonarray1 = a(((Process) (obj2)).getInputStream());
        obj = jsonarray1;
        obj1 = obj;
        if (obj2 != null)
        {
            ((Process) (obj2)).destroy();
            return ((JSONArray) (obj));
        }
          goto _L3
        Exception exception1;
        exception1;
        obj1 = obj;
        dx.b("Crittercism", "Unable to collect logcat data", exception1);
        obj1 = obj;
        jsonarray.put((new StringBuilder("Unable to collect logcat data due to a(n) ")).append(exception1.getClass().getName()).toString());
        obj1 = obj;
        exception1 = exception1.getMessage();
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        obj1 = obj;
        jsonarray.put(exception1);
        obj1 = jsonarray;
        if (obj == null) goto _L3; else goto _L4
_L4:
        ((Process) (obj)).destroy();
        return jsonarray;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((Process) (obj1)).destroy();
        }
        throw exception;
    }
}
