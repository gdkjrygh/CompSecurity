// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pe, ph, pi

public class pl extends pe
{

    public final ph a;

    public pl(int i)
    {
        super(i);
        a = new ph(i);
    }

    public final void a(int i, pi pi1)
    {
        pi pi2 = (pi)super.K[i];
        a(i, pi1);
        if (pi2 != null)
        {
            int j = pi2.a();
            a.a(j, -1);
        }
        if (pi1 != null)
        {
            int l = pi1.a();
            int i1 = a.a();
            for (int k = 0; k <= l - i1; k++)
            {
                a.b(-1);
            }

            a.a(l, i);
        }
    }

    public final int d()
    {
        int i;
        for (i = a.a() - 1; i >= 0 && a.a(i) < 0; i--) { }
        i++;
        a.c(i);
        return i;
    }
}
