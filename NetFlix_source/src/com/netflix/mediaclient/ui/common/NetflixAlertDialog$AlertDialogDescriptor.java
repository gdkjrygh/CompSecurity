// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Context;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            NetflixAlertDialog

public static class mContext
{

    public static final String ACTION_ID_NEGATIVE_BUTTON_CLICKED = "nflx_negative_button_clicked";
    public static final String ACTION_ID_NEUTRAL_BUTTON_CLICKED = "nflx_neutral_button_clicked";
    public static final String ACTION_ID_POSITIVE_BUTTON_CLICKED = "nflx_positive_button_clicked";
    private final boolean mCancelOnBack;
    private final boolean mCancelOnTouchOutside;
    private final Context mContext;
    private final String mDialogId;
    private final String mMessage;
    private  mNegativeButton;
    private  mNeutralButton;
    private  mPositiveButton;

    public String getDialogId()
    {
        return mDialogId;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public  getNegativeButton()
    {
        return mNegativeButton;
    }

    public  getNeutralButton()
    {
        return mNeutralButton;
    }

    public  getPositiveButton()
    {
        return mPositiveButton;
    }

    public boolean isCancelOnBack()
    {
        return mCancelOnBack;
    }

    public boolean isCancelOnTouchOutside()
    {
        return mCancelOnTouchOutside;
    }

    public void setNegativeButton()
    {
        mNegativeButton = new (mContext.getString(0x7f0c0101), "nflx_negative_button_clicked");
    }

    public void setNegativeButton(String s)
    {
        mNegativeButton = new (mContext.getString(0x7f0c0101), s);
    }

    public void setNegativeButton(String s, String s1)
    {
        mNegativeButton = new (s, s1);
    }

    public void setNeutralButton(String s)
    {
        mNeutralButton = new (s, "nflx_neutral_button_clicked");
    }

    public void setNeutralButton(String s, String s1)
    {
        mNeutralButton = new (s, s1);
    }

    public void setPositiveButton()
    {
        mPositiveButton = new (mContext.getString(0x7f0c0071), "nflx_positive_button_clicked");
    }

    public void setPositiveButton(String s)
    {
        mPositiveButton = new (mContext.getString(0x7f0c0071), s);
    }

    public void setPositiveButton(String s, String s1)
    {
        mPositiveButton = new (s, s1);
    }

    public (Context context, String s, String s1, boolean flag, boolean flag1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Message can not be null!");
        }
        if (context == null)
        {
            throw new IllegalArgumentException("Context can not be null!");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("Dialog id can not be null!");
        } else
        {
            mDialogId = s;
            mMessage = s1;
            mCancelOnTouchOutside = flag;
            mCancelOnBack = flag1;
            mContext = context;
            return;
        }
    }
}
