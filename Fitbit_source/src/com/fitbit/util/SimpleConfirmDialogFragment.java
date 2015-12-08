// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.fitbit.util:
//            r, z

public class SimpleConfirmDialogFragment extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{
    public static interface a
    {

        public abstract void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment);

        public abstract void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment);

        public abstract void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment);
    }


    public static final String a = "com.fitbit.util.SimpleConfirmDialogFragment.ACTION_POSITIVE";
    public static final String b = "com.fitbit.util.SimpleConfirmDialogFragment.ACTION_NEGATIVE";
    public static final String c = "com.fitbit.util.SimpleConfirmDialogFragment.ACTION_NEUTRAL";
    public static final String d = "com.fitbit.util.SimpleConfirmDialogFragment.EXTRA_TAG";
    private static final String e = "SimpleConfirmDialogFragment";
    private static final String f = "com.fitbit.util.SimpleConfirmDialogFragment.KEY_OK";
    private static final String g = "com.fitbit.util.SimpleConfirmDialogFragment.KEY_CANCEL";
    private static final String h = "com.fitbit.util.SimpleConfirmDialogFragment.KEY_NEUTRAL";
    private int i;
    private int j;
    private int k;
    private a l;

    public SimpleConfirmDialogFragment()
    {
        i = 0x7f08042e;
        j = 0x7f0802c2;
    }

    public SimpleConfirmDialogFragment(int i1, int j1)
    {
        i = i1;
        j = j1;
    }

    public SimpleConfirmDialogFragment(int i1, int j1, int k1)
    {
        i = i1;
        j = j1;
        k = k1;
    }

    public static SimpleConfirmDialogFragment a(a a1, int i1, int j1, int k1, int l1)
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(i1, j1);
        a(simpleconfirmdialogfragment, k1, l1, a1);
        return simpleconfirmdialogfragment;
    }

    public static SimpleConfirmDialogFragment a(a a1, int i1, int j1, int k1, int l1, String s)
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(i1, j1, k1);
        a(simpleconfirmdialogfragment, l1, s, a1);
        return simpleconfirmdialogfragment;
    }

    public static SimpleConfirmDialogFragment a(a a1, int i1, int j1, int k1, String s)
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(i1, j1);
        a(simpleconfirmdialogfragment, k1, s, a1);
        return simpleconfirmdialogfragment;
    }

    public static SimpleConfirmDialogFragment a(a a1, String s, String s1)
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment();
        simpleconfirmdialogfragment.setArguments(r.a(s, s1));
        simpleconfirmdialogfragment.b(a1);
        return simpleconfirmdialogfragment;
    }

    public static void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment, int i1, int j1, a a1)
    {
        simpleconfirmdialogfragment.setArguments(r.a(i1, j1));
        simpleconfirmdialogfragment.b(a1);
    }

    public static void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment, int i1, String s, a a1)
    {
        s = r.a(i1, s);
        if (simpleconfirmdialogfragment.getArguments() != null)
        {
            simpleconfirmdialogfragment.getArguments().putAll(s);
        } else
        {
            simpleconfirmdialogfragment.setArguments(s);
        }
        simpleconfirmdialogfragment.b(a1);
    }

    public static void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment, String s, String s1, a a1)
    {
        s = r.a(s, s1);
        if (simpleconfirmdialogfragment.getArguments() != null)
        {
            simpleconfirmdialogfragment.getArguments().putAll(s);
        } else
        {
            simpleconfirmdialogfragment.setArguments(s);
        }
        simpleconfirmdialogfragment.b(a1);
    }

    private void a(String s)
    {
        if (s != null)
        {
            s = new Intent(s);
            s.putExtra("com.fitbit.util.SimpleConfirmDialogFragment.EXTRA_TAG", getTag());
            z.a(s);
        }
    }

    public static SimpleConfirmDialogFragment c(a a1, int i1, int j1)
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment();
        a(simpleconfirmdialogfragment, i1, j1, a1);
        return simpleconfirmdialogfragment;
    }

    public void b(a a1)
    {
        l = a1;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (l != null)
        {
            l.b(this);
        }
        a("com.fitbit.util.SimpleConfirmDialogFragment.ACTION_NEGATIVE");
    }

    public void onClick(DialogInterface dialoginterface, int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case -1: 
            if (l != null)
            {
                l.a(this);
            }
            a("com.fitbit.util.SimpleConfirmDialogFragment.ACTION_POSITIVE");
            return;

        case -2: 
            if (l != null)
            {
                l.b(this);
            }
            a("com.fitbit.util.SimpleConfirmDialogFragment.ACTION_NEGATIVE");
            return;

        case -3: 
            break;
        }
        if (l != null)
        {
            l.c(this);
        }
        a("com.fitbit.util.SimpleConfirmDialogFragment.ACTION_NEUTRAL");
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (bundle != null)
        {
            i = bundle.getInt("com.fitbit.util.SimpleConfirmDialogFragment.KEY_OK");
            j = bundle.getInt("com.fitbit.util.SimpleConfirmDialogFragment.KEY_CANCEL");
            k = bundle.getInt("com.fitbit.util.SimpleConfirmDialogFragment.KEY_NEUTRAL");
        }
        bundle = r.c(this);
        bundle.setOnCancelListener(this);
        bundle.setPositiveButton(i, this);
        if (j != 0)
        {
            bundle.setNegativeButton(j, this);
        }
        if (k != 0)
        {
            bundle.setNeutralButton(k, this);
        }
        return bundle.create();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.fitbit.util.SimpleConfirmDialogFragment.KEY_OK", i);
        bundle.putInt("com.fitbit.util.SimpleConfirmDialogFragment.KEY_CANCEL", j);
        bundle.putInt("com.fitbit.util.SimpleConfirmDialogFragment.KEY_NEUTRAL", k);
    }
}
