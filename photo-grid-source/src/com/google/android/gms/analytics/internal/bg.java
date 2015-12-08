// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            i

public final class bg
{

    public static int a()
    {
        int j;
        try
        {
            j = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            i.a("Invalid version number", android.os.Build.VERSION.SDK);
            return 0;
        }
        return j;
    }
}
