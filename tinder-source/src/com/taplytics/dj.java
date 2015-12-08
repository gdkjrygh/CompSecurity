// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            cv, dk

final class dj
    implements android.view.View.OnTouchListener
{

    final cv a;

    dj(cv cv1)
    {
        a = cv1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!cv.m(a) && motionevent.getAction() == 1)
        {
            view = (TextView)cv.d(a).findViewById(0x17ccbc33);
            TextView textview = (TextView)cv.d(a).findViewById(0x17ccbc34);
            view.setText("Uploading view...");
            textview.setText("");
            Handler handler = new Handler();
            handler.postDelayed(new dk(this, textview, handler, motionevent, view, new Handler()), 50L);
        }
        return false;
    }
}
