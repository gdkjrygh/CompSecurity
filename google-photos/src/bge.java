// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class bge
{

    public final float a;
    public final float b;
    public final float c;

    private bge(float f, float f1, float f2)
    {
        if (f == 0.0F && f1 == 0.0F)
        {
            throw new IllegalArgumentException("The values of a and b must not both be 0.");
        } else
        {
            a = f;
            b = f1;
            c = f2;
            return;
        }
    }

    public bge(float f, float f1, float f2, float f3)
    {
        this(f3 - f1, f - f2, (f1 - f3) * f + (f2 - f) * f1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof bge)
        {
            if (a == ((bge) (obj = (bge)obj)).a && b == ((bge) (obj)).b && c == ((bge) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(a) * 54 + Float.floatToIntBits(b) * 31 + Float.floatToIntBits(c);
    }

    public final String toString()
    {
        return String.format(Locale.US, "{ a:%.1f, b:%.1f, c:%.1f }", new Object[] {
            Float.valueOf(a), Float.valueOf(b), Float.valueOf(c)
        });
    }
}
