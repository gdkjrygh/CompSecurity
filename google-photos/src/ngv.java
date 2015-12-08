// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public final class ngv extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private nga ad;
    private mmv ae;
    private pur ai;

    public ngv()
    {
    }

    public static void a(ay ay, String s, int ai1[], boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putIntArray("account_ids", ai1);
        bundle.putBoolean("add_account_enabled", flag);
        s = new ngv();
        s.f(bundle);
        s.a(ay, "account.selector");
    }

    public final void au_()
    {
        super.au_();
        Object obj = super.e;
        if (obj == null)
        {
            return;
        }
        Resources resources = g();
        ((AlertDialog)obj).getListView().setDivider(null);
        ((Dialog) (obj)).findViewById(resources.getIdentifier("titleDivider", "id", "android")).setVisibility(8);
        obj = ((Dialog) (obj)).findViewById(resources.getIdentifier("title_template", "id", "android"));
        ((View) (obj)).setBackgroundColor(resources.getColor(q.bx));
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
        int j;
        int k;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            k = layoutparams.getMarginStart();
            j = layoutparams.getMarginEnd();
            layoutparams.setMarginStart(0);
            layoutparams.setMarginEnd(0);
        } else
        {
            k = layoutparams.leftMargin;
            j = layoutparams.rightMargin;
            layoutparams.setMargins(0, layoutparams.topMargin, 0, layoutparams.bottomMargin);
        }
        ((View) (obj)).setLayoutParams(layoutparams);
        ((View) (obj)).setPadding(k, ((View) (obj)).getPaddingTop(), j, ((View) (obj)).getPaddingBottom());
        j = resources.getIdentifier("alertTitle", "id", "android");
        ((TextView)super.e.findViewById(j)).setTypeface(null, 1);
    }

    public final Dialog c(Bundle bundle)
    {
        ContextThemeWrapper contextthemewrapper = new ContextThemeWrapper(O_(), b.Go);
        bundle = super.q;
        String s = bundle.getString("title");
        int ai1[] = bundle.getIntArray("account_ids");
        boolean flag = bundle.getBoolean("add_account_enabled");
        bundle = this;
        if (ai != null)
        {
            bundle = new pus(ai, "AccountSelection", this);
        }
        return (new android.app.AlertDialog.Builder(contextthemewrapper)).setTitle(s).setAdapter(new ngu(contextthemewrapper, ai1, flag), bundle).setCancelable(false).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (nga)ag.a(nga);
        ae = (mmv)ag.a(mmv);
        ai = (pur)ag.b(pur);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        ad.b();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        int ai1[] = super.q.getIntArray("account_ids");
        boolean flag1 = super.q.getBoolean("add_account_enabled");
        dialoginterface = (nga)ag.a(nga);
        boolean flag;
        if (flag1 && j == ai1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            j = ai1[j];
            if (!ae.c(j))
            {
                dialoginterface.b();
                return;
            } else
            {
                mmx mmx1 = ae.a(j);
                dialoginterface.a(mmx1.b("account_name"), mmx1.b("effective_gaia_id"));
                return;
            }
        } else
        {
            dialoginterface.a();
            return;
        }
    }
}
