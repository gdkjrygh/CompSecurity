// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            zzel, zzhs

static final class t> extends RelativeLayout
{

    zzhs zzlL;

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        zzlL.zzc(motionevent);
        return false;
    }

    public (Context context, String s)
    {
        super(context);
        zzlL = new zzhs(context, s);
    }
}
