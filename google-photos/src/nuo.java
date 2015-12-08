// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class nuo extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private nur ad;

    public nuo()
    {
    }

    public static void a(am am1, nup nup1)
    {
        a(am1.h(), nup1);
    }

    private static void a(ay ay, nup nup1)
    {
        nuq nuq1 = new nuq();
        nuq1.a = nup1;
        nuq1.d = true;
        a(ay, nuq1);
    }

    public static void a(ay ay, nuq nuq1)
    {
        nuo nuo1 = new nuo();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_offline_bundle", nuq1.b);
        bundle.putString("extra_offline_dialog_tag", nuq1.c);
        bundle.putString("extra_offline_action", nuq1.a.toString());
        bundle.putBoolean("extra_offline_is_flaky", nuq1.d);
        bundle.putBoolean("extra_offline_show_retry_button", nuq1.e);
        nuo1.f(bundle);
        nuo1.a(ay, "offline_dialog");
    }

    public static boolean a(am am1, Exception exception, nup nup1)
    {
        return a(am1.h(), exception, nup1);
    }

    public static boolean a(am am1, mue mue1, nup nup1)
    {
        if (mue1 == null)
        {
            return false;
        } else
        {
            return a(am1.h(), mue1.c, nup1);
        }
    }

    public static boolean a(ar ar1, mue mue1, nup nup1)
    {
        if (mue1 == null)
        {
            return false;
        } else
        {
            return a(ar1.c(), mue1.c, nup1);
        }
    }

    private static boolean a(ay ay, Exception exception, nup nup1)
    {
        if (exception != null && nxx.a(exception))
        {
            a(ay, nup1);
            return true;
        } else
        {
            return false;
        }
    }

    public final Dialog c(Bundle bundle)
    {
        boolean flag = super.q.getBoolean("extra_offline_is_flaky");
        boolean flag1 = super.q.getBoolean("extra_offline_show_retry_button");
        bundle = nup.valueOf(super.q.getString("extra_offline_action"));
        android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(af)).setIcon(q.by);
        int j;
        if (flag)
        {
            j = b.HI;
        } else
        {
            j = b.HF;
        }
        builder = builder.setTitle(j);
        if (bundle == null)
        {
            bundle = g().getString(b.HH);
        } else
        {
            Resources resources;
            int k;
            int l;
            if (flag)
            {
                k = b.Hp;
            } else
            {
                k = b.GX;
            }
            resources = g();
            l = ((nup) (bundle)).G;
            bundle = resources.getString(k, new Object[] {
                g().getString(l)
            });
        }
        bundle = builder.setMessage(bundle);
        if (flag1)
        {
            bundle.setPositiveButton(b.HG, this).setNegativeButton(0x1040000, this);
        } else
        {
            bundle.setPositiveButton(0x104000a, this);
        }
        return bundle.create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (nur)ag.a(nur);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface = (Bundle)super.q.getParcelable("extra_offline_bundle");
        Object obj = super.q.getString("extra_offline_dialog_tag");
        if (j == -1 && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = (Set)ad.a.get(obj);
            if (obj != null)
            {
                for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((nus)((Iterator) (obj)).next()).c_(dialoginterface)) { }
            }
        }
    }
}
