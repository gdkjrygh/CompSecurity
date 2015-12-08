// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.Button;

final class iqi
    implements android.content.DialogInterface.OnShowListener
{

    private iqf a;

    iqi(iqf iqf1)
    {
        a = iqf1;
        super();
    }

    public final void onShow(DialogInterface dialoginterface)
    {
        iqf.b(a).getButton(-2).setTextColor(a.g().getColor(af.P));
        iqf.b(a).getButton(-1).setTextColor(a.g().getColor(af.P));
    }
}
