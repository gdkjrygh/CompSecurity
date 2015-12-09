// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsRequest

public final class CloseContentsRequestCreator
    implements android.os.Parcelable.Creator
{

    public CloseContentsRequestCreator()
    {
    }

    static void writeToParcel(CloseContentsRequest closecontentsrequest, Parcel parcel, int i)
    {
        boolean flag = true;
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, closecontentsrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, closecontentsrequest.mContentsReference, i, false);
        Boolean boolean1 = closecontentsrequest.mSaveResults;
        if (boolean1 != null)
        {
            SafeParcelWriter.writeHeader(parcel, 3, 4);
            if (boolean1.booleanValue())
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }
        SafeParcelWriter.writeInt(parcel, 4, closecontentsrequest.mContentsRequestId);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        Boolean boolean1 = null;
        Contents contents = null;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    contents = (Contents)SafeParcelReader.createParcelable(parcel, l, Contents.CREATOR);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readSize(parcel, l);
                    if (l == 0)
                    {
                        boolean1 = null;
                    } else
                    {
                        SafeParcelReader.enforceSize$ae3cd4b(parcel, l, 4);
                        boolean flag;
                        if (parcel.readInt() != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        boolean1 = Boolean.valueOf(flag);
                    }
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CloseContentsRequest(i, contents, boolean1, j);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CloseContentsRequest[i];
    }
}
