// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

public final class mResultKey
{

    private boolean mAllowFreeFormInput;
    private CharSequence mChoices[];
    private Bundle mExtras;
    private CharSequence mLabel;
    private final String mResultKey;

    public final mResultKey addExtras(Bundle bundle)
    {
        if (bundle != null)
        {
            mExtras.putAll(bundle);
        }
        return this;
    }

    public final RemoteInput build()
    {
        return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormInput, mExtras);
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final mExtras setAllowFreeFormInput(boolean flag)
    {
        mAllowFreeFormInput = flag;
        return this;
    }

    public final mAllowFreeFormInput setChoices(CharSequence acharsequence[])
    {
        mChoices = acharsequence;
        return this;
    }

    public final mChoices setLabel(CharSequence charsequence)
    {
        mLabel = charsequence;
        return this;
    }

    public (String s)
    {
        mAllowFreeFormInput = true;
        mExtras = new Bundle();
        if (s == null)
        {
            throw new IllegalArgumentException("Result key can't be null");
        } else
        {
            mResultKey = s;
            return;
        }
    }
}
