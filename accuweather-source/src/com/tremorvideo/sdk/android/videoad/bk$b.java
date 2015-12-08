// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk

public static class c
{

    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private f f;
    private int g;
    private boolean h;

    public int a()
    {
        if (f.b())
        {
            return d;
        } else
        {
            return 0;
        }
    }

    public String b()
    {
        return a;
    }

    public int c()
    {
        return b;
    }

    public int d()
    {
        return c;
    }

    public int e()
    {
        return d;
    }

    public int f()
    {
        return e;
    }

    public e g()
    {
        return f;
    }

    public (JSONObject jsonobject)
        throws Exception
    {
        a = jsonobject.getString("url");
        d = jsonobject.getInt("layout-width");
        e = jsonobject.getInt("layout-height");
        f = values()[jsonobject.getInt("layout")];
        g = Long.decode(jsonobject.getString("background-color")).intValue();
        h = jsonobject.getBoolean("opaque");
        if (jsonobject.has("layout-x"))
        {
            b = jsonobject.getInt("layout-x");
        }
        if (jsonobject.has("layout-y"))
        {
            c = jsonobject.getInt("layout-y");
        }
    }
}
