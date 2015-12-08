// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import com.cmcm.a.a.a;
import com.roidapp.cloudlib.ads.f;
import com.roidapp.cloudlib.ads.g;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            a

final class j extends g
{

    public j(com.roidapp.photogrid.cloud.a.a a1)
    {
        super(a1);
    }

    private static void a(com.roidapp.photogrid.cloud.a.a a1)
    {
        com.roidapp.photogrid.cloud.a.a.a(a1, null);
        if (a1.d != null)
        {
            com.roidapp.photogrid.cloud.a.a.c(a1);
        }
    }

    public final void a(Object obj)
    {
        a a1;
label0:
        {
            obj = (com.roidapp.photogrid.cloud.a.a)obj;
            if (com.roidapp.photogrid.cloud.a.a.a(((com.roidapp.photogrid.cloud.a.a) (obj))) != null)
            {
                a1 = f.a().a(com.roidapp.photogrid.cloud.a.a.b(((com.roidapp.photogrid.cloud.a.a) (obj))));
                if (a1 != null)
                {
                    break label0;
                }
                a(((com.roidapp.photogrid.cloud.a.a) (obj)));
            }
            return;
        }
        obj.b = 6;
        com.roidapp.photogrid.cloud.a.a.a(((com.roidapp.photogrid.cloud.a.a) (obj)), a1);
        obj.c = true;
        ((com.roidapp.photogrid.cloud.a.a) (obj)).b();
    }

    public final void a(Object obj, a a1)
    {
        ((com.roidapp.photogrid.cloud.a.a)obj).onClick(null);
    }

    public final void b(Object obj)
    {
        a((com.roidapp.photogrid.cloud.a.a)obj);
    }
}
