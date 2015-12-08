// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.video.model.TrackWithPlayOrigin;
import java.util.Map;

public final class gjz
{

    public final String a;
    public final TrackWithPlayOrigin b;
    final boolean c;
    boolean d;
    azq e[];
    Map f;
    long g;

    public gjz()
    {
        a = null;
        b = null;
        c = false;
        d = false;
    }

    public gjz(TrackWithPlayOrigin trackwithplayorigin, boolean flag)
    {
        a = trackwithplayorigin.playbackId;
        b = trackwithplayorigin;
        c = flag;
        d = true;
    }

    public final azq a()
    {
        boolean flag;
        if (e != null && e.length > 0 && e[0] != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return null;
        } else
        {
            return e[0];
        }
    }
}
