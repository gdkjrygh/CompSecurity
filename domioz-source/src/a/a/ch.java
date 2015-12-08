// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.net.Uri;
import com.appboy.b.c;
import com.appboy.d.j;
import com.appboy.f;
import com.appboy.f.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            cn, ci, m, k, 
//            dl, aa

public final class ch extends cn
{

    private static final String a;
    private final List b = new ArrayList();

    public ch(String s, int i)
    {
        super(Uri.parse((new StringBuilder()).append(s).append("data").toString()));
        switch (a.a.ci.a[i - 1])
        {
        default:
            return;

        case 1: // '\001'
            b.add(m.b);
            b.add(a.a.m.a);
            return;

        case 2: // '\002'
            b.add(m.b);
            return;

        case 3: // '\003'
            b.add(a.a.m.a);
            break;
        }
    }

    public final k a()
    {
        return k.b;
    }

    public final void a(aa aa)
    {
    }

    public final void a(aa aa, j j1)
    {
        aa = j1.a();
        if (aa == c.a)
        {
            com.appboy.f.a.d(a, String.format("Required Field Missing: %s", new Object[] {
                j1.b()
            }));
        } else
        if (aa == c.b)
        {
            com.appboy.f.a.d(a, String.format("Bad Input: %s", new Object[] {
                j1.b()
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
            jsonobject.put("only_respond_with", a.a.dl.a(b));
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
            f.a, a/a/ch.getName()
        });
    }
}
