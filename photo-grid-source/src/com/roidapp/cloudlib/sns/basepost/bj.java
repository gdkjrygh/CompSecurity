// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            v, bc, u

final class bj extends v
{

    final bc d;

    bj(bc bc1, int i, int j, long l, int k)
    {
        d = bc1;
        super(i, j, l, k);
    }

    public final void onClick(View view)
    {
        b.a("SNS", "click", "SNS/ToComments/FromPostComments/Click");
        al.g().a(bc.a(d), "SNS", "click", "SNS/ToComments/FromPostComments/Click", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.basepost.bc.b(d).a(a(), false);
    }
}
