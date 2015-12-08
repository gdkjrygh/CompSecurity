// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.player.EntityType;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class ezu
{

    private final Flags a;

    public ezu(Flags flags)
    {
        a = flags;
    }

    public final ezs a(PlayerState playerstate, String s)
    {
        EntityType entitytype = EntityType.a(playerstate, a);
        ezt ezt1 = new ezt(playerstate, s);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[EntityType.values().length];
                try
                {
                    a[EntityType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[EntityType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[EntityType.o.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[EntityType.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[EntityType.w.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[EntityType.u.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[EntityType.l.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[EntityType.d.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[EntityType.e.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[EntityType.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[EntityType.r.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[EntityType.g.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[EntityType.f.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[EntityType.i.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[EntityType.j.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[EntityType.q.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[EntityType.m.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[EntityType.n.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[EntityType.p.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[EntityType.v.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[EntityType.h.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[EntityType.t.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[EntityType.s.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[EntityType.x.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[entitytype.ordinal()])
        {
        default:
            return new ezs(entitytype.mTitleHolder, entitytype.mSubtitleHolder, ezt1.b);

        case 1: // '\001'
            playerstate = ezr.a(ezt1.h, "advertiser");
            s = ezr.a(ezt1.h, "click_url");
            return ezt.a(entitytype.mTitleHolder, new fas(playerstate), s);

        case 2: // '\002'
        case 3: // '\003'
            return ezt1.a(entitytype.mTitleHolder, new fas(ezt1.f));

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return ezt1.a(entitytype.mTitleHolder, new fas(ezt1.g));

        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            s = a;
            playerstate = ezt1.a;
            if (!ViewUri.h.a(playerstate))
            {
                if (gpl.a(s))
                {
                    playerstate = gpl.c(playerstate);
                    String s1;
                    if (playerstate == null)
                    {
                        playerstate = "";
                    }
                    s = (String)playerstate;
                    playerstate = gpl.b(s);
                    if (playerstate == null)
                    {
                        playerstate = "";
                    }
                    s1 = (String)playerstate;
                    playerstate = s;
                    if (ViewUri.V.b(s1))
                    {
                        playerstate = s1;
                    }
                } else
                if (ViewUri.ag.b(playerstate))
                {
                    playerstate = ViewUri.h.toString();
                } else
                {
                    playerstate = gpl.c(playerstate);
                    if (playerstate == null)
                    {
                        playerstate = "";
                    }
                    playerstate = (String)playerstate;
                }
            }
            return ezt.a(entitytype.mTitleHolder, new fas(ezt1.c), playerstate);

        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            if (TextUtils.isEmpty(ezt1.d) || ezt1.d.equals(ezt1.e))
            {
                return ezt1.a(entitytype.mTitleHolder, new fas(ezt1.c));
            } else
            {
                playerstate = new ezq(0x7f0803f8, new Object[] {
                    ezt1.c, ezt1.d
                });
                return ezt1.a(entitytype.mTitleHolder, playerstate);
            }

        case 18: // '\022'
            playerstate = "";
            if (SpotifyLink.b(ezt1.a))
            {
                playerstate = (new SpotifyLink(ezt1.a)).a.getLastPathSegment();
            }
            playerstate = new ezq(0x7f0803f9, new Object[] {
                playerstate
            });
            return ezt1.a(entitytype.mTitleHolder, playerstate);

        case 19: // '\023'
            if (TextUtils.isEmpty(ezt1.d) || ezt1.d.equals(ezt1.e))
            {
                return ezt1.a(entitytype.mTitleHolder, entitytype.mSubtitleHolder);
            } else
            {
                playerstate = new ezl(new ezq(0x7f0803fa, new Object[0]), new Object[] {
                    ezt1.d
                });
                return ezt1.a(entitytype.mTitleHolder, playerstate);
            }

        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            playerstate = new ezq(0x7f0803f8, new Object[] {
                ezt1.f, ezt1.g
            });
            return ezt1.a(entitytype.mTitleHolder, playerstate);

        case 23: // '\027'
        case 24: // '\030'
            return new ezs(entitytype.mTitleHolder, entitytype.mSubtitleHolder, enk.b);
        }
    }
}
