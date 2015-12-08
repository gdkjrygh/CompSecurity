// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.net.Uri;
import com.appboy.f;
import com.appboy.f.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            ck, cc, af, aa, 
//            ae, by

public abstract class cn
    implements ck
{

    private static final String a;
    private final Uri b;
    private cc c;
    private by d;

    protected cn(Uri uri)
    {
        b = uri;
    }

    public final void a(by by1)
    {
        d = by1;
    }

    public final void a(cc cc1)
    {
        c = cc1;
    }

    public final void b(aa aa1)
    {
        cd cd = c.c;
        bv bv = c.b;
        if (cd != null)
        {
            aa1.a(new af(cd), a/a/af);
        }
        if (bv != null)
        {
            aa1.a(new ae(bv), a/a/ae);
        }
    }

    public boolean b()
    {
        return c == null || c.d();
    }

    public JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (c != null)
            {
                jsonobject.put("extras", c.b());
            }
            if (d != null)
            {
                jsonobject.put("environment", d.b());
            }
        }
        catch (JSONException jsonexception)
        {
            com.appboy.f.a.b(a, "Experienced JSONException while retrieving parameters. Returning null.", jsonexception);
            return null;
        }
        return jsonobject;
    }

    public final cc d()
    {
        return c;
    }

    public final by e()
    {
        return d;
    }

    public final Uri f()
    {
        return com.appboy.a.a(b);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/cn.getName()
        });
    }
}
