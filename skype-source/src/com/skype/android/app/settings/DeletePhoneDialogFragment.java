// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;

public class DeletePhoneDialogFragment extends SkypeDialogFragment
{

    private static final String EXTRA_ALIAS = "alias";
    private static final String EXTRA_MESSAGE = "message";
    private ManageAliasesAdapter.DeletePhoneCallback deletePhoneCallback;

    public DeletePhoneDialogFragment()
    {
    }

    public static DeletePhoneDialogFragment create(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo)
    {
        Bundle bundle = new Bundle();
        bundle.putString("message", aliasinfo.getAlias());
        bundle.putSerializable("alias", aliasinfo);
        return (DeletePhoneDialogFragment)SkypeDialogFragment.create(bundle, com/skype/android/app/settings/DeletePhoneDialogFragment);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        setRetainInstance(true);
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.b(getArguments().getString("message"));
        bundle.a(getString(0x7f0802ab), new android.content.DialogInterface.OnClickListener() {

            final DeletePhoneDialogFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                if (deletePhoneCallback != null)
                {
                    deletePhoneCallback.onDeletePhoneNumber((com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo)getArguments().getSerializable("alias"));
                }
            }

            
            {
                this$0 = DeletePhoneDialogFragment.this;
                super();
            }
        });
        bundle.a(true);
        return bundle.c();
    }

    public void onDestroyView()
    {
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void setDeletePhoneCallback(ManageAliasesAdapter.DeletePhoneCallback deletephonecallback)
    {
        deletePhoneCallback = deletephonecallback;
    }

}
