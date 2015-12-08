// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.e;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ci, ak

static final class 
    implements e
{

    public final void a()
    {
        ak.b();
    }

    public final void a(int i)
    {
        ak.b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    public final void a(String s)
    {
        ak.c(s);
    }

    public final int b()
    {
        switch (ak.c())
        {
        case 6: // '\006'
        default:
            return 3;

        case 5: // '\005'
            return 2;

        case 3: // '\003'
        case 4: // '\004'
            return 1;

        case 2: // '\002'
            return 0;
        }
    }

    public final void b(String s)
    {
        ak.b(s);
    }

    public final void c(String s)
    {
        ak.a(s);
    }

    ()
    {
    }
}
