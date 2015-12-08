// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import java.util.Collection;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            bk, bg, bs, fm, 
//            dl, bn

public final class bi
    implements bk, c
{

    public final bn a;
    public volatile Double b;
    public final boolean c;
    private final fm d;
    private final bs e;
    private final double f;

    public bi(bn bn, Double double1, Double double2, fm fm1, bs bs1, boolean flag)
    {
        a = bn;
        f = double1.doubleValue();
        b = double2;
        d = fm1;
        e = bs1;
        c = flag;
    }

    public final Object a()
    {
        return c();
    }

    public final bg b()
    {
        return new bg(d);
    }

    public final JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("guid", e.a.toString());
            jsonobject.put("start_time", f);
            if (!d.isEmpty())
            {
                jsonobject.put("events", dl.a(d));
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
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public final boolean d()
    {
        fm fm1 = b().a;
        return !c && b == null && (fm1 == null || fm1.isEmpty());
    }
}
