// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.translate.l;
import com.google.android.libraries.handwriting.gui.UndoButtonInterface;

// Referenced classes of package com.google.android.apps.translate.widget:
//            u

public class HandwritingUndoButton extends UndoButtonInterface
{

    private com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState a;

    public HandwritingUndoButton(Context context)
    {
        super(context);
    }

    public HandwritingUndoButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public HandwritingUndoButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState getState()
    {
        return a;
    }

    public void setState(com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState undobuttonstate)
    {
        a = undobuttonstate;
        switch (u.a[undobuttonstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            setImageResource(l.ic_undo_black_24dp);
            break;
        }
    }
}
