// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.g;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.f;
import com.roidapp.baselib.g;
import com.roidapp.baselib.h;

// Referenced classes of package com.roidapp.baselib.g:
//            c, d, b

public final class a extends DialogFragment
    implements android.view.View.OnClickListener
{

    c a;
    private com.roidapp.baselib.e.a b;
    private ProgressBar c;
    private b d;
    private TextView e;
    private View f;
    private TextView g;
    private TextView h;

    public a()
    {
        a = null;
    }

    public static a a(String s, String s1, b b1)
    {
        a a1 = new a();
        a1.d = b1;
        b1 = new Bundle();
        b1.putString("url", s);
        b1.putString("savePath", s1);
        b1.putBoolean("showRetry", true);
        a1.setArguments(b1);
        return a1;
    }

    static b a(a a1)
    {
        return a1.d;
    }

    private void a()
    {
        if (b != null)
        {
            b.f();
        }
        b = null;
    }

    static void b(a a1)
    {
        if (a1.e != null)
        {
            a1.e.setText(h.c);
        }
        if (a1.f != null)
        {
            a1.f.setVisibility(0);
        }
        if (a1.c != null)
        {
            a1.c.setVisibility(8);
        }
    }

    static ProgressBar c(a a1)
    {
        return a1.c;
    }

    static TextView d(a a1)
    {
        return a1.g;
    }

    public final void dismiss()
    {
        dismissAllowingStateLoss();
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        a();
    }

    public final void onClick(View view)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null && !fragmentactivity.isFinishing())
        {
            int i = view.getId();
            if (i == f.a)
            {
                a();
                dismiss();
            } else
            if (i == f.d && b != null)
            {
                b = new com.roidapp.baselib.e.a(b);
                f.setVisibility(8);
                g.setText("");
                c.setProgress(0);
                c.setVisibility(0);
                (new Thread(b, "DownLoadSticker")).start();
                e.setText(h.d);
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        String s;
        Object obj;
        Bundle bundle1;
label0:
        {
            obj = getActivity();
            a = new c(this, (byte)0);
            bundle1 = getArguments();
            if (obj != null && !((Activity) (obj)).isFinishing() && bundle1 != null)
            {
                bundle = bundle1.getString("url");
                if (bundle != null)
                {
                    s = bundle1.getString("savePath");
                    if (s != null)
                    {
                        break label0;
                    }
                }
            }
            setShowsDialog(false);
            return null;
        }
        View view = LayoutInflater.from(((android.content.Context) (obj))).inflate(g.a, null);
        view.findViewById(f.a).setOnClickListener(this);
        f = view.findViewById(f.d);
        if (bundle1.getBoolean("showRetry"))
        {
            f.setOnClickListener(this);
        } else
        {
            f.setVisibility(8);
        }
        c = (ProgressBar)view.findViewById(f.c);
        c.setProgress(0);
        c.setMax(100);
        e = (TextView)view.findViewById(f.e);
        g = (TextView)view.findViewById(f.f);
        h = (TextView)view.findViewById(f.b);
        obj = (new android.app.AlertDialog.Builder(((android.content.Context) (obj)))).setView(view).setIcon(0x1080055).setCancelable(false).create();
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        f.setVisibility(8);
        b = new com.roidapp.baselib.e.a(bundle, s, new d(a, (byte)0));
        b.g();
        b.h();
        (new Thread(b, "DownLoadSticker")).start();
        return ((Dialog) (obj));
    }

    public final void onDetach()
    {
        super.onDetach();
        a();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        a();
    }
}
