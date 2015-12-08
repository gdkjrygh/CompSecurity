// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d.e;
import java.util.Collection;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cj, cf, cr, gr, 
//            eo, cm

public class ch
    implements cj, e
{

    private static final String d = String.format("%s.%s", new Object[] {
        "Appboy", bo/app/ch.getName()
    });
    public final cm a;
    public volatile Double b;
    public final boolean c;
    private final gr e;
    private final cr f;
    private final double g;

    public ch(cm cm, Double double1, Double double2, gr gr1, cr cr1, boolean flag)
    {
        a = cm;
        g = double1.doubleValue();
        b = double2;
        e = gr1;
        f = cr1;
        c = flag;
    }

    public final cf a()
    {
        return new cf(e);
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
                jsonobject.put("events", eo.a(e));
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
            return jsonobject;
        }
        return jsonobject;
    }

    public final boolean c()
    {
        gr gr1 = a().a;
        return !c && b == null && (gr1 == null || gr1.isEmpty());
    }

    public Object forJsonPut()
    {
        return b();
    }

}
