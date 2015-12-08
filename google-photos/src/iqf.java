// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;

public final class iqf extends al
{

    private EditText ad;
    private Bundle ae;
    private AlertDialog af;
    private boolean ag;

    public iqf()
    {
    }

    static void a(iqf iqf1)
    {
        iqf1.ag = true;
        iqf1.a(false);
    }

    static AlertDialog b(iqf iqf1)
    {
        return iqf1.af;
    }

    public final void ak_()
    {
        if (super.e != null && super.K)
        {
            super.e.setDismissMessage(null);
        }
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        c(true);
        Object obj = new android.app.AlertDialog.Builder(O_());
        bundle = (ViewGroup)O_().getLayoutInflater().inflate(b.AN, null);
        ((android.app.AlertDialog.Builder) (obj)).setView(bundle).setPositiveButton(a(q.aR), new iqh(this)).setNegativeButton(a(q.aw), new iqg(this));
        af = ((android.app.AlertDialog.Builder) (obj)).create();
        obj = super.q;
        af.getWindow().setSoftInputMode(4);
        af.setOnShowListener(new iqi(this));
        ae = ((Bundle) (obj)).getBundle("passthrough_data");
        ad = (EditText)bundle.findViewById(s.aS);
        bundle = ((Bundle) (obj)).getString("text", "");
        ad.setText(bundle);
        ad.setLines(g().getInteger(b.AE));
        ad.setHorizontallyScrolling(false);
        ad.setSelection(bundle.length());
        ad.setHint(((Bundle) (obj)).getString("placeholder", ""));
        ad.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(((Bundle) (obj)).getInt("max_length", 500)), new iql()
        });
        boolean flag = ((Bundle) (obj)).getBoolean("allow_empty", true);
        ad.addTextChangedListener(new iqj(this, flag));
        ad.setOnEditorActionListener(new iqk(this));
        return af;
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (!ag)
        {
            super.r.a(super.t, 0, null);
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("text", ad.getText().toString());
            intent.putExtra("passthrough_data", ae);
            super.r.a(super.t, -1, intent);
        }
        super.onDismiss(dialoginterface);
    }
}
