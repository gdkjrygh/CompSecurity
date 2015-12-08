// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class enl
{

    final int a;
    enm b;
    float c;

    enl(int i)
    {
        a = i;
    }

    public final String toString()
    {
        return String.format(Locale.US, "index=%d demerits=%.3f optimum=%s", new Object[] {
            Integer.valueOf(a), Float.valueOf(c), b
        });
    }
}
