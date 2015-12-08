// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzq

public static final class b extends ViewSwitcher
{

    private final go a;
    private final gw b;

    public final go a()
    {
        return a;
    }

    public final void b()
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (b != null)
        {
            b.b();
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b != null)
        {
            b.c();
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (b != null)
        {
            b.d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }

    public final void removeAllViews()
    {
        Object obj = new ArrayList();
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof hi))
            {
                ((List) (obj)).add((hi)view);
            }
        }

        super.removeAllViews();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((hi)((Iterator) (obj)).next()).destroy()) { }
    }

    public r(Context context, android.view.Observer.OnGlobalLayoutListener ongloballayoutlistener, android.view.Observer.OnScrollChangedListener onscrollchangedlistener)
    {
        super(context);
        a = new go(context);
        if (context instanceof Activity)
        {
            b = new gw((Activity)context, ongloballayoutlistener, onscrollchangedlistener);
            b.a();
            return;
        } else
        {
            b = null;
            return;
        }
    }
}
