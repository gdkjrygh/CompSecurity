// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.view.View;
import com.google.android.m4b.maps.model.CameraPosition;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bz, cb, bp

final class a
    implements android.view.OnClickListener
{

    private bz a;

    public final void onClick(View view)
    {
        bz.a(a).b(ba);
        view = bz.b(a).c();
        view = new CameraPosition(((CameraPosition) (view)).b, ((CameraPosition) (view)).c, 0.0F, 0.0F);
        bz.b(a).a(view, 400);
    }

    meraPosition(bz bz1)
    {
        a = bz1;
        super();
    }
}
