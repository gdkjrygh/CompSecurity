// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class cy
    implements IPutIntoJson
{

    private static final String a;
    private final int b;
    private final int c;
    private final float d;
    private final float e;
    private final int f;

    public cy(int i, int j, float f1, float f2, int k)
    {
        b = i;
        c = j;
        d = f1;
        e = f2;
        f = k;
    }

    public static cy a(JSONObject jsonobject)
    {
        int i = jsonobject.optInt("resolution_width", -1);
        int j = jsonobject.optInt("resolution_height", -1);
        float f1 = (float)jsonobject.optDouble("x_dpi", -1D);
        float f2 = (float)jsonobject.optDouble("y_dpi", -1D);
        int k = jsonobject.optInt("density_default", -1);
        if (i != -1 && j != -1 && f1 != -1F && f2 != -1F && k != -1)
        {
            return new cy(i, j, f1, f2, k);
        } else
        {
            return null;
        }
    }

    public JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("resolution_height", c);
            jsonobject.put("resolution_width", b);
            jsonobject.put("x_dpi", d);
            jsonobject.put("y_dpi", e);
            jsonobject.put("density_default", f);
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating display Json.", jsonexception);
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cy.getName()
        });
    }
}
