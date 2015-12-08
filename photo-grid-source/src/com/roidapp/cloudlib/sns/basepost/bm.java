// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            av, bc, u

final class bm extends av
{

    final bc d;

    bm(bc bc1, int i, int j, String s, boolean flag)
    {
        d = bc1;
        super(i, j, s, flag);
    }

    public final void onClick(View view)
    {
        bc.b(d).a(null, b().substring(1));
    }
}
