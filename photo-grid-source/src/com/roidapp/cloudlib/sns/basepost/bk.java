// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.b.x;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            av, bc, u

final class bk extends av
{

    final bc d;

    bk(bc bc1, int i, int j, x x)
    {
        d = bc1;
        super(i, j, x);
    }

    public final void onClick(View view)
    {
        b.a("SNS", "click", "SNS/ToPersonalCenter/FromPostComments/Click");
        al.g().a(bc.a(d), "SNS", "click", "SNS/ToPersonalCenter/FromPostComments/Click", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.basepost.bc.b(d).a(a(), null);
    }
}
