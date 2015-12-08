// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a.a;

import com.samsung.multiscreen.device.Device;
import com.samsung.multiscreen.device.f;
import com.samsung.multiscreen.device.g;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a
    implements f
{

    private static final Logger b;
    int a;
    private List c;
    private List d;
    private f e;

    public a(List list, List list1, int i, f f1)
    {
        c = list;
        d = list1;
        a = i;
        e = f1;
    }

    public void onError(g g)
    {
        b.info((new StringBuilder("findLocal() onError() error: ")).append(g).toString());
        d.add(g);
        boolean flag;
        if (c.size() + d.size() >= a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e.onResult(c);
        }
    }

    public void onResult(Object obj)
    {
        obj = (Device)obj;
        c.add(obj);
        boolean flag;
        if (c.size() + d.size() >= a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e.onResult(c);
        }
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/a/a.getName());
        b = logger;
        logger.setLevel(Level.OFF);
    }
}
