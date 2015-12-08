// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.text.TextUtils;

public final class mIcon
{

    private final String mAction;
    private Bundle mExtras;
    private final int mIcon;
    private final CharSequence mName;

    public final mIcon build()
    {
        return new mIcon(mAction, mName, mIcon, mExtras, null);
    }

    public final mExtras setExtras(Bundle bundle)
    {
        mExtras = bundle;
        return this;
    }

    public (String s, CharSequence charsequence, int i)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
        }
        if (TextUtils.isEmpty(charsequence))
        {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
        }
        if (i == 0)
        {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
        } else
        {
            mAction = s;
            mName = charsequence;
            mIcon = i;
            return;
        }
    }
}
