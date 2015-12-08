// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import java.text.NumberFormat;

public final class ido extends omn
{

    private iee ad;
    private NumberFormat ae;

    public ido()
    {
    }

    public static final ido h(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_share_by_link", flag);
        ido ido1 = new ido();
        ido1.f(bundle);
        return ido1;
    }

    public final Dialog c(Bundle bundle)
    {
        boolean flag = super.q.getBoolean("is_share_by_link");
        bundle = O_().getResources();
        if (flag)
        {
            bundle = bundle.getString(b.yO, new Object[] {
                ae.format(1500L)
            });
        } else
        {
            bundle = bundle.getString(b.yN, new Object[] {
                ae.format(200L), ae.format(1500L)
            });
        }
        return (new android.app.AlertDialog.Builder(O_())).setTitle(b.yP).setMessage(bundle).setPositiveButton(0x104000a, null).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (iee)ag.a(iee);
        ae = NumberFormat.getIntegerInstance();
    }
}
