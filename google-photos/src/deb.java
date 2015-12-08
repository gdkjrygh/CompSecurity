// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class deb extends ddx
{

    private final dec b;

    public deb(int i, dec dec1)
    {
        super(dec1.a(i));
        for (int j = 0; j < i; j++)
        {
            a[j] = dec1.a();
        }

        b = dec1;
    }

    protected final void b()
    {
        int i = a.length;
        int j = (int)((float)i * 1.5F);
        Object aobj[] = b.a(j);
        for (; i < j; i++)
        {
            aobj[i] = b.a();
        }

        a = aobj;
    }

    static 
    {
        deb.getSimpleName();
    }
}
