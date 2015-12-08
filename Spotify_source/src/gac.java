// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.graphics.SpotifyIcon;
import java.lang.ref.WeakReference;

public final class gac
{

    public final com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState a;
    public final int b;
    public final int c;
    public final SpotifyIcon d;
    public WeakReference e;

    private gac(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate, SpotifyIcon spotifyicon, int i, int j)
    {
        e = new WeakReference(null);
        a = contentstate;
        d = spotifyicon;
        b = i;
        c = j;
    }

    gac(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate, SpotifyIcon spotifyicon, int i, int j, byte byte0)
    {
        this(contentstate, spotifyicon, i, j);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gac)
        {
            flag = flag1;
            if (((gac)obj).a.mPriority == a.mPriority)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a.mPriority;
    }
}
