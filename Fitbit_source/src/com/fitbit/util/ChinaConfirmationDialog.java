// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.fitbit.savedstate.ChinaStoreUtilsSavedState;

// Referenced classes of package com.fitbit.util:
//            r

public class ChinaConfirmationDialog extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{
    public static interface a
    {

        public abstract void a(ChinaConfirmationDialog chinaconfirmationdialog, com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope, boolean flag);

        public abstract void b(ChinaConfirmationDialog chinaconfirmationdialog, com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope, boolean flag);
    }


    private static final String a = "com.fitbit.util.ChinaConfirmationDialog.KEY_OK";
    private static final String b = "com.fitbit.util.ChinaConfirmationDialog.KEY_CANCEL";
    private static final String c = "com.fitbit.util.ChinaConfirmationDialog.KEY_SCOPE";
    private int d;
    private int e;
    private com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope f;
    private a g;

    public ChinaConfirmationDialog()
    {
    }

    static com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope a(ChinaConfirmationDialog chinaconfirmationdialog)
    {
        return chinaconfirmationdialog.f;
    }

    public static ChinaConfirmationDialog a(a a1, int i, int j, com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        ChinaConfirmationDialog chinaconfirmationdialog = new ChinaConfirmationDialog();
        Bundle bundle = r.a(i, j);
        bundle.putInt("com.fitbit.util.ChinaConfirmationDialog.KEY_OK", 0x7f08042e);
        bundle.putInt("com.fitbit.util.ChinaConfirmationDialog.KEY_CANCEL", 0x7f0800e7);
        bundle.putInt("com.fitbit.util.ChinaConfirmationDialog.KEY_SCOPE", confirmationscope.ordinal());
        chinaconfirmationdialog.setArguments(bundle);
        chinaconfirmationdialog.a(a1);
        return chinaconfirmationdialog;
    }

    public void a(a a1)
    {
        g = a1;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (g != null)
        {
            g.b(this, f, false);
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        dialoginterface = getDialog();
        if (dialoginterface == null) goto _L4; else goto _L3
_L3:
        dialoginterface = (CheckBox)dialoginterface.findViewById(0x7f1103b9);
        if (dialoginterface == null) goto _L4; else goto _L5
_L5:
        boolean flag = dialoginterface.isChecked();
_L10:
        i;
        JVM INSTR tableswitch -2 -1: default 60
    //                   -2 84
    //                   -1 68;
           goto _L6 _L7 _L8
_L6:
        throw new IllegalArgumentException();
_L8:
        g.a(this, f, flag);
_L2:
        return;
_L7:
        g.b(this, f, flag);
        return;
_L4:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getArguments().getInt("com.fitbit.util.ChinaConfirmationDialog.KEY_OK");
        e = getArguments().getInt("com.fitbit.util.ChinaConfirmationDialog.KEY_CANCEL");
        f = com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.values()[getArguments().getInt("com.fitbit.util.ChinaConfirmationDialog.KEY_SCOPE")];
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getInt("com.fitbit.util.ChinaConfirmationDialog.KEY_OK");
            e = bundle.getInt("com.fitbit.util.ChinaConfirmationDialog.KEY_CANCEL");
            f = com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a(bundle.getInt("com.fitbit.util.ChinaConfirmationDialog.KEY_SCOPE"));
        }
        bundle = getActivity().getLayoutInflater().inflate(0x7f040132, null);
        Object obj = (CheckBox)bundle.findViewById(0x7f1103b9);
        if (obj != null)
        {
            ((CheckBox) (obj)).setChecked(ChinaStoreUtilsSavedState.b(f));
            ((CheckBox) (obj)).setOnCheckedChangeListener(new _cls1());
        }
        obj = r.c(this);
        ((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(this);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(d, this);
        ((android.app.AlertDialog.Builder) (obj)).setView(bundle);
        if (e != 0)
        {
            ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(e, this);
        }
        return ((android.app.AlertDialog.Builder) (obj)).create();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.fitbit.util.ChinaConfirmationDialog.KEY_OK", d);
        bundle.putInt("com.fitbit.util.ChinaConfirmationDialog.KEY_CANCEL", e);
        bundle.putInt("com.fitbit.util.ChinaConfirmationDialog.KEY_SCOPE", f.a());
    }

    /* member class not found */
    class _cls1 {}

}
