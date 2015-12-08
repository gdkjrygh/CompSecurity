// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cmt
    implements cmx
{

    cmt()
    {
    }

    public final Object a(cmi cmi1, long al[])
    {
        cdx cdx1 = new cdx();
        int i1 = al.length;
        int k = 0;
        int i;
        int j;
        for (i = 0; k < i1; i = j)
        {
            long l1 = al[k];
            cdx acdx[] = (cdx[])cmi1.a(cos.g, l1);
            j = i;
            if (acdx != null)
            {
                int j1 = acdx.length;
                int l = 0;
                do
                {
                    j = i;
                    if (l >= j1)
                    {
                        break;
                    }
                    cdx cdx2 = acdx[l];
                    cdx1.c = cdx1.c + cdx2.c;
                    cdx1.d = cdx1.d + cdx2.d;
                    cdx1.e = cdx1.e + cdx2.e;
                    cdx1.f = cdx1.f + cdx2.f;
                    cdx1.g = cdx1.g + cdx2.g;
                    float f = cdx1.h;
                    cdx1.h = cdx2.h + f;
                    l++;
                    i++;
                } while (true);
            }
            k++;
        }

        if (i > 0)
        {
            float f1 = 1.0F / (float)i;
            cdx1.c = cdx1.c * f1;
            cdx1.d = cdx1.d * f1;
            cdx1.e = cdx1.e * f1;
            cdx1.f = cdx1.f * f1;
            cdx1.g = cdx1.g * f1;
            cdx1.h = f1 * cdx1.h;
        }
        return cdx1;
    }

    public final Object a(cvs cvs1)
    {
        if (cvs1.b == null)
        {
            return null;
        } else
        {
            return cdx.a(cvs1.b);
        }
    }

    public final void a(Object obj, cvs cvs1)
    {
        cvs1.b = ((cdx)obj).a();
    }
}
