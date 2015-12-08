// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cxo
    implements cxn
{

    cxo()
    {
    }

    public final float a(int i, float af[], boolean aflag[])
    {
        int j = 0;
        b.a(af, "distances", null);
        b.a(aflag, "selected", null);
        b.a(af.length, "array length", aflag.length, null);
        b.a(i, "element", 0, af.length - 1, null);
        float f;
        float f1;
        for (f = 3.402823E+38F; j < af.length; f = f1)
        {
            f1 = f;
            if (i != j)
            {
                f1 = f;
                if (aflag[j])
                {
                    f1 = f;
                    if (af[j] < f)
                    {
                        f1 = af[j];
                    }
                }
            }
            j++;
        }

        float f2 = f;
        if (f == 3.402823E+38F)
        {
            f2 = 0.0F;
        }
        return f2;
    }
}
