// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import a.a.dl;
import a.a.dm;
import android.net.Uri;
import com.appboy.b.a.a;
import com.appboy.f;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            c

public class i
    implements c
{

    private static final String a;
    private JSONObject b;
    private int c;
    private a d;
    private Uri e;
    private String f;
    private int g;
    private int h;

    public i()
    {
        c = -1;
        d = a.c;
        g = 0;
        h = 0;
    }

    public i(JSONObject jsonobject)
    {
        this(jsonobject, jsonobject.optInt("id", -1), (a)dl.a(jsonobject, "click_action", com/appboy/b/a/a, a.a), jsonobject.optString("uri"), jsonobject.optString("text"), jsonobject.optInt("bg_color"), jsonobject.optInt("text_color"));
    }

    private i(JSONObject jsonobject, int j, a a1, String s, String s1, int k, int l)
    {
        c = -1;
        d = a.c;
        g = 0;
        h = 0;
        b = jsonobject;
        c = j;
        d = a1;
        if (d == a.b && !dm.c(s))
        {
            e = Uri.parse(s);
        }
        f = s1;
        g = k;
        h = l;
    }

    public final volatile Object a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public final a c()
    {
        return d;
    }

    public final Uri d()
    {
        return e;
    }

    public final String e()
    {
        return f;
    }

    public final int f()
    {
        return g;
    }

    public final int g()
    {
        return h;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/d/i.getName()
        });
    }
}
