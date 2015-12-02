// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.b.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.p;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.e;
import com.facebook.zero.a.c;
import com.google.common.base.Preconditions;
import java.util.UUID;

// Referenced classes of package com.facebook.zero.ui:
//            i, j, k

public class ExtraChargesDialog extends DialogFragment
    implements d
{

    private com.facebook.prefs.shared.d Z;
    private av aa;
    private TextView ab;
    private TextView ac;
    private Button ad;
    private Button ae;
    private CheckBox af;
    private Dialog ag;
    private com.facebook.zero.ui.k ah;
    private ae ai;
    private String aj;
    private String ak;
    private String al;
    private Parcelable am;
    private String an;

    public ExtraChargesDialog()
    {
    }

    public ExtraChargesDialog(ae ae1, String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", s);
        bundle.putString("dialogContent", s1);
        bundle.putString("dialogName", com.facebook.zero.a.c.a(ae1));
        bundle.putString("dialogCheckboxPreference", ae1.b(aj.a));
        g(bundle);
    }

    private void O()
    {
        Preconditions.checkNotNull(ai);
        boolean flag;
        if (!af.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Z.b().a(ai, flag).a();
        if (!flag)
        {
            aa.a((new cb("dismiss")).a(g_()).h(an).g("zero_extra_charges_dialog_persist_dismiss").b("dialogName", al));
        }
        ag.dismiss();
    }

    static com.facebook.zero.ui.k a(ExtraChargesDialog extrachargesdialog)
    {
        return extrachargesdialog.ah;
    }

    static String b(ExtraChargesDialog extrachargesdialog)
    {
        return extrachargesdialog.al;
    }

    static String c(ExtraChargesDialog extrachargesdialog)
    {
        return extrachargesdialog.an;
    }

    static av d(ExtraChargesDialog extrachargesdialog)
    {
        return extrachargesdialog.aa;
    }

    static Parcelable e(ExtraChargesDialog extrachargesdialog)
    {
        return extrachargesdialog.am;
    }

    static Dialog f(ExtraChargesDialog extrachargesdialog)
    {
        return extrachargesdialog.ag;
    }

    static void g(ExtraChargesDialog extrachargesdialog)
    {
        extrachargesdialog.O();
    }

    public ExtraChargesDialog a(Parcelable parcelable)
    {
        am = parcelable;
        return this;
    }

    public ExtraChargesDialog a(com.facebook.zero.ui.k k1)
    {
        ah = k1;
        return this;
    }

    public Dialog c(Bundle bundle)
    {
        super.c(bundle);
        Object obj = t.a(n());
        Z = (com.facebook.prefs.shared.d)((t) (obj)).a(com/facebook/prefs/shared/d);
        aa = (av)((t) (obj)).a(com/facebook/analytics/av);
        Bundle bundle1 = k();
        if (bundle1 != null)
        {
            aj = bundle1.getString("dialogTitle");
            ak = bundle1.getString("dialogContent");
            al = bundle1.getString("dialogName");
            ai = (ae)aj.a.c(bundle1.getString("dialogCheckboxPreference"));
        }
        obj = ((LayoutInflater)((t) (obj)).a(android/view/LayoutInflater)).inflate(k.extra_data_charges_dialog, null);
        ab = (TextView)((View) (obj)).findViewById(i.dialog_title);
        ac = (TextView)((View) (obj)).findViewById(i.dialog_text);
        ad = (Button)((View) (obj)).findViewById(i.cancel_button);
        ae = (Button)((View) (obj)).findViewById(i.confirm_button);
        af = (CheckBox)((View) (obj)).findViewById(i.disable_reminder_checkbox);
        ab.setText(aj);
        ac.setText(ak);
        ag = new Dialog(n(), p.ZeroModalDialog);
        ag.setContentView(((View) (obj)));
        ad.setOnClickListener(new com.facebook.zero.ui.i(this));
        ae.setOnClickListener(new j(this));
        if (bundle != null)
        {
            am = bundle.getParcelable("extra_data");
            af.setChecked(bundle.getBoolean("dialogCheckboxKey"));
            an = bundle.getString("uuid");
        } else
        {
            an = com.facebook.common.h.a.a().toString();
        }
        aa.a((new cb("click")).a(g_()).f("button").h(an).g("zero_extra_charges_dialog_open").b("dialogName", al));
        com.facebook.base.b.a.a(ag);
        return ag;
    }

    public void e(Bundle bundle)
    {
        if (am != null)
        {
            bundle.putParcelable("extra_data", am);
        }
        bundle.putString("uuid", an);
        bundle.putBoolean("dialogCheckboxKey", af.isChecked());
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ZERO_EXTRA_CHARGES_DIALOG;
    }
}
