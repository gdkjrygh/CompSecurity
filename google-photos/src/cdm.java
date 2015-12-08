// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdm
    implements cdi
{

    public cdm()
    {
    }

    public final float a(cob cob1)
    {
        b.a(cob1.b(), "input.getValueCount()", 24, null);
        float f = 0.0F;
        float f1 = 0.0F;
        for (int i = 0; i < 24;)
        {
            float f3 = cob1.c[i];
            float f2 = f1;
            if (i < 18)
            {
                f2 = f1 + (float)b.g(i) * f3;
            }
            f += f3;
            i++;
            f1 = f2;
        }

        return f1 / (256F * f);
    }
}
