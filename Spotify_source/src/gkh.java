// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import com.spotify.mobile.android.core.internal.ConnectivityListener;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.model.TrackWithPlayOrigin;
import com.spotify.mobile.android.video.stats.Reason;
import java.util.List;
import java.util.UUID;

public class gkh
{

    gkd a;
    gmd b;
    private Context c;

    public gkh(Context context, gkd gkd1)
    {
        c = context;
        a = gkd1;
        dmz.a(fop);
        dmz.a(gmf);
        b = gmf.a(context);
    }

    public void a()
    {
    }

    public void a(TrackWithPlayOrigin trackwithplayorigin, String s, String s1, long l, long l1, 
            String s2)
    {
        long l2 = gcf.b();
        gmd gmd1 = b;
        ctz.a(trackwithplayorigin);
        ctz.a(trackwithplayorigin.playOrigin);
        ctz.a(s);
        Object obj = trackwithplayorigin.playbackId;
        if (gmd1.k)
        {
            Assertion.b("Already tracking playback, will reset and start over.");
        }
        gmd1.c();
        gmd1.k = true;
        gmd1.l = new gmb(((String) (obj)));
        gmd1.i = l1;
        gmd1.j = l2;
        gmd1.y = gmd1.A.getConnectionType();
        gmd1.e = l;
        obj = trackwithplayorigin.playOrigin;
        Object obj1 = new gme(gmd1, (byte)0);
        gmd1.b = new gfi(gmd1.a, ((gfk) (obj1)));
        gmd1.b.a(dtx.a, ((gme) (obj1)).a);
        obj1 = gmd1.l;
        ctz.a(s1);
        obj1.a = s1;
        obj1 = gmd1.l;
        s1 = ((PlayOrigin) (obj)).featureIdentifier();
        if (s1 == null)
        {
            s1 = "";
        }
        s1 = (String)s1;
        ctz.a(s1);
        obj1.b = s1;
        obj1 = gmd1.l;
        s1 = ((PlayOrigin) (obj)).featureVersion();
        if (s1 == null)
        {
            s1 = "";
        }
        s1 = (String)s1;
        ctz.a(s1);
        obj1.c = s1;
        s1 = gmd1.l;
        obj1 = (String)"none";
        ctz.a(obj1);
        s1.f = ((String) (obj1));
        obj1 = gmd1.l;
        s1 = ((PlayOrigin) (obj)).viewUri();
        if (s1 == null)
        {
            s1 = "";
        }
        s1 = (String)s1;
        ctz.a(s1);
        obj1.d = s1;
        obj1 = gmd1.l;
        s1 = trackwithplayorigin.entityURI;
        if (s1 == null)
        {
            s1 = "";
        }
        s1 = (String)s1;
        ctz.a(s1);
        obj1.e = s1;
        obj1 = gmd1.l;
        s1 = ((PlayOrigin) (obj)).externalReferrer();
        if (s1 == null)
        {
            s1 = "";
        }
        s1 = (String)s1;
        ctz.a(s1);
        obj1.h = s1;
        obj1 = gmd1.l;
        s1 = ((PlayOrigin) (obj)).featureVersion();
        if (s1 == null)
        {
            s1 = "";
        }
        s1 = (String)s1;
        ctz.a(s1);
        obj1.i = s1;
        s1 = gmd1.l;
        ctz.a("com.spotify");
        s1.j = "com.spotify";
        s1 = gmd1.l;
        ctz.a(s2);
        s1.k = s2;
        gmd1.l.J = l;
        s1 = gmd1.l;
        ctz.a(s);
        s1.m = s;
        s1 = gmd1.l;
        s = trackwithplayorigin.track.uri();
        if (s == null)
        {
            s = "";
        }
        s1.n = (String)s;
        s = gmd1.l;
        trackwithplayorigin = trackwithplayorigin.track.provider();
        if (trackwithplayorigin == null)
        {
            trackwithplayorigin = "";
        }
        trackwithplayorigin = (String)trackwithplayorigin;
        ctz.a(trackwithplayorigin);
        s.g = trackwithplayorigin;
    }

