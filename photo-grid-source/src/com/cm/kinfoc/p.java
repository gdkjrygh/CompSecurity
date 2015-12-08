// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import java.util.regex.Pattern;

// Referenced classes of package com.cm.kinfoc:
//            ag, j, m

public final class p
{

    static Pattern a = Pattern.compile(".*_(\\d+).ich");
    private static final boolean b;
    private j c;
    private m d;

    public p()
    {
        c = new j();
        d = new m();
    }

    static 
    {
        b = ag.a;
    }
}
