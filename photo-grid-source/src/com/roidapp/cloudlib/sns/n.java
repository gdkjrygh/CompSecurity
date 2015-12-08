// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.e.i;
import com.roidapp.baselib.e.j;
import com.roidapp.cloudlib.sns.b.v;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            o, af, z

public final class n extends o
{

    private final Class e;

    public n(String s, i j, Class class1, j j1)
    {
        super(s, j, j1);
        e = class1;
    }

    public n(String s, Class class1, j j)
    {
        this(s, i.a, class1, j);
    }

    protected final Object a(String s, boolean flag)
    {
        JSONObject jsonobject = new JSONObject(s);
        if (af.a(jsonobject))
        {
            v v1 = (v)e.newInstance();
            v1.a(jsonobject, flag);
            if (flag)
            {
                b(s);
            }
            return v1;
        } else
        {
            throw new z(jsonobject.optInt("code", 1));
        }
    }
}
