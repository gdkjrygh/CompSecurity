// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            dv, l, be, ba, 
//            eu

public final class ds
    implements dv
{

    public Map a;

    public ds(l l1)
    {
        a = new HashMap();
        a.put("app_id", l1.a());
        a.put("hashed_device_id", l1.c());
        a.put("library_version", "5.3.3");
    }

    public final ds a(String s, String s1)
    {
        a.put(s, s1);
        return this;
    }

    public final ds a(String s, JSONArray jsonarray)
    {
        a.put(s, jsonarray);
        return this;
    }

    public final dv a(be be1)
    {
        String s = be1.b;
        a.put(be1.b, (new ba(be1)).a);
        return this;
    }

    public final void a(OutputStream outputstream)
    {
        eu.b();
        outputstream.write((new JSONObject(a)).toString().getBytes("UTF8"));
    }

    public final String toString()
    {
        String s;
        try
        {
            s = (new JSONObject(a)).toString(4);
        }
        catch (JSONException jsonexception)
        {
            eu.a();
            return null;
        }
        return s;
    }
}
