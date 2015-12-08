// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            t, r, i

final class p extends t
{

    final r a;
    final ViewPropertyAnimatorCompat b;
    final i c;

    p(i j, r r1, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        c = j;
        a = r1;
        b = viewpropertyanimatorcompat;
        super((byte)0);
    }

    public final void onAnimationEnd(View view)
    {
        b.setListener(null);
        ViewCompat.setAlpha(view, 1.0F);
        ViewCompat.setTranslationX(view, 0.0F);
        ViewCompat.setTranslationY(view, 0.0F);
        c.g(a.a);
        i.h(c).remove(a.a);
        i.e(c);
    }

    public final void onAnimationStart(View view)
    {
    }
}
