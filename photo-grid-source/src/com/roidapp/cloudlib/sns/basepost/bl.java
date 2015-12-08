// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bu, bc, u

final class bl extends bu
{

    final bc d;

    bl(bc bc1, String s, int i, int j, boolean flag)
    {
        d = bc1;
        super(s, i, j, flag);
    }

    public final void onClick(View view)
    {
        bc.b(d).a(a().substring(1));
    }
}
