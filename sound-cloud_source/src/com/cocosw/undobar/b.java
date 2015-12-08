// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cocosw.undobar;


// Referenced classes of package com.cocosw.undobar:
//            UndoBarController

final class b
    implements Runnable
{

    final UndoBarController a;

    b(UndoBarController undobarcontroller)
    {
        a = undobarcontroller;
        super();
    }

    public final void run()
    {
        if (UndoBarController.a(a) instanceof UndoBarController.a)
        {
            UndoBarController.a(a);
            UndoBarController.b(a);
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
