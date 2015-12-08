// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class gxt extends al
    implements android.content.DialogInterface.OnClickListener
{

    public gxt()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(b.uU).setTitle(b.uV).setPositiveButton(b.uT, this).setNegativeButton(0x1040000, this).setCancelable(false);
        return bundle.create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        gxu gxu1 = (gxu)olm.a(O_(), this).a(gxu);
        switch (i)
        {
        default:
            return;

        case -1: 
            gxu1.a();
            // fall through

        case -2: 
            dialoginterface.dismiss();
            break;
        }
    }
}
