// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import crittercism.android.ae;
import crittercism.android.l;
import java.util.concurrent.Callable;

// Referenced classes of package com.crittercism.app:
//            Crittercism

static final class 
    implements Callable
{

    private static String a()
    {
        Object obj = l.i();
        if (((l) (obj)).f == null)
        {
            return null;
        }
        String s;
        try
        {
            s = ((l) (obj)).a(ae.g.a(), ae.g.b(), null);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in getUserUUID.call(): ")).append(exception.getClass().getName());
            return null;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = ((l) (obj)).a("com.crittercism.prefs", "com.crittercism.prefs.did", null);
        return ((String) (obj));
        return s;
    }

    public final Object call()
    {
        return a();
    }

    ()
    {
    }
}
