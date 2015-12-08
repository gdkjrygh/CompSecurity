// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ck

public final class cz
    implements ck
{

    private static final String a;
    private final double b;
    private final double c;
    private final Double d;
    private final Double e;

    public cz(double d1, double d2, Double double1, Double double2)
    {
        if (d1 > 90D || d1 < -90D || d2 > 180D || d2 < -180D)
        {
            throw new IllegalArgumentException("Unable to create Location. Latitude and longitude values are bounded by \26190 and \261180 respectively");
        } else
        {
            b = d1;
            c = d2;
            d = double1;
            e = double2;
            return;
        }
    }

    public final JSONObject a()
    {
        JSONObject jsonobject;
        boolean flag1;
        flag1 = true;
        jsonobject = new JSONObject();
        jsonobject.put("latitude", b);
        jsonobject.put("longitude", c);
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        jsonobject.put("altitude", d);
        if (e != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                jsonobject.put("ll_accuracy", e);
            }
            catch (JSONException jsonexception)
            {
                AppboyLogger.e(a, "Caught exception creating location Json.", jsonexception);
                return jsonobject;
            }
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cz.getName()
        });
    }
}
