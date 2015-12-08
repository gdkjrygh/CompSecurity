// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gai
{

    public final ehr a;
    final List b = new ArrayList();
    boolean c;

    public gai(ehr ehr)
    {
        a = ehr;
    }

    public final int a()
    {
        return b.size();
    }

    public final ekp a(int i)
    {
        return (ekp)b.get(i);
    }

    public final boolean a(ekp ekp1)
    {
        return b.remove(ekp1);
    }

    public final int b(ekp ekp1)
    {
        return b.indexOf(ekp1);
    }

    public final List b()
    {
        return Collections.unmodifiableList(new ArrayList(b));
    }
}
