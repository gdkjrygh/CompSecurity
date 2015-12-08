// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            rl, kl

public class rk
    implements SafeParcelable
{

    public static final rl CREATOR = new rl();
    private final int aBD;
    private final int aBE;
    private final boolean mUseLargePictureForCp2Images;
    private final int mVersionCode;

    rk(int i, int j, int k, boolean flag)
    {
        mVersionCode = i;
        aBD = j;
        aBE = k;
        mUseLargePictureForCp2Images = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int qI()
    {
        return aBD;
    }

    public final int qJ()
    {
        return aBE;
    }

    public final boolean qK()
    {
        return mUseLargePictureForCp2Images;
    }

    public String toString()
    {
        return kl.j(this).a("imageSize", Integer.valueOf(aBD)).a("avatarOptions", Integer.valueOf(aBE)).a("useLargePictureForCp2Images", Boolean.valueOf(mUseLargePictureForCp2Images)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        rl.a(this, parcel, i);
    }

}
