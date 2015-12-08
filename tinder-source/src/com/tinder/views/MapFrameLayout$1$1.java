// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.os.AsyncTask;
import android.view.MotionEvent;
import com.tinder.managers.a;

// Referenced classes of package com.tinder.views:
//            MapFrameLayout

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        a.a("Passport.MapMove");
    }

    nGestureListener()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/tinder/views/MapFrameLayout$1

/* anonymous class */
    class MapFrameLayout._cls1 extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final MapFrameLayout this$0;

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            int i = motionevent1.getActionMasked();
            if (i == 1 || i == 3)
            {
                AsyncTask.execute(new MapFrameLayout._cls1._cls1());
            }
            return true;
        }

            
            {
                this$0 = MapFrameLayout.this;
                super();
            }
    }

}
