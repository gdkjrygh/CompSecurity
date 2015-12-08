// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.net.Uri;
import com.appboy.b.c;
import com.appboy.d;
import com.appboy.d.m;
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

    public final void a(az az, m m1)
    {
        az = m1.a;
        if (az == c.a)
        {
            String.format("Required Field Missing: %s", new Object[] {
                m1.b
            });
        } else
        if (az == c.b)
        {
            String.format("Bad Input: %s", new Object[] {
                m1.b
            });
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
            return null;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/dj.getName()
        });
    }
}
