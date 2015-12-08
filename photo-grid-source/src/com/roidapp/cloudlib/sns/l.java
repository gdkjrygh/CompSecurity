// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.e.i;
import com.roidapp.baselib.e.j;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            o, af, z

public final class l extends o
{

    public l(String s, i i, j j)
    {
        super(s, i, j);
    }

    public l(String s, j j)
    {
        super(s, j);
    }

    public final Object a(String s, boolean flag)
    {
        JSONObject jsonobject = new JSONObject(s);
        if (af.a(jsonobject))
        {
            if (flag)
            {
                b(s);
            }
            return jsonobject;
        } else
        {
            throw new z(jsonobject.optInt("code", 1));
        }
    }
}
