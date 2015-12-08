// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.l;
import a.a.a.a.f;
import a.a.a.a.s;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.b.a.c:
//            bw

final class ay
{

    private static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public ay(File file)
    {
        b = file;
    }

    private static String a(JSONObject jsonobject, String s1)
    {
        String s2 = null;
        if (!jsonobject.isNull(s1))
        {
            s2 = jsonobject.optString(s1, null);
        }
        return s2;
    }

    private static Map c(String s1)
    {
        s1 = new JSONObject(s1);
        HashMap hashmap = new HashMap();
        String s2;
        for (Iterator iterator = s1.keys(); iterator.hasNext(); hashmap.put(s2, a(s1, s2)))
        {
            s2 = (String)iterator.next();
        }

        return hashmap;
    }

    public final bw a(String s1)
    {
        s1 = new File(b, (new StringBuilder()).append(s1).append("user.meta").toString());
        if (!s1.exists())
        {
            return bw.a;
        }
        FileInputStream fileinputstream = new FileInputStream(s1);
        s1 = fileinputstream;
        Object obj = new JSONObject(l.a(fileinputstream));
        s1 = fileinputstream;
        obj = new bw(a(((JSONObject) (obj)), "userId"), a(((JSONObject) (obj)), "userName"), a(((JSONObject) (obj)), "userEmail"));
        l.a(fileinputstream, "Failed to close user metadata file.");
        return ((bw) (obj));
        Exception exception1;
        exception1;
        fileinputstream = null;
_L4:
        s1 = fileinputstream;
        f.d().b("CrashlyticsCore", "Error deserializing user metadata.", exception1);
        l.a(fileinputstream, "Failed to close user metadata file.");
        return bw.a;
        Exception exception;
        exception;
        s1 = null;
_L2:
        l.a(s1, "Failed to close user metadata file.");
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Map b(String s1)
    {
        s1 = new File(b, (new StringBuilder()).append(s1).append("keys.meta").toString());
        if (!s1.exists())
        {
            return Collections.emptyMap();
        }
        FileInputStream fileinputstream = new FileInputStream(s1);
        s1 = fileinputstream;
        Map map = c(l.a(fileinputstream));
        l.a(fileinputstream, "Failed to close user metadata file.");
        return map;
        Exception exception1;
        exception1;
        fileinputstream = null;
_L4:
        s1 = fileinputstream;
        f.d().b("CrashlyticsCore", "Error deserializing user metadata.", exception1);
        l.a(fileinputstream, "Failed to close user metadata file.");
        return Collections.emptyMap();
        Exception exception;
        exception;
        s1 = null;
_L2:
        l.a(s1, "Failed to close user metadata file.");
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
