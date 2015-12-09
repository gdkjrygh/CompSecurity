// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.squareup.picasso.Picasso;

public final class eqd
{

    public static transient void a(Flags flags, PlayerTrack aplayertrack[])
    {
        if (aplayertrack != null)
        {
            int j = aplayertrack.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = aplayertrack[i];
                if (fbn.a(((PlayerTrack) (obj))))
                {
                    obj = fbn.a(((PlayerTrack) (obj)), flags, fbn.b(((PlayerTrack) (obj))));
                } else
                {
                    obj = fbn.c(((PlayerTrack) (obj)));
                }
                if (!Uri.EMPTY.equals(obj))
                {
                    ((gft)dmz.a(gft)).a().a(((Uri) (obj))).e();
                }
                i++;
            }
        }
    }
}
