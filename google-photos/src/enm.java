// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class enm
{

    final int a;
    final int b;
    final int c;
    final float d;
    float e;
    float f;
    boolean g;

    private enm(int i, int j, int k, float f1)
    {
        a = i;
        b = j;
        c = k;
        d = f1;
    }

    enm(int i, int j, int k, float f1, byte byte0)
    {
        this(i, j, k, f1);
    }

    public final String toString()
    {
        return String.format(Locale.US, "start=%d end=%d height=%d ratio=%.3f demerits=%.3f forced=%b", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Float.valueOf(d), Float.valueOf(e), Boolean.valueOf(g)
        });
    }
}
