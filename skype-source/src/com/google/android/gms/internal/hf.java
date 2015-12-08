// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.p;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            hh, gn

final class hf extends hh
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private final WeakReference a;

    public hf(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        super(view);
        a = new WeakReference(ongloballayoutlistener);
    }

    protected final void a(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnGlobalLayoutListener(this);
    }

    protected final void b(ViewTreeObserver viewtreeobserver)
    {
        p.g().a(viewtreeobserver, this);
    }

    public final void onGlobalLayout()
    {
        android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = (android.view.ViewTreeObserver.OnGlobalLayoutListener)a.get();
        if (ongloballayoutlistener != null)
        {
            ongloballayoutlistener.onGlobalLayout();
            return;
        } else
        {
            b();
            return;
        }
    }
}
