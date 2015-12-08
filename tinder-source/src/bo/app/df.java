// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cy

public final class df extends cy
{

    private static final String a;
    private final String b;

    private df(int i, int j, float f, float f1, int k, String s)
    {
        super(i, j, f, f1, k);
        b = s;
    }

    public static df b(JSONObject jsonobject)
    {
        Object obj = null;
        int i = jsonobject.optInt("resolution_width", -1);
        int j = jsonobject.optInt("resolution_height", -1);
        float f = (float)jsonobject.optDouble("x_dpi", -1D);
        float f1 = (float)jsonobject.optDouble("y_dpi", -1D);
        int k = jsonobject.optInt("density_default", -1);
        String s = jsonobject.optString("screen_type", null);
        jsonobject = obj;
        if (i != -1)
        {
            jsonobject = obj;
            if (j != -1)
            {
                jsonobject = obj;
                if (f != -1F)
                {
                    jsonobject = obj;
                    if (f1 != -1F)
                    {
                        jsonobject = obj;
                        if (k != -1)
                        {
                            jsonobject = new df(i, j, f, f1, k, s);
                        }
                    }
                }
            }
        }
        return jsonobject;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = super.a();
        try
        {
            if (b != null)
            {
                jsonobject.put("screen_type", b);
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating wear display Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/df.getName()
        });
    }
}
