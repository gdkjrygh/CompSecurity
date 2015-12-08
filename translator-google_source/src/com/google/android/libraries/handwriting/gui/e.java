// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            d

public final class e
{

    final char a;
    final d b;

    public e(char c, d d)
    {
        a = c;
        b = d;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("char: '");
        stringbuilder.append(a);
        stringbuilder.append("' request:");
        stringbuilder.append(b);
        stringbuilder.append("\n");
        return stringbuilder.toString();
    }
}
