// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            b

final class c extends b
{

    c()
    {
        super(null, null, false, null);
    }

    public final Object get()
    {
        throw new AssertionError("Unresolved binding should never be called to inject.");
    }

    public final void injectMembers(Object obj)
    {
        throw new AssertionError("Unresolved binding should never be called to inject.");
    }
}
