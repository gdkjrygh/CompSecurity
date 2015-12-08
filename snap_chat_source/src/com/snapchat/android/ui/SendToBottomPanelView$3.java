// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.ui:
//            SendToBottomPanelView

final class a
    implements android.view.anelView._cls3
{

    private a a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view = (TextView)view;
        CharSequence charsequence = view.getText();
        if (motionevent.getActionMasked() != 1)
        {
            return true;
        }
        int i = view.getOffsetForPosition(motionevent.getX(), motionevent.getY());
        if (i < 0 || i >= charsequence.length())
        {
            return false;
        } else
        {
            a.a(Integer.valueOf(i));
            return false;
        }
    }

    ( )
    {
        a = ;
        super();
    }
}
