// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class cmu
    implements cmx
{

    private final float a = 0.0F;

    public cmu(float f)
    {
    }

    protected abstract Float a(cmi cmi, long l);

    public final Object a(cmi cmi, long al[])
    {
        int l = al.length;
        int i = 0;
        int j = 0;
        float f = 0.0F;
        while (i < l) 
        {
            Float float1 = a(cmi, al[i]);
            float f1 = f;
            int k = j;
            if (float1 != null)
            {
                f1 = f + float1.floatValue();
                k = j + 1;
            }
            i++;
            f = f1;
            j = k;
        }
        if (j == 0)
        {
            return Float.valueOf(a);
        } else
        {
            return Float.valueOf(f / (float)j);
        }
    }
}
