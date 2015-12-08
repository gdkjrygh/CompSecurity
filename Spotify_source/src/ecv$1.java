// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import com.spotify.music.spotlets.radio.model.ThumbState;

final class ang.Object
    implements Runnable
{

    private ecv a;

    public final void run()
    {
        Object obj = a;
        if (((ecv) (obj)).a != null)
        {
            obj = fnu.a(new ecp(((ecv) (obj)).a.e, ((ecv) (obj)).a.a, null, ((ecv) (obj)).a.b, Uri.parse(((ecv) (obj)).a.d), ((ecv) (obj)).a.h, false, false, ((ecv) (obj)).a.g, ((ecv) (obj)).a.f, ThumbState.a, false, false, true));
        } else
        {
            obj = fnv.a;
        }
        a.e.obtainMessage(10, obj).sendToTarget();
    }

    (ecv ecv1)
    {
        a = ecv1;
        super();
    }
}
