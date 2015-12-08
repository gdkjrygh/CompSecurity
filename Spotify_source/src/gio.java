// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONArray;
import org.json.JSONObject;

public final class gio
{

    public final android.content.SharedPreferences.Editor a;
    private boolean b;

    gio(android.content.SharedPreferences.Editor editor)
    {
        a = editor;
        b = false;
    }

    public final gio a(gip gip1)
    {
        ctz.a(gip1);
        a.remove(gip1.a);
        return this;
    }

    public final gio a(gip gip1, int i)
    {
        ctz.a(gip1);
        a.putInt(gip1.a, i);
        return this;
    }

    public final gio a(gip gip1, long l)
    {
        ctz.a(gip1);
        a.putLong(gip1.a, l);
        return this;
    }

    public final gio a(gip gip1, String s)
    {
        ctz.a(gip1);
        a.putString(gip1.a, s);
        return this;
    }

    public final gio a(gip gip1, JSONArray jsonarray)
    {
        ctz.a(gip1);
        a.putString(gip1.a, jsonarray.toString());
        return this;
    }

    public final gio a(gip gip1, JSONObject jsonobject)
    {
        ctz.a(gip1);
        a.putString(gip1.a, jsonobject.toString());
        return this;
    }

    public final gio a(gip gip1, boolean flag)
    {
        ctz.a(gip1);
        a.putBoolean(gip1.a, flag);
        return this;
    }

    public final void a()
    {
        if (b)
        {
            throw new IllegalStateException("Must not use the same Editor instance twice");
        } else
        {
            a.commit();
            b = true;
            return;
        }
    }

    public final void b()
    {
        if (b)
        {
            throw new IllegalStateException("Must not use the same Editor instance twice");
        } else
        {
            a.apply();
            b = true;
            return;
        }
    }
}
