// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cp, cl, cx, gw, 
//            eu, cs

public class cn
    implements cp, IPutIntoJson
{

    private static final String d = String.format("%s.%s", new Object[] {
        "Appboy", bo/app/cn.getName()
    });
    public final cs a;
    public volatile Double b;
    public final boolean c;
    private final gw e;
    private final cx f;
    private final double g;

    public cn(cs cs, Double double1, Double double2, gw gw1, cx cx1, boolean flag)
    {
        a = cs;
        g = double1.doubleValue();
        b = double2;
        e = gw1;
        f = cx1;
        c = flag;
    }

    public final cl a()
    {
        return new cl(e);
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("guid", f.a.toString());
            jsonobject.put("start_time", g);
            if (!e.isEmpty())
            {
                jsonobject.put("events", eu.a(e));
            }
            if (c)
            {
                jsonobject.put("new", true);
            }
            if (b != null)
            {
                jsonobject.put("end_time", b);
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(d, "Caught exception creating dispatch session Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final boolean c()
    {
        gw gw1 = a().a;
        return !c && b == null && (gw1 == null || gw1.isEmpty());
    }

    public Object forJsonPut()
    {
        return b();
    }

}
