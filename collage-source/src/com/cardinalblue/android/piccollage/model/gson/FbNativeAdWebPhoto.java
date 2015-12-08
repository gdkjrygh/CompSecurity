// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import bolts.j;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            BaseNativeAdWebPhoto

public class FbNativeAdWebPhoto extends BaseNativeAdWebPhoto
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FbNativeAdWebPhoto createFromParcel(Parcel parcel)
        {
            return new FbNativeAdWebPhoto();
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FbNativeAdWebPhoto[] newArray(int i)
        {
            return new FbNativeAdWebPhoto[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };

    FbNativeAdWebPhoto()
    {
        super(WebPhoto.Category.AD_FACEBOOK);
    }

    protected j load()
    {
        final bolts.j.a source = j.a();
        j.a(new Callable() {

            final FbNativeAdWebPhoto this$0;
            final bolts.j.a val$source;

            public Object call()
                throws Exception
            {
                NativeAd nativead = new NativeAd(k.a(), "217116108329566_720057204702118");
                if (!d.e());
                nativead.setAdListener(nativead. new AdListener() {

                    final _cls1 this$1;
                    final NativeAd val$nativeAd;

                    public void onAdClicked(Ad ad)
                    {
                    }

                    public void onAdLoaded(Ad ad)
                    {
                        source.b(nativeAd);
                    }

                    public void onError(Ad ad, AdError aderror)
                    {
                        source.b(new Exception(aderror.getErrorMessage()));
                    }

            
            {
                this$1 = final__pcls1;
                nativeAd = NativeAd.this;
                super();
            }
                });
                nativead.loadAd();
                return null;
            }

            
            {
                this$0 = FbNativeAdWebPhoto.this;
                source = a;
                super();
            }
        }, j.b);
        return source.a();
    }

}
