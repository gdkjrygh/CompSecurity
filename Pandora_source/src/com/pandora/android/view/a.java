// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public abstract class com.pandora.android.view.a
    implements android.view.View.OnTouchListener
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/view/a$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("left", 0);
            b = new a("top", 1);
            c = new a("right", 2);
            d = new a("bootom", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private Drawable a[];
    private int b;

    public com.pandora.android.view.a(TextView textview)
    {
        b = 10;
        if (textview != null)
        {
            a = textview.getCompoundDrawables();
        }
    }

    public abstract boolean a(a a1, MotionEvent motionevent);

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1 = false;
        if (motionevent.getAction() == 0) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (motionevent.getAction() != 1) goto _L3; else goto _L2
_L2:
        flag = flag1;
        if (a == null) goto _L3; else goto _L4
_L4:
        Drawable drawable;
        Object obj;
        int j;
        int k;
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        drawable = a[a.a.ordinal()];
        obj = a[a.c.ordinal()];
        if (drawable == null) goto _L6; else goto _L5
_L5:
        Rect rect = drawable.getBounds();
        if (j < view.getPaddingLeft() - b || j > rect.width() + b || k < view.getPaddingTop() - b || k > (view.getHeight() - view.getPaddingBottom()) + b) goto _L6; else goto _L7
_L7:
        flag = a(a.a, motionevent);
_L3:
        return flag;
_L6:
        flag = flag1;
        if (obj != null)
        {
            obj = ((Drawable) (obj)).getBounds();
            int i;
            if (drawable != null)
            {
                i = drawable.getBounds().width();
            } else
            {
                i = 0;
            }
            flag = flag1;
            if (j >= view.getRight() - ((Rect) (obj)).width() - i - b)
            {
                flag = flag1;
                if (j <= (view.getRight() - view.getPaddingRight()) + b)
                {
                    flag = flag1;
                    if (k >= view.getPaddingTop() - b)
                    {
                        flag = flag1;
                        if (k <= (view.getHeight() - view.getPaddingBottom()) + b)
                        {
                            return a(a.c, motionevent);
                        }
                    }
                }
            }
        }
        if (true) goto _L3; else goto _L8
_L8:
    }
}
