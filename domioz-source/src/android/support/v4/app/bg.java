// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.app:
//            bu, bi

public final class bg extends bu
{

    Bitmap a;
    Bitmap b;
    boolean c;

    public bg()
    {
    }

    public final bg a(Bitmap bitmap)
    {
        a = bitmap;
        return this;
    }

    public final bg a(CharSequence charsequence)
    {
        e = bi.e(charsequence);
        return this;
    }

    public final bg b(CharSequence charsequence)
    {
        f = bi.e(charsequence);
        g = true;
        return this;
    }
}
