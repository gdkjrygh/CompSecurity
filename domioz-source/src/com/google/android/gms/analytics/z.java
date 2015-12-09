// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            aa, ae

final class z
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[aa.values().length];
        try
        {
            b[aa.e.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[aa.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[aa.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[aa.f.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[aa.d.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[ae.values().length];
        try
        {
            a[ae.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ae.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
