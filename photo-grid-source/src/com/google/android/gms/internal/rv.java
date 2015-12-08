// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            rw

final class rv extends rw
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final WeakReference a;

    public rv(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        super(view);
        a = new WeakReference(onscrollchangedlistener);
    }

    protected final void a(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnScrollChangedListener(this);
    }

    protected final void b(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged()
    {
        android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = (android.view.ViewTreeObserver.OnScrollChangedListener)a.get();
        if (onscrollchangedlistener != null)
        {
            onscrollchangedlistener.onScrollChanged();
            return;
        } else
        {
            b();
            return;
        }
    }
}
