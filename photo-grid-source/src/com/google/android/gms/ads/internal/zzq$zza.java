// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ql;
import com.google.android.gms.internal.re;
import com.google.android.gms.internal.ry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b extends ViewSwitcher
{

    private final ql a;
    private final re b;

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b != null)
        {
            b.c();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (b != null)
        {
            b.d();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }

    public void removeAllViews()
    {
        Object obj = new ArrayList();
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof ry))
            {
                ((List) (obj)).add((ry)view);
            }
        }

        super.removeAllViews();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ry)((Iterator) (obj)).next()).destroy()) { }
    }

    public void zzbP()
    {
        zzb.v("Disable position monitoring on adFrame.");
        if (b != null)
        {
            b.b();
        }
    }

    public ql zzbT()
    {
        return a;
    }

    public r(Context context, android.view.Observer.OnGlobalLayoutListener ongloballayoutlistener, android.view.Observer.OnScrollChangedListener onscrollchangedlistener)
    {
        super(context);
        a = new ql(context);
        if (context instanceof Activity)
        {
            b = new re((Activity)context, ongloballayoutlistener, onscrollchangedlistener);
            b.a();
            return;
        } else
        {
            b = null;
            return;
        }
    }
}
