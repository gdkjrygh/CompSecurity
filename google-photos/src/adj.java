// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.PointF;

final class adj extends adp
{

    private adi a;

    adj(adi adi1, Context context)
    {
        a = adi1;
        super(context);
    }

    public final PointF computeScrollVectorForPosition(int i)
    {
        boolean flag = true;
        boolean flag1 = false;
        adi adi1 = a;
        if (adi1.getChildCount() == 0)
        {
            return null;
        }
        if (i < adi1.getPosition(adi1.getChildAt(0)))
        {
            flag1 = true;
        }
        i = ((flag) ? 1 : 0);
        if (flag1 != adi1.d)
        {
            i = -1;
        }
        if (adi1.b == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }
}
