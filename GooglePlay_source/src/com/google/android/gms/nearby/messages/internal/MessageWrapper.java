// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageWrapperCreator

public class MessageWrapper
    implements SafeParcelable
{

    public static final MessageWrapperCreator CREATOR = new MessageWrapperCreator();
    final int mVersionCode;
    public final Message message;

    MessageWrapper(int i, Message message1)
    {
        mVersionCode = i;
        message = (Message)Preconditions.checkNotNull(message1);
    }

    public static final MessageWrapper create(Message message1)
    {
        return new MessageWrapper(1, message1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MessageWrapper))
        {
            return false;
        } else
        {
            obj = (MessageWrapper)obj;
            return Objects.equal(message, ((MessageWrapper) (obj)).message);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            message
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MessageWrapperCreator.writeToParcel(this, parcel, i);
    }

}
