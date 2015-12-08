// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.spotlets.applink.AppLinkImpl;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class egs
    implements dmx
{

    public AppLinkImpl a;

    public egs()
    {
    }

    public static efz a(efy efy, MediaService mediaservice, egq egq1, eay eay)
    {
        return new efz(efy, mediaservice, egq1, eay);
    }

    public static egq a(Context context)
    {
        return new egq(context);
    }

    public static egr a()
    {
        return new egr();
    }

    public static egl b(Context context)
    {
        return new egl(context);
    }

    public static ScheduledExecutorService b()
    {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
