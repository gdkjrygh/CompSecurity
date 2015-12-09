// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.events:
//            CompletionEvent

public final class CompletionEventCreator
    implements android.os.Parcelable.Creator
{

    public CompletionEventCreator()
    {
    }

    static void writeToParcel(CompletionEvent completionevent, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, completionevent.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, completionevent.mDriveId, i, false);
        SafeParcelWriter.writeString(parcel, 3, completionevent.mAccountName, false);
        SafeParcelWriter.writeParcelable(parcel, 4, completionevent.mBaseParcelFileDescriptor, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, completionevent.mModifiedParcelFileDescriptor, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, completionevent.mModifiedMetadataBundle, i, false);
        SafeParcelWriter.writeStringList(parcel, 7, completionevent.mTrackingTags, false);
        SafeParcelWriter.writeInt(parcel, 8, completionevent.mStatus);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 9, completionevent.mReleaseCallback);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.IBinder ibinder = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        MetadataBundle metadatabundle = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        ParcelFileDescriptor parcelfiledescriptor1 = null;
        String s = null;
        DriveId driveid = null;
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
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, l, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    parcelfiledescriptor1 = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 5: // '\005'
                    parcelfiledescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 6: // '\006'
                    metadatabundle = (MetadataBundle)SafeParcelReader.createParcelable(parcel, l, MetadataBundle.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = SafeParcelReader.createStringList(parcel, l);
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 9: // '\t'
                    ibinder = SafeParcelReader.readIBinder(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CompletionEvent(j, driveid, s, parcelfiledescriptor1, parcelfiledescriptor, metadatabundle, arraylist, i, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CompletionEvent[i];
    }
}
