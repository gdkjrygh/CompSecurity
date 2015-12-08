// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.support.v4.util.ContainerHelpers;
import android.support.v4.util.LongSparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.client.PlayGames;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.games.util:
//            ExperimentUtils

public static final class mId
{

    private final boolean mDefault;
    private final long mId;
    private final String mName;

    public final boolean get(GoogleApiClient googleapiclient)
    {
        return isEnabled(PlayGames.getExperiments(googleapiclient));
    }

    public final boolean isEnabled(Collection collection)
    {
        if (collection == null)
        {
            return mDefault;
        } else
        {
            return collection.contains(Long.valueOf(mId));
        }
    }

    public final String toString()
    {
        return String.format("%s (%s)", new Object[] {
            mName, Long.valueOf(mId)
        });
    }

    (long l, String s, boolean flag)
    {
        mId = l;
        mName = s;
        mDefault = flag;
        s = ExperimentUtils.access$000();
        l = mId;
        if (((LongSparseArray) (s)).mSize != 0 && l <= ((LongSparseArray) (s)).mKeys[((LongSparseArray) (s)).mSize - 1])
        {
            s.put(l, this);
            return;
        }
        int i = ((LongSparseArray) (s)).mSize;
        if (i >= ((LongSparseArray) (s)).mKeys.length)
        {
            int j = ContainerHelpers.idealLongArraySize(i + 1);
            long al[] = new long[j];
            Object aobj[] = new Object[j];
            System.arraycopy(((LongSparseArray) (s)).mKeys, 0, al, 0, ((LongSparseArray) (s)).mKeys.length);
            System.arraycopy(((Object) (((LongSparseArray) (s)).mValues)), 0, ((Object) (aobj)), 0, ((LongSparseArray) (s)).mValues.length);
            s.mKeys = al;
            s.mValues = aobj;
        }
        ((LongSparseArray) (s)).mKeys[i] = l;
        ((LongSparseArray) (s)).mValues[i] = this;
        s.mSize = i + 1;
    }
}
