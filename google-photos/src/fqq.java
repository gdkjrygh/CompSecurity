// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class fqq
    implements android.view.View.OnAttachStateChangeListener
{

    private fqm a;

    fqq(fqm fqm1)
    {
        a = fqm1;
        super();
    }

    public final void onViewAttachedToWindow(View view)
    {
        fqm.d(a).a.a(fqm.g(a), true);
    }

    public final void onViewDetachedFromWindow(View view)
    {
        fqm.d(a).a.a(fqm.g(a));
    }
}
