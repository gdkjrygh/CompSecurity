// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.os.AsyncTask;
import android.view.MotionEvent;
import com.tinder.managers.a;

// Referenced classes of package com.tinder.views:
//            MapFrameLayout

class r extends android.view.impleOnGestureListener
{

    final MapFrameLayout this$0;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        int i = motionevent1.getActionMasked();
        if (i == 1 || i == 3)
        {
            AsyncTask.execute(new Runnable() {

                final MapFrameLayout._cls1 this$1;

                public void run()
                {
                    a.a("Passport.MapMove");
                }

            
            {
                this$1 = MapFrameLayout._cls1.this;
                super();
            }
            });
        }
        return true;
    }

    _cls1.this._cls1()
    {
        this$0 = MapFrameLayout.this;
        super();
    }
}
