// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.view;

import android.content.Context;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ListView;

public class AppBoxListView extends ListView
{
    class a extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final AppBoxListView a;

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (f1 != 0.0F)
            {
                if (f == 0.0F);
            }
            return Math.abs(f1) >= Math.abs(f);
        }

        a()
        {
            a = AppBoxListView.this;
            super();
        }
    }


    protected final int a;
    protected final GestureDetector b;

    public AppBoxListView(Context context)
    {
        this(context, null);
    }

    public AppBoxListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AppBoxListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = z.a(ViewConfiguration.get(context));
        b = new GestureDetector(new a());
    }
}
