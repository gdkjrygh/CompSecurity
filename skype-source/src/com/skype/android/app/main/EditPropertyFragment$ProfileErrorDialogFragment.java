// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;

// Referenced classes of package com.skype.android.app.main:
//            EditPropertyFragment

public static class  extends h
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.DialogFragment(getActivity());
        CharSequence charsequence = getActivity().getTitle();
        bundle.getActivity(getString(0x7f080235, new Object[] {
            charsequence
        }));
        bundle.getString(getString(0x7f080387, new Object[] {
            charsequence
        }));
        bundle.getString(getString(0x7f080340), null);
        bundle.getString(getString(0x7f080120), null);
        return bundle.getString();
    }

    public ()
    {
    }
}
