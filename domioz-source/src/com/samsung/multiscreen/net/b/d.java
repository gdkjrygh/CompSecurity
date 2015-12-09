// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.b;

import java.util.Map;
import org.b.a.a.a;
import org.b.a.a.b;
import org.b.a.a.c;

// Referenced classes of package com.samsung.multiscreen.net.b:
//            e

public final class d
{

    private static a a = new e();

    public static Map a(String s)
    {
        if (s == null)
        {
            return a.b();
        }
        try
        {
            s = (Map)(new b()).a(s, a);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a.b();
        }
        return s;
    }

}
