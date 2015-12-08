// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.InputFilter;
import android.view.Window;
import android.widget.EditText;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionNewStyleFragment

public class StyleTitleDialogFragment extends DialogFragment
{

    private static final String ARG_CURRENT_TITLE = "current_title";
    private CaptionNewStyleFragment mListener;

    public StyleTitleDialogFragment()
    {
    }

    public static StyleTitleDialogFragment getInstance(CaptionNewStyleFragment captionnewstylefragment, String s)
    {
        StyleTitleDialogFragment styletitledialogfragment = new StyleTitleDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("current_title", s);
        styletitledialogfragment.setArguments(bundle);
        styletitledialogfragment.setListener(captionnewstylefragment);
        return styletitledialogfragment;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(0x7f0700c4);
        final EditText editTextNewDescription = new EditText(getActivity());
        editTextNewDescription.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(10)
        });
        editTextNewDescription.setText(getArguments().getString("current_title"));
        bundle.setView(editTextNewDescription);
        bundle.setPositiveButton(0x7f0700c3, new android.content.DialogInterface.OnClickListener() {

            final StyleTitleDialogFragment this$0;
            final EditText val$editTextNewDescription;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = editTextNewDescription.getText().toString();
                mListener.setDescription(dialoginterface);
            }

            
            {
                this$0 = StyleTitleDialogFragment.this;
                editTextNewDescription = edittext;
                super();
            }
        });
        bundle.setNegativeButton(0x7f0700c2, null);
        bundle = bundle.create();
        bundle.getWindow().setSoftInputMode(5);
        return bundle;
    }

    public void setListener(CaptionNewStyleFragment captionnewstylefragment)
    {
        mListener = captionnewstylefragment;
    }

}
