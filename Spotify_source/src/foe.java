// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment;
import com.spotify.mobile.android.spotlets.collection.fragments.CollectionEpisodesFragment;
import com.spotify.mobile.android.spotlets.momentsstart.MomentsStartFragment;
import com.spotify.mobile.android.spotlets.user.ProfilesListFragment;
import com.spotify.mobile.android.ui.fragments.CosmosTestFragment;
import com.spotify.mobile.android.ui.fragments.NotificationSettingsFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class foe
{

    public static final fxy a = new fof();

    public foe()
    {
    }

    public static fxy a(SpotifyLink spotifylink, Intent intent, String s, String s1, boolean flag, String s2, Flags flags, FeatureIdentifier featureidentifier)
    {
        ctz.a(flags);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aO.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror94) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.T.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror93) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.U.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror92) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror91) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror90) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror89) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.v.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror88) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.x.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror87) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.m.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror86) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror85) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.e.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror84) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.h.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror83) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.k.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror82) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.j.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror81) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.i.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror80) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.l.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror79) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aD.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror78) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.d.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror77) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aK.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror76) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.f.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror75) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.G.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror74) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ap.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror73) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.as.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror72) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.au.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror71) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.av.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror70) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ax.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror69) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.at.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror68) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aw.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror67) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.W.ordinal()] = 29;
                }
                catch (NoSuchFieldError nosuchfielderror66) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.V.ordinal()] = 30;
                }
                catch (NoSuchFieldError nosuchfielderror65) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ae.ordinal()] = 31;
                }
                catch (NoSuchFieldError nosuchfielderror64) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ak.ordinal()] = 32;
                }
                catch (NoSuchFieldError nosuchfielderror63) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.o.ordinal()] = 33;
                }
                catch (NoSuchFieldError nosuchfielderror62) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.p.ordinal()] = 34;
                }
                catch (NoSuchFieldError nosuchfielderror61) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.q.ordinal()] = 35;
                }
                catch (NoSuchFieldError nosuchfielderror60) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.Z.ordinal()] = 36;
                }
                catch (NoSuchFieldError nosuchfielderror59) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.t.ordinal()] = 37;
                }
                catch (NoSuchFieldError nosuchfielderror58) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.s.ordinal()] = 38;
                }
                catch (NoSuchFieldError nosuchfielderror57) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.r.ordinal()] = 39;
                }
                catch (NoSuchFieldError nosuchfielderror56) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.S.ordinal()] = 40;
                }
                catch (NoSuchFieldError nosuchfielderror55) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.az.ordinal()] = 41;
                }
                catch (NoSuchFieldError nosuchfielderror54) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.al.ordinal()] = 42;
                }
                catch (NoSuchFieldError nosuchfielderror53) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aE.ordinal()] = 43;
                }
                catch (NoSuchFieldError nosuchfielderror52) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aQ.ordinal()] = 44;
                }
                catch (NoSuchFieldError nosuchfielderror51) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.L.ordinal()] = 45;
                }
                catch (NoSuchFieldError nosuchfielderror50) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.M.ordinal()] = 46;
                }
                catch (NoSuchFieldError nosuchfielderror49) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.Y.ordinal()] = 47;
                }
                catch (NoSuchFieldError nosuchfielderror48) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.N.ordinal()] = 48;
                }
                catch (NoSuchFieldError nosuchfielderror47) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aM.ordinal()] = 49;
                }
                catch (NoSuchFieldError nosuchfielderror46) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aI.ordinal()] = 50;
                }
                catch (NoSuchFieldError nosuchfielderror45) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aN.ordinal()] = 51;
                }
                catch (NoSuchFieldError nosuchfielderror44) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.a.ordinal()] = 52;
                }
                catch (NoSuchFieldError nosuchfielderror43) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aC.ordinal()] = 53;
                }
                catch (NoSuchFieldError nosuchfielderror42) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.b.ordinal()] = 54;
                }
                catch (NoSuchFieldError nosuchfielderror41) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.I.ordinal()] = 55;
                }
                catch (NoSuchFieldError nosuchfielderror40) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aL.ordinal()] = 56;
                }
                catch (NoSuchFieldError nosuchfielderror39) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.u.ordinal()] = 57;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.E.ordinal()] = 58;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.w.ordinal()] = 59;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.y.ordinal()] = 60;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.A.ordinal()] = 61;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.B.ordinal()] = 62;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.D.ordinal()] = 63;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.F.ordinal()] = 64;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.z.ordinal()] = 65;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.C.ordinal()] = 66;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aB.ordinal()] = 67;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ.ordinal()] = 68;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.J.ordinal()] = 69;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.af.ordinal()] = 70;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.K.ordinal()] = 71;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aV.ordinal()] = 72;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.O.ordinal()] = 73;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.R.ordinal()] = 74;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.H.ordinal()] = 75;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ac.ordinal()] = 76;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aa.ordinal()] = 77;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ab.ordinal()] = 78;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ad.ordinal()] = 79;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.X.ordinal()] = 80;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ao.ordinal()] = 81;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ar.ordinal()] = 82;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ay.ordinal()] = 83;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aA.ordinal()] = 84;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aH.ordinal()] = 85;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 86;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aU.ordinal()] = 87;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aP.ordinal()] = 88;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.P.ordinal()] = 89;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.Q.ordinal()] = 90;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ai.ordinal()] = 91;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ag.ordinal()] = 92;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aj.ordinal()] = 93;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ah.ordinal()] = 94;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aG.ordinal()] = 95;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[spotifylink.c.ordinal()];
        JVM INSTR tableswitch 1 95: default 412
    //                   1 806
    //                   2 856
    //                   3 883
    //                   4 897
    //                   5 897
    //                   6 577
    //                   7 1905
    //                   8 1919
    //                   9 484
    //                   10 491
    //                   11 491
    //                   12 577
    //                   13 622
    //                   14 649
    //                   15 676
    //                   16 703
    //                   17 741
    //                   18 768
    //                   19 768
    //                   20 768
    //                   21 768
    //                   22 897
    //                   23 976
    //                   24 992
    //                   25 1008
    //                   26 1024
    //                   27 1035
    //                   28 1074
    //                   29 1084
    //                   30 1100
    //                   31 1116
    //                   32 1125
    //                   33 1154
    //                   34 1154
    //                   35 1154
    //                   36 1154
    //                   37 1253
    //                   38 1262
    //                   39 1276
    //                   40 1290
    //                   41 1299
    //                   42 1309
    //                   43 1346
    //                   44 1384
    //                   45 1416
    //                   46 1423
    //                   47 1460
    //                   48 1607
    //                   49 1617
    //                   50 1626
    //                   51 1636
    //                   52 1644
    //                   53 1653
    //                   54 1678
    //                   55 1686
    //                   56 1695
    //                   57 1702
    //                   58 1711
    //                   59 1754
    //                   60 1797
    //                   61 1840
    //                   62 1881
    //                   63 1933
    //                   64 1959
    //                   65 1988
    //                   66 2017
    //                   67 2046
    //                   68 2055
    //                   69 2091
    //                   70 2100
    //                   71 2111
    //                   72 2122
    //                   73 2129
    //                   74 2136
    //                   75 2145
    //                   76 2152
    //                   77 2163
    //                   78 2200
    //                   79 2256
    //                   80 2293
    //                   81 2319
    //                   82 2326
    //                   83 2333
    //                   84 2340
    //                   85 2347
    //                   86 2354
    //                   87 2361
    //                   88 2368
    //                   89 2375
    //                   90 2375
    //                   91 2436
    //                   92 2460
    //                   93 2484
    //                   94 2508
    //                   95 2532;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L6 _L11 _L12 _L13 _L14 _L15 _L16 _L16 _L16 _L16 _L5 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L27 _L27 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L80 _L81 _L82 _L83 _L84 _L85
