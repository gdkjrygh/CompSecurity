// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

// Referenced classes of package com.roidapp.cloudlib.sns.main:
//            f

public class MainScrollView extends ScrollView
{

    private f a;
    private float b;
    private float c;

    public MainScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MainScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        if (a != null) goto _L2; else goto _L1
_L1:
        boolean flag = super.onInterceptTouchEvent(motionevent);
_L9:
        return flag;
_L2:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 54
    //                   1 48
    //                   2 65;
           goto _L3 _L4 _L3 _L5
_L3:
        return super.onInterceptTouchEvent(motionevent);
_L4:
        b = motionevent.getY();
          goto _L3
_L5:
        if (!a.a()) goto _L7; else goto _L6
_L6:
        c = motionevent.getY();
        flag = flag1;
        if (c - b <= 0.0F) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (!a.b()) goto _L9; else goto _L10
_L10:
        super.onInterceptTouchEvent(motionevent);
          goto _L3
_L7:
        return super.onInterceptTouchEvent(motionevent);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
    }
}
