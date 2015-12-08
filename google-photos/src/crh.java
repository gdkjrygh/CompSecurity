// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class crh
    implements Comparable
{

    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    private long h;

    public crh(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        a = f1;
        c = f2;
        g = f2 - f1;
        b = f3;
        d = f4;
        e = f5;
        f = f6;
        h = -1L;
    }

    public crh(float f1, float f2, float f3, float f4, long l)
    {
        a = f1;
        c = f2;
        g = c - a;
        b = a + g / 5F;
        d = c + g / 4F;
        e = f3;
        f = f4;
        h = l;
    }

    public final int compareTo(Object obj)
    {
        obj = (crh)obj;
        if ((int)(g * 30F) == (int)(((crh) (obj)).g * 30F))
        {
            if (h < ((crh) (obj)).h)
            {
                return -1;
            }
            if (h > ((crh) (obj)).h)
            {
                return 1;
            }
        }
        return Float.compare(((crh) (obj)).g, g);
    }
}
