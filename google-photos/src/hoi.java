// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class hoi extends al
    implements android.content.DialogInterface.OnClickListener
{

    public hoi()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.eb).setMessage(c.ea).setPositiveButton(c.ed, this).setNegativeButton(c.ec, this).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 27;
           goto _L1 _L2
_L1:
        dialoginterface.dismiss();
        return;
_L2:
        ((dhs)olm.a(O_(), dhs)).a();
        if (true) goto _L1; else goto _L3
_L3:
    }
}
