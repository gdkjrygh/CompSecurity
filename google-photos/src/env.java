// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class env extends omn
    implements android.content.DialogInterface.OnClickListener
{

    public env()
    {
    }

    public static env a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("error_message", s);
        s = new env();
        s.f(bundle);
        return s;
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.q.getString("error_message");
        return (new android.app.AlertDialog.Builder(af)).setTitle(b.my).setMessage(bundle).setPositiveButton(0x104000a, this).setCancelable(false).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
