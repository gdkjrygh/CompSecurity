// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class gin
{

    public SharedPreferences a;
    private Context b;
    private final String c;

    gin(Context context, String s)
    {
        b = context;
        c = s;
        a();
    }

    public static Object a(Object obj, Object obj1, Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            if (obj.equals(aobj[i]))
            {
                return obj;
            }
        }

        return obj1;
    }

    public final int a(gip gip1)
    {
        h(gip1);
        return a(gip1, 0);
    }

    public final int a(gip gip1, int i)
    {
        return a.getInt(gip1.a, i);
    }

    public final long a(gip gip1, long l)
    {
        return a.getLong(gip1.a, l);
    }

    public final String a(gip gip1, String s)
    {
        return a.getString(gip1.a, s);
    }

    public final JSONArray a(gip gip1, JSONArray jsonarray)
    {
        Object obj = null;
        try
        {
            gip1 = a.getString(gip1.a, null);
        }
        // Misplaced declaration of an exception variable
        catch (gip gip1)
        {
            gip1 = obj;
        }
        if (gip1 == null)
        {
            return jsonarray;
        } else
        {
            return new JSONArray(gip1);
        }
    }

    public final JSONObject a(gip gip1, JSONObject jsonobject)
    {
        ctz.a(jsonobject);
        gip1 = a.getString(gip1.a, null);
        if (gip1 == null)
        {
            return jsonobject;
        } else
        {
            return new JSONObject(gip1);
        }
    }

    final void a()
    {
        a = b.getSharedPreferences(c, 0);
    }

    public final boolean a(gip gip1, boolean flag)
    {
        return a.getBoolean(gip1.a, flag);
    }

    public final long b(gip gip1)
    {
        h(gip1);
        return a(gip1, 0L);
    }

    public final gio b()
    {
        return new gio(a.edit());
    }

    public final void b(gip gip1, String s)
    {
        b().a(gip1, s).a();
    }

    public final String c(gip gip1)
    {
        h(gip1);
        return a(gip1, ((String) (null)));
    }

    public final JSONArray d(gip gip1)
    {
        h(gip1);
        try
        {
            a.getString(gip1.a, null);
        }
        // Misplaced declaration of an exception variable
        catch (gip gip1)
        {
            throw new NoSuchElementException(gip1.getMessage());
        }
        return a(gip1, ((JSONArray) (null)));
    }

    public final JSONObject e(gip gip1)
    {
        h(gip1);
        return new JSONObject((String)ctz.a(a.getString(gip1.a, null)));
    }

    public final boolean f(gip gip1)
    {
        return a.contains(gip1.a);
    }

    public final void g(gip gip1)
    {
        b().a(gip1).a();
    }

    public final void h(gip gip1)
    {
        if (!f(gip1))
        {
            throw new NoSuchElementException((new StringBuilder("key ")).append(gip1.a).append(" has no value").toString());
        } else
        {
            return;
        }
    }
}
