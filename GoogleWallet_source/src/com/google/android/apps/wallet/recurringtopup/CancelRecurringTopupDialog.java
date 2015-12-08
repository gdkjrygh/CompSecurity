// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.widgets.checkablelayout.CheckableLinearLayout;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;

public class CancelRecurringTopupDialog extends AlertDialogFragment
    implements android.widget.SimpleAdapter.ViewBinder
{
    public static interface CancelRecurringTopupDialogListener
    {

        public abstract void onCancelAll();

        public abstract void onSkip();
    }


    private int selectedIndex;

    public CancelRecurringTopupDialog()
    {
        super(newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.cancel_recurring_topup_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.nevermind).setCancelable(true));
        selectedIndex = 0;
    }

    static CancelRecurringTopupDialog createDialog(String s, String s1)
    {
        CancelRecurringTopupDialog cancelrecurringtopupdialog = new CancelRecurringTopupDialog();
        Bundle bundle = cancelrecurringtopupdialog.getArguments();
        bundle.putString("AMOUNT", s);
        bundle.putString("DATE", s1);
        return cancelrecurringtopupdialog;
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        Object obj1 = getArguments();
        Object obj = builder.getContext();
        obj1 = ImmutableList.of(ImmutableMap.of("LINE_1", getString(com.google.android.apps.walletnfcrel.R.string.next_transfer, new Object[] {
            ((Bundle) (obj1)).getString("AMOUNT"), ((Bundle) (obj1)).getString("DATE")
        }), "LINE_2", getString(com.google.android.apps.walletnfcrel.R.string.cancel_cutoff, new Object[] {
            ((Bundle) (obj1)).getString("DATE")
        })), ImmutableMap.of("LINE_1", getString(com.google.android.apps.walletnfcrel.R.string.all_transfers), "LINE_2", ""));
        int i = com.google.android.apps.walletnfcrel.R.layout.dialog_check_item_2_lines;
        int j = com.google.android.apps.walletnfcrel.R.id.line1;
        int k = com.google.android.apps.walletnfcrel.R.id.line2;
        obj = new SimpleAdapter(((Context) (obj)), ((List) (obj1)), i, new String[] {
            "LINE_1", "LINE_2"
        }, new int[] {
            j, k
        }) {

            final CancelRecurringTopupDialog this$0;

            public final View getView(int l, View view, ViewGroup viewgroup)
            {
                view = (CheckableLinearLayout)super.getView(l, view, viewgroup);
                view.setDelegate((Checkable)view.findViewById(com.google.android.apps.walletnfcrel.R.id.check));
                return view;
            }

            
            {
                this$0 = CancelRecurringTopupDialog.this;
                super(context, list, i, as, ai);
            }
        };
        ((SimpleAdapter) (obj)).setViewBinder(this);
        builder.setSingleChoiceItems(((android.widget.ListAdapter) (obj)), selectedIndex, this);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (CancelRecurringTopupDialogListener)((AlertDialog)dialoginterface).getOwnerActivity();
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (selectedIndex != 0) goto _L4; else goto _L3
_L3:
        dialoginterface.onSkip();
_L6:
        return;
_L4:
        if (selectedIndex == 1)
        {
            dialoginterface.onCancelAll();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i >= 0)
        {
            selectedIndex = i;
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean setViewValue(View view, Object obj, String s)
    {
        ((TextView)view).setText(s);
        if (!view.equals(view.findViewById(com.google.android.apps.walletnfcrel.R.id.line2))) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (s.length() == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
_L4:
        return true;
_L2:
        if (view.equals(view.findViewById(com.google.android.apps.walletnfcrel.R.id.item)))
        {
            ((CheckableLinearLayout)view).setDelegate((Checkable)view.findViewById(com.google.android.apps.walletnfcrel.R.id.check));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
