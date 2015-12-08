// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;


// Referenced classes of package com.google.android.apps.unveil.env:
//            af

public final class b
{

    private static final af a = new af();

    public static void a(Object obj)
    {
        if (obj == null)
        {
            a.e("Unexpected null argument", new Object[0]);
        }
    }

}
