// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class bgk extends omn
    implements mso
{

    private bgm ad;

    public bgk()
    {
        new msh(ah, (byte)0);
    }

    public static bgk a(long l, long l1, long l2)
    {
        return a(bgm.a, l, l1, l2);
    }

    private static bgk a(bgm bgm1, long l, long l1, long l2)
    {
        bgk bgk1 = new bgk();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", bgm1.ordinal());
        bundle.putLong("requested_size", l);
        bundle.putLong("available_size", l1);
        bundle.putLong("trash_size", l2);
        bgk1.f(bundle);
        return bgk1;
    }

    public static bgk b(long l, long l1, long l2)
    {
        return a(bgm.b, l, l1, l2);
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.q;
        long l1 = bundle.getLong("requested_size");
        long l2 = bundle.getLong("available_size");
        long l = bundle.getLong("trash_size");
        String s;
        if (ad == bgm.a)
        {
            s = af.getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_storage_error_title);
            l1 -= l2;
            l2 = oqm.e.b(l1) + 1L;
            if (l1 <= l)
            {
                bundle = String.format(af.getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_storage_error_trash_msg), new Object[] {
                    Long.valueOf(l2)
                });
            } else
            {
                bundle = String.format(af.getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_storage_error_msg), new Object[] {
                    Long.valueOf(l2)
                });
            }
        } else
        if (ad == bgm.b)
        {
            s = af.getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_storage_warning_title);
            bundle = af.getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_storage_warning_msg);
        } else
        {
            bundle = String.valueOf(ad);
            throw new IllegalStateException((new StringBuilder(String.valueOf(bundle).length() + 20)).append("Unknown DialogType: ").append(bundle).toString());
        }
        return (new android.app.AlertDialog.Builder(new ContextThemeWrapper(af, com.google.android.apps.consumerphotoeditor.R.style.Theme_AppCompat_Light))).setTitle(s).setMessage(bundle).setPositiveButton(0x104000a, null).setCancelable(true).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ag.a(mso, this);
        bundle = super.q;
        ad = bgm.values()[bundle.getInt("dialog_type")];
    }

    public final msm r()
    {
        switch (bgl.a[ad.ordinal()])
        {
        default:
            String s = String.valueOf(ad);
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 20)).append("Unknown DialogType: ").append(s).toString());

        case 1: // '\001'
            return new msm(pwu.D);

        case 2: // '\002'
            return new msm(pwu.E);
        }
    }
}
