// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bu, w, at

final class x extends bu
{

    final w d;

    x(w w1, String s, int i, int j)
    {
        d = w1;
        super(s, i, j, false);
    }

    public final void onClick(View view)
    {
        w.a(d).a(a().substring(1));
    }
}
