// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageTypeCreator

public class MessageType
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new MessageTypeCreator();
    final int mVersionCode;
    public final String namespace;
    public final String type;

    MessageType(int i, String s, String s1)
    {
        mVersionCode = i;
        namespace = s;
        type = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MessageType))
            {
                return false;
            }
            obj = (MessageType)obj;
            if (!Objects.equal(namespace, ((MessageType) (obj)).namespace) || !Objects.equal(type, ((MessageType) (obj)).type))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            namespace, type
        });
    }

    public String toString()
    {
        return (new StringBuilder("namespace=")).append(namespace).append(", type=").append(type).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MessageTypeCreator.writeToParcel$11c2bab6(this, parcel);
    }

}
