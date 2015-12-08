// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsDebugActivity

private static final class mFinskyUrl
{

    final String mDriveUrl;
    final String mFinskyUrl;
    final String mInternalVersion;
    final String mUrl;
    final String mVersion;

    public final boolean equals(Object obj)
    {
        if (obj instanceof mFinskyUrl)
        {
            if (Objects.equal(mUrl, ((mUrl) (obj = (mUrl)obj)).mUrl) && Objects.equal(mVersion, ((mVersion) (obj)).mVersion) && Objects.equal(mInternalVersion, ((mInternalVersion) (obj)).mInternalVersion) && Objects.equal(mDriveUrl, ((mDriveUrl) (obj)).mDriveUrl))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mUrl, mVersion, mInternalVersion, mDriveUrl
        });
    }

    public final String toString()
    {
        return String.format("url(%s), version(%s), internalVersion(%s), driveUrl(%s), finskyUrl(%s)", new Object[] {
            mUrl, mVersion, mInternalVersion, mDriveUrl, mFinskyUrl
        });
    }

    Q(String s, String s1, String s2, String s3)
    {
        this(s, s1, s2, s3, null);
    }

    <init>(String s, String s1, String s2, String s3, String s4)
    {
        mUrl = s;
        mVersion = s1;
        mInternalVersion = s2;
        mDriveUrl = s3;
        mFinskyUrl = s4;
    }
}
