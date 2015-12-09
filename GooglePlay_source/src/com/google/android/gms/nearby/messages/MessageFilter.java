// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            MessageFilterCreator

public class MessageFilter
    implements SafeParcelable
{
    public static final class Builder
    {

        boolean includeAllMyTypes;
        final List mDeviceFilters = new ArrayList();
        final List messageTypes = new ArrayList();

        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new MessageFilterCreator();
    public static final MessageFilter INCLUDE_ALL_MY_TYPES;
    final boolean includeAllMyTypes;
    final List mDeviceFilters;
    final List mMessageTypes;
    final int mVersionCode;

    MessageFilter(int i, List list, List list1, boolean flag)
    {
        mVersionCode = i;
        mMessageTypes = Collections.unmodifiableList((List)Preconditions.checkNotNull(list));
        includeAllMyTypes = flag;
        list = list1;
        if (list1 == null)
        {
            list = Collections.emptyList();
        }
        mDeviceFilters = Collections.unmodifiableList(list);
    }

    private MessageFilter(List list, List list1, boolean flag)
    {
        this(1, list, list1, flag);
    }

    private MessageFilter(List list, List list1, boolean flag, byte byte0)
    {
        this(list, list1, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MessageFilter))
            {
                return false;
            }
            obj = (MessageFilter)obj;
            if (includeAllMyTypes != ((MessageFilter) (obj)).includeAllMyTypes || !Objects.equal(mMessageTypes, ((MessageFilter) (obj)).mMessageTypes) || !Objects.equal(mDeviceFilters, ((MessageFilter) (obj)).mDeviceFilters))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mMessageTypes, mDeviceFilters, Boolean.valueOf(includeAllMyTypes)
        });
    }

    public String toString()
    {
        return (new StringBuilder("MessageFilter{includeAllMyTypes=")).append(includeAllMyTypes).append(", messageTypes=").append(mMessageTypes).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MessageFilterCreator.writeToParcel$1fcaecb8(this, parcel);
    }

    static 
    {
        boolean flag1 = true;
        Builder builder = new Builder();
        builder.includeAllMyTypes = true;
        boolean flag = flag1;
        if (!builder.includeAllMyTypes)
        {
            if (!builder.messageTypes.isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        Preconditions.checkState(flag, "At least one of the include methods must be called.");
        INCLUDE_ALL_MY_TYPES = new MessageFilter(builder.messageTypes, builder.mDeviceFilters, builder.includeAllMyTypes, (byte)0);
    }
}
