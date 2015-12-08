// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bkz
    implements Comparable
{

    final int a;
    final int b;
    private final float c;

    public bkz(float f, int i, int j)
    {
        c = f;
        a = i;
        b = j;
    }

    public final int compareTo(Object obj)
    {
        obj = (bkz)obj;
        return Float.compare(c, ((bkz) (obj)).c);
    }
}
