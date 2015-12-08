// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqj
    implements aqy
{

    int a;
    int b;
    android.graphics.Bitmap.Config c;
    private final aqk d;

    public aqj(aqk aqk1)
    {
        d = aqk1;
    }

    public final void a()
    {
        d.a(this);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof aqj)
        {
            obj = (aqj)obj;
            flag = flag1;
            if (a == ((aqj) (obj)).a)
            {
                flag = flag1;
                if (b == ((aqj) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((aqj) (obj)).c)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j = a;
        int k = b;
        int i;
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        return i + (j * 31 + k) * 31;
    }

    public final String toString()
    {
        return aqi.c(a, b, c);
    }
}