    public void a(Reason reason, boolean flag)
    {
        Object obj;
label0:
        {
            if (b.k)
            {
                if (flag)
                {
                    gmd gmd1 = b;
                    if (gmd1.b())
                    {
                        gmd1.r = false;
                    }
                }
                gmd gmd2 = b;
                long l = a.d();
                if (!gmd2.b())
                {
                    obj = gma.d();
                } else
                {
                    gmd2.k = false;
                    obj = gmd2.l;
                    ctz.a(reason);
                    obj.l = reason.mReason;
                    gmd2.a(gmd2.e, l);
                    gmd2.a(gmd2.d, l, gmd2.g);
                    gmd2.h();
                    if (gmd2.B)
                    {
                        gmd2.D.add(new gmc(gmd2.C, l - gmd2.C));
                    }
                    obj = gmd2.d();
                }
                gmd2.b.b();
                gmd2.b = null;
                if (!((gma) (obj)).c())
                {
                    break label0;
                }
                Logger.b("Empty report, no EndVideo to send.", new Object[0]);
            }
            return;
        }
        Context context = c;
        Assertion.b(((gma) (obj)).G, "Do not use reports from unfinished trackings to create EndVideo messages.");
        byte abyte0[] = ((gma) (obj)).b();
        byte abyte1[] = ((gma) (obj)).a();
        String s = ((gma) (obj)).a;
        String s1 = ((gma) (obj)).b;
        String s2 = ((gma) (obj)).d;
        String s3 = ((gma) (obj)).l;
        String s4 = ((gma) (obj)).k;
        long l1 = ((gma) (obj)).m;
        long l2 = ((gma) (obj)).n;
        long l3 = ((gma) (obj)).o;
        long l4 = ((gma) (obj)).p;
        long l5 = ((gma) (obj)).q;
        long l6 = ((gma) (obj)).r;
        long l7 = ((gma) (obj)).s;
        long l8 = ((gma) (obj)).t;
        long l9 = ((gma) (obj)).u;
        long l10 = ((gma) (obj)).I;
        long l11 = ((gma) (obj)).J;
        long l12 = ((gma) (obj)).K;
        long l13 = ((gma) (obj)).H;
        long l14 = ((gma) (obj)).L;
        long l15 = ((gma) (obj)).M;
        long l16 = ((gma) (obj)).C;
        flag = ((gma) (obj)).v;
        long l17 = ((gma) (obj)).w;
        long l18 = ((gma) (obj)).x;
        String s5 = ((gma) (obj)).c;
        String s6 = ((gma) (obj)).A;
        String s7 = ((gma) (obj)).B;
        String s8 = ((gma) (obj)).y;
        boolean flag1 = ((gma) (obj)).z;
        String s9 = ((gma) (obj)).f;
        String s10 = ((gma) (obj)).g;
        String s11 = ((gma) (obj)).h;
        String s12 = ((gma) (obj)).i;
        String s13 = ((gma) (obj)).j;
        String s14 = ((gma) (obj)).e;
        long l19 = ((gma) (obj)).O;
        long l20 = ((gma) (obj)).P;
        long l21 = ((gma) (obj)).D;
        long l22 = ((gma) (obj)).N;
        if (((gma) (obj)).Q == null)
        {
            reason = "none";
        } else
        if (gkv.b.equals(((gma) (obj)).Q))
        {
            reason = "widevine";
        } else
        {
            reason = "";
        }
        fop.a(context, new dni(abyte0, abyte1, s, s1, s2, s3, s4, l1, l2, false, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, flag, l17, l18, s5, s6, s7, s8, flag1, s9, s10, s11, s12, s13, s14, l19, l20, l21, -1L, l22, reason, ((gma) (obj)).R, 0L, 0L, ((gma) (obj)).E, ((gma) (obj)).F));
    }

    public void a(glp glp1, boolean flag)
    {
        Object obj1 = b.a();
        if (((gma) (obj1)).c())
        {
            Logger.b("Empty report, no VideoPlayerError to send.", new Object[0]);
        } else
        {
            long l = gcf.a();
            dmz.a(gcz);
            gda gda1 = gcz.h();
            Object obj;
            Object obj2;
            byte abyte0[];
            String s;
            byte abyte1[];
            String s1;
            if (glp1 != null)
            {
                obj = glp1.a;
            } else
            {
                obj = new Exception();
            }
            abyte0 = ((gma) (obj1)).b();
            s = ((gma) (obj1)).y;
            abyte1 = ((gma) (obj1)).a();
            s1 = obj.getClass().getSimpleName();
            if (((Throwable) (obj)).getMessage() == null)
            {
                obj1 = "";
            } else
            {
                obj1 = ((Throwable) (obj)).getMessage();
            }
            if (obj != null)
            {
                glp1 = Log.getStackTraceString(((Throwable) (obj)));
            } else
            {
                glp1 = "Stack trace N/A";
            }
            obj2 = glp1;
            if (glp1.length() > 500)
            {
                obj2 = glp1.substring(0, 499);
            }
            glp1 = new dnt(abyte0, s, abyte1, l, s1, ((String) (obj1)), ((String) (obj2)).replace("\t", " ").replace("\n", " "), gma.a(((Throwable) (obj))), gda1.e);
            fop.a(c, glp1);
        }
        if (flag)
        {
            a(Reason.a, true);
        }
    }

    public void b()
    {
    }

    public void c()
    {
        gmd gmd1 = b;
        long l = a.e();
        if (gmd1.b())
        {
            gmd1.l.s = l;
            gmd1.t = true;
            boolean flag;
            if (gmd1.v != -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && gmd1.v >= 0L)
            {
                gmd1.l.K = gcf.b() - gmd1.v;
                gmd1.v = -1L;
            }
            gmd1.u = true;
            if (gmd1.g())
            {
                gmd1.h();
            }
            if (gmd1.e())
            {
                gmd1.f();
            }
        }
    }

    public final gma d()
    {
        if (b.k)
        {
            return b.a();
        } else
        {
            return gma.d();
        }
    }
}
