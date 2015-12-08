// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import java.util.List;

// Referenced classes of package com.tinder.parse:
//            f

public static final class er
{

    public String a;
    public List b;

    public final String toString()
    {
        return (new StringBuilder("error: [")).append(a).append("] purchases:[").append(b).append("]").toString();
    }

    public er()
    {
    }
}
