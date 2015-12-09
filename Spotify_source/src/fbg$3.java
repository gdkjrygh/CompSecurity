// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.widget.carousel.CarouselView;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Set;

final class nit> extends dhj
{

    private fbg a;

    public final void a(int i, int j)
    {
        fbg.a(a, true);
        fbg.a(a, i, j);
    }

    public final void b(int i)
    {
        abo abo = fbg.b(a).c(i);
        if (abo instanceof faw)
        {
            ((faw)abo).x();
            if (!fbg.c(a))
            {
                fbh fbh1 = fbg.a(a);
                Object obj = fbh1.a.getLastPlayerState();
                if (obj != null)
                {
                    obj = ((PlayerState) (obj)).restrictions().disallowSkippingNextReasons();
                    if (!((Set) (obj)).isEmpty() && ((Set) (obj)).contains("mft_disallow") && fbh1.c != null)
                    {
                        fbh1.c.b();
                    }
                }
            }
        }
        fbg.a(a, false);
    }

    (fbg fbg1)
    {
        a = fbg1;
        super();
    }
}
