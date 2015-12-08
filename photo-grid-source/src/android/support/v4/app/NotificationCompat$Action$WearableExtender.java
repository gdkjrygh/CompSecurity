// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

public final class mCancelLabel
    implements mCancelLabel
{

    private static final int DEFAULT_FLAGS = 1;
    private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
    private static final int FLAG_AVAILABLE_OFFLINE = 1;
    private static final String KEY_CANCEL_LABEL = "cancelLabel";
    private static final String KEY_CONFIRM_LABEL = "confirmLabel";
    private static final String KEY_FLAGS = "flags";
    private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
    private CharSequence mCancelLabel;
    private CharSequence mConfirmLabel;
    private int mFlags;
    private CharSequence mInProgressLabel;

    private void setFlag(int i, boolean flag)
    {
        if (flag)
        {
            mFlags = mFlags | i;
            return;
        } else
        {
            mFlags = mFlags & ~i;
            return;
        }
    }

    public final mFlags clone()
    {
        mFlags mflags = new <init>();
        mflags.mFlags = mFlags;
        mflags.mInProgressLabel = mInProgressLabel;
        mflags.mConfirmLabel = mConfirmLabel;
        mflags.mCancelLabel = mCancelLabel;
        return mflags;
    }

    public final volatile Object clone()
    {
        return clone();
    }

    public final clone extend(clone clone1)
    {
        Bundle bundle = new Bundle();
        if (mFlags != 1)
        {
            bundle.putInt("flags", mFlags);
        }
        if (mInProgressLabel != null)
        {
            bundle.putCharSequence("inProgressLabel", mInProgressLabel);
        }
        if (mConfirmLabel != null)
        {
            bundle.putCharSequence("confirmLabel", mConfirmLabel);
        }
        if (mCancelLabel != null)
        {
            bundle.putCharSequence("cancelLabel", mCancelLabel);
        }
        clone1.().putBundle("android.wearable.EXTENSIONS", bundle);
        return clone1;
    }

    public final CharSequence getCancelLabel()
    {
        return mCancelLabel;
    }

    public final CharSequence getConfirmLabel()
    {
        return mConfirmLabel;
    }

    public final CharSequence getInProgressLabel()
    {
        return mInProgressLabel;
    }

    public final boolean isAvailableOffline()
    {
        return (mFlags & 1) != 0;
    }

    public final mFlags setAvailableOffline(boolean flag)
    {
        setFlag(1, flag);
        return this;
    }

    public final setFlag setCancelLabel(CharSequence charsequence)
    {
        mCancelLabel = charsequence;
        return this;
    }

    public final mCancelLabel setConfirmLabel(CharSequence charsequence)
    {
        mConfirmLabel = charsequence;
        return this;
    }

    public final mConfirmLabel setInProgressLabel(CharSequence charsequence)
    {
        mInProgressLabel = charsequence;
        return this;
    }

    public ()
    {
        mFlags = 1;
    }

    public mFlags(mFlags mflags)
    {
        mFlags = 1;
        mflags = mflags.mFlags().getBundle("android.wearable.EXTENSIONS");
        if (mflags != null)
        {
            mFlags = mflags.getInt("flags", 1);
            mInProgressLabel = mflags.getCharSequence("inProgressLabel");
            mConfirmLabel = mflags.getCharSequence("confirmLabel");
            mCancelLabel = mflags.getCharSequence("cancelLabel");
        }
    }
}
