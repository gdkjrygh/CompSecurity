// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.text.TextUtils;
import android.util.SparseArray;
import com.cmcm.a.a.a;
import com.roidapp.cloudlib.ads.f;
import com.roidapp.cloudlib.ads.g;
import com.roidapp.cloudlib.ads.i;
import com.roidapp.cloudlib.ads.j;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            aa

final class ae extends g
{

    public ae(aa aa1)
    {
        super(aa1);
    }

    public final void a(Object obj)
    {
        obj = (aa)obj;
        if (com.roidapp.photogrid.cloud.aa.a(((aa) (obj))) != null)
        {
            a a1 = f.a().a(40008);
            if (a1 != null && com.roidapp.photogrid.cloud.aa.a(((aa) (obj))) != null)
            {
                j j1 = new j();
                j1.a(a1);
                j1.a(((com.roidapp.cloudlib.ads.k) (obj)));
                com.roidapp.photogrid.cloud.aa.a(((aa) (obj))).a(j1);
            }
        }
    }

    public final void a(Object obj, a a1)
    {
        obj = (aa)obj;
        if (aa.b(((aa) (obj))) != null)
        {
            obj = (String)aa.b(((aa) (obj))).get(a1.hashCode());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                com.roidapp.photogrid.b.f.a(((String) (obj)), 4, 6);
            }
        }
    }

    public final volatile void b(Object obj)
    {
    }
}
