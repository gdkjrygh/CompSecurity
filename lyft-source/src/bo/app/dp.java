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
//            dv, dq, ao, al, 
//            eu, be

public final class dp extends dv
{

    private static final String a;
    private final List b = new ArrayList();

    public dp(String s, int i)
    {
        super(Uri.parse((new StringBuilder()).append(s).append("data").toString()));
        switch (dq.a[i - 1])
        {
        default:
            return;

        case 1: // '\001'
            b.add(ao.b);
            b.add(ao.a);
            return;

        case 2: // '\002'
            b.add(ao.b);
            return;

        case 3: // '\003'
            b.add(ao.a);
            break;
        }
    }

    public final al a()
    {
        return al.b;
    }

    public final void a(be be)
    {
    }

    public final void a(be be, ResponseError responseerror)
    {
        be = responseerror.getType();
        if (be == ErrorType.REQUIRED_FIELD_MISSING)
        {
            AppboyLogger.e(a, String.format("Required Field Missing: %s", new Object[] {
                responseerror.getMessage()
            }));
        } else
        if (be == ErrorType.BAD_INPUT)
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
            jsonobject.put("only_respond_with", eu.a(b));
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dp.getName()
        });
    }
}
