// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            n

final class q
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    final n a;

    private q(n n1)
    {
        a = n1;
        super();
    }

    q(n n1, byte byte0)
    {
        this(n1);
    }

    public final void onClick(View view)
    {
        a.k();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return false;
    }
}
