// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.a;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class e
    implements android.view.View.OnTouchListener
{
    private final class a extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final e a;

        public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            f1 = motionevent1.getX() - motionevent.getX();
            float f2 = motionevent1.getY();
            float f3 = motionevent.getY();
            if (Math.abs(f1) > Math.abs(f2 - f3) && Math.abs(f1) > 120F && Math.abs(f) > 90F)
            {
                if (f1 > 0.0F)
                {
                    a.b();
                } else
                {
                    a.a();
                }
                return true;
            } else
            {
                return false;
            }
        }

        private a()
        {
            a = e.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final GestureDetector a;

    public e(Context context)
    {
        a = new GestureDetector(context, new a((byte)0));
    }

    public void a()
    {
    }

    public void b()
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }
}
