// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.net.Uri;
import com.appboy.b.c;
import com.appboy.c.e;
import com.appboy.d;
import com.appboy.d.m;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            dp, ag, az

public final class dl extends dp
{

    private static final String a;
    private final com.appboy.d.b.e b;

    public dl(String s, com.appboy.d.b.e e1)
    {
        super(Uri.parse((new StringBuilder()).append(s).append("feedback").toString()));
        b = e1;
    }

    public final ag a()
    {
        return ag.b;
    }

    public final void a(az az1)
    {
        az1.a(new e(b), com/appboy/c/e);
    }

    public final void a(az az1, m m1)
    {
        c c1;
        String s;
        c1 = m1.a;
        s = m1.b;
        if (c1 != c.a) goto _L2; else goto _L1
_L1:
        String.format("Required Field Missing: %s", new Object[] {
            s
        });
_L4:
        az1.a(new com.appboy.c.d(b, m1), com/appboy/c/d);
        return;
_L2:
        if (c1 == c.b)
        {
            String.format("Bad Input: %s", new Object[] {
                s
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return false;
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
            jsonobject.put("feedback", b.a());
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
            d.a, bo/app/dl.getName()
        });
    }
}
