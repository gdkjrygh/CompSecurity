// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataTypeCreateRequest

public static class Uv
{

    private List Uv;
    private String mName;

    static String a(Uv uv)
    {
        return uv.mName;
    }

    static List b(mName mname)
    {
        return mname.Uv;
    }

    public Uv addField(Field field)
    {
        if (!Uv.contains(field))
        {
            Uv.add(field);
        }
        return this;
    }

    public Uv addField(String s, int i)
    {
        boolean flag;
        if (s != null || !s.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Invalid name specified");
        return addField(new Field(s, i));
    }

    public DataTypeCreateRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (mName != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must set the name");
        if (!Uv.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must specify the data fields");
        return new DataTypeCreateRequest(this, null);
    }

    public Uv setName(String s)
    {
        mName = s;
        return this;
    }

    public ()
    {
        Uv = new ArrayList();
    }
}
