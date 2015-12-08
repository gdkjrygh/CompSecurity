// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bf:
//            d

final class a
    implements d
{

    private com.google.android.m4b.maps.bf.d a;

    public final void a(ac ac1, int i, aa aa)
    {
        if (i == 1)
        {
            synchronized (d.a(a))
            {
                d.a(a).remove(Integer.valueOf(ac1.hashCode()));
            }
            return;
        } else
        {
            return;
        }
        ac1;
        aa;
        JVM INSTR monitorexit ;
        throw ac1;
    }

    (com.google.android.m4b.maps.bf.d d1)
    {
        a = d1;
        super();
    }
}
