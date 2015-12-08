// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            dj

public final class by
    implements c
{

    public final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;

    public by(String s, int i, String s1, String s2, String s3)
    {
        b = s;
        c = i;
        d = s1;
        e = s2;
        a = s3;
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("sdk_version", b);
            jsonobject.put("now", dj.b());
            jsonobject.put("version_code", c);
            jsonobject.put("version_name", d);
            jsonobject.put("package_name", e);
            if (a != null)
            {
                jsonobject.put("config_time", a);
            }
            jsonobject.put("no_acks", true);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
