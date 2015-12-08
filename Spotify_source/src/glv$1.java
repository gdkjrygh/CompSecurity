// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.exo.DashManifestLoader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ang.Object
    implements Runnable
{

    private Set a;
    private glv b;

    public final void run()
    {
        HashSet hashset = new HashSet();
        do
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                Object obj = (PlayerTrack)iterator.next();
                if (!((PlayerTrack) (obj)).metadata().containsKey("media.manifest_id"))
                {
                    Logger.c("Track does not contain manifest id", new Object[0]);
                } else
                {
                    String s = (String)((PlayerTrack) (obj)).metadata().get("media.manifest_id");
                    obj = (String)((PlayerTrack) (obj)).metadata().get("media.start_position");
                    int i;
                    if (obj == null)
                    {
                        i = 0;
                    } else
                    {
                        i = Integer.parseInt(((String) (obj)));
                    }
                    if (i == 0)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (i != 0)
                    {
                        glv.a(b).add(s);
                    }
                    hashset.add(s);
                    glv.b(b).a(s, b);
                }
            }

            glv.c(b).a(hashset);
            return;
        } while (true);
    }

    (glv glv1, Set set)
    {
        b = glv1;
        a = set;
        super();
    }
}
