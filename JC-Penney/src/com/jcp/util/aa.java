// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.text.TextUtils;
import com.crittercism.app.Crittercism;
import com.google.a.j;
import com.jcp.JCP;
import com.jcp.pojo.GetAccountResponse;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.reflect.Type;
import org.json.JSONObject;

// Referenced classes of package com.jcp.util:
//            ae

public final class aa
{

    private static final String a = com/jcp/util/aa.getName();

    private aa()
    {
    }

    public static Object a(Reader reader, Class class1)
    {
        j j1 = new j();
        try
        {
            class1 = ((Class) (j1.a(reader, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            try
            {
                reader = a(reader);
            }
            // Misplaced declaration of an exception variable
            catch (Reader reader)
            {
                reader = "";
            }
            a(((Exception) (class1)), ((String) (reader)), b());
            return null;
        }
        return class1;
    }

    public static Object a(String s, Class class1)
    {
        j j1 = new j();
        try
        {
            class1 = ((Class) (j1.a(s, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            a(((Exception) (class1)), s, b());
            return null;
        }
        return class1;
    }

    public static Object a(String s, Type type)
    {
        j j1 = new j();
        try
        {
            type = ((Type) (j1.a(s, type)));
        }
        // Misplaced declaration of an exception variable
        catch (Type type)
        {
            a(((Exception) (type)), s, b());
            return null;
        }
        return type;
    }

    private static String a()
    {
        GetAccountResponse getaccountresponse = JCP.j();
        if (getaccountresponse != null)
        {
            return getaccountresponse.getId();
        } else
        {
            return (new StringBuilder()).append("Guest-").append(System.currentTimeMillis()).toString();
        }
    }

    private static String a(Reader reader)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        reader = new BufferedReader(reader);
_L1:
        String s = reader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        stringbuilder.append(s);
          goto _L1
        reader;
        reader.printStackTrace();
        return stringbuilder.toString();
    }

    private static void a(Exception exception, String s, String s1)
    {
        Crittercism.a(a());
        Crittercism.a(b(exception, s, b()));
        Crittercism.a(exception);
    }

    private static boolean a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = s.toLowerCase()).contains("thread") || s.contains("stack"))
            {
                return true;
            }
        }
        return false;
    }

    private static String b()
    {
        Object obj;
        String s;
        StackTraceElement astacktraceelement[];
        s = "";
        astacktraceelement = Thread.currentThread().getStackTrace();
        obj = s;
        if (astacktraceelement == null) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        k = astacktraceelement.length;
        i = 0;
_L7:
        obj = s;
        if (i >= k) goto _L2; else goto _L3
_L3:
        String s1;
        String s2;
        obj = astacktraceelement[i];
        s1 = ((StackTraceElement) (obj)).getClassName();
        s2 = ((StackTraceElement) (obj)).getMethodName();
        if (a.equalsIgnoreCase(s1) || a(s2)) goto _L5; else goto _L4
_L4:
        obj = (new StringBuilder()).append(s1).append(".").append(((StackTraceElement) (obj)).getMethodName()).toString();
_L2:
        return ((String) (obj));
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static JSONObject b(Exception exception, String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("caller", s1);
            jsonobject.put("response", s);
            jsonobject.put("exception", exception.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            ae.a(com/jcp/util/aa.getName(), "Error building crittercism metadata", exception);
            return jsonobject;
        }
        return jsonobject;
    }

}
