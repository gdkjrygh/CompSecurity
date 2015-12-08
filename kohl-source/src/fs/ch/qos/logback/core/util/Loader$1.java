// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;

// Referenced classes of package fs.ch.qos.logback.core.util:
//            Loader

static final class 
    implements PrivilegedAction
{

    public Boolean run()
    {
        try
        {
            AccessController.checkPermission(new RuntimePermission("getClassLoader"));
        }
        catch (AccessControlException accesscontrolexception)
        {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public volatile Object run()
    {
        return run();
    }

    ()
    {
    }
}
