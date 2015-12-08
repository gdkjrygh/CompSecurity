// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            BaseNativeAdWebPhoto

public class AdmobNativeAdWebPhoto extends BaseNativeAdWebPhoto
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AdmobNativeAdWebPhoto createFromParcel(Parcel parcel)
        {
            return new AdmobNativeAdWebPhoto();
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AdmobNativeAdWebPhoto[] newArray(int i)
        {
            return new AdmobNativeAdWebPhoto[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private j mLoadTask;

    AdmobNativeAdWebPhoto()
    {
        super(WebPhoto.Category.AD_ADMOB);
        mLoadTask = null;
    }

    protected j load()
    {
        if (mLoadTask == null)
        {
            mLoadTask = ((a)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/a)).b(k.a());
        }
        return mLoadTask;
    }

}
