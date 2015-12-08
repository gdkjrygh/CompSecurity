// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class msp
{

    public final int a;
    public final boolean b;

    public msp(int i)
    {
        this(i, false, msm);
    }

    public msp(int i, boolean flag, Class class1)
    {
        a = i;
        b = flag;
    }

    public final String toString()
    {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", new Object[] {
            Integer.valueOf(a), Boolean.valueOf(b)
        });
    }
}
