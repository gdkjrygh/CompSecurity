// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.bi;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            t, i

final class o extends t
{

    final bi a;
    final int b;
    final int c;
    final ViewPropertyAnimatorCompat d;
    final i e;

    o(i j, bi bi, int k, int l, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        e = j;
        a = bi;
        b = k;
        c = l;
        d = viewpropertyanimatorcompat;
        super((byte)0);
    }

    public final void onAnimationCancel(View view)
    {
        if (b != 0)
        {
            ViewCompat.setTranslationX(view, 0.0F);
        }
        if (c != 0)
        {
            ViewCompat.setTranslationY(view, 0.0F);
        }
    }

    public final void onAnimationEnd(View view)
    {
        d.setListener(null);
        e.e(a);
        i.g(e).remove(a);
        i.e(e);
    }

    public final void onAnimationStart(View view)
    {
    }
}
