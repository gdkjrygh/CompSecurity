// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.DriveLog;
import com.google.android.gms.drive.internal.IEventReleaseCallback;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, CompletionEventCreator

public final class CompletionEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new CompletionEventCreator();
    public final String mAccountName;
    final ParcelFileDescriptor mBaseParcelFileDescriptor;
    final DriveId mDriveId;
    private boolean mGetBaseInputStreamCalled;
    public boolean mGetModifiedInputStreamCalled;
    public final MetadataBundle mModifiedMetadataBundle;
    public final ParcelFileDescriptor mModifiedParcelFileDescriptor;
    final IBinder mReleaseCallback;
    private boolean mReleased;
    public final int mStatus;
    public final List mTrackingTags;
    final int mVersionCode;

    CompletionEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, List list, 
            int j, IBinder ibinder)
    {
        mGetBaseInputStreamCalled = false;
        mGetModifiedInputStreamCalled = false;
        mReleased = false;
        mVersionCode = i;
        mDriveId = driveid;
        mAccountName = s;
        mBaseParcelFileDescriptor = parcelfiledescriptor;
        mModifiedParcelFileDescriptor = parcelfiledescriptor1;
        mModifiedMetadataBundle = metadatabundle;
        mTrackingTags = list;
        mStatus = j;
        mReleaseCallback = ibinder;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getType()
    {
        return 2;
    }

    public final void release(boolean flag)
    {
        throwIfReleased();
        mReleased = true;
        IOUtils.closeQuietly(mBaseParcelFileDescriptor);
        IOUtils.closeQuietly(mModifiedParcelFileDescriptor);
        if (mModifiedMetadataBundle != null)
        {
            MetadataBundle metadatabundle = mModifiedMetadataBundle;
            MetadataField metadatafield = BasicFields.THUMBNAIL;
            if (metadatabundle.mValueBundle.containsKey(metadatafield.getName()))
            {
                BitmapTeleporter bitmapteleporter = (BitmapTeleporter)mModifiedMetadataBundle.get(BasicFields.THUMBNAIL);
                StringBuilder stringbuilder;
                if (!bitmapteleporter.mUnwrapped)
                {
                    try
                    {
                        bitmapteleporter.mFileDescriptor.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.w("BitmapTeleporter", "Could not close PFD", ((Throwable) (obj)));
                    }
                }
            }
        }
        if (mReleaseCallback == null)
        {
            stringbuilder = new StringBuilder("No callback on ");
            Object obj;
            if (flag)
            {
                obj = "snooze";
            } else
            {
                obj = "dismiss";
            }
            DriveLog.e("CompletionEvent", stringbuilder.append(((String) (obj))).toString());
            return;
        }
        try
        {
            com.google.android.gms.drive.internal.IEventReleaseCallback.Stub.asInterface(mReleaseCallback).release(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            StringBuilder stringbuilder1 = new StringBuilder("RemoteException on ");
            String s;
            if (flag)
            {
                s = "snooze";
            } else
            {
                s = "dismiss";
            }
            DriveLog.e("CompletionEvent", stringbuilder1.append(s).append(": ").append(remoteexception).toString());
            return;
        }
    }

    public final void throwIfReleased()
    {
        if (mReleased)
        {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        } else
        {
            return;
        }
    }

    public final String toString()
    {
        String s;
        if (mTrackingTags == null)
        {
            s = "<null>";
        } else
        {
            s = (new StringBuilder("'")).append(TextUtils.join("','", mTrackingTags)).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] {
            mDriveId, Integer.valueOf(mStatus), s
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CompletionEventCreator.writeToParcel(this, parcel, i | 1);
    }

}
