// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class flt
{

    public static CharSequence a(int i)
    {
        int j = i / 60;
        return String.format(Locale.getDefault(), "%d:%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i % 60)
        });
    }
}
