// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import com.spotify.mobile.android.service.feature.FeatureService;

public final class dxc extends dwn
{

    public dxc(Context context)
    {
        super(context, com/spotify/mobile/android/service/feature/FeatureService, new dwl() {

            public final volatile Object a(IBinder ibinder)
            {
                return ((dwy)ibinder).a;
            }

        });
    }
}
