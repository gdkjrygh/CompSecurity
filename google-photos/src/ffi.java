// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class ffi
{

    final Drawable a;
    final String b;
    public final int c;
    final msp d;

    private ffi(int i, Drawable drawable, String s, msp msp)
    {
        c = i;
        a = drawable;
        b = s;
        d = msp;
    }

    public static ffi a(Resources resources, int i, int j, int k, msp msp)
    {
        return new ffi(i, resources.getDrawable(j), resources.getString(k), msp);
    }

    public final String toString()
    {
        String s = b;
        return (new StringBuilder(String.valueOf(s).length() + 27)).append("AccountUtilItem {caption: ").append(s).append("}").toString();
    }
}
