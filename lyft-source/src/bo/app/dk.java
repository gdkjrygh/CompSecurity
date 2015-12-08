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
//            ev

public class dk
    implements IPutIntoJson
{

    private static final String b;
    public final String a;

    private dk(String s)
    {
        a = s;
    }

    public static dk a(JSONObject jsonobject)
    {
        return new dk(ev.d(jsonobject.optString("android_id")));
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("android_id", a);
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(b, "Caught exception creating wear device identifier Json.", jsonexception);
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dk.getName()
        });
    }
}
