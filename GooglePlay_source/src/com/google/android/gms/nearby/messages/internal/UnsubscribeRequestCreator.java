// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            UnsubscribeRequest, INearbyMessagesCallback, IMessageListener

public final class UnsubscribeRequestCreator
    implements android.os.Parcelable.Creator
{

    public UnsubscribeRequestCreator()
    {
    }

    static void writeToParcel(UnsubscribeRequest unsubscriberequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, unsubscriberequest.mVersionCode);
        android.os.IBinder ibinder;
        if (unsubscriberequest.messageListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = unsubscriberequest.messageListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, ibinder);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, unsubscriberequest.callback.asBinder());
        SafeParcelWriter.writeParcelable(parcel, 4, unsubscriberequest.pendingIntent, i, false);
        SafeParcelWriter.writeInt(parcel, 5, unsubscriberequest.messageListenerKey);
        SafeParcelWriter.writeString(parcel, 6, unsubscriberequest.zeroPartyPackageName, false);
        SafeParcelWriter.writeString(parcel, 7, unsubscriberequest.realClientPackageName, false);
        SafeParcelWriter.writeBoolean(parcel, 8, unsubscriberequest.useRealClientApiKey);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        int i = 0;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder = null;
        android.os.IBinder ibinder1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 8: // '\b'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new UnsubscribeRequest(j, ibinder1, ibinder, pendingintent, i, s1, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UnsubscribeRequest[i];
    }
}
