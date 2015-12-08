// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;

public final class dgn
{

    private static boolean a = true;

    public static void a(Class class1, Object obj)
    {
        if (a && obj.getClass() != class1)
        {
            throw new UnsupportedOperationException((new StringBuilder("You are not allowed to subclass ")).append(class1.getName()).toString());
        } else
        {
            return;
        }
    }

    public static boolean a(Context context)
    {
        context = context.obtainStyledAttributes(new int[] {
            0x7f010142
        });
        boolean flag = context.getBoolean(0, true);
        context.recycle();
        return flag;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

}
