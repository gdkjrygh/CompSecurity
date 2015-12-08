// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            Fragment, aj, ay, ai

public class y extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

    int a;
    int b;
    boolean c;
    boolean d;
    int e;
    Dialog f;
    boolean g;
    boolean h;
    boolean i;

    public y()
    {
        a = 0;
        b = 0;
        c = true;
        d = true;
        e = -1;
    }

    public Dialog a()
    {
        return f;
    }

    public void a(Activity activity)
    {
        super.a(activity);
        if (!i)
        {
            h = false;
        }
    }

    public void a(Dialog dialog, int j)
    {
        switch (j)
        {
        default:
            return;

        case 3: // '\003'
            dialog.getWindow().addFlags(24);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            dialog.requestWindowFeature(1);
            break;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        boolean flag;
        if (H == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (bundle != null)
        {
            a = bundle.getInt("android:style", 0);
            b = bundle.getInt("android:theme", 0);
            c = bundle.getBoolean("android:cancelable", true);
            d = bundle.getBoolean("android:showsDialog", d);
            e = bundle.getInt("android:backStackId", -1);
        }
    }

    public void a(aj aj1, String s)
    {
        h = false;
        i = true;
        aj1 = aj1.a();
        aj1.a(this, s);
        aj1.a();
    }

    void a(boolean flag)
    {
        if (h)
        {
            return;
        }
        h = true;
        i = false;
        if (f != null)
        {
            f.dismiss();
            f = null;
        }
        g = true;
        if (e >= 0)
        {
            k().a(e, 1);
            e = -1;
            return;
        }
        ay ay1 = k().a();
        ay1.a(this);
        if (flag)
        {
            ay1.b();
            return;
        } else
        {
            ay1.a();
            return;
        }
    }

    public int b()
    {
        return b;
    }

    public LayoutInflater b(Bundle bundle)
    {
        if (!d)
        {
            return super.b(bundle);
        }
        f = c(bundle);
        if (f != null)
        {
            a(f, a);
            return (LayoutInflater)f.getContext().getSystemService("layout_inflater");
        } else
        {
            return (LayoutInflater)D.g().getSystemService("layout_inflater");
        }
    }

    public void b(boolean flag)
    {
        d = flag;
    }

    public Dialog c(Bundle bundle)
    {
        return new Dialog(i(), b());
    }

    public void d()
    {
        super.d();
        if (f != null)
        {
            g = false;
            f.show();
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (d)
        {
            View view = r();
            if (view != null)
            {
                if (view.getParent() != null)
                {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                f.setContentView(view);
            }
            f.setOwnerActivity(i());
            f.setCancelable(c);
            f.setOnCancelListener(this);
            f.setOnDismissListener(this);
            if (bundle != null)
            {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null)
                {
                    f.onRestoreInstanceState(bundle);
                    return;
                }
            }
        }
    }

    public void e()
    {
        super.e();
        if (f != null)
        {
            f.hide();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (f != null)
        {
            Bundle bundle1 = f.onSaveInstanceState();
            if (bundle1 != null)
            {
                bundle.putBundle("android:savedDialogState", bundle1);
            }
        }
        if (a != 0)
        {
            bundle.putInt("android:style", a);
        }
        if (b != 0)
        {
            bundle.putInt("android:theme", b);
        }
        if (!c)
        {
            bundle.putBoolean("android:cancelable", c);
        }
        if (!d)
        {
            bundle.putBoolean("android:showsDialog", d);
        }
        if (e != -1)
        {
            bundle.putInt("android:backStackId", e);
        }
    }

    public void e_()
    {
        super.e_();
        if (!i && !h)
        {
            h = true;
        }
    }

    public void f()
    {
        super.f();
        if (f != null)
        {
            g = true;
            f.dismiss();
            f = null;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!g)
        {
            a(true);
        }
    }
}
