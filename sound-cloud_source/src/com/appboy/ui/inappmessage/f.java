// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.b.a.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            u

final class f
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.appboy.b.a.a.values().length];
        try
        {
            b[a.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[a.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[a.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.appboy.ui.inappmessage.u.a().length];
        try
        {
            a[com.appboy.ui.inappmessage.u.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[u.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[u.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
