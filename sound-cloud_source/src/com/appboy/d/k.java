// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d;

import bo.app.bx;
import bo.app.eo;
import com.appboy.b.a.d;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d:
//            f

public final class k extends f
{

    public d a;
    public int b;

    public k()
    {
        a = d.b;
    }

    public k(JSONObject jsonobject, bx bx)
    {
        this(jsonobject, bx, (d)eo.a(jsonobject, "slide_from", com/appboy/b/a/d, d.b), jsonobject.optInt("close_btn_color"));
    }

    private k(JSONObject jsonobject, bx bx, d d1, int i)
    {
        super(jsonobject, bx);
        a = d.b;
        a = d1;
        if (a == null)
        {
            a = d.b;
        }
        b = i;
    }
}
