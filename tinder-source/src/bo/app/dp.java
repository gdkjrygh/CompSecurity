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
//            dm, da, bd, az, 
//            bc, cx

public abstract class dp
    implements dm
{

    private static final String a;
    private final Uri b;
    private da c;
    private cx d;

    protected dp(Uri uri)
    {
        b = uri;
    }

    public final void a(cx cx1)
    {
        d = cx1;
    }

    public final void a(da da1)
    {
        c = da1;
    }

    public final void b(az az1)
    {
        db db = c.c;
        cu cu = c.b;
        if (db != null)
        {
            az1.a(new bd(db), bo/app/bd);
        }
        if (cu != null)
        {
            az1.a(new bc(cu), bo/app/bc);
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

    public final da d()
    {
        return c;
    }

    public final cx e()
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dp.getName()
        });
    }
}
