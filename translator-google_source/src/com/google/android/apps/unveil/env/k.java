// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Bitmap;
import com.google.android.apps.unveil.sensors.a;
import com.google.android.apps.unveil.sensors.t;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, l, j

public final class k
{

    private static final af a = new af();

    public static j a(Bitmap bitmap, int i)
    {
        return new l(new a(bitmap, i));
    }

    public static j a(byte abyte0[], int i)
    {
        return new l(new t(abyte0, i));
    }

    public static j a(byte abyte0[], int i, int j)
    {
        return new l(new a(abyte0, i, j));
    }

}
