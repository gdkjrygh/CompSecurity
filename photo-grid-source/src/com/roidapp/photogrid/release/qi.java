// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.a.d;
import com.roidapp.photogrid.a.m;

// Referenced classes of package com.roidapp.photogrid.release:
//            qj, qp, qr, qq, 
//            qn, qo, qk, ql, 
//            qm

public final class qi extends DialogFragment
{

    private int a;
    private int b;
    private int c;
    private d d;
    private boolean e;
    private Handler f;

    public qi()
    {
        a = 0;
        b = 1;
        e = false;
        f = new qj(this);
    }

    static int a(qi qi1, int i)
    {
        qi1.c = i;
        return i;
    }

    static void a(qi qi1)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = qi1.getActivity();
        if (fragmentactivity == null || fragmentactivity.isFinishing())
        {
            return;
        }
        try
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(qi1.getActivity());
            builder.setTitle(0x7f0702e7);
            builder.setMessage(0x7f07033d);
            builder.setPositiveButton(0x7f070137, new qp(qi1));
            builder.setNegativeButton(0x7f070049, new qr(qi1)).setOnCancelListener(new qq(qi1));
            builder.create();
            builder.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (qi qi1)
        {
            qi1.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (qi qi1)
        {
            qi1.printStackTrace();
        }
    }

    static void a(qi qi1, Activity activity)
    {
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        if (qi1.d != null)
        {
            qi1.d.a();
            qi1.d = null;
        }
        qi1.d = new d(activity, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3hDBUTqCFEy0ee8FVgMli9SgoFAEwh6LplNMMRM3GMnUIZMapwISgCeyVeoX1d3idHCG3hSEd3t6ukuBvsiyTi3UYryPl9SvECTpaQLnyjJLxNdZB/a1h5Bwbk+4ugKWuKXMKTI8MpKmDD/wx1EexO7PntgM1Y28CFUeJD93C9qVRGQNKqjVdNm/jImEQeZcCEDXDw9j03psvXyE02Xj6HIcMBVvRbUynXWl8KtAY8fNHgGvb0JYRLnmz8ei14m6wqrXHPTpe5lZ4zHTEd7nsjTAUNfvdNqn2p662IWemg7h1Q34DaIZlVycqKy/URffwgNrixRKN3AY/Y2YD0O0GQIDAQAB");
        qi1.d.a(new qn(qi1));
    }

    static boolean a(qi qi1, boolean flag)
    {
        qi1.e = flag;
        return flag;
    }

    static int b(qi qi1)
    {
        return qi1.a;
    }

    static void b(qi qi1, Activity activity)
    {
        byte byte0;
        byte0 = 0;
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        if (!qi1.e) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        Log.e("iab", "setup success");
        s = null;
        s1 = "subs";
        if (qi1.c != qi1.a) goto _L4; else goto _L3
_L3:
        s = "com.roidapp.photogrid.remove_ad_year";
        byte0 = 16;
        s1 = "subs";
_L5:
        qi1.d.a(activity, s, s1, byte0, new qo(qi1), "");
        return;
_L4:
        if (qi1.c == qi1.b)
        {
            s = "com.roidapp.photogrid.remove_ad_lifelong";
            byte0 = 32;
            s1 = "inapp";
        }
        if (true) goto _L5; else goto _L2
_L2:
        Log.e("iab", "setup failed");
        m.a(qi1.getActivity(), 0);
        activity = Message.obtain();
        activity.what = 3;
        activity.arg1 = 1;
        qi1.f.sendMessage(activity);
        return;
    }

    static int c(qi qi1)
    {
        return qi1.b;
    }

    static Handler d(qi qi1)
    {
        return qi1.f;
    }

    static void e(qi qi1)
    {
        if (qi1.d != null)
        {
            qi1.d.a();
            qi1.d = null;
        }
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (d == null || !d.a(i, j, intent))
        {
            super.onActivityResult(i, j, intent);
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030103, viewgroup, false);
        n.a((TextView)layoutinflater.findViewById(0x7f0d0405), 0x7f02035c, 0, 0);
        n.a((ImageView)layoutinflater.findViewById(0x7f0d0406), 0x7f02036b);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d040b);
        bundle = (RadioButton)layoutinflater.findViewById(0x7f0d0408);
        bundle.setText((new StringBuilder("$1.99 ")).append(getResources().getString(0x7f07033f)).toString());
        bundle.setChecked(true);
        c = a;
        ((RadioGroup)layoutinflater.findViewById(0x7f0d0407)).setOnCheckedChangeListener(new qk(this, viewgroup));
        ((TextView)layoutinflater.findViewById(0x7f0d040a)).setOnClickListener(new ql(this));
        ((ImageView)layoutinflater.findViewById(0x7f0d0406)).setOnClickListener(new qm(this));
        return layoutinflater;
    }
}
