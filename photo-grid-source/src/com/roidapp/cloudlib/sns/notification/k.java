// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.view.View;
import com.roidapp.cloudlib.sns.basepost.av;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            f, o

final class k extends av
{

    final f d;

    k(f f1, int i, int j, String s)
    {
        d = f1;
        super(i, j, s, true);
    }

    public final void onClick(View view)
    {
        f.d(d).b(b().substring(1));
    }
}
