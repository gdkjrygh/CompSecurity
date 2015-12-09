// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public final class OnEventResponseCreator
    implements android.os.Parcelable.Creator
{

    public OnEventResponseCreator()
    {
    }

    static void writeToParcel(OnEventResponse oneventresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, oneventresponse.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, oneventresponse.mEventType);
        SafeParcelWriter.writeParcelable(parcel, 3, oneventresponse.mChangeEvent, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, oneventresponse.mCompletionEvent, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, oneventresponse.mQueryResultEvent, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, oneventresponse.mChangesAvailableEvent, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, oneventresponse.mProgressEvent, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        ProgressEvent progressevent = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        ChangesAvailableEvent changesavailableevent = null;
        QueryResultEventParcelable queryresulteventparcelable = null;
        CompletionEvent completionevent = null;
        ChangeEvent changeevent = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 4: // '\004'
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
                    changeevent = (ChangeEvent)SafeParcelReader.createParcelable(parcel, l, ChangeEvent.CREATOR);
                    break;

                case 5: // '\005'
                    completionevent = (CompletionEvent)SafeParcelReader.createParcelable(parcel, l, CompletionEvent.CREATOR);
                    break;

                case 6: // '\006'
                    queryresulteventparcelable = (QueryResultEventParcelable)SafeParcelReader.createParcelable(parcel, l, QueryResultEventParcelable.CREATOR);
                    break;

                case 7: // '\007'
                    changesavailableevent = (ChangesAvailableEvent)SafeParcelReader.createParcelable(parcel, l, ChangesAvailableEvent.CREATOR);
                    break;

                case 8: // '\b'
                    progressevent = (ProgressEvent)SafeParcelReader.createParcelable(parcel, l, ProgressEvent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OnEventResponse(j, i, changeevent, completionevent, queryresulteventparcelable, changesavailableevent, progressevent);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OnEventResponse[i];
    }
}
