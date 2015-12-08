// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataTypeCreateRequest

public static class SY
{

    private List SY;
    private String mName;

    static String a(SY sy)
    {
        return sy.mName;
    }

    static List b(mName mname)
    {
        return mname.SY;
    }

    public SY addField(Field field)
    {
        if (!SY.contains(field))
        {
            SY.add(field);
        }
        return this;
    }

    public SY addField(String s, int i)
    {
        boolean flag;
        if (s != null || !s.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Invalid name specified");
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
        o.a(flag, "Must set the name");
        if (!SY.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must specify the data fields");
        return new DataTypeCreateRequest(this, null);
    }

    public SY setName(String s)
    {
        mName = s;
        return this;
    }

    public ()
    {
        SY = new ArrayList();
    }
}
