// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.view.View;
import com.google.android.m4b.maps.model.CameraPosition;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bz, bp, bi

static final class b extends com.google.android.m4b.maps.df.b
{

    private final bi a;
    private final bp b;

    public final void a(CameraPosition cameraposition)
    {
        boolean flag1 = true;
        bi bi1 = a;
        boolean flag;
        if (cameraposition.c < b.a(cameraposition.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bi1.a.setEnabled(flag);
        bi1 = a;
        if (cameraposition.c > b.d())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bi1.b.setEnabled(flag);
    }

    meraPosition(bp bp1, bi bi1)
    {
        a = bi1;
        b = bp1;
    }
}
