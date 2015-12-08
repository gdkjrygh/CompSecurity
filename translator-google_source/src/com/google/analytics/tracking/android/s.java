// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            aq

final class s
{

    public static int a()
    {
        int i;
        try
        {
            i = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException numberformatexception)
        {
            aq.b((new StringBuilder("Invalid version number: ")).append(android.os.Build.VERSION.SDK).toString());
            return 0;
        }
        return i;
    }
}
