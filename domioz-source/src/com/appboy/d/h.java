// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import a.a.az;
import a.a.dl;
import com.appboy.b.a.d;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            d

public final class h extends com.appboy.d.d
{

    private d e;
    private int f;

    public h()
    {
        e = d.b;
    }

    public h(JSONObject jsonobject, az az)
    {
        this(jsonobject, az, (d)dl.a(jsonobject, "slide_from", com/appboy/b/a/d, d.b), jsonobject.optInt("close_btn_color"));
    }

    private h(JSONObject jsonobject, az az, d d1, int i)
    {
        super(jsonobject, az);
        e = d.b;
        e = d1;
        if (e == null)
        {
            e = d.b;
        }
        f = i;
    }

    public final d t()
    {
        return e;
    }

    public final int u()
    {
        return f;
    }
}
