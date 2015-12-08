// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.google;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.urbanairship.google:
//            PlayServicesErrorActivity

public static class  extends DialogFragment
{

    private static final String DIALOG_ERROR = "dialog_error";

    public static  createInstance(int i)
    {
          = new <init>();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_error", i);
        .setArguments(bundle);
        return ;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        getActivity().finish();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return GooglePlayServicesUtil.getErrorDialog(getArguments().getInt("dialog_error"), getActivity(), 1000);
    }

    public ()
    {
    }
}