_L1:
        spotifylink = a;
_L87:
        if (intent.hasExtra("referer"))
        {
            intent = (Verified)intent.getParcelableExtra("referer");
            Assertion.a(intent, "Did you pass the referrer as a string by mistake?");
            s = new Bundle();
            s.putParcelable("referer", intent);
            a(((fxy) (spotifylink)), ((Bundle) (s)));
        }
        if (!spotifylink.equals(a))
        {
            gnl.a(spotifylink.F(), featureidentifier);
        }
        return spotifylink;
_L9:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L10:
        if ("Enabled".equals(flags.a(fys.U)))
        {
            spotifylink = efr.a(spotifylink.i(), s, spotifylink.h(), spotifylink.g(), flags);
            if (efr.b(intent))
            {
                a(((fxy) (spotifylink)), intent);
            }
        } else
        {
            spotifylink = eyy.a(spotifylink.i(), s, spotifylink.h(), spotifylink.g(), flags);
            if (eyy.b(intent))
            {
                a(((fxy) (spotifylink)), intent);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        s = eih.a(spotifylink.i(), s, spotifylink.h(), spotifylink.g(), flags);
        ctz.a(intent);
        spotifylink = s;
        if (intent.hasExtra("artist_uri"))
        {
            a(((fxy) (s)), intent);
            spotifylink = s;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        s = spotifylink.d();
        s1 = intent.getExtras();
        spotifylink = new eic();
        eih.a(s, s1, spotifylink);
        continue; /* Loop/switch isn't completed */
_L12:
        s = spotifylink.d();
        s1 = intent.getExtras();
        spotifylink = new eif();
        eih.a(s, s1, spotifylink);
        continue; /* Loop/switch isn't completed */
_L13:
        s = spotifylink.d();
        s1 = intent.getExtras();
        spotifylink = new eib();
        eih.a(s, s1, spotifylink);
        continue; /* Loop/switch isn't completed */
_L14:
        s = spotifylink.d();
        s1 = intent.getExtras();
        spotifylink = new eii();
        eih.a(s, s1, spotifylink);
        fyw.a(spotifylink.F(), flags);
        continue; /* Loop/switch isn't completed */
_L15:
        s = spotifylink.d();
        s1 = intent.getExtras();
        spotifylink = new eid();
        eih.a(s, s1, spotifylink);
        continue; /* Loop/switch isn't completed */
_L16:
        s = spotifylink.d();
        s1 = intent.getExtras();
        spotifylink = new eij();
        eih.a(s, s1, spotifylink);
        fyw.a(spotifylink.F(), flags);
        continue; /* Loop/switch isn't completed */
_L2:
        s = (new fdm()).a(spotifylink.d()).b("time_added").c(s).a(flags);
        spotifylink = s;
        if (intent.hasExtra("playlist_uri"))
        {
            a(((fxy) (s)), intent);
            spotifylink = s;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        spotifylink = fdf.a(spotifylink.d(), s, false, flags);
        if (fdf.b(intent))
        {
            a(((fxy) (spotifylink)), intent);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        spotifylink = fdg.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new fdm()).a(spotifylink.i()).c(s);
        s1 = spotifylink.h();
        ((fdm) (s)).a.putString("lookup_track_uri", s1);
        flag = spotifylink.g();
        ((fdm) (s)).a.putBoolean("autoplay", flag);
        s = s.a(flags);
        spotifylink = s;
        if (intent.hasExtra("playlist_uri"))
        {
            a(((fxy) (s)), intent);
            spotifylink = s;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        spotifylink = fkm.a(spotifylink.d(), s2, s, flags);
        continue; /* Loop/switch isn't completed */
_L18:
        spotifylink = ProfilesListFragment.a(spotifylink.d(), com.spotify.mobile.android.spotlets.user.ProfilesListFragment.Type.a, flags);
        continue; /* Loop/switch isn't completed */
_L19:
        spotifylink = ProfilesListFragment.a(spotifylink.d(), com.spotify.mobile.android.spotlets.user.ProfilesListFragment.Type.b, flags);
        continue; /* Loop/switch isn't completed */
_L20:
        spotifylink = fkl.a(spotifylink.d());
        continue; /* Loop/switch isn't completed */
_L21:
        if (intent.getExtras().containsKey("artists-json"))
        {
            spotifylink = new fkr();
            a(((fxy) (spotifylink)), intent);
        } else
        {
            spotifylink = fkr.a(spotifylink.d());
        }
        continue; /* Loop/switch isn't completed */
_L22:
        spotifylink = fkg.a(spotifylink, flags);
        continue; /* Loop/switch isn't completed */
_L23:
        spotifylink = ProfilesListFragment.a(spotifylink.d(), com.spotify.mobile.android.spotlets.user.ProfilesListFragment.Type.c, flags);
        continue; /* Loop/switch isn't completed */
_L24:
        spotifylink = ProfilesListFragment.a(spotifylink.d(), com.spotify.mobile.android.spotlets.user.ProfilesListFragment.Type.d, flags);
        continue; /* Loop/switch isn't completed */
_L25:
        spotifylink = ezf.a(flags);
        continue; /* Loop/switch isn't completed */
_L26:
        if (evm.b(flags))
        {
            spotifylink = evm.a(flags);
            a(((fxy) (spotifylink)), intent);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if (ekr.a(flags))
        {
            spotifylink = esq.a(s, spotifylink, flags);
        } else
        {
            switch (ekr._cls1.a[spotifylink.c.ordinal()])
            {
            default:
                spotifylink = a;
                break;

            case 1: // '\001'
                spotifylink = ekt.a(s, s1, flags);
                break;

            case 2: // '\002'
                spotifylink = eku.a(s, s1, flags);
                break;

            case 3: // '\003'
                spotifylink = ekw.a(s, s1, intent, flags);
                break;
            }
            if (false)
            {
            }
        }
        continue; /* Loop/switch isn't completed */
_L28:
        spotifylink = eme.a(flags);
        continue; /* Loop/switch isn't completed */
_L29:
        spotifylink = emd.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L30:
        spotifylink = emc.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L31:
        spotifylink = esh.a(flags);
        continue; /* Loop/switch isn't completed */
_L32:
        spotifylink = goq.a(s, flags);
        continue; /* Loop/switch isn't completed */
_L33:
        if (((Boolean)flags.a(fys.at)).booleanValue())
        {
            spotifylink = eyg.a(s2, flags);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L34:
        if (((Boolean)flags.a(fys.au)).booleanValue())
        {
            spotifylink = fdr.a(s, flags, s2);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L35:
        if (gpl.a(flags))
        {
            spotifylink = goo.a(spotifylink.d(), s, flags);
        } else
        {
            spotifylink = goq.a(s, flags);
        }
        continue; /* Loop/switch isn't completed */
_L36:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L37:
        if (((Boolean)flags.a(fys.aC)).booleanValue())
        {
            spotifylink = erb.a(flags);
        } else
        {
            spotifylink = fxx.a(flags);
        }
        continue; /* Loop/switch isn't completed */
_L38:
        if (((Integer)flags.a(fys.ax)).intValue() == 2 || ((Integer)flags.a(fys.ax)).intValue() == 1)
        {
            spotifylink = MomentsStartFragment.a(flags, s2);
        } else
        if (((Integer)flags.a(fys.ax)).intValue() == 3)
        {
            spotifylink = evl.a(flags);
        } else
        if (!gex.a(flags) || intent.getBooleanExtra("extra_manual_login", false))
        {
            if (ekr.a(flags))
            {
                spotifylink = esq.a(s, new SpotifyLink("spotify:app:browse"), flags);
            } else
            {
                spotifylink = ekt.a(s, s1, flags);
            }
        } else
        {
            spotifylink = emy.a(flags);
        }
        continue; /* Loop/switch isn't completed */
_L39:
        spotifylink = gns.a(s, flags);
        continue; /* Loop/switch isn't completed */
_L40:
        spotifylink = fjd.a(flags);
        continue; /* Loop/switch isn't completed */
_L41:
        spotifylink = fhn.a(intent, flags);
        continue; /* Loop/switch isn't completed */
_L42:
        spotifylink = fjc.b(intent);
        continue; /* Loop/switch isn't completed */
_L43:
        spotifylink = ActivityFeedFragment.a(flags);
        continue; /* Loop/switch isn't completed */
_L44:
        spotifylink = intent.getStringExtra("com.spotify.activity_feed.type.profile_username");
        ctz.a(spotifylink);
        spotifylink = ActivityFeedFragment.a(spotifylink, s2, flags);
        continue; /* Loop/switch isn't completed */
_L45:
        spotifylink = edh.b(intent);
        continue; /* Loop/switch isn't completed */
_L46:
        spotifylink = fyk.a(flags);
        continue; /* Loop/switch isn't completed */
_L47:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L48:
        spotifylink = emy.a(flags);
        continue; /* Loop/switch isn't completed */
_L49:
        if (((Boolean)flags.a(fys.u)).booleanValue())
        {
            spotifylink = end.a(flags, flag, s2);
        } else
        {
            spotifylink = enk.a(flags, flag);
        }
        continue; /* Loop/switch isn't completed */
_L50:
        if (((Boolean)flags.a(fys.r)).booleanValue())
        {
            spotifylink = emw.a(flags, flag, s2);
        } else
        {
            spotifylink = eng.a(flags, flag);
        }
        continue; /* Loop/switch isn't completed */
_L51:
        if (((Boolean)flags.a(fys.s)).booleanValue())
        {
            spotifylink = emx.a(flags, flag, s2);
        } else
        {
            spotifylink = eni.a(flags, flag);
        }
        continue; /* Loop/switch isn't completed */
_L52:
        if (((Boolean)flags.a(fys.t)).booleanValue())
        {
            spotifylink = ena.a(flags, flag);
        } else
        {
            spotifylink = enj.a(flags, flag);
        }
        continue; /* Loop/switch isn't completed */
_L53:
        if (gpl.a(flags))
        {
            spotifylink = enb.a(flags);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        spotifylink = enf.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L8:
        spotifylink = enh.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L54:
        if (fiy.b(flags))
        {
            spotifylink = enc.a(flags, s2);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L55:
        if (fiy.a(flags))
        {
            spotifylink = CollectionEpisodesFragment.a(flags, s2, com.spotify.mobile.android.spotlets.collection.fragments.CollectionEpisodesFragment.Filter.b);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L56:
        if (fiy.a(flags))
        {
            spotifylink = CollectionEpisodesFragment.a(flags, s2, com.spotify.mobile.android.spotlets.collection.fragments.CollectionEpisodesFragment.Filter.c);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L57:
        if (fiy.a(flags))
        {
            spotifylink = CollectionEpisodesFragment.a(flags, s2, com.spotify.mobile.android.spotlets.collection.fragments.CollectionEpisodesFragment.Filter.a);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L58:
        spotifylink = ene.a(flags);
        continue; /* Loop/switch isn't completed */
_L59:
        if (fiy.b(flags))
        {
            spotifylink = fig.a(spotifylink.d(), flags, fig.b(intent), fig.c(intent));
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L60:
        spotifylink = NotificationSettingsFragment.a(flags);
        continue; /* Loop/switch isn't completed */
_L61:
        spotifylink = new fxz();
        continue; /* Loop/switch isn't completed */
_L62:
        spotifylink = new CosmosTestFragment();
        continue; /* Loop/switch isn't completed */
_L63:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L64:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L65:
        spotifylink = ers.a(flags);
        continue; /* Loop/switch isn't completed */
_L66:
        spotifylink = esa.H();
        continue; /* Loop/switch isn't completed */
_L67:
        spotifylink = esv.a(flags, spotifylink, s);
        continue; /* Loop/switch isn't completed */
_L68:
        if (((Boolean)flags.a(fys.N)).booleanValue())
        {
            spotifylink = est.a(flags, spotifylink, s);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L69:
        if (((Boolean)flags.a(fys.N)).booleanValue() || ((Boolean)flags.a(fys.M)).booleanValue())
        {
            spotifylink = esu.a(flags, spotifylink, s);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L70:
        if (((Boolean)flags.a(fys.N)).booleanValue())
        {
            spotifylink = esw.a(flags, spotifylink, s);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L71:
        if (esr.a(flags))
        {
            spotifylink = esr.a(flags, spotifylink, s);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L72:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L73:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L74:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L75:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L76:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L77:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L78:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L79:
        spotifylink = a;
        continue; /* Loop/switch isn't completed */
_L80:
        if (fiy.b(flags))
        {
            s = spotifylink.i();
            s1 = spotifylink.i();
            if (spotifylink.g() || fig.c(intent))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            spotifylink = fig.a(s, flags, s1, flag);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L81:
        if (fzp.a(flags))
        {
            spotifylink = fzm.a(flags);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L82:
        if (fzp.a(flags))
        {
            spotifylink = fzk.a(flags);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L83:
        if (fzp.b(flags))
        {
            spotifylink = fzn.a(flags);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L84:
        if (fzp.b(flags))
        {
            spotifylink = fzl.a(flags);
        } else
        {
            spotifylink = a;
        }
        continue; /* Loop/switch isn't completed */
_L85:
        spotifylink = eff.a(flags);
        if (true) goto _L87; else goto _L86
_L86:
    }

    public static fxy a(SpotifyLink spotifylink, String s, Flags flags, FeatureIdentifier featureidentifier)
    {
        ctz.a(flags);
        _cls1.a[spotifylink.c.ordinal()];
        JVM INSTR tableswitch 1 8: default 64
    //                   1 90
    //                   2 124
    //                   3 138
    //                   4 151
    //                   5 151
    //                   6 180
    //                   7 195
    //                   8 208;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L8
_L1:
        spotifylink = a;
_L10:
        if (!spotifylink.equals(a))
        {
            gnl.a(spotifylink.F(), featureidentifier);
        }
        return spotifylink;
_L2:
        spotifylink = (new fdm()).a(spotifylink.d()).b("time_added").c(s).a().a(flags);
        continue; /* Loop/switch isn't completed */
_L3:
        spotifylink = fdf.a(spotifylink.d(), s, true, flags);
        continue; /* Loop/switch isn't completed */
_L4:
        spotifylink = fdg.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L5:
        spotifylink = (new fdm()).a(spotifylink.d()).c(s).a().a(flags);
        continue; /* Loop/switch isn't completed */
_L6:
        spotifylink = eih.a(spotifylink.d(), s, null, false, flags);
        continue; /* Loop/switch isn't completed */
_L7:
        spotifylink = enf.a(spotifylink.d(), s, flags);
        continue; /* Loop/switch isn't completed */
_L8:
        spotifylink = enh.a(spotifylink.d(), s, flags);
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static void a(fxy fxy1, Intent intent)
    {
        a(fxy1, intent.getExtras());
    }

    private static void a(fxy fxy1, Bundle bundle)
    {
        if (a.equals(fxy1))
        {
            return;
        }
        Bundle bundle2 = fxy1.F().g();
        Bundle bundle1 = bundle2;
        if (bundle2 == null)
        {
            bundle1 = new Bundle();
            fxy1.F().f(bundle1);
        }
        bundle1.putAll(bundle);
    }

}
