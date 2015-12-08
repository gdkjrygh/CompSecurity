// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.view.View;
import com.roidapp.cloudlib.sns.basepost.bu;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            f, o

final class j extends bu
{

    final f d;

    j(f f1, String s, int i, int k)
    {
        d = f1;
        super(s, i, k, true);
    }

    public final void onClick(View view)
    {
        f.d(d).a(a().substring(1));
    }
}
