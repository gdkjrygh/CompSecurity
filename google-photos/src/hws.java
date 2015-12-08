// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class hws
    implements android.view.View.OnAttachStateChangeListener
{

    private hwq a;

    hws(hwq hwq1)
    {
        a = hwq1;
        super();
    }

    public final void onViewAttachedToWindow(View view)
    {
        if (hwq.a(a) != null && hwq.a(a).a() == hsw.a)
        {
            hwq.c(a).a.a(hwq.b(a), false);
        }
    }

    public final void onViewDetachedFromWindow(View view)
    {
        hwq.c(a).a.a(hwq.b(a));
    }
}
