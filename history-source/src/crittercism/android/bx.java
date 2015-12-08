// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            ch, cf, ed

public final class bx extends ch
{

    private String a;
    private String b;
    private String c;
    private String d;

    public bx(String s, String s1)
    {
        a = cf.a.a();
        b = ed.a.a();
        c = s;
        d = s1;
    }

    public final JSONArray a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", c);
        hashmap.put("reason", d);
        return (new JSONArray()).put(b).put(6).put(new JSONObject(hashmap));
    }

    public final String e()
    {
        return a;
    }
}
