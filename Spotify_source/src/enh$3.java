// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements hfb
{

    private enh a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        Logger.b(throwable, "Failed to get followed count for %s", new Object[] {
            enh.i(a)
        });
    }

    public final void onNext(Object obj)
    {
        obj = (com.spotify.mobile.android.spotlets.follow.owersCountResolver.Count)obj;
        enh.a(a, a.b.a(enh.i(a)));
        if (enh.y(a) == null)
        {
            enh.a(a, new eso(enh.i(a), ((com.spotify.mobile.android.spotlets.follow.owersCountResolver.Count) (obj)).getFollowersCount(), ((com.spotify.mobile.android.spotlets.follow.owersCountResolver.Count) (obj)).getFollowingCount(), enh.g(a)));
        } else
        {
            enh.y(a).c = ((com.spotify.mobile.android.spotlets.follow.owersCountResolver.Count) (obj)).getFollowersCount();
            enh.y(a).b = ((com.spotify.mobile.android.spotlets.follow.owersCountResolver.Count) (obj)).getFollowingCount();
        }
        a.b.a(enh.y(a));
    }

    (enh enh1)
    {
        a = enh1;
        super();
    }
}
