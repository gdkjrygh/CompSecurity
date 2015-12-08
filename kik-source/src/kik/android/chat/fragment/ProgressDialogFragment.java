// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.kik.sdkutils.y;
import kik.a.e.s;

// Referenced classes of package kik.android.chat.fragment:
//            KikDialogFragment, ql

public class ProgressDialogFragment extends KikDialogFragment
{
    public static interface a
    {

        public abstract void a();
    }


    private boolean f;
    private android.content.DialogInterface.OnCancelListener g;
    private int h;
    private int i;
    private s j;
    private a k;
    private ProgressDialog l;

    public ProgressDialogFragment()
    {
        f = false;
        h = 0;
        i = 0;
    }

    public ProgressDialogFragment(String s, a a1)
    {
        this(s, true);
        h = 1;
        k = a1;
    }

    public ProgressDialogFragment(String s, boolean flag)
    {
        f = false;
        h = 0;
        i = 0;
        b = s;
        setCancelable(flag);
        s = new Bundle();
        s.putString("kik.android.ProgressDialogFragment.KEY_TEXT", b);
        s.putBoolean("kik.android.ProgressDialogFragment.KEY_CANCELLABLE", flag);
        setArguments(s);
    }

    static int a(ProgressDialogFragment progressdialogfragment)
    {
        return progressdialogfragment.i;
    }

    static int a(ProgressDialogFragment progressdialogfragment, int i1)
    {
        progressdialogfragment.i = i1;
        return i1;
    }

    static ProgressDialog b(ProgressDialogFragment progressdialogfragment)
    {
        return progressdialogfragment.l;
    }

    public final void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        g = oncancellistener;
    }

    public final void e()
    {
        f = false;
    }

    public final s f()
    {
        return j;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (g != null)
        {
            g.onCancel(dialoginterface);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            String s = bundle1.getString("kik.android.ProgressDialogFragment.KEY_TEXT");
            bundle = s;
            if (s == null)
            {
                bundle = "";
            }
            b = bundle;
            setCancelable(bundle1.getBoolean("kik.android.ProgressDialogFragment.KEY_CANCELLABLE", true));
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        l = new ProgressDialog(getActivity());
        l.setTitle(a);
        l.setMessage(b);
        if (c != null)
        {
            l.setButton(-1, c.a(), c.b());
        }
        if (d != null)
        {
            l.setButton(-2, d.a(), d.b());
        }
        if (e != null)
        {
            l.setButton(-3, e.a(), e.b());
        }
        l.setCancelable(isCancelable());
        if (h != 0) goto _L2; else goto _L1
_L1:
        l.setProgressStyle(h);
_L4:
        l.setCanceledOnTouchOutside(f);
        j = new ql(this);
        if (k != null)
        {
            k.a();
        }
        return l;
_L2:
        l.setIndeterminate(false);
        l.setProgress(i);
        l.setMax(100);
        l.setProgressStyle(h);
        if (y.a(14))
        {
            l.setProgressNumberFormat(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
