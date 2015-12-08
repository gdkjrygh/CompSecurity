// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class owe
{

    public static final owe a = new owe(0.0F, 0.0F, 0);
    public final float b;
    public final float c;
    public final int d;

    public owe(float f, float f1, int i)
    {
        b = f;
        c = f1;
        d = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof owe))
            {
                return false;
            }
            obj = (owe)obj;
            if (d != ((owe) (obj)).d || c != ((owe) (obj)).c || b != ((owe) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

}
