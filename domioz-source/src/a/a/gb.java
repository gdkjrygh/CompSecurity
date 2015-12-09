// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            gs

final class gb extends gs
{

    final gs a;

    gb(gs gs1)
    {
        a = gs1;
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
