// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ezq
    implements faj
{

    private final int a;
    private final Object b[];

    public transient ezq(int i, Object aobj[])
    {
        a = i;
        b = aobj;
    }

    public final String a(Context context)
    {
        return context.getString(a, b);
    }
}
