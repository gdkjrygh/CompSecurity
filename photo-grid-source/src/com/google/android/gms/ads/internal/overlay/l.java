// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Window;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            k, zzd

final class l
    implements Runnable
{

    final Drawable a;
    final k b;

    l(k k1, Drawable drawable)
    {
        b = k1;
        a = drawable;
        super();
    }

    public final void run()
    {
        zzd.a(b.a).getWindow().setBackgroundDrawable(a);
    }
}
