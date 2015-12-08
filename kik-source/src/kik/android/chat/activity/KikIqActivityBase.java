// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import kik.a.e.f;
import kik.a.f.f.y;
import kik.a.f.f.z;
import kik.a.f.j;
import kik.android.chat.a;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.chat.activity:
//            KikActivityBase, ah, ai

public abstract class KikIqActivityBase extends KikActivityBase
    implements j
{

    private static final b f = c.a("KikIqActivityBase");
    private y a;
    private Dialog e;
    protected String h;
    protected String i;
    protected f j;

    public KikIqActivityBase()
    {
        a = null;
        e = null;
        h = "";
        i = "";
    }

    private void a(Dialog dialog)
    {
        if (c())
        {
            if (e != null)
            {
                e.dismiss();
                e = null;
            }
            if (dialog != null)
            {
                e = dialog;
                dialog.show();
            }
        }
    }

    static void a(KikIqActivityBase kikiqactivitybase, String s, String s1)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(kikiqactivitybase)).create();
        alertdialog.setTitle(s);
        alertdialog.setMessage(s1);
        alertdialog.setButton(kikiqactivitybase.getString(0x7f090193), new ah(kikiqactivitybase, alertdialog));
        kikiqactivitybase.a(((Dialog) (alertdialog)));
    }

    protected final void a()
    {
        a(((Dialog) (null)));
    }

    protected final void a(String s)
    {
        ProgressDialog progressdialog = new ProgressDialog(this);
        progressdialog.setProgressStyle(0);
        progressdialog.setMessage(s);
        progressdialog.setCancelable(false);
        a(((Dialog) (progressdialog)));
    }

    protected void a(z z)
    {
    }

    public final void a(z z, int k)
    {
        if (z.equals(a))
        {
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            default:
                return;

            case 2: // '\002'
                a(z);
                a(((Dialog) (null)));
                a = null;
                return;

            case 3: // '\003'
                break;
            }
            if (b(z))
            {
                runOnUiThread(new ai(this));
            }
            a = null;
            return;
        } else
        {
            (new StringBuilder("Dropping unexpected iq: ")).append(z);
            return;
        }
    }

    protected boolean b(z z)
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((a)getApplication()).a().a(this);
        h = getString(0x7f0902ba);
        i = getString(0x7f090383);
    }

    protected void onPause()
    {
        if (e != null)
        {
            e.cancel();
        }
        super.onPause();
    }

}
