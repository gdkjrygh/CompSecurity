// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cp, eu, da, dh

public final class dg
    implements cp, IPutIntoJson
{

    private static final String d;
    public final List a;
    public final da b;
    public final dh c;

    public dg(List list, da da1, dh dh1)
    {
        a = list;
        b = da1;
        c = dh1;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (a != null && !a.isEmpty())
            {
                jsonobject.put("sessions", eu.a(a));
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
            AppboyLogger.e(d, "Caught exception creating outbound extras Json.", jsonexception);
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
            cp cp1 = (cp)((Iterator) (obj)).next();
            if (cp1 != null && !cp1.c())
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dg.getName()
        });
    }
}
