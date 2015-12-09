// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;


// Referenced classes of package com.android.slyce.a.c.c:
//            d

class c
{

    static final int a[];

    static 
    {
        a = new int[d.values().length];
        try
        {
            a[d.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[d.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[d.d.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[d.e.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[d.f.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[d.g.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
