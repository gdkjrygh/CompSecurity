// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.share.util.AppInfoHelper;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToFacebookRecipient;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanSendToRecipient;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fwg
{

    public final Context a;
    public final String b;
    public final String c;
    public final CanSendToRecipient d;
    public final CanSendToFacebookRecipient e;
    public final SpotifyContextMenu f;
    public fuk g;
    public final AppInfoHelper h;
    private final Verified i;

    public fwg(Context context, String s, String s1, Verified verified, CanSendToRecipient cansendtorecipient, CanSendToFacebookRecipient cansendtofacebookrecipient, SpotifyContextMenu spotifycontextmenu, 
            fxe fxe1)
    {
        a = context;
        b = s;
        c = s1;
        i = verified;
        d = cansendtorecipient;
        e = cansendtofacebookrecipient;
        f = spotifycontextmenu;
        g = new fuk(context, i, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu, (fxe)ctz.a(fxe1));
        h = new AppInfoHelper(context.getPackageManager());
    }

    public static String a(SpotifyLink spotifylink, String s)
    {
        return (new StringBuilder()).append(s).append("\n").append(spotifylink.e()).toString();
    }

    public final String a(SpotifyLink spotifylink, boolean flag)
    {
        public final class _cls1
        {

            public static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.x.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.v.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aO.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aS.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.P.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[spotifylink.c.ordinal()])
        {
        default:
            Assertion.a((new StringBuilder("Unsupported link type ")).append(spotifylink.c).toString());
            return "";

        case 1: // '\001'
        case 2: // '\002'
            return a.getString(0x7f0804d9);

        case 3: // '\003'
        case 4: // '\004'
            spotifylink = a;
            int j;
            if (flag)
            {
                j = 0x7f0804d8;
            } else
            {
                j = 0x7f0804d7;
            }
            return spotifylink.getString(j);

        case 5: // '\005'
            spotifylink = a;
            int k;
            if (flag)
            {
                k = 0x7f0804e0;
            } else
            {
                k = 0x7f0804df;
            }
            return spotifylink.getString(k);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            spotifylink = a;
            int l;
            if (flag)
            {
                l = 0x7f0804db;
            } else
            {
                l = 0x7f0804da;
            }
            return spotifylink.getString(l);

        case 9: // '\t'
        case 10: // '\n'
            spotifylink = a;
            break;
        }
        int i1;
        if (flag)
        {
            i1 = 0x7f0804de;
        } else
        {
            i1 = 0x7f0804dd;
        }
        return spotifylink.getString(i1);
    }
}
