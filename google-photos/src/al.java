// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class al extends am
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

    public int a;
    private int ad;
    public boolean b;
    public boolean c;
    public int d;
    public Dialog e;
    public boolean f;
    public boolean g;
    public boolean h;

    public al()
    {
        ad = 0;
        a = 0;
        b = true;
        c = true;
        d = -1;
    }

    public final void a(int i, int j)
    {
        ad = i;
        if (ad == 2 || ad == 3)
        {
            a = 0x1030059;
        }
        if (j != 0)
        {
            a = j;
        }
    }

    public void a(Activity activity)
    {
        super.a(activity);
        if (!h)
        {
            g = false;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        boolean flag;
        if (G == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (bundle != null)
        {
            ad = bundle.getInt("android:style", 0);
            a = bundle.getInt("android:theme", 0);
            b = bundle.getBoolean("android:cancelable", true);
            c = bundle.getBoolean("android:showsDialog", c);
            d = bundle.getInt("android:backStackId", -1);
        }
    }

    public void a(ay ay1, String s)
    {
        g = false;
        h = true;
        ay1 = ay1.a();
        ay1.a(this, s);
        ay1.b();
    }

    public final void a(boolean flag)
    {
        if (g)
        {
            return;
        }
        g = true;
        h = false;
        if (e != null)
        {
            e.dismiss();
            e = null;
        }
        f = true;
        if (d >= 0)
        {
            super.B.a(d, 1);
            d = -1;
            return;
        }
        bp bp1 = super.B.a();
        bp1.a(this);
        if (flag)
        {
            bp1.c();
            return;
        } else
        {
            bp1.b();
            return;
        }
    }

    public void aj_()
    {
        super.aj_();
        if (e != null)
        {
            e.hide();
        }
    }

    public void ak_()
    {
        super.ak_();
        if (e != null)
        {
            f = true;
            e.dismiss();
            e = null;
        }
    }

    public void au_()
    {
        super.au_();
        if (e != null)
        {
            f = false;
            e.show();
        }
    }

    public LayoutInflater b(Bundle bundle)
    {
        if (!c)
        {
            return super.b(bundle);
        }
        e = c(bundle);
        if (e == null) goto _L2; else goto _L1
_L1:
        bundle = e;
        ad;
        JVM INSTR tableswitch 1 3: default 64
    //                   1 89
    //                   2 89
    //                   3 80;
           goto _L3 _L4 _L4 _L5
_L3:
        return (LayoutInflater)e.getContext().getSystemService("layout_inflater");
_L5:
        bundle.getWindow().addFlags(24);
_L4:
        bundle.requestWindowFeature(1);
        if (true) goto _L3; else goto _L2
_L2:
        return (LayoutInflater)C.b.getSystemService("layout_inflater");
    }

    public final void b(boolean flag)
    {
        b = flag;
        if (e != null)
        {
            e.setCancelable(flag);
        }
    }

    public Dialog c(Bundle bundle)
    {
        return new Dialog(O_(), a);
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (c)
        {
            View view = super.R;
            if (view != null)
            {
                if (view.getParent() != null)
                {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                e.setContentView(view);
            }
            e.setOwnerActivity(O_());
            e.setCancelable(b);
            e.setOnCancelListener(this);
            e.setOnDismissListener(this);
            if (bundle != null)
            {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null)
                {
                    e.onRestoreInstanceState(bundle);
                    return;
                }
            }
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (e != null)
        {
            Bundle bundle1 = e.onSaveInstanceState();
            if (bundle1 != null)
            {
                bundle.putBundle("android:savedDialogState", bundle1);
            }
        }
        if (ad != 0)
        {
            bundle.putInt("android:style", ad);
        }
        if (a != 0)
        {
            bundle.putInt("android:theme", a);
        }
        if (!b)
        {
            bundle.putBoolean("android:cancelable", b);
        }
        if (!c)
        {
            bundle.putBoolean("android:showsDialog", c);
        }
        if (d != -1)
        {
            bundle.putInt("android:backStackId", d);
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!f)
        {
            a(true);
        }
    }

    public void s_()
    {
        super.s_();
        if (!h && !g)
        {
            g = true;
        }
    }
}
