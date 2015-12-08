// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class dsl extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private hyw ad;

    public dsl()
    {
    }

    public static dsl a(hyw hyw1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_media", hyw1);
        hyw1 = new dsl();
        hyw1.f(bundle);
        return hyw1;
    }

    private void r()
    {
        ((iwx)olm.a(O_(), iwx)).a(ad, iww.b, gaw.a);
    }

    public final Dialog c(Bundle bundle)
    {
        ad = (hyw)super.q.getParcelable("selected_media");
        int k = ad.a.size();
        Resources resources = af.getResources();
        String s = resources.getQuantityString(b.ji, k);
        Iterator iterator = ad.a.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            int j;
            if (((gax)((ekp)iterator.next()).a(gax)).q().contains(gav.b))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            i = j + i;
        }
        if (i == k)
        {
            r();
            a(false);
            return super.c(bundle);
        }
        if (i == 0)
        {
            bundle = resources.getQuantityString(b.jj, k);
        } else
        {
            bundle = resources.getString(b.jt);
        }
        return (new android.app.AlertDialog.Builder(af)).setTitle(s).setMessage(bundle).setPositiveButton(b.js, this).setNegativeButton(0x1040000, this).setCancelable(false).create();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            r();
            // fall through

        case -2: 
            dialoginterface.dismiss();
            break;
        }
    }
}
