// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.lang.reflect.Constructor;

// Referenced classes of package com.tealium.library:
//            s, u

final class r
{

    static final boolean a;
    private static final Class b;

    static Object a(Tealium.Config config, s s1)
    {
        if (!a)
        {
            return null;
        }
        try
        {
            config = ((Tealium.Config) (b.getConstructor(new Class[] {
                com/tealium/library/Tealium$Config, com/tealium/library/s
            }).newInstance(new Object[] {
                config, s1
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Tealium.Config config)
        {
            u.b(config);
            return null;
        }
        return config;
    }

    static 
    {
        Class class1 = null;
        Class class2 = Class.forName("com.tealium.library.FULL_AutoTracker");
        class1 = class2;
_L2:
        b = class1;
        boolean flag;
        if (class1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
