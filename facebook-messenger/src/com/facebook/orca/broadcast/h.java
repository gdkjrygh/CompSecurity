// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;


// Referenced classes of package com.facebook.orca.broadcast:
//            i

class h
{

    static final int a[];

    static 
    {
        a = new int[i.values().length];
        try
        {
            a[i.COMPOSE_BROADCAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[i.CONTACT_MULTIPICKER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
