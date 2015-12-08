// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.j;
import b.a.a.a.d;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.a.a.c:
//            ae

final class U
{

    static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public U(File file)
    {
        b = file;
    }

    static String a(Map map)
        throws JSONException
    {
        return (new JSONObject(map)).toString();
    }

    private static String a(JSONObject jsonobject, String s)
    {
        String s1 = null;
        if (!jsonobject.isNull(s))
        {
            s1 = jsonobject.optString(s, null);
        }
        return s1;
    }

    private static Map d(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        HashMap hashmap = new HashMap();
        String s1;
        for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, a(s, s1)))
        {
            s1 = (String)iterator.next();
        }

        return hashmap;
    }

    public final ae a(String s)
    {
        Object obj;
        obj = new File(b, (new StringBuilder()).append(s).append("user.meta").toString());
        if (!((File) (obj)).exists())
        {
            return ae.a;
        }
        s = null;
        obj = new FileInputStream(((File) (obj)));
        s = new JSONObject(j.a(((java.io.InputStream) (obj))));
        s = new ae(a(((JSONObject) (s)), "userId"), a(((JSONObject) (s)), "userName"), a(((JSONObject) (s)), "userEmail"));
        j.a(((java.io.Closeable) (obj)));
        return s;
        obj;
_L4:
        b.a.a.a.d.a();
        j.a(s);
        return ae.a;
        s;
        obj = null;
_L2:
        j.a(((java.io.Closeable) (obj)));
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj = s;
        s = exception;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Map b(String s)
    {
        Object obj;
        obj = c(s);
        if (!((File) (obj)).exists())
        {
            return Collections.emptyMap();
        }
        s = null;
        obj = new FileInputStream(((File) (obj)));
        s = d(j.a(((java.io.InputStream) (obj))));
        j.a(((java.io.Closeable) (obj)));
        return s;
        obj;
_L4:
        b.a.a.a.d.a();
        j.a(s);
        return Collections.emptyMap();
        s;
        obj = null;
_L2:
        j.a(((java.io.Closeable) (obj)));
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj = s;
        s = exception;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    final File c(String s)
    {
        return new File(b, (new StringBuilder()).append(s).append("keys.meta").toString());
    }

}
