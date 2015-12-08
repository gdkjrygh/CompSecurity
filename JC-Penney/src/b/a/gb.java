// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nm, mu, gh, pe, 
//            mt, nb, my

public final class gb
{

    final gh a[];
    private final gh b[];
    private final gh c[];

    public gb(nm nm1)
    {
        int i = nm1.a.d();
        a = new gh[i];
        b = new gh[i];
        c = new gh[i];
        a(nm1);
    }

    private void a(nm nm1)
    {
        nm1 = nm1.a;
        int j = ((pe) (nm1)).K.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = nm1.a(i);
            int k = ((mt) (obj)).a;
            my my1 = ((mt) (obj)).b.a(0);
            a[k] = new gh(my1.c);
            obj = ((mt) (obj)).b.b().c;
            b[k] = new gh(((no) (obj)));
            c[k] = new gh(((no) (obj)));
        }

    }

    public final gh a(mt mt1)
    {
        return b[mt1.a];
    }

    public final gh b(mt mt1)
    {
        return c[mt1.a];
    }
}
