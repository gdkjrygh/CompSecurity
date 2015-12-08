// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

final class igo
{

    final String a;
    final igj b;
    final Drawable c;
    final msp d;

    public igo(String s, igj igj, Drawable drawable, msp msp)
    {
        a = s;
        b = igj;
        c = drawable;
        d = msp;
    }

    public final String toString()
    {
        String s = a;
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 30 + String.valueOf(s1).length())).append("ShareMethod {name: ").append(s).append(", method: ").append(s1).append("}").toString();
    }
}
