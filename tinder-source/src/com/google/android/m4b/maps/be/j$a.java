// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.b;
import java.lang.ref.SoftReference;

// Referenced classes of package com.google.android.m4b.maps.be:
//            j

static final class a
{

    final SoftReference a;
    final aa b;

    public (aa aa1)
    {
        Object obj1 = null;
        super();
        Object obj;
        boolean flag;
        if (aa1.b() == ah.q && ((ap)aa1).n() == 0 || (aa1 instanceof b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = aa1;
        } else
        {
            obj = null;
        }
        b = ((aa) (obj));
        obj = obj1;
        if (b == null)
        {
            obj = new SoftReference(aa1);
        }
        a = ((SoftReference) (obj));
    }
}
