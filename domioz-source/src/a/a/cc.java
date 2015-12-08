// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            bk, dl, bv, cd

public final class cc
    implements bk, c
{

    public final List a;
    public final bv b;
    public final cd c;

    public cc(List list, bv bv1, cd cd1)
    {
        a = list;
        b = bv1;
        c = cd1;
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (a != null && !a.isEmpty())
            {
                jsonobject.put("sessions", dl.a(a));
            }
            if (b != null)
            {
                jsonobject.put("device", b.b());
            }
            if (c != null)
            {
                jsonobject.put("user", c.a);
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public final boolean d()
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
            bk bk1 = (bk)((Iterator) (obj)).next();
            if (bk1 != null && !bk1.d())
            {
                return false;
            }
        }

        return true;
    }
}
