// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class fwr
    implements lzy
{

    private fwm a;

    public fwr(fwm fwm1)
    {
        a = fwm1;
        super();
    }

    public final void a(lzx lzx)
    {
        Object obj = (mhq)lzx;
        lzx = a;
        boolean flag = ((mhq) (obj)).r().a();
        obj = ((mhq) (obj)).a();
        if (flag)
        {
            lzx = ((fwm) (lzx)).d;
            lzx.a = new HashMap();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); lzx.a((mhp)((Iterator) (obj)).next())) { }
        } else
        {
            ((fwm) (lzx)).d.a(false);
            ((fwm) (lzx)).d.b();
        }
    }
}
