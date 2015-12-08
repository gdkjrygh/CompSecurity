// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class aoh
{

    public final Map a = new HashMap();

    public aoh()
    {
    }

    public final Collection a()
    {
        return Collections.unmodifiableCollection(a.keySet());
    }

    public final int b()
    {
        return a.size();
    }
}
