// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class cnu
{

    public static final cnu a;
    public final cog b;
    public final float c[];
    public final cnv d;

    private cnu(cog cog1, float af[], cnv cnv1)
    {
        b = (cog)b.a(cog1, "keyFrameMetrics", null);
        c = (float[])b.a(af, "rotationTransformationMatrix", null);
        d = (cnv)b.a(cnv1, "cropSpecification", null);
    }

    public static cnu a(cnq cnq1, pxq pxq, int i, int j, cnz cnz1, boolean flag)
    {
        cnv cnv1 = cnk.a(cnq1.b());
        cnq1 = cnv1;
        if (cnv1 == null)
        {
            pxq = crg.a(pxq, i, j, flag);
            cnq1 = cnv1;
            if (pxq != null)
            {
                cnq1 = new cqe(pxq);
            }
        }
        pxq = csc.a(cnz1.b());
        if (cnq1 == null)
        {
            return a;
        } else
        {
            return new cnu(cog.a, pxq, cnq1);
        }
    }

    public static cnu a(pyg pyg, pxq pxq, int i, int j, boolean flag)
    {
        pyg = cnk.a(pyg);
        if (pyg == null)
        {
            pxq = crg.a(pxq, i, j, false);
            if (pxq != null)
            {
                pyg = new cqe(pxq);
            }
        }
        if (pyg == null)
        {
            return a;
        } else
        {
            return new cnu(cog.a, csc.a, pyg);
        }
    }

    public static List a(List list, Map map, int i, int j)
    {
        if (list.isEmpty())
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(list.size());
        int k = 0;
        while (k < list.size()) 
        {
            Object obj2 = (cnq)list.get(k);
            Object obj;
            if (((cnq) (obj2)).d == cnt.d)
            {
                obj = a;
            } else
            {
                obj = (cnz)c.a(map.get(((cnq) (obj2)).e), "displayable", null);
                Object obj1 = (cor)c.a(((cnz) (obj)).d(), "playbackMetrics", null);
                float af[] = ((cnz) (obj)).b();
                float f1;
                int l;
                int i1;
                if (((coi) (af)).a == 90 || ((coi) (af)).a == 270)
                {
                    i1 = ((coi) (af)).d;
                    l = ((coi) (af)).c;
                } else
                {
                    i1 = ((coi) (af)).c;
                    l = ((coi) (af)).d;
                }
                f1 = (float)i1 / (float)l / ((float)i / (float)j);
                af = csc.a(((cnz) (obj)).b());
                obj = cnk.a(((cnq) (obj2)).b());
                if (obj == null)
                {
                    float f3 = 0.0F;
                    float f = crg.a(f1, ((cor) (obj1)), ((cnq) (obj2)).f.b, ((cnq) (obj2)).f.c);
                    float f2;
                    if (f1 > 1.0F)
                    {
                        f1 = 1.0F - 1.0F / f1 - f;
                        f2 = 0.0F;
                    } else
                    {
                        f2 = 1.0F - f1 - f;
                        f3 = f;
                        f1 = 0.0F;
                        f = 0.0F;
                    }
                    obj = new cqe(new cnw(f, f1, f2, f3, 0.0F));
                }
                obj1 = ((cor) (obj1)).a;
                obj2 = ((cnq) (obj2)).f;
                l = Math.max(0, b.b(((cod) (obj2)).b, ((cog) (obj1)).b));
                i1 = Math.min(((cog) (obj1)).b.length - 1, b.a(((cod) (obj2)).c, ((cog) (obj1)).b));
                if (l != 0 || i1 != ((cog) (obj1)).b.length - 1)
                {
                    obj1 = new cog(Arrays.copyOfRange(((cog) (obj1)).b, l, i1 + 1));
                }
                obj = new cnu(((cog) (obj1)), af, ((cnv) (obj)));
            }
            arraylist.add(obj);
            k++;
        }
        return arraylist;
    }

    static 
    {
        a = new cnu(cog.a, csc.a, new cqe(new cnw(0.0F, 0.0F, 0.0F, 0.0F, 0.0F)));
    }
}
