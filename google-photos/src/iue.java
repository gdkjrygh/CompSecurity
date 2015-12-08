// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class iue extends al
{

    public iue()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(super.q.getString("text")).setNeutralButton(q.aB, new iuf(this));
        return bundle.create();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.r.a(super.t, -1, null);
        super.onDismiss(dialoginterface);
    }
}
