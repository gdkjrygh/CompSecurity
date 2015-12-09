// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            IndexHidingAdapter, SendWobNotificationFeedbackActivity

public class WobNotificationFeedbackDialogFragment extends AlertDialogFragment
{

    private int selectedIndex;
    private Spinner spinner;
    private String wobInstanceId;

    public WobNotificationFeedbackDialogFragment()
    {
        super(AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.wobs_notification_feedback_dialog_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_continue).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel));
    }

    private String getSelectedItemOnSpinner()
    {
        return (String)spinner.getSelectedItem();
    }

    private void updatePositiveButton()
    {
        Button button = ((AlertDialog)getDialog()).getButton(-1);
        if (selectedIndex == 0)
        {
            button.setEnabled(false);
            return;
        } else
        {
            button.setEnabled(true);
            return;
        }
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        View view = getActivity().getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_notification_feedback_dialog, null);
        builder.setView(view);
        spinner = (Spinner)view.findViewById(com.google.android.apps.walletnfcrel.R.id.feedback_reasons_spinner);
        builder = new IndexHidingAdapter(getActivity(), 0x1090008, getResources().getStringArray(com.google.android.apps.walletnfcrel.R.array.wobs_notification_feedback_reasons), 0);
        builder.setDropDownViewResource(0x1090009);
        spinner.setAdapter(builder);
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final WobNotificationFeedbackDialogFragment this$0;

            public final void onItemSelected(AdapterView adapterview, View view1, int i, long l)
            {
                selectedIndex = i;
                updatePositiveButton();
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = WobNotificationFeedbackDialogFragment.this;
                super();
            }
        });
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            dismiss();
            return;

        case -1: 
            startActivity(SendWobNotificationFeedbackActivity.createIntent(getActivity(), wobInstanceId, getSelectedItemOnSpinner()));
            break;
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            selectedIndex = bundle.getInt("KEY_SELECTED_INDEX");
            wobInstanceId = bundle.getString("KEY_WOB_INSTANCE_ID");
        }
    }

    public final void onResume()
    {
        super.onResume();
        updatePositiveButton();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_SELECTED_INDEX", selectedIndex);
        bundle.putString("KEY_WOB_INSTANCE_ID", wobInstanceId);
    }

    public final void setWobInstanceId(String s)
    {
        wobInstanceId = s;
    }


/*
    static int access$002(WobNotificationFeedbackDialogFragment wobnotificationfeedbackdialogfragment, int i)
    {
        wobnotificationfeedbackdialogfragment.selectedIndex = i;
        return i;
    }

*/

}
