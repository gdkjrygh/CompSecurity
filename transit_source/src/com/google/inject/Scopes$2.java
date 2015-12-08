// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;


// Referenced classes of package com.google.inject:
//            Scope, Scopes, Key, Provider

static final class 
    implements Scope
{

    public Provider scope(Key key, Provider provider)
    {
        return provider;
    }

    public String toString()
    {
        return "Scopes.NO_SCOPE";
    }

    ()
    {
    }
}
