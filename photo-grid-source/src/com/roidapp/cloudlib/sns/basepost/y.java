// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            av, w, at

final class y extends av
{

    final w d;

    y(w w1, int i, int j, String s)
    {
        d = w1;
        super(i, j, s, false);
    }

    public final void onClick(View view)
    {
        w.a(d).a(null, b().substring(1));
    }
}
