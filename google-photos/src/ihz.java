// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ihz extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private ekq ad;

    public ihz()
    {
    }

    public static ihz a(ekq ekq1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_shared_link", ekq1);
        ekq1 = new ihz();
        ekq1.f(bundle);
        return ekq1;
    }

    public final Dialog c(Bundle bundle)
    {
        ad = (ekq)super.q.getParcelable("selected_shared_link");
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(b.zJ).setTitle(b.zK).setPositiveButton(b.zI, this).setNegativeButton(0x1040000, this);
        return bundle.create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            ((iia)ag.a(iia)).a(ad);
            // fall through

        case -2: 
            dialoginterface.dismiss();
            break;
        }
    }
}
