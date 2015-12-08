// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;

public final class OnboardNavFooterButtonInfo
{

    protected Runnable mClickRunnable;
    protected boolean mEnabled;
    protected int mIconResId;
    protected String mLabel;
    protected boolean mVisible;

    public OnboardNavFooterButtonInfo()
    {
        mVisible = true;
        mEnabled = true;
    }

    private OnboardNavFooterButtonInfo clone()
    {
        OnboardNavFooterButtonInfo onboardnavfooterbuttoninfo;
        try
        {
            onboardnavfooterbuttoninfo = (OnboardNavFooterButtonInfo)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new UnsupportedOperationException(clonenotsupportedexception);
        }
        return onboardnavfooterbuttoninfo;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final Runnable getClickRunnable()
    {
        return mClickRunnable;
    }

    public final int getIconResId()
    {
        return mIconResId;
    }

    public final String getLabel()
    {
        return mLabel;
    }

    public final boolean isEnabled()
    {
        return mEnabled;
    }

    public final boolean isVisible()
    {
        return mVisible;
    }

    public final OnboardNavFooterButtonInfo setClickRunnable(Runnable runnable)
    {
        mClickRunnable = runnable;
        return this;
    }

    public final OnboardNavFooterButtonInfo setIconResId(int i)
    {
        mIconResId = 0x7f02019c;
        return this;
    }

    public final OnboardNavFooterButtonInfo setLabel(Context context, int i)
    {
        if (i == 0)
        {
            context = null;
        } else
        {
            context = context.getString(i);
        }
        mLabel = context;
        return this;
    }

    public final OnboardNavFooterButtonInfo setLabel(String s)
    {
        mLabel = s;
        return this;
    }

    public final OnboardNavFooterButtonInfo setVisible$1466a8b4()
    {
        mVisible = false;
        return this;
    }
}
