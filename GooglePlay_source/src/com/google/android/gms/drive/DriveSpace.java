// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.drive:
//            DriveSpaceCreator

public class DriveSpace
    implements SafeParcelable
{

    public static final Set ALL_SPACES;
    public static final String ALL_SPACES_STRING;
    public static final DriveSpace APP_DATA_FOLDER;
    public static final android.os.Parcelable.Creator CREATOR = new DriveSpaceCreator();
    public static final DriveSpace DRIVE;
    public static final DriveSpace PHOTOS;
    private static final Pattern UPPER_SNAKE_CASE_PATTERN = Pattern.compile("[A-Z0-9_]*");
    final String mName;
    final int mVersionCode;

    DriveSpace(int i, String s)
    {
        mVersionCode = i;
        mName = (String)Preconditions.checkNotNull(s);
    }

    private DriveSpace(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != com/google/android/gms/drive/DriveSpace)
        {
            return false;
        } else
        {
            return mName.equals(((DriveSpace)obj).mName);
        }
    }

    public int hashCode()
    {
        return 0x4a54c0de ^ mName.hashCode();
    }

    public String toString()
    {
        return mName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DriveSpaceCreator.writeToParcel$44248e37(this, parcel);
    }

    static 
    {
        DRIVE = new DriveSpace("DRIVE");
        APP_DATA_FOLDER = new DriveSpace("APP_DATA_FOLDER");
        PHOTOS = new DriveSpace("PHOTOS");
        ALL_SPACES = CollectionUtils.setOf(DRIVE, APP_DATA_FOLDER, PHOTOS);
        ALL_SPACES_STRING = TextUtils.join(",", ALL_SPACES.toArray());
    }
}
