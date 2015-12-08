// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.b;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.fitbit.savedstate.k;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.d;
import java.util.HashSet;
import java.util.Set;

public class a
{

    private static final String a = "ErrorProcessor";

    public a()
    {
    }

    public static void a(FragmentActivity fragmentactivity, String s)
    {
        int i = 0;
        com/fitbit/ui/b/a;
        JVM INSTR monitorenter ;
        Integer ainteger[];
        int j;
        ainteger = k.i();
        j = ainteger.length;
        if (j != 0) goto _L2; else goto _L1
_L1:
        com/fitbit/ui/b/a;
        JVM INSTR monitorexit ;
        return;
_L2:
        HashSet hashset;
        StringBuilder stringbuilder;
        Object obj;
        hashset = new HashSet();
        stringbuilder = new StringBuilder();
        obj = (SimpleConfirmDialogFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        int ai[];
        if (((SimpleConfirmDialogFragment) (obj)).getArguments() == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        ai = ((SimpleConfirmDialogFragment) (obj)).getArguments().getIntArray("errorList");
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        hashset.addAll(d.a(ai));
        obj = ((SimpleConfirmDialogFragment) (obj)).getArguments().getString("errorMessage");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        stringbuilder.append(((String) (obj)));
        int l = ainteger.length;
        j = 0;
_L6:
        if (i >= l) goto _L4; else goto _L3
_L3:
        obj = ainteger[i];
        if (!hashset.add(obj))
        {
            break MISSING_BLOCK_LABEL_329;
        }
        if (hashset.size() > 1)
        {
            stringbuilder.append('\n');
        }
        stringbuilder.append(fragmentactivity.getString(((Integer) (obj)).intValue()));
        j = 1;
        break MISSING_BLOCK_LABEL_329;
_L4:
        if (!j) goto _L1; else goto _L5
_L5:
        com.fitbit.e.a.a("ErrorProcessor", "%s:%s", new Object[] {
            fragmentactivity.getClass().getName(), stringbuilder
        });
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f08042e, 0);
        simpleconfirmdialogfragment.setRetainInstance(true);
        SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, fragmentactivity.getString(0x7f08052b), stringbuilder.toString(), null);
        if (simpleconfirmdialogfragment.getArguments() == null)
        {
            simpleconfirmdialogfragment.setArguments(new Bundle());
        }
        simpleconfirmdialogfragment.getArguments().putString("errorMessage", stringbuilder.toString());
        simpleconfirmdialogfragment.getArguments().putIntArray("errorList", d.a(hashset));
        ad.a(fragmentactivity.getSupportFragmentManager(), s, simpleconfirmdialogfragment);
        fragmentactivity.getSupportFragmentManager().executePendingTransactions();
          goto _L1
        fragmentactivity;
        throw fragmentactivity;
        i++;
          goto _L6
    }
}
