// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            c

public abstract class d
    implements c
{

    final Set a;
    protected List b;

    public d(Set set)
    {
        b = new ArrayList();
        a = set;
    }

    public abstract int a();

    public abstract int b();
}
