// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Collection;

public final class fwj extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private hyw ad;

    public fwj()
    {
    }

    public static fwj a(hyw hyw1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_media", hyw1);
        hyw1 = new fwj();
        hyw1.f(bundle);
        return hyw1;
    }

    public final Dialog c(Bundle bundle)
    {
        ad = (hyw)super.q.getParcelable("selected_media");
        int i = ad.a.size();
        bundle = O_();
        Object obj = bundle.getResources();
        String s = ((Resources) (obj)).getQuantityString(b.qE, i);
        obj = ((Resources) (obj)).getString(b.qJ);
        return (new android.app.AlertDialog.Builder(bundle)).setTitle(s).setMessage(((CharSequence) (obj))).setPositiveButton(b.qI, this).setNegativeButton(0x1040000, this).setCancelable(false).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            ((iwx)olm.a(O_(), iwx)).a(ad, iww.b, gaw.a);
            // fall through

        case -2: 
            dialoginterface.dismiss();
            break;
        }
    }
}
