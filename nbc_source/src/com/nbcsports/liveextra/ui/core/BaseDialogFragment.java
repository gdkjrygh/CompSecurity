// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

public abstract class BaseDialogFragment extends DialogFragment
{

    public BaseDialogFragment()
    {
    }

    public boolean isActivityDead()
    {
        return getActivity() == null || getActivity().isFinishing();
    }
}
