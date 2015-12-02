// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.p;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

// Referenced classes of package com.facebook.orca.emoji:
//            ComposerPopup, b

class a extends Dialog
{

    final ComposerPopup a;

    a(ComposerPopup composerpopup, Context context, int i)
    {
        a = composerpopup;
        super(context, i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 4)
        {
            p p1 = a.m();
            if (ComposerPopup.a(a) != null && p1 != null)
            {
                Rect rect = new Rect();
                p1.c().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i = motionevent.getAction();
                float f1 = motionevent.getY();
                float f;
                if (a.ad)
                {
                    f = motionevent.getY() + (float)a.aa + (float)rect.top;
                } else
                {
                    f = (float)(rect.bottom - (a.ab + a.aa)) + motionevent.getY();
                }
                motionevent.setAction(0);
                motionevent.setLocation(motionevent.getX(), f);
                if (ComposerPopup.a(a).a(motionevent))
                {
                    return true;
                }
                motionevent.setAction(i);
                motionevent.setLocation(motionevent.getX(), f1);
                ComposerPopup.a(a).a();
            }
            a.a("popup_dismiss_outside_click");
            dismiss();
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
