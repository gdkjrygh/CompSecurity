// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;

public final class nvq
{

    public final int a;
    public final int b;

    public nvq(Context context)
    {
        boolean flag3 = false;
        super();
        float f;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (context.getResources().getConfiguration().orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = b.a(b.x(context));
        if (f >= 750F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (!flag1)
        {
            flag2 = flag3;
            if (f >= 500F)
            {
                flag2 = true;
            }
        }
        b = (int)TypedValue.applyDimension(1, 4F, b.x(context));
        if (flag)
        {
            if (flag1)
            {
                a = 6;
                return;
            }
            if (flag2)
            {
                a = 6;
                return;
            } else
            {
                a = 4;
                return;
            }
        }
        if (flag1)
        {
            a = 4;
            return;
        } else
        {
            a = 3;
            return;
        }
    }
}
