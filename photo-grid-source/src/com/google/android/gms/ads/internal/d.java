// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zze, c

final class d
    implements android.view.View.OnTouchListener
{

    final zze a;
    final c b;

    d(c c, zze zze1)
    {
        b = c;
        a = zze1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.recordClick();
        return false;
    }
}
