// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Set;

public final class SelectionSet
{

    public int mMaxSelected;
    public final Set mSelectedSet = new HashSet();

    public SelectionSet(int i)
    {
        boolean flag;
        if (i >= 0 || i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mMaxSelected = i;
    }

    public final int getNumSelected()
    {
        return mSelectedSet.size();
    }

    public final boolean isSelected(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return mSelectedSet.contains(obj);
    }
}
