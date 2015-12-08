// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class bwn extends bmb
    implements bwh
{

    private static final String f = bwn.getSimpleName();
    public final bsm a;
    public final bsm b;
    public final bsr e = new bwr(this, false);
    private final bsr g = new bwo(this, "InitializeMusicLibrary");
    private final bsr h = new bwp(this, "RequestMusicLibraryUpdate");
    private final bsr i = new bwq(this, "GetDetailedSoundtrack");
    private final csz j;
    private bvy k;

    public bwn(bmb bmb1, Bundle bundle, cag cag, csz csz1)
    {
        super(bmb1);
        j = (csz)b.a(csz1, "musicLibraryFactory", null);
        a = (new bsp()).a(g).a(h).a(this, "MusicLibraryFlow", bundle, cag);
        b = (new bsp()).a(i).a(new bwr(this, true)).a(this, "DownloadMusicFlow", bundle, cag);
    }

    static bww A(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww B(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww C(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww D(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww E(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww F(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww G(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww H(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww I(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww J(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww K(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww L(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww M(bwn bwn1)
    {
        return bwn1.c;
    }

    static bvy a(bwn bwn1, bvy bvy)
    {
        bwn1.k = bvy;
        return bvy;
    }

    static bww a(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww b(bwn bwn1)
    {
        return bwn1.c;
    }

    static csz c(bwn bwn1)
    {
        return bwn1.j;
    }

    static bvy d(bwn bwn1)
    {
        return bwn1.k;
    }

    static String d()
    {
        return f;
    }

    static bww e(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww f(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww g(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww h(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww i(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww j(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww k(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww l(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww m(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww n(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww o(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww p(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww q(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww r(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww s(bwn bwn1)
    {
        return bwn1.c;
    }

    static void t(bwn bwn1)
    {
        bwn1.c();
    }

    static bww u(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww v(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww w(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww x(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww y(bwn bwn1)
    {
        return bwn1.c;
    }

    static bww z(bwn bwn1)
    {
        return bwn1.c;
    }

    public final void a()
    {
        a.a(f);
    }

    public final boolean b()
    {
        c();
        return a.f() || b.f();
    }

}
