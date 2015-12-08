// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class enx extends al
    implements android.content.DialogInterface.OnClickListener
{

    public enx()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(b.mA).setMessage(b.mz).setPositiveButton(0x104000a, this).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        O_().finish();
    }
}
