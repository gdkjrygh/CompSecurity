// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class fhh
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    final List c = new ArrayList();

    fhh()
    {
    }

    final fhg a()
    {
        return new fhg(this);
    }

    final fhh a(String s)
    {
        a.add(s);
        return this;
    }

    final fhh b(String s)
    {
        b.add(s);
        return this;
    }

    final fhh c(String s)
    {
        c.add(s);
        return this;
    }
}
