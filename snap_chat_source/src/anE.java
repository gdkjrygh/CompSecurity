// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

public final class anE
    implements anD
{

    public anE()
    {
    }

    public final alw a(String s)
    {
        if ("UTC".equalsIgnoreCase(s))
        {
            return alw.a;
        } else
        {
            return null;
        }
    }

    public final Set a()
    {
        return Collections.singleton("UTC");
    }
}
