// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Arrays;

public final class gpg
{

    public RadioStationModel a;
    public gpk b;
    public String c;
    public String d;
    boolean e;
    boolean f;

    public gpg()
    {
        a = null;
        b = new gpk(new RadioStationTracksModel(new PlayerTrack[0], ""), ViewUri.h, null);
        d = "";
        e = false;
        f = false;
    }

    public final ThumbState a()
    {
        return b.a(d);
    }

    final void a(RadioStationModel radiostationmodel, gpk gpk1)
    {
        ctz.a(gpk1);
        a = radiostationmodel;
        b = gpk1;
        e = false;
        f = false;
    }

    public final boolean b()
    {
        return gpl.f(c) && (a == null || !a.isMyContext(c));
    }

    public final boolean c()
    {
        return gpl.f(c) && e;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gpg)
        {
            obj = (gpg)obj;
            flag = flag1;
            if (cty.a(a, ((gpg) (obj)).a))
            {
                flag = flag1;
                if (cty.a(d, ((gpg) (obj)).d))
                {
                    flag = flag1;
                    if (e == ((gpg) (obj)).e)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, d, Boolean.valueOf(e)
        });
    }
}
