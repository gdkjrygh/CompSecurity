// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            be, FileUploadPreferencesImpl

public class SetFileUploadPreferencesRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new be();
    final int CK;
    final FileUploadPreferencesImpl QK;

    SetFileUploadPreferencesRequest(int i, FileUploadPreferencesImpl fileuploadpreferencesimpl)
    {
        CK = i;
        QK = fileuploadpreferencesimpl;
    }

    public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl fileuploadpreferencesimpl)
    {
        this(1, fileuploadpreferencesimpl);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        be.a(this, parcel, i);
    }

}
