// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            i, zzic

class g extends i
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private final WeakReference a;

    public g(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        super(view);
        a = new WeakReference(ongloballayoutlistener);
    }

    protected void a(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnGlobalLayoutListener(this);
    }

    protected void b(ViewTreeObserver viewtreeobserver)
    {
        if (zzic.zzni())
        {
            viewtreeobserver.removeOnGlobalLayoutListener(this);
            return;
        } else
        {
            viewtreeobserver.removeGlobalOnLayoutListener(this);
            return;
        }
    }

    public void onGlobalLayout()
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
