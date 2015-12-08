// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class t extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

    private int Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    public Dialog b;

    public t()
    {
        Y = 0;
        Z = 0;
        aa = true;
        a = true;
        ab = -1;
    }

    private void d(boolean flag)
    {
        if (ad)
        {
            return;
        }
        ad = true;
        ae = false;
        if (b != null)
        {
            b.dismiss();
            b = null;
        }
        ac = true;
        if (ab >= 0)
        {
            super.v.b(ab);
            ab = -1;
            return;
        }
        ah ah1 = super.v.a();
        ah1.a(this);
        if (flag)
        {
            ah1.d();
            return;
        } else
        {
            ah1.c();
            return;
        }
    }

    public final void a()
    {
        aa = true;
        if (b != null)
        {
            b.setCancelable(true);
        }
    }

    public void a(aa aa1, String s)
    {
        ad = false;
        ae = true;
        aa1 = aa1.a();
        aa1.a(this, s);
        aa1.c();
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        if (!ae)
        {
            ad = false;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        boolean flag;
        if (A == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (bundle != null)
        {
            Y = bundle.getInt("android:style", 0);
            Z = bundle.getInt("android:theme", 0);
            aa = bundle.getBoolean("android:cancelable", true);
            a = bundle.getBoolean("android:showsDialog", a);
            ab = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater b(Bundle bundle)
    {
        if (!a)
        {
            return super.b(bundle);
        }
        b = c(bundle);
        if (b == null) goto _L2; else goto _L1
_L1:
        bundle = b;
        Y;
        JVM INSTR tableswitch 1 3: default 64
    //                   1 89
    //                   2 89
    //                   3 80;
           goto _L3 _L4 _L4 _L5
_L3:
        return (LayoutInflater)b.getContext().getSystemService("layout_inflater");
_L5:
        bundle.getWindow().addFlags(24);
_L4:
        bundle.requestWindowFeature(1);
        if (true) goto _L3; else goto _L2
_L2:
        return (LayoutInflater)w.b.getSystemService("layout_inflater");
    }

    public Dialog c(Bundle bundle)
    {
        return new Dialog(k(), Z);
    }

    public final void c()
    {
        super.c();
        if (b != null)
        {
            ac = false;
            b.show();
        }
    }

    public final void d()
    {
        super.d();
        if (b != null)
        {
            b.hide();
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (a)
        {
            View view = super.M;
            if (view != null)
            {
                if (view.getParent() != null)
                {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                b.setContentView(view);
            }
            b.setOwnerActivity(k());
            b.setCancelable(aa);
            b.setOnCancelListener(this);
            b.setOnDismissListener(this);
            if (bundle != null)
            {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null)
                {
                    b.onRestoreInstanceState(bundle);
                    return;
                }
            }
        }
    }

    public void dismiss()
    {
        d(false);
    }

    public final void e()
    {
        super.e();
        if (b != null)
        {
            ac = true;
            b.dismiss();
            b = null;
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (b != null)
        {
            Bundle bundle1 = b.onSaveInstanceState();
            if (bundle1 != null)
            {
                bundle.putBundle("android:savedDialogState", bundle1);
            }
        }
        if (Y != 0)
        {
            bundle.putInt("android:style", Y);
        }
        if (Z != 0)
        {
            bundle.putInt("android:theme", Z);
        }
        if (!aa)
        {
            bundle.putBoolean("android:cancelable", aa);
        }
        if (!a)
        {
            bundle.putBoolean("android:showsDialog", a);
        }
        if (ab != -1)
        {
            bundle.putInt("android:backStackId", ab);
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!ac)
        {
            d(true);
        }
    }

    public final void t_()
    {
        super.t_();
        if (!ae && !ad)
        {
            ad = true;
        }
    }
}
