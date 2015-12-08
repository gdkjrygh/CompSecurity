// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cocosw.undobar;

import android.view.View;

// Referenced classes of package com.cocosw.undobar:
//            UndoBarController

final class c
    implements android.view.View.OnClickListener
{

    final UndoBarController a;

    c(UndoBarController undobarcontroller)
    {
        a = undobarcontroller;
        super();
    }

    public final void onClick(View view)
    {
        if (UndoBarController.a(a) != null)
        {
            UndoBarController.a(a).onUndo(UndoBarController.b(a));
        }
        if (UndoBarController.c(a))
        {
            UndoBarController.a(a, true);
            return;
        } else
        {
            UndoBarController.a(a, false);
            return;
        }
    }
}
