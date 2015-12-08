// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            hf, hg

public final class he
{

    public static void a(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        (new hf(view, ongloballayoutlistener)).a();
    }

    public static void a(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        (new hg(view, onscrollchangedlistener)).a();
    }
}
