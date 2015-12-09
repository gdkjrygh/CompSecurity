// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pn, nk

public final class nd extends pn
{

    public final nk a;
    private final nk b[];

    public final nk a(int i)
    {
        nk nk;
        try
        {
            nk = b[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new IllegalArgumentException("bogus label");
        }
        return nk;
    }
}
