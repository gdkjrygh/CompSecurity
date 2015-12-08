// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class huu
    implements android.view.View.OnAttachStateChangeListener
{

    private hus a;

    huu(hus hus1)
    {
        a = hus1;
        super();
    }

    public final void onViewAttachedToWindow(View view)
    {
        hus.c(a).a.a(hus.b(a), true);
    }

    public final void onViewDetachedFromWindow(View view)
    {
        hus.c(a).a.a(hus.b(a));
    }
}
