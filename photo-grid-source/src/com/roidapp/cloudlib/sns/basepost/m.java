// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.bi;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            t, i

final class m extends t
{

    final bi a;
    final ViewPropertyAnimatorCompat b;
    final i c;

    m(i j, bi bi, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = j;
        a = bi;
        b = viewpropertyanimatorcompat;
        super((byte)0);
    }

    public final void onAnimationEnd(View view)
    {
        b.setListener(null);
        i.a(view);
        c.d(a);
        i.d(c).remove(a);
        i.e(c);
    }

    public final void onAnimationStart(View view)
    {
    }
}
