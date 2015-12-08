// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import java.util.Locale;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            e

public final class d extends DialogFragment
{

    private String a;

    public d()
    {
    }

    public static void a(Context context, String s)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "quickpic://open/?from=com.roidapp.photogrid&code=%s&time=%s", new Object[] {
                s, Long.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getLong("QPicCodeTime", System.currentTimeMillis()))
            }))));
            b.d("QuickPic", "OpenApp");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.roidapp.cloudlib.ads.b.a(context, "com.alensw.PicFolder", "https://play.google.com/store/apps/details?id=com.alensw.PicFolder", "https://play.google.com/store/apps/details?id=com.alensw.PicFolder", false);
        }
        b.d("QuickPic", "OpenGP");
    }

    public static boolean a(FragmentManager fragmentmanager, String s)
    {
        String s1 = PreferenceManager.getDefaultSharedPreferences(aj.a()).getString("QPicCode", null);
        if (TextUtils.isEmpty(s1))
        {
            return false;
        } else
        {
            d d1 = new d();
            Bundle bundle = new Bundle();
            bundle.putString("QPicCode", s1);
            d1.setArguments(bundle);
            return n.a(fragmentmanager, d1, s);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            a = getArguments().getString("QPicCode");
        }
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        if (getActivity() != null && !getActivity().isFinishing() && !TextUtils.isEmpty(a))
        {
            bundle = LayoutInflater.from(getActivity()).inflate(as.P, null);
            ((TextView)bundle.findViewById(ar.bn)).setText(a);
            String s = a;
            if (getResources().getDisplayMetrics().heightPixels <= 400)
            {
                bundle.findViewById(ar.cG).setVisibility(8);
            }
            View view = bundle.findViewById(ar.j);
            view.setBackgroundDrawable(n.a(0, 0xfff0f0f0, com.roidapp.cloudlib.common.d.a(getResources(), 2.0F)));
            view.setOnClickListener(new e(this, s));
            n.a((ImageView)bundle.findViewById(ar.bc), aq.X);
            bundle = (new android.app.AlertDialog.Builder(getActivity())).setView(bundle).create();
            bundle.setCanceledOnTouchOutside(false);
            return bundle;
        } else
        {
            return super.onCreateDialog(bundle);
        }
    }
}
