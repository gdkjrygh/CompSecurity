// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            a, ValidatingEditText

public class b extends a
{

    private ValidatingEditText a;

    public b(ValidatingEditText validatingedittext)
    {
        super(validatingedittext);
        a = validatingedittext;
    }

    public boolean a(a.a a1, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            if (a.a())
            {
                a.setErrorPressed(true);
                a.refreshDrawableState();
            }
        } else
        if (motionevent.getAction() == 1 && a.a() && a1 == a.a.a)
        {
            a.setErrorPressed(false);
            a.refreshDrawableState();
            return false;
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return super.onTouch(view, motionevent);
    }
}
