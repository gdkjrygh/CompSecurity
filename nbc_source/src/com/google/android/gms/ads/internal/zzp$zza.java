// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp

public static final class zzqn extends ViewSwitcher
{

    private final zzhn zzqn;

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        zzqn.zzd(motionevent);
        return false;
    }

    public void removeAllViews()
    {
        Object obj = new ArrayList();
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof zzid))
            {
                ((List) (obj)).add((zzid)view);
            }
        }

        super.removeAllViews();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzid)((Iterator) (obj)).next()).destroy()) { }
    }

    public zzhn zzbP()
    {
        return zzqn;
    }

    public (Context context)
    {
        super(context);
        zzqn = new zzhn(context);
    }
}
