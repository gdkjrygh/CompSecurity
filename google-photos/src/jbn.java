// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Collection;

public final class jbn extends al
    implements android.content.DialogInterface.OnClickListener
{

    private hyw ad;

    public jbn()
    {
    }

    public static jbn a(hyw hyw1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_media", hyw1);
        hyw1 = new jbn();
        hyw1.f(bundle);
        return hyw1;
    }

    public final Dialog c(Bundle bundle)
    {
        ad = (hyw)super.q.getParcelable("selected_media");
        int i = b.BG;
        int j = b.BF;
        int k = ad.a.size();
        return (new android.app.AlertDialog.Builder(O_())).setTitle(g().getQuantityString(i, k)).setMessage(g().getQuantityString(j, k, new Object[] {
            Integer.valueOf(k)
        })).setPositiveButton(b.BJ, this).setNegativeButton(b.BI, this).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            ((iwx)olm.a(O_(), iwx)).a(ad, iww.a, gaw.c);
            // fall through

        case -2: 
            dialoginterface.dismiss();
            break;
        }
    }
}
