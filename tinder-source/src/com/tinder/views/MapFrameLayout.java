// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.view.e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tinder.managers.a;

public class MapFrameLayout extends FrameLayout
{

    private e mGestureDetector;
    private android.view.GestureDetector.SimpleOnGestureListener mSimpleOnGestureListener;

    public MapFrameLayout(Context context)
    {
        super(context);
        init();
    }

    public MapFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public MapFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        mSimpleOnGestureListener = new android.view.GestureDetector.SimpleOnGestureListener() {

            final MapFrameLayout this$0;

            public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                int i = motionevent1.getActionMasked();
                if (i == 1 || i == 3)
                {
                    AsyncTask.execute(new Runnable() {

                        final _cls1 this$1;

                        public void run()
                        {
                            a.a("Passport.MapMove");
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }
                return true;
            }

            
            {
                this$0 = MapFrameLayout.this;
                super();
            }
        };
        mGestureDetector = new e(getContext(), mSimpleOnGestureListener);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        mGestureDetector.a(motionevent);
        return super.dispatchTouchEvent(motionevent);
    }
}
