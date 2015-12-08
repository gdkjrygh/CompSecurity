// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.net.Uri;
import com.appboy.Constants;
import com.appboy.enums.ErrorType;
import com.appboy.models.ResponseError;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            dp, dk, aj, ag, 
//            eo, az

public final class dj extends dp
{

    private static final String a;
    private final List b = new ArrayList();

    public dj(String s, int i)
    {
        super(Uri.parse((new StringBuilder()).append(s).append("data").toString()));
        switch (dk.a[i - 1])
        {
        default:
            return;

        case 1: // '\001'
            b.add(aj.b);
            b.add(aj.a);
            return;

        case 2: // '\002'
            b.add(aj.b);
            return;

        case 3: // '\003'
            b.add(aj.a);
            break;
        }
    }

    public final ag a()
    {
        return ag.b;
    }

    public final void a(az az)
    {
    }

    public final void a(az az, ResponseError responseerror)
    {
        az = responseerror.getType();
        if (az == ErrorType.REQUIRED_FIELD_MISSING)
        {
            AppboyLogger.e(a, String.format("Required Field Missing: %s", new Object[] {
                responseerror.getMessage()
            }));
        } else
        if (az == ErrorType.BAD_INPUT)
        {
            AppboyLogger.e(a, String.format("Bad Input: %s", new Object[] {
                responseerror.getMessage()
            }));
            return;
        }
    }

    public final boolean b()
    {
        boolean flag;
        if (b == null || b.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && super.b();
    }

    public final JSONObject c()
    {
        JSONObject jsonobject = super.c();
        if (jsonobject == null)
        {
            return null;
        }
        try
        {
            jsonobject.put("only_respond_with", eo.a(b));
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.w(a, "Experienced JSONException while retrieving parameters. Returning null.", jsonexception);
            return null;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dj.getName()
        });
    }
}
