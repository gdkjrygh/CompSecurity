// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.cardinalblue.android.piccollage.view.a;
import com.cardinalblue.android.piccollage.view.b;
import com.cardinalblue.android.piccollage.view.d;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            AdmobNativeAdWebPhoto, FbNativeAdWebPhoto, BaseNativeAdWebPhoto

public class NativeAdFactory
{
    public static final class AdType extends Enum
    {

        private static final AdType $VALUES[];
        public static final AdType ADMOB;
        public static final AdType FB;
        public final String name;

        public static AdType valueOf(String s)
        {
            return (AdType)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/NativeAdFactory$AdType, s);
        }

        public static AdType[] values()
        {
            return (AdType[])$VALUES.clone();
        }

        static 
        {
            FB = new AdType("FB", 0, "facebook");
            ADMOB = new AdType("ADMOB", 1, "admob");
            $VALUES = (new AdType[] {
                FB, ADMOB
            });
        }

        private AdType(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }


    public NativeAdFactory()
    {
    }

    public static BaseNativeAdWebPhoto create(AdType adtype)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$cardinalblue$android$piccollage$model$gson$NativeAdFactory$AdType[];

            static 
            {
                $SwitchMap$com$cardinalblue$android$piccollage$model$gson$NativeAdFactory$AdType = new int[AdType.values().length];
                try
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$NativeAdFactory$AdType[AdType.FB.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$NativeAdFactory$AdType[AdType.ADMOB.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.cardinalblue.android.piccollage.model.gson.NativeAdFactory.AdType[adtype.ordinal()])
        {
        default:
            return new AdmobNativeAdWebPhoto();

        case 1: // '\001'
            return new FbNativeAdWebPhoto();
        }
    }

    public static BaseNativeAdWebPhoto create(String s)
    {
        return create(getType(s));
    }

    public static a createViewHolder(Context context, String s, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        s = getType(s);
        switch (_cls1..SwitchMap.com.cardinalblue.android.piccollage.model.gson.NativeAdFactory.AdType[s.ordinal()])
        {
        default:
            return new b(context, layoutinflater.inflate(0x7f03008a, viewgroup, false));

        case 1: // '\001'
            return new d(context, layoutinflater.inflate(0x7f030089, viewgroup, false));
        }
    }

    private static AdType getType(String s)
    {
        AdType adtype = AdType.ADMOB;
        if (AdType.FB.name.equals(s))
        {
            adtype = AdType.FB;
        }
        return adtype;
    }
}
