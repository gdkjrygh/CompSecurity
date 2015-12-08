// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.spotlets.share.oauth.model.OAuthInfo;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import fhi;
import fhj;
import fhk;
import fhl;
import fht;
import fhx;
import fys;
import java.util.Locale;

public abstract class <init> extends Enum
    implements fhj, fhx
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static d e;
    private static final d f[];
    fhi mConnectDialogFragment;
    public String mName;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/mobile/android/spotlets/share/model/Network$Type, s);
    }

    public static <init>[] values()
    {
        return (<init>[])f.clone();
    }

    public final String a()
    {
        return toString().toLowerCase(Locale.ENGLISH);
    }

    static 
    {
        a = new Network.Type("FACEBOOK", "Facebook") {

            public final fhi a(Flags flags)
            {
                return new fhk();
            }

            public final OAuthInfo b()
            {
                return null;
            }

        };
        b = new Network.Type("TWITTER", "Twitter") {

            public final fhi a(Flags flags)
            {
                if (((String)flags.a(fys.Y)).equals("Enabled"))
                {
                    return fht.a(this);
                } else
                {
                    return fhl.a(this);
                }
            }

            public final OAuthInfo b()
            {
                return OAuthInfo.a;
            }

        };
        c = new Network.Type("TUMBLR", "Tumblr") {

            public final fhi a(Flags flags)
            {
                if (((String)flags.a(fys.Y)).equals("Enabled"))
                {
                    return fht.a(this);
                } else
                {
                    return fhl.a(this);
                }
            }

            public final OAuthInfo b()
            {
                return OAuthInfo.b;
            }

        };
        e = new Network.Type("GOOGLE_PLUS", "Google+") {

            public final fhi a(Flags flags)
            {
                return null;
            }

            public final OAuthInfo b()
            {
                return null;
            }

        };
        d = new Network.Type("SPOTIFY", "Spotify") {

            public final fhi a(Flags flags)
            {
                return null;
            }

            public final OAuthInfo b()
            {
                return null;
            }

        };
        f = (new f[] {
            a, b, c, e, d
        });
    }

    private _cls5(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    mName(String s, int i, String s1, byte byte0)
    {
        this(s, i, s1);
    }
}
