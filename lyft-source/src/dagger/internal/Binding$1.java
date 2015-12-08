// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Binding

final class nit> extends Binding
{

    public Object get()
    {
        throw new AssertionError("Unresolved binding should never be called to inject.");
    }

    public void injectMembers(Object obj)
    {
        throw new AssertionError("Unresolved binding should never be called to inject.");
    }

    (String s, String s1, boolean flag, Object obj)
    {
        super(s, s1, flag, obj);
    }
}
