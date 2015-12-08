// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            s

public class r
{

    private static final Set a = a();

    private static Set a()
    {
        return Collections.unmodifiableSet(new s());
    }

    static boolean a(String s1)
    {
        return s1 != null && (s1.startsWith("publish") || s1.startsWith("manage") || a.contains(s1));
    }

}
