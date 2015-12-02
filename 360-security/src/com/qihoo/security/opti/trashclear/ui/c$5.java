// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.DialogInterface;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            c

class a
    implements android.content.ogInterface.OnDismissListener
{

    final c a;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (a.i != null)
        {
            a.i.b();
        }
    }

    istener(c c1)
    {
        a = c1;
        super();
    }
}
