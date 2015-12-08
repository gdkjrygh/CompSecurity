// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Window;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzd

final class a
    implements Runnable
{

    final Drawable a;
    final a b;

    public final void run()
    {
        zzd.a(b.b).getWindow().setBackgroundDrawable(a);
    }

    _cls9(_cls9 _pcls9, Drawable drawable)
    {
        b = _pcls9;
        a = drawable;
        super();
    }
}
