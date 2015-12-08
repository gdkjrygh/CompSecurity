// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.util.Log;

// Referenced classes of package com.amazon.device.associates:
//            bl

final class ai
    implements bl
{

    ai()
    {
    }

    private static String a(String s)
    {
        return (new StringBuilder()).append("IAP Physical SDK/Sandbox Mode: ").append(s).toString();
    }

    public void a(String s, String s1)
    {
        Log.d(s, a(s1));
    }

    public boolean a()
    {
        return true;
    }

    public void b(String s, String s1)
    {
        Log.e(s, a(s1));
    }

    public boolean b()
    {
        return true;
    }
}
