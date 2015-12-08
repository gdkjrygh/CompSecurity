// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class azf extends ayz
{

    private final int a;
    private final int b;

    public azf()
    {
        this(0x80000000, 0x80000000);
    }

    public azf(int i, int j)
    {
        a = i;
        b = j;
    }

    public final void a(azg azg1)
    {
        if (!bag.a(a, b))
        {
            azg1 = String.valueOf("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
            int i = a;
            int j = b;
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(azg1).length() + 100)).append(azg1).append(i).append(" and height: ").append(j).append(", either provide dimensions in the constructor or call override()").toString());
        } else
        {
            azg1.a(a, b);
            return;
        }
    }
}
