// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            er

public class dd
    implements IPutIntoJson
{

    private static final String b;
    public final String a;
    private final String c;
    private final int d;
    private final String e;
    private final String f;

    public dd(String s, int i, String s1, String s2, String s3)
    {
        c = s;
        d = i;
        e = s1;
        f = s2;
        a = s3;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("sdk_version", c);
            jsonobject.put("now", er.b());
            jsonobject.put("version_code", d);
            jsonobject.put("version_name", e);
            jsonobject.put("package_name", f);
            if (a != null)
            {
                jsonobject.put("config_time", a);
            }
            jsonobject.put("no_acks", true);
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(b, "Caught exception creating dispatch environment Json.", jsonexception);
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
        b = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dd.getName()
        });
    }
}
