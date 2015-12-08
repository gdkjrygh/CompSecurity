// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.MotionEvent;

// Referenced classes of package com.pandora.android.view:
//            b, ValidatingEditText

class a extends b
{

    final ValidatingEditText a;

    public boolean a(a a1, MotionEvent motionevent)
    {
        super.a(a1, motionevent);
        if (motionevent.getAction() == 0)
        {
            if (a1 == a)
            {
                if (!a.c() && !a.b())
                {
                    a.d();
                    a.setError(true);
                }
            } else
            if (a1 == tError)
            {
                a.setText("");
                return true;
            }
        }
        return true;
    }

    (ValidatingEditText validatingedittext, ValidatingEditText validatingedittext1)
    {
        a = validatingedittext;
        super(validatingedittext1);
    }
}
