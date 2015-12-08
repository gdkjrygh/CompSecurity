// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;
import com.appboy.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cj, eo, cu, db

public final class da
    implements cj, e
{

    private static final String d;
    public final List a;
    public final cu b;
    public final db c;

    public da(List list, cu cu1, db db1)
    {
        a = list;
        b = cu1;
        c = db1;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (a != null && !a.isEmpty())
            {
                jsonobject.put("sessions", eo.a(a));
            }
            if (b != null)
            {
                jsonobject.put("device", b.a());
            }
            if (c != null)
            {
                jsonobject.put("user", c.a);
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
        Object obj = new ArrayList();
        if (a != null)
        {
            ((List) (obj)).addAll(a);
        }
        ((List) (obj)).add(b);
        ((List) (obj)).add(c);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            cj cj1 = (cj)((Iterator) (obj)).next();
            if (cj1 != null && !cj1.c())
            {
                return false;
            }
        }

        return true;
    }

    public final Object forJsonPut()
    {
        return a();
    }

    static 
    {
        d = String.format("%s.%s", new Object[] {
            d.a, bo/app/da.getName()
        });
    }
}
