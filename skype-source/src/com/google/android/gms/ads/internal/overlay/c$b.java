// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.go;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            c

static final class a extends RelativeLayout
{

    go a;

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }

    public (Context context, String s)
    {
        super(context);
        a = new go(context, s);
    }
}
