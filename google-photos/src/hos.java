// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

final class hos
    implements android.content.DialogInterface.OnClickListener
{

    private hor a;

    hos(hor hor1)
    {
        a = hor1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        hor.a(a, i);
        dialoginterface = ((AlertDialog)((al) (a)).e).getButton(-1);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.setEnabled(flag);
    }
}
