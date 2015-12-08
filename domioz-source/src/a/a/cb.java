// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            bl

public final class cb
    implements bl
{

    private final double a;
    private final double b;
    private final Double c;
    private final Double d;

    public cb(double d1, double d2, Double double1, Double double2)
    {
        if (d1 > 90D || d1 < -90D || d2 > 180D || d2 < -180D)
        {
            throw new IllegalArgumentException("Unable to create Location. Latitude and longitude values are bounded by \26190 and \261180 respectively");
        } else
        {
            a = d1;
            b = d2;
            c = double1;
            d = double2;
            return;
        }
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject;
        boolean flag1;
        flag1 = true;
        jsonobject = new JSONObject();
        jsonobject.put("latitude", a);
        jsonobject.put("longitude", b);
        boolean flag;
        if (c != null)
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
        jsonobject.put("altitude", c);
        if (d != null)
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
                jsonobject.put("ll_accuracy", d);
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                return jsonobject;
            }
        }
        return jsonobject;
    }
}
