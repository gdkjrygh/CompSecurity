// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Collection;

public final class ixn extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private hyw ad;
    private ixo ae;

    public ixn()
    {
    }

    public static ixn a(hyw hyw1, ixo ixo1)
    {
        Bundle bundle;
        boolean flag;
        if (hyw1.a.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Cannot permanently delete 0 medias.");
        p.b(ixo1, "Cannot permanently delete without a reason.");
        bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.trash.selected_media", hyw1);
        bundle.putSerializable("com.google.android.apps.photos.trash.skip_reason", ixo1);
        hyw1 = new ixn();
        hyw1.f(bundle);
        return hyw1;
    }

    public final Dialog c(Bundle bundle)
    {
        ad = (hyw)super.q.getParcelable("com.google.android.apps.photos.trash.selected_media");
        ae = (ixo)super.q.getSerializable("com.google.android.apps.photos.trash.skip_reason");
        Object obj = O_();
        int i = ad.a.size();
        Resources resources = ((Context) (obj)).getResources();
        if (ae == ixo.a)
        {
            bundle = resources.getQuantityString(b.Bt, i);
        } else
        {
            bundle = resources.getQuantityString(b.Bf, i);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj = new android.app.AlertDialog.Builder(((Context) (obj)), b.By);
        } else
        {
            obj = new android.app.AlertDialog.Builder(((Context) (obj)));
        }
        return ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(b.Bx, this).setNegativeButton(b.Bw, this).setTitle(resources.getQuantityString(b.Bp, i)).setMessage(bundle).setCancelable(false).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            ((iwx)ag.a(iwx)).a(ad, iww.a, gaw.c);
            // fall through

        case -2: 
            dialoginterface.dismiss();
            break;
        }
    }
}
