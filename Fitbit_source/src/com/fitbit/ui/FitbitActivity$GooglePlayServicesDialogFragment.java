// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.google.android.gms.common.e;

// Referenced classes of package com.fitbit.ui:
//            FitbitActivity

public static class setArguments extends DialogFragment
{

    private android.content.tActivity a;

    public static setArguments a(int i, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("error-code", i);
        bundle.putInt("request-code", j);
        setArguments setarguments = new <init>();
        setarguments.setArguments(bundle);
        return setarguments;
    }

    public void a(android.content.tArguments targuments)
    {
        a = targuments;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        int i = getArguments().getInt("error-code");
        int j = getArguments().getInt("request-code");
        return e.a(i, getActivity(), j, a);
    }

    public ()
    {
        setArguments(new Bundle());
    }
}
