// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;

final class fzl
{

    fzl()
    {
    }

    static Float a(myb myb1)
    {
        if (myb1 == null)
        {
            return null;
        } else
        {
            return Float.valueOf((float)myb1.a());
        }
    }

    public static void a(fzy fzy1, Point point)
    {
        if (point != null)
        {
            fzy1.d = Long.valueOf(point.x);
            fzy1.e = Long.valueOf(point.y);
        }
    }
}
