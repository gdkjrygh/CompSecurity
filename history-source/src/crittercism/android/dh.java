// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.URL;

// Referenced classes of package crittercism.android:
//            di, br, dj, cx, 
//            cw, dc, au, cy

final class dh extends di
{

    private br a;
    private br b;
    private au c;
    private URL d;
    private cy e;
    private cx f;

    dh(br br1, br br2, au au, URL url, cy cy, cx cx1)
    {
        b = br1;
        a = br2;
        c = au;
        d = url;
        e = cy;
        f = cx1;
    }

    public final void a()
    {
        a.b(b);
        (new dj(f.a(c).a(b), new dc(d), true, e)).run();
    }
}
