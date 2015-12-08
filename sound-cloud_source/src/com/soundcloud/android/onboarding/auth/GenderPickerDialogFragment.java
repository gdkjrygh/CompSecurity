// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            GenderOption

public class GenderPickerDialogFragment extends DialogFragment
{
    public static interface Callback
    {

        public abstract void onGenderSelected(GenderOption genderoption);
    }

    public static interface CallbackProvider
    {

        public abstract Callback getGenderPickerCallback();
    }

    private class OnGenderSelected
        implements android.content.DialogInterface.OnClickListener
    {

        final GenderPickerDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            getCallback().onGenderSelected(GenderOption.values()[i]);
            dialoginterface.dismiss();
        }

        private OnGenderSelected()
        {
            this$0 = GenderPickerDialogFragment.this;
            super();
        }

        OnGenderSelected(_cls1 _pcls1)
        {
            this();
        }
    }


    public static final String GENDER_BUNDLE_KEY = "GENDER_KEY";

    public GenderPickerDialogFragment()
    {
    }

    static DialogFragment build(GenderOption genderoption)
    {
        GenderPickerDialogFragment genderpickerdialogfragment = new GenderPickerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("GENDER_KEY", genderoption);
        genderpickerdialogfragment.setArguments(bundle);
        return genderpickerdialogfragment;
    }

    private int currentGenderIndex()
    {
        GenderOption genderoption = (GenderOption)getArguments().getSerializable("GENDER_KEY");
        if (genderoption != null)
        {
            return genderoption.ordinal();
        } else
        {
            return -1;
        }
    }

    private String[] genderOptions()
    {
        GenderOption agenderoption[] = GenderOption.values();
        String as[] = new String[agenderoption.length];
        for (int i = 0; i < agenderoption.length; i++)
        {
            as[i] = getString(agenderoption[i].getResId());
        }

        return as;
    }

    private Callback getCallback()
    {
        return ((CallbackProvider)getActivity()).getGenderPickerCallback();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070173).setSingleChoiceItems(genderOptions(), currentGenderIndex(), new OnGenderSelected(null)).create();
    }

}
