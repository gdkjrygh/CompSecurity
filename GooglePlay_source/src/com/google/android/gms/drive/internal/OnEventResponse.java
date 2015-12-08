// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponseCreator

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnEventResponseCreator();
    public final ChangeEvent mChangeEvent;
    public final ChangesAvailableEvent mChangesAvailableEvent;
    public final CompletionEvent mCompletionEvent;
    public final int mEventType;
    public final ProgressEvent mProgressEvent;
    public final QueryResultEventParcelable mQueryResultEvent;
    final int mVersionCode;

    OnEventResponse(int i, int j, ChangeEvent changeevent, CompletionEvent completionevent, QueryResultEventParcelable queryresulteventparcelable, ChangesAvailableEvent changesavailableevent, ProgressEvent progressevent)
    {
        mVersionCode = i;
        mEventType = j;
        mChangeEvent = changeevent;
        mCompletionEvent = completionevent;
        mQueryResultEvent = queryresulteventparcelable;
        mChangesAvailableEvent = changesavailableevent;
        mProgressEvent = progressevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OnEventResponseCreator.writeToParcel(this, parcel, i);
    }

}
