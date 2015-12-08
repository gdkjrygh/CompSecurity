// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.internal.provider.SpotifyProvider;
import java.util.AbstractMap;
import java.util.HashMap;

public final class WaitReason
{

    public static final Uri a;
    private static final AbstractMap b;

    public static int a(String s)
    {
        s = (Integer)b.get(s);
        if (s == null)
        {
            return 1;
        } else
        {
            return s.intValue();
        }
    }

    public static boolean a(int i)
    {
        return i == 1;
    }

    public static boolean a(int i, int j)
    {
        return e(i) && j < 100;
    }

    public static WaitReason b(int i)
    {
        class WaitReason extends Enum
        {

            public static final WaitReason a;
            public static final WaitReason b;
            public static final WaitReason c;
            public static final WaitReason d;
            public static final WaitReason e;
            private static final WaitReason f[];

            public static WaitReason valueOf(String s)
            {
                return (WaitReason)Enum.valueOf(com/spotify/mobile/android/provider/Metadata$OfflineSync$WaitReason, s);
            }

            public static WaitReason[] values()
            {
                return (WaitReason[])f.clone();
            }

            static 
            {
                a = new WaitReason("UNKNOWN", 0);
                b = new WaitReason("WAITING", 1);
                c = new WaitReason("NO_INTERNET", 2);
                d = new WaitReason("IN_OFFLINE_MODE", 3);
                e = new WaitReason("SYNC_NOT_ALLOWED", 4);
                f = (new WaitReason[] {
                    a, b, c, d, e
                });
            }

            private WaitReason(String s, int i)
            {
                super(s, i);
            }
        }

        if (!e(i))
        {
            return WaitReason.a;
        }
        switch (i)
        {
        default:
            Assertion.a((new StringBuilder("Offline state ")).append(i).append(" is not a waiting state.").toString());
            return WaitReason.a;

        case 4: // '\004'
            return WaitReason.b;

        case 5: // '\005'
            return WaitReason.c;

        case 6: // '\006'
            return WaitReason.d;

        case 7: // '\007'
            return WaitReason.e;
        }
    }

    public static boolean b(int i, int j)
    {
        return i == 2 || e(i) && j == 100;
    }

    public static boolean c(int i)
    {
        return i == 3;
    }

    public static boolean d(int i)
    {
        return i == 2;
    }

    private static boolean e(int i)
    {
        return i == 4 || i == 5 || i == 6 || i == 7;
    }

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/offlinesync").toString());
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("no", Integer.valueOf(1));
        b.put("waiting", Integer.valueOf(4));
        b.put("waitingOfflineMode", Integer.valueOf(6));
        b.put("waitingSyncNotAllowed", Integer.valueOf(7));
        b.put("waitingNoConnection", Integer.valueOf(5));
        b.put("downloading", Integer.valueOf(3));
        b.put("yes", Integer.valueOf(2));
        b.put("error", Integer.valueOf(1));
        b.put("expired", Integer.valueOf(1));
        b.put("exceeded", Integer.valueOf(1));
        b.put("resync", Integer.valueOf(1));
    }
}
