// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            aa

public final class er extends es.a
{

    private final aa sM;
    private final String sN;
    private final String sO;

    public er(aa aa1, String s, String s1)
    {
        sM = aa1;
        sN = s;
        sO = s1;
    }

    public void ar()
    {
        sM.ar();
    }

    public void as()
    {
        sM.as();
    }

    public void c(d d)
    {
        if (d == null)
        {
            return;
        } else
        {
            sM.b((View)e.f(d));
            return;
        }
    }

    public String cu()
    {
        return sN;
    }

    public String cv()
    {
        return sO;
    }
}
