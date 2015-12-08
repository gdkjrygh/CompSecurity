// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.account;

import android.content.Context;
import android.support.v7.app.ActionBar;

// Referenced classes of package com.google.android.gms.common.account:
//            GoogleAccountSpinnerAdapter

public static final class mContext
{

    public String mAccountNames[];
    public final ActionBar mActionBar;
    public final Context mContext;
    public android.widget.SpinnerAdapter.Builder mListener;
    public String mPackageName;
    public String mSelectedAccountName;
    public CharSequence mTitle;

    public (ActionBar actionbar)
    {
        mActionBar = actionbar;
        mContext = actionbar.getThemedContext();
        mPackageName = mContext.getPackageName();
    }
}
