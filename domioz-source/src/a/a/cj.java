// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.net.Uri;
import com.appboy.b.c;
import com.appboy.c.d;
import com.appboy.c.e;
import com.appboy.d.j;
import com.appboy.f;
import com.appboy.f.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            cn, k, aa

public final class cj extends cn
{

    private static final String a;
    private final com.appboy.d.b.c b;

    public cj(String s, com.appboy.d.b.c c1)
    {
        super(Uri.parse((new StringBuilder()).append(s).append("feedback").toString()));
        b = c1;
    }

    public final k a()
    {
        return k.b;
    }

    public final void a(aa aa1)
    {
        aa1.a(new e(b), com/appboy/c/e);
    }

    public final void a(aa aa1, j j1)
    {
        c c1;
        String s;
        c1 = j1.a();
        s = j1.b();
        if (c1 != c.a) goto _L2; else goto _L1
_L1:
        com.appboy.f.a.d(a, String.format("Required Field Missing: %s", new Object[] {
            s
        }));
_L4:
        aa1.a(new d(b, j1), com/appboy/c/d);
        return;
_L2:
        if (c1 == c.b)
        {
            com.appboy.f.a.d(a, String.format("Bad Input: %s", new Object[] {
                s
            }));
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
            jsonobject.put("feedback", b.b());
        }
        catch (JSONException jsonexception)
        {
            com.appboy.f.a.b(a, "Experienced JSONException while retrieving parameters. Returning null.", jsonexception);
            return null;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/cj.getName()
        });
    }
}
