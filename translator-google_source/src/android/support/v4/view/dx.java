// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            dv, ef, ei

class dx extends dv
{

    dx()
    {
    }

    public final void a(View view, ei ei)
    {
        view.animate().setUpdateListener(new ef(ei, view));
    }
}
