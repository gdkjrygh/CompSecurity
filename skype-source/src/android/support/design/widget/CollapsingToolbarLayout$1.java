// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.am;
import android.support.v4.view.r;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CollapsingToolbarLayout

final class a
    implements r
{

    final CollapsingToolbarLayout a;

    public final am a(View view, am am1)
    {
        CollapsingToolbarLayout.a(a, am1);
        a.requestLayout();
        return am1.f();
    }

    (CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        a = collapsingtoolbarlayout;
        super();
    }
}
