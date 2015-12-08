// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

final class hot
    implements android.content.DialogInterface.OnShowListener
{

    private hor a;

    hot(hor hor1)
    {
        a = hor1;
        super();
    }

    public final void onShow(DialogInterface dialoginterface)
    {
        dialoginterface = ((AlertDialog)((al) (a)).e).getButton(-1);
        boolean flag;
        if (hor.a(a) >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.setEnabled(flag);
    }
}
