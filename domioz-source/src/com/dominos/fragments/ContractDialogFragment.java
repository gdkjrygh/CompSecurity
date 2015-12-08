// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Activity;
import android.support.v4.app.m;

public abstract class ContractDialogFragment extends m
{

    private Object mContract;

    public ContractDialogFragment()
    {
    }

    public final Object getContract()
    {
        return mContract;
    }

    public void onAttach(Activity activity)
    {
        try
        {
            mContract = activity;
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException((new StringBuilder()).append(activity.getClass().getSimpleName()).append(" does not implement the dialog's contract interface.").toString(), classcastexception);
        }
        super.onAttach(activity);
    }

    public void onDetach()
    {
        super.onDetach();
        mContract = null;
    }
}
