// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import com.spotify.mobile.android.service.SpotifyService;

public final class dwh extends dwj
{

    public dwh(Context context)
    {
        super(context, com/spotify/mobile/android/service/SpotifyService, new dwl() {

            public final Object a(IBinder ibinder)
            {
                return SpotifyService.e(((dvt)ibinder).a);
            }

        });
    }
}
