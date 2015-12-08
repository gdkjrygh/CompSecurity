// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.drawable.LevelListDrawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.roidapp.photogrid.release:
//            ga

final class gb
    implements android.view.View.OnTouchListener
{

    float a;
    float b;
    final LevelListDrawable c;
    final ga d;

    gb(ga ga1, LevelListDrawable levellistdrawable)
    {
        d = ga1;
        c = levellistdrawable;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        int l;
        i = view.getWidth();
        l = view.getHeight();
        j = c.getIntrinsicWidth();
        k = c.getIntrinsicHeight();
        l = l / 2 - k / 2;
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 68
    //                   0 70
    //                   1 158;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        a = motionevent.getX();
        b = motionevent.getY();
        if (a > (float)(i - j) && a < (float)i && b > (float)l && b < (float)(l + k) && c.getLevel() != 1)
        {
            c.setLevel(1);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        if (c.getLevel() != 0)
        {
            c.setLevel(0);
        }
        if (f - a <= (float)j && f1 - b <= (float)k && f > (float)(i - j) && f < (float)i && f1 > (float)l && f1 < (float)(l + k))
        {
            ga.a(d).getText().clear();
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
