// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangesAvailableOptionsCreator

public final class ChangesAvailableOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ChangesAvailableOptionsCreator();
    final int mChangesSizeLimit;
    final boolean mRepeats;
    private final Set mSpaces;
    final List mSpacesList;
    final int mVersionCode;

    ChangesAvailableOptions(int i, int j, boolean flag, List list)
    {
        Object obj;
        if (list == null)
        {
            obj = null;
        } else
        {
            obj = new HashSet(list);
        }
        this(i, j, flag, list, ((Set) (obj)));
    }

    private ChangesAvailableOptions(int i, int j, boolean flag, List list, Set set)
    {
        mVersionCode = i;
        mChangesSizeLimit = j;
        mRepeats = flag;
        mSpacesList = list;
        mSpaces = set;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ChangesAvailableOptions)obj;
        if (!Objects.equal(mSpaces, ((ChangesAvailableOptions) (obj)).mSpaces) || mChangesSizeLimit != ((ChangesAvailableOptions) (obj)).mChangesSizeLimit)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (mRepeats == ((ChangesAvailableOptions) (obj)).mRepeats) goto _L4; else goto _L5
_L5:
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mSpaces, Integer.valueOf(mChangesSizeLimit), Boolean.valueOf(mRepeats)
        });
    }

    public final String toString()
    {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[] {
            Integer.valueOf(mChangesSizeLimit), Boolean.valueOf(mRepeats), mSpacesList
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ChangesAvailableOptionsCreator.writeToParcel$621aa751(this, parcel);
    }

}
