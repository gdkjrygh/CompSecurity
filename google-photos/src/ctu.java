// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ctu
    implements ded
{

    car a;
    cin b;
    cin c;
    private final chq d;
    private final cij e;
    private final cij f;
    private int g;
    private int h;
    private cij i;
    private cij j;
    private cin k;
    private cin l;
    private int m;
    private int n;
    private boolean o;

    public ctu(chq chq1, cij cij1, cij cij2)
    {
        d = (chq)b.a(chq1, "renderContext", null);
        f = (cij)b.a(cij1, "mixShaderProgram", null);
        e = (cij)b.a(cij2, "identityShader", null);
        a = car.a;
    }

    public final void a()
    {
        dee.a(k);
        dee.a(l);
        dee.a(b);
        dee.a(c);
    }

    public final void a(int i1, int j1)
    {
        g = b.a(i1, "textureWidth");
        h = b.a(j1, "textureHeight");
        if (a == car.a)
        {
            return;
        }
        float f1 = a.g;
        n = Math.round((float)g / f1);
        m = Math.round((float)h / f1);
        boolean flag;
        if (n != g || m != h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        a();
        if (o)
        {
            k = d.b(n, m);
            l = d.b(n, m);
            b = d.b(n, m);
            c = d.b(n, m);
            i = b.a(d, a.f, m, false);
            j = b.b(d, a.f, n, false);
            return;
        } else
        {
            k = d.b(g, h);
            l = null;
            b = d.b(g, h);
            c = d.b(g, h);
            i = b.a(d, a.f, h, false);
            j = b.b(d, a.f, n, false);
            return;
        }
    }

    public final void a(car car1)
    {
        if (a == car1)
        {
            return;
        } else
        {
            a = car1;
            a(g, h);
            return;
        }
    }

    void a(cin cin, cin cin1, chy chy, float f1)
    {
        if (o)
        {
            chi.a(k, cin, e);
            chi.a(l, k, i);
            chi.a(cin1, l, j);
            chi.a(chy, cin, cin1, f1, f);
            return;
        } else
        {
            chi.a(k, cin, i);
            chi.a(cin1, k, j);
            chi.a(chy, cin, cin1, f1, f);
            return;
        }
    }
}
