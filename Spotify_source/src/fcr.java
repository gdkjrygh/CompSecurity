// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.player.notifications.PlayerNotificationType;

final class fcr
{

    final PlayerNotificationType a;
    final int b;
    final int c;

    fcr(PlayerNotificationType playernotificationtype, int i, int j)
    {
        a = playernotificationtype;
        b = i;
        c = j;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof fcr) && ((fcr)obj).a == a;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    // Unreferenced inner class fcr$1

/* anonymous class */
    final class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[PlayerNotificationType.values().length];
            try
            {
                a[PlayerNotificationType.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[PlayerNotificationType.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[PlayerNotificationType.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
