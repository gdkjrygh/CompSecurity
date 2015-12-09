// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.MotionEvent;

// Referenced classes of package com.dominos.nina.persona:
//            NinaView, NinaBar

class <init> extends android.view.stener
{

    final NinaView this$0;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        boolean flag;
        if (f1 > 2.0F * Math.abs(f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!NinaView.access$100(NinaView.this).isEditing() && !isOpened() && flag)
        {
            listener._mth0();
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = NinaView.this;
        super();
    }

    >(> >)
    {
        this();
    }
}
