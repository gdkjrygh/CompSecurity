// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.net.Uri;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ds, dg, bj, be, 
//            bi, dd

public abstract class dv
    implements ds
{

    private static final String a;
    private final Uri b;
    private dg c;
    private dd d;

    protected dv(Uri uri)
    {
        b = uri;
    }

    public final void a(dd dd1)
    {
        d = dd1;
    }

    public final void a(dg dg1)
    {
        c = dg1;
    }

    public final void b(be be1)
    {
        dh dh = c.c;
        da da = c.b;
        if (dh != null)
        {
            be1.a(new bj(dh), bo/app/bj);
        }
        if (da != null)
        {
            be1.a(new bi(da), bo/app/bi);
        }
    }

    public boolean b()
    {
        return c == null || c.c();
    }

    public JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (c != null)
            {
                jsonobject.put("extras", c.a());
            }
            if (d != null)
            {
                jsonobject.put("environment", d.a());
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.w(a, "Experienced JSONException while retrieving parameters. Returning null.", jsonexception);
            return null;
        }
        return jsonobject;
    }

    public final dg d()
    {
        return c;
    }

    public final dd e()
    {
        return d;
    }

    public final Uri f()
    {
        return Appboy.getAppboyApiEndpoint(b);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dv.getName()
        });
    }
}
