// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class obx
    implements mru
{

    public final long a;
    public final int b = 1;

    private obx(long l, int i)
    {
        a = l;
    }

    public static obx a(long l)
    {
        return new obx(l, 1);
    }

    public final String a(Context context, mrw mrw1)
    {
        return mrw1.a(context);
    }

    public final void a(Context context)
    {
    }
}
