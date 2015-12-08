// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            s, m, l, q, 
//            i, au

public final class x extends s
{

    private String i;
    private JSONArray j;
    private JSONArray k;
    private JSONObject l;

    public x(m m1)
    {
        this((new StringBuilder()).append(m1.a()).append("/android_v2/handle_crashes").toString());
    }

    private x(String s1)
    {
        i = new String();
        j = new JSONArray();
        k = new JSONArray();
        l = new JSONObject();
        a = s1;
        b = new Vector();
    }

    private static x a(String s1)
    {
        Object obj;
        x x1;
        x1 = new x(s1);
        obj = new JSONObject();
        JSONObject jsonobject;
        Object obj1;
        obj1 = crittercism.android.l.i().m();
        jsonobject = new JSONObject(((SharedPreferences) (obj1)).getString(a(), (new JSONObject()).toString()));
        obj1 = ((SharedPreferences) (obj1)).edit();
        ((android.content.SharedPreferences.Editor) (obj1)).remove(a());
        obj = jsonobject;
        if (!((android.content.SharedPreferences.Editor) (obj1)).commit())
        {
            throw new Exception("failed to remove crashes from Shared Preferences");
        }
          goto _L1
        obj;
_L3:
        (new StringBuilder("Exception in SdkCrashes.readFromDisk(): ")).append(obj.getClass().getName());
        obj = jsonobject;
_L1:
        try
        {
            s1 = a(((JSONObject) (obj)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return x1;
        }
        return s1;
        Exception exception;
        exception;
        jsonobject = ((JSONObject) (obj));
        obj = exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private static x a(JSONObject jsonobject, String s1)
    {
        JSONArray jsonarray;
        x x1;
        x1 = new x(s1);
        s1 = new JSONObject();
        jsonarray = new JSONArray();
        int i1;
        try
        {
            if (jsonobject.has("requestData"))
            {
                s1 = jsonobject.getJSONObject("requestData");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            s1 = new JSONObject();
        }
        if (!s1.has("crashes")) goto _L2; else goto _L1
_L1:
        jsonobject = s1.getJSONArray("crashes");
_L4:
        i1 = 0;
        while (i1 < jsonobject.length()) 
        {
            try
            {
                x1.a(jsonobject.getJSONObject(i1));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                (new StringBuilder("Exception in SdkCrashes.fromJSON: ")).append(s1.getClass().getName());
            }
            i1++;
        }
        break MISSING_BLOCK_LABEL_136;
        jsonobject;
        jsonobject = new JSONArray();
        continue; /* Loop/switch isn't completed */
        return x1;
_L2:
        jsonobject = jsonarray;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a()
    {
        new String();
        String s1;
        try
        {
            s1 = crittercism.android.l.i().a();
        }
        catch (Exception exception)
        {
            exception = new String();
        }
        return (new StringBuilder("critter_pendingcrashes_")).append(s1).toString();
    }

    private void b(Throwable throwable)
    {
        int i1 = throwable.toString().indexOf(":");
        Object obj;
        PrintWriter printwriter;
        if (i1 >= 0)
        {
            obj = throwable.toString().substring(0, i1);
        } else
        {
            obj = throwable.getClass().getName();
        }
        i = ((String) (obj));
        obj = new StringWriter();
        printwriter = new PrintWriter(((java.io.Writer) (obj)));
        throwable.printStackTrace(printwriter);
        for (throwable = throwable.getCause(); throwable != null; throwable = throwable.getCause())
        {
            i = throwable.getClass().getName();
            throwable.printStackTrace(printwriter);
        }

        throwable = obj.toString();
        j = new JSONArray();
        throwable = throwable.split("\n");
        for (int j1 = 0; j1 < throwable.length; j1++)
        {
            j.put(throwable[j1]);
        }

    }

    private void h()
    {
        Iterator iterator = Thread.getAllStackTraces().entrySet().iterator();
_L4:
        JSONObject jsonobject;
        Object obj;
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        jsonobject = new JSONObject();
        obj = (Thread)entry.getKey();
        StackTraceElement astacktraceelement[];
        int j1;
        if (((Thread) (obj)).getId() == Thread.currentThread().getId())
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject.put("name", ((Thread) (obj)).getName());
        jsonobject.put("id", ((Thread) (obj)).getId());
        jsonobject.put("state", ((Thread) (obj)).getState().name());
        obj = new JSONArray();
        astacktraceelement = (StackTraceElement[])entry.getValue();
        j1 = astacktraceelement.length;
        int i1 = 0;
_L2:
        StackTraceElement stacktraceelement;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        stacktraceelement = astacktraceelement[i1];
        (new StringBuilder("  ")).append(stacktraceelement);
        ((JSONArray) (obj)).put(stacktraceelement);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("stacktrace", obj);
            k.put(jsonobject);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Problem with setBackgroundThreads(): ")).append(exception.getClass().getName());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Throwable throwable)
    {
        String s1;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        new String();
        s1 = "";
        q q1;
        q q2;
        if (throwable.getMessage() != null)
        {
            s1 = throwable.getMessage();
        }
        b(throwable);
        h();
        q1 = crittercism.android.l.i().m;
        q2 = crittercism.android.l.i().n;
        throwable = new JSONObject();
        throwable.put("crashed_session", q1.a());
        throwable.put("previous_session", q2.a());
_L3:
        l = throwable;
_L4:
        jsonobject.put("app_state", crittercism.android.l.i().c.a(new boolean[] {
            1, 1
        }));
        jsonobject.put("breadcrumbs", l);
        jsonobject.put("current_thread_id", Thread.currentThread().getId());
        jsonobject.put("endpoints", crittercism.android.l.i().o.a());
        jsonobject.put("exception_name", i);
        jsonobject.put("exception_reason", s1);
        jsonobject.put("platform", "android");
        jsonobject.put("threads", k);
        jsonobject.put("ts", au.a.a());
        if (Thread.currentThread().getId() != 1L) goto _L2; else goto _L1
_L1:
        jsonobject.put("type", s.c);
_L5:
        jsonobject.put("unsymbolized_stacktrace", j);
_L6:
        a(jsonobject);
        return;
        throwable;
        throwable = new JSONObject();
          goto _L3
        throwable;
        (new StringBuilder("Exception in addThrowableToVector: ")).append(throwable.getClass().getName());
        s1 = new String();
        i = new String();
        j = new JSONArray();
        k = new JSONArray();
        l = new JSONObject();
          goto _L4
_L2:
        jsonobject.put("type", s.d);
          goto _L5
        throwable;
        (new StringBuilder("JSONException in addThrowableToVector: ")).append(throwable.getClass().getName());
          goto _L6
        throwable;
        (new StringBuilder("Exception in addThrowableToVector: ")).append(throwable.getClass().getName());
          goto _L6
    }

    public final void a(JSONObject jsonobject)
    {
        (new StringBuilder("responseObject = ")).append(jsonobject.toString());
        int i1;
        try
        {
            i1 = b.size();
        }
        catch (Exception exception)
        {
            super.a(jsonobject);
            return;
        }
label0:
        {
            if (i1 == 0)
            {
                return;
            }
            break label0;
        }
    }

    public final JSONObject b()
    {
        Object obj;
        JSONObject jsonobject1 = new JSONObject();
        new JSONObject();
        new JSONArray();
        JSONObject jsonobject;
        try
        {
            obj = new JSONArray(b);
        }
        catch (Exception exception)
        {
            exception = new JSONArray();
        }
        jsonobject = crittercism.android.l.i().c.d();
        jsonobject.put("crashes", obj);
        obj = jsonobject;
_L1:
        Exception exception1;
        try
        {
            jsonobject1.put("requestUrl", a);
            jsonobject1.put("requestData", obj);
        }
        catch (Exception exception2)
        {
            return new JSONObject();
        }
        return jsonobject1;
        exception1;
        exception1 = new JSONObject();
          goto _L1
    }

    public final void c()
    {
        try
        {
            android.content.SharedPreferences.Editor editor = crittercism.android.l.i().m().edit();
            editor.remove(a());
            editor.putString(a(), b().toString());
            if (!editor.commit())
            {
                throw new Exception("commit failed");
            }
        }
        catch (Exception exception) { }
    }

    public final JSONObject d()
    {
        return super.d();
    }

    protected final void e()
    {
        x x1 = a(a);
        x1.a((Vector)b);
        b = x1.b;
    }
}
