// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            b

public final class c
    implements a
{

    static final boolean a;
    private final b b;

    private c(b b1)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = b1;
            return;
        }
    }

    public static a a(b b1)
    {
        return new c(b1);
    }

    public final Object a()
    {
        return (new com.squareup.okhttp.g.a()).a("api.gotinder.com", new String[] {
            "sha1/JTtEL0PVAp98bzZkcPLKf6aIx+o="
        }).a("api.gotinder.com", new String[] {
            "sha1/ui61qD4TI9lTS15lvOejE13QqZY="
        }).a("api.gotinder.com", new String[] {
            "sha1/7uWfHiqlRMPLJUOmmlvUaiW8u44="
        }).a();
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
