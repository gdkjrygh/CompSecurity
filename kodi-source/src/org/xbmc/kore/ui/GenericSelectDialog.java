// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class GenericSelectDialog extends DialogFragment
{
    public static interface GenericSelectDialogListener
    {

        public abstract void onDialogSelect(int i, int j);
    }


    private GenericSelectDialogListener mListener;

    public GenericSelectDialog()
    {
    }

    public static GenericSelectDialog newInstance(GenericSelectDialogListener genericselectdialoglistener, int i, String s, CharSequence acharsequence[], int j)
    {
        GenericSelectDialog genericselectdialog = new GenericSelectDialog();
        genericselectdialog.mListener = genericselectdialoglistener;
        genericselectdialoglistener = new Bundle();
        genericselectdialoglistener.putInt("TOKEN", i);
        genericselectdialoglistener.putString("TITLE", s);
        genericselectdialoglistener.putCharSequenceArray("ARRAY_ITEMS", acharsequence);
        genericselectdialoglistener.putInt("SELECTED_ITEM", j);
        genericselectdialog.setArguments(genericselectdialoglistener);
        return genericselectdialog;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new android.app.AlertDialog.Builder(getActivity());
        Bundle bundle1 = getArguments();
        String s = bundle1.getString("TITLE");
        final int token = bundle1.getInt("TOKEN");
        int i = bundle1.getInt("SELECTED_ITEM");
        bundle.setTitle(s);
        if (getArguments().containsKey("ARRAY_ID_KEY"))
        {
            bundle.setSingleChoiceItems(bundle1.getInt("ARRAY_ID_KEY"), i, new android.content.DialogInterface.OnClickListener() {

                final GenericSelectDialog this$0;
                final int val$token;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    if (mListener != null)
                    {
                        mListener.onDialogSelect(token, j);
                    }
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = GenericSelectDialog.this;
                token = i;
                super();
            }
            });
        } else
        {
            bundle.setItems(bundle1.getCharSequenceArray("ARRAY_ITEMS"), new android.content.DialogInterface.OnClickListener() {

                final GenericSelectDialog this$0;
                final int val$token;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    if (mListener != null)
                    {
                        mListener.onDialogSelect(token, j);
                    }
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = GenericSelectDialog.this;
                token = i;
                super();
            }
            });
        }
        return bundle.create();
    }

}
