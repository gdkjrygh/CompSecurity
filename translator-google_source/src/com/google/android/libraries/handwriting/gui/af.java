// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.view.View;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            UIHandler, UndoButtonInterface, i, aa, 
//            c

public final class af
    implements android.view.View.OnClickListener
{

    final UIHandler a;

    public af(UIHandler uihandler)
    {
        a = uihandler;
        super();
    }

    public final void onClick(View view)
    {
        boolean flag;
        flag = false;
        view.performHapticFeedback(3);
        if (UIHandler.e(a).getState() == UndoButtonInterface.UndoButtonState.NONE)
        {
            a.h();
            return;
        }
        a.m = true;
        view = UIHandler.f(a);
        if (!((i) (view)).e.isEmpty()) goto _L2; else goto _L1
_L1:
        flag = ((i) (view)).i.e();
_L4:
        if (flag)
        {
            UIHandler.a(a, UndoButtonInterface.UndoButtonState.UNDO);
            a.a("");
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        view.d();
        if (!((i) (view)).e.isEmpty())
        {
            view.a(false);
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        a.a(UIHandler.g(a));
        if (UIHandler.h(a).a.size() == 0)
        {
            UIHandler.a(a, UndoButtonInterface.UndoButtonState.NONE);
            return;
        } else
        {
            UIHandler.a(a, UndoButtonInterface.UndoButtonState.BACK);
            return;
        }
    }
}
