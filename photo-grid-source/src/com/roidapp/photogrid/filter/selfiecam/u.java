// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            o

final class u
    implements android.view.View.OnTouchListener
{

    final PopupWindow a;
    final o b;

    u(o o, PopupWindow popupwindow)
    {
        b = o;
        a = popupwindow;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.dismiss();
        return true;
    }
}
