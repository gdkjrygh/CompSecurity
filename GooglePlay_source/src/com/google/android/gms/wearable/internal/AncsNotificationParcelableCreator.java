// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable

public final class AncsNotificationParcelableCreator
    implements android.os.Parcelable.Creator
{

    public AncsNotificationParcelableCreator()
    {
    }

    static void writeToParcel$4e9d8cf1(AncsNotificationParcelable ancsnotificationparcelable, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, ancsnotificationparcelable.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, ancsnotificationparcelable.mId);
        SafeParcelWriter.writeString(parcel, 3, ancsnotificationparcelable.mAppId, false);
        SafeParcelWriter.writeString(parcel, 4, ancsnotificationparcelable.mDateTime, false);
        SafeParcelWriter.writeString(parcel, 5, ancsnotificationparcelable.mNotificationText, false);
        SafeParcelWriter.writeString(parcel, 6, ancsnotificationparcelable.mTitle, false);
        SafeParcelWriter.writeString(parcel, 7, ancsnotificationparcelable.mSubtitle, false);
        String s;
        if (ancsnotificationparcelable.mDisplayName == null)
        {
            s = ancsnotificationparcelable.mAppId;
        } else
        {
            s = ancsnotificationparcelable.mDisplayName;
        }
        SafeParcelWriter.writeString(parcel, 8, s, false);
        SafeParcelWriter.writeByte(parcel, 9, ancsnotificationparcelable.mEventId);
        SafeParcelWriter.writeByte(parcel, 10, ancsnotificationparcelable.mEventFlags);
        SafeParcelWriter.writeByte(parcel, 11, ancsnotificationparcelable.mCategoryId);
        SafeParcelWriter.writeByte(parcel, 12, ancsnotificationparcelable.mCategoryCount);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = SafeParcelReader.readByte(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = SafeParcelReader.readByte(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AncsNotificationParcelable(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AncsNotificationParcelable[i];
    }
}
