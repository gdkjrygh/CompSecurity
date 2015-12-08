// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;
import com.appboy.d.e;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            eq

public class cw
    implements e
{

    private static final String a;
    private final String b;
    private final String c;

    public cw(String s, String s1)
    {
        b = s;
        c = s1;
    }

    public static cw a(JSONObject jsonobject)
    {
        String s = bo.app.eq.d(jsonobject.optString("android_id"));
        return new cw(bo.app.eq.d(jsonobject.optString("serial")), s);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("serial", b);
            jsonobject.put("android_id", c);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/cw.getName()
        });
    }
}
