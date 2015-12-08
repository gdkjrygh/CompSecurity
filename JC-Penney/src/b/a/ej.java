// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.net.URL;

// Referenced classes of package b.a:
//            ek, be, el, dw, 
//            dv, ec, l, dx

final class ej extends ek
{

    private be a;
    private be b;
    private l c;
    private URL d;
    private dx e;
    private dw f;

    ej(be be1, be be2, l l, URL url, dx dx, dw dw1)
    {
        b = be1;
        a = be2;
        c = l;
        d = url;
        e = dx;
        f = dw1;
    }

    public final void a()
    {
        a.a(b);
        (new el(f.a(c).a(b), new ec(d), true, e)).run();
    }
}
