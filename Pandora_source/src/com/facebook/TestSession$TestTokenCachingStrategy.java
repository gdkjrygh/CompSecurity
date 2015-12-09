// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;

// Referenced classes of package com.facebook:
//            TokenCachingStrategy, TestSession

private static final class <init> extends TokenCachingStrategy
{

    private Bundle bundle;

    public void clear()
    {
        bundle = null;
    }

    public Bundle load()
    {
        return bundle;
    }

    public void save(Bundle bundle1)
    {
        bundle = bundle1;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
