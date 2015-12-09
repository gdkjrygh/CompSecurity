// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;


// Referenced classes of package com.fitbit.util:
//            SimpleConfirmDialogFragment

public class RetryDialogFragment extends SimpleConfirmDialogFragment
{

    public RetryDialogFragment()
    {
        super(0x7f08048d, 0x7f0802c2);
    }

    public static RetryDialogFragment a(SimpleConfirmDialogFragment.a a1, int i, int j)
    {
        RetryDialogFragment retrydialogfragment = new RetryDialogFragment();
        a(((SimpleConfirmDialogFragment) (retrydialogfragment)), i, j, a1);
        return retrydialogfragment;
    }

    public static RetryDialogFragment a(SimpleConfirmDialogFragment.a a1, int i, String s)
    {
        RetryDialogFragment retrydialogfragment = new RetryDialogFragment();
        a(((SimpleConfirmDialogFragment) (retrydialogfragment)), i, s, a1);
        return retrydialogfragment;
    }
}
