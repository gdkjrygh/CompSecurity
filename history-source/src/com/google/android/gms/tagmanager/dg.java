// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di

abstract class dg extends aj
{

    public transient dg(String s, String as[])
    {
        super(s, as);
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        D(map);
        return di.rb();
    }

    public abstract void D(Map map);

    public boolean pe()
    {
        return false;
    }
}
