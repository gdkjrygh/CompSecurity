// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.synclair.config.bean:
//            DeviceBaseConfigBean, a

public class b extends DeviceBaseConfigBean
{

    private a a;

    public b()
    {
    }

    public void a(a a1)
    {
        a = a1;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        if (a != null)
        {
            arraylist.add(a);
        }
        return arraylist;
    }

    public a c()
    {
        return a;
    }

    public boolean d()
    {
        return a != null;
    }
}
