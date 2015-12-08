// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public final class ekm
{

    private final Set a = new HashSet();
    private final Set b = new HashSet();

    public ekm()
    {
    }

    public final ekk a()
    {
        return new ekk(a, b);
    }

    public final ekm a(ekk ekk1)
    {
        a.addAll(ekk.a(ekk1));
        b.addAll(ekk.b(ekk1));
        return this;
    }

    public final ekm a(Class class1)
    {
        a.add(class1);
        return this;
    }

    public final ekm b(Class class1)
    {
        b.add(class1);
        return this;
    }
}
