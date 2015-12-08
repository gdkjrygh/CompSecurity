// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

// Referenced classes of package com.google.android.gms.internal:
//            zzt, zzhs, zzic

public static final class it> extends ViewSwitcher
{

    private final zzhs zzlL;

    static zzhs zza(it> it>)
    {
        return it>.zzlL;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        zzlL.zzc(motionevent);
        return false;
    }

    public final void removeAllViews()
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof zzic))
            {
                ((zzic)view).destroy();
            }
        }

        super.removeAllViews();
    }

    public (Context context)
    {
        super(context);
        zzlL = new zzhs(context);
    }
}
