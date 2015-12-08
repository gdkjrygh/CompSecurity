// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm

class bq
    implements android.view.View.OnTouchListener
{

    boolean a;
    final bm b;

    bq(bm bm)
    {
        b = bm;
        super();
        a = false;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        view = (VideoView)view;
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (a)
        {
            view.pause();
            return false;
        } else
        {
            view.start();
            return false;
        }
    }
}
