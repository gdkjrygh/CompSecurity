// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class ekr
{

    public static boolean a(Flags flags)
    {
        return ((Boolean)flags.a(fys.O)).booleanValue();
    }

    // Unreferenced inner class ekr$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
            try
            {
                a[com.spotify.mobile.android.util.SpotifyLink.LinkType.o.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.spotify.mobile.android.util.SpotifyLink.LinkType.p.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.spotify.mobile.android.util.SpotifyLink.LinkType.q.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
