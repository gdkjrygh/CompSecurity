// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ep

public class cw
    implements IPutIntoJson
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
        String s = ep.d(jsonobject.optString("android_id"));
        return new cw(ep.d(jsonobject.optString("serial")), s);
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cw.getName()
        });
    }
}
