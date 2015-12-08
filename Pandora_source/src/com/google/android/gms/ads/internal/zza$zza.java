// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzfn;
import com.google.android.gms.internal.zzgd;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza

public static final class zzmF extends ViewSwitcher
{

    private final zzfn zzmF;

    static zzfn zza(zzmF zzmf)
    {
        return zzmf.zzmF;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        zzmF.zzc(motionevent);
        return false;
    }

    public void removeAllViews()
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof zzgd))
            {
                ((zzgd)view).destroy();
            }
        }

        super.removeAllViews();
    }

    public (Context context)
    {
        super(context);
        zzmF = new zzfn(context);
    }
}
