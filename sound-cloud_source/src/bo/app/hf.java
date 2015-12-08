// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            hw

final class hf extends hw
{

    final hw a;

    hf(hw hw1)
    {
        a = hw1;
        super();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return ((java.util.Map.Entry)a.next()).getValue();
    }
}
