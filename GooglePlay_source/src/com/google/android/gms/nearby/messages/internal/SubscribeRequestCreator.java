// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            SubscribeRequest, IMessageListener, INearbyMessagesCallback, ISubscribeCallback

public final class SubscribeRequestCreator
    implements android.os.Parcelable.Creator
{

    public SubscribeRequestCreator()
    {
    }

    static void writeToParcel(SubscribeRequest subscriberequest, Parcel parcel, int i)
    {
        Object obj = null;
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, subscriberequest.mVersionCode);
        android.os.IBinder ibinder;
        if (subscriberequest.messageListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = subscriberequest.messageListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, ibinder);
        SafeParcelWriter.writeParcelable(parcel, 3, subscriberequest.strategy, i, false);
        if (subscriberequest.callback == null)
        {
            ibinder = null;
        } else
        {
            ibinder = subscriberequest.callback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 4, ibinder);
        SafeParcelWriter.writeParcelable(parcel, 5, subscriberequest.filter, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, subscriberequest.pendingIntent, i, false);
        SafeParcelWriter.writeInt(parcel, 7, subscriberequest.messageListenerKey);
        SafeParcelWriter.writeString(parcel, 8, subscriberequest.zeroPartyPackageName, false);
        SafeParcelWriter.writeString(parcel, 9, subscriberequest.realClientPackageName, false);
        SafeParcelWriter.writeByteArray(parcel, 10, subscriberequest.hint, false);
        SafeParcelWriter.writeBoolean(parcel, 11, subscriberequest.isIgnoreNearbyPermission);
        if (subscriberequest.subscribeCallback == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = subscriberequest.subscribeCallback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 12, ibinder);
        SafeParcelWriter.writeBoolean(parcel, 13, subscriberequest.useRealClientApiKey);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        android.os.IBinder ibinder2 = null;
        Strategy strategy = null;
        android.os.IBinder ibinder1 = null;
        MessageFilter messagefilter = null;
        PendingIntent pendingintent = null;
        int i = 0;
        String s1 = null;
        String s = null;
        byte abyte0[] = null;
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
        boolean flag = false;
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
                    ibinder2 = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 3: // '\003'
                    strategy = (Strategy)SafeParcelReader.createParcelable(parcel, l, Strategy.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 5: // '\005'
                    messagefilter = (MessageFilter)SafeParcelReader.createParcelable(parcel, l, MessageFilter.CREATOR);
                    break;

                case 6: // '\006'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, l, PendingIntent.CREATOR);
                    break;

                case 7: // '\007'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 10: // '\n'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l);
                    break;

                case 11: // '\013'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 12: // '\f'
                    ibinder = SafeParcelReader.readIBinder(parcel, l);
                    break;

                case 13: // '\r'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new SubscribeRequest(j, ibinder2, strategy, ibinder1, messagefilter, pendingintent, i, s1, s, abyte0, flag1, ibinder, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SubscribeRequest[i];
    }
}
