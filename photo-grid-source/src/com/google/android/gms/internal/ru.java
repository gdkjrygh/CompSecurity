// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            rw, qd

final class ru extends rw
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private final WeakReference a;

    public ru(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
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
        zzp.zzbx().a(viewtreeobserver, this);
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
