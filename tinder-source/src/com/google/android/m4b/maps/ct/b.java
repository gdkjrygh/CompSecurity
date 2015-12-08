// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            s

public abstract class b
    implements s
{

    private boolean a;
    private int b;

    public b()
    {
        a = true;
        b = -1;
    }

    public final s b()
    {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    public Object clone()
    {
        return b();
    }
}
