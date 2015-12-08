// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

public final class dsq extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private ixe ad;
    private fnp ae;

    public dsq()
    {
    }

    public static dsq a(hyw hyw1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_media", hyw1);
        hyw1 = new dsq();
        hyw1.f(bundle);
        return hyw1;
    }

    public final Dialog c(Bundle bundle)
    {
        byte byte0 = 8;
        Object obj = (hyw)super.q.getParcelable("selected_media");
        bundle = ((hyw) (obj)).a.iterator();
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2;
        boolean flag3;
        do
        {
            flag2 = flag;
            flag3 = flag1;
            if (!bundle.hasNext())
            {
                break;
            }
            gej gej1 = (gej)((ekp)bundle.next()).a(gej);
            if (gej1.n())
            {
                flag1 = true;
            }
            if (gej1.o())
            {
                flag = true;
            }
            if (!flag1 || !flag)
            {
                continue;
            }
            flag3 = flag1;
            flag2 = flag;
            break;
        } while (true);
        bundle = View.inflate(af, b.jd, null);
        TextView textview = (TextView)bundle.findViewById(p.f);
        int j;
        if (flag3 && flag2)
        {
            j = b.jm;
        } else
        if (flag3)
        {
            j = b.jn;
        } else
        if (flag2)
        {
            j = b.jr;
        } else
        {
            throw new IllegalArgumentException("items are not from drive or shared.");
        }
        textview.setText(j);
        ((TextView)bundle.findViewById(p.a)).setText(af.getResources().getQuantityString(b.jg, ((hyw) (obj)).a.size()));
        obj = bundle.findViewById(p.b);
        if (flag3)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((View) (obj)).setVisibility(j);
        obj = bundle.findViewById(p.c);
        j = byte0;
        if (flag2)
        {
            j = 0;
        }
        ((View) (obj)).setVisibility(j);
        obj = (TextView)bundle.findViewById(p.d);
        ae.a(((TextView) (obj)), a(b.jq), fnl.f);
        ((TextView) (obj)).setMovementMethod(LinkMovementMethod.getInstance());
        return (new android.app.AlertDialog.Builder(af)).setPositiveButton(b.jl, this).setNegativeButton(b.jk, this).setView(bundle).setCancelable(false).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (ixe)ag.a(ixe);
        ae = (fnp)ag.a(fnp);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        switch (j)
        {
        default:
            return;

        case -1: 
            hyw hyw1 = (hyw)super.q.getParcelable("selected_media");
            ad.b(hyw1);
            // fall through

        case -2: 
            dialoginterface.dismiss();
            return;
        }
    }
}
