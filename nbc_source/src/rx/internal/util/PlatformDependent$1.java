// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.security.PrivilegedAction;

// Referenced classes of package rx.internal.util:
//            PlatformDependent

static final class 
    implements PrivilegedAction
{

    public ClassLoader run()
    {
        return ClassLoader.getSystemClassLoader();
    }

    public volatile Object run()
    {
        return run();
    }

    ()
    {
    }
}
