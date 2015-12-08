// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;

final class chd
    implements android.content.DialogInterface.OnClickListener
{

    private chc a;

    chd(chc chc1)
    {
        a = chc1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(false);
        dialoginterface = a.O_();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }
}
