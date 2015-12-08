// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class aws extends android.graphics.drawable.Drawable.ConstantState
{

    final aww a;

    public aws(Context context, aqm aqm, aww aww)
    {
        context.getApplicationContext();
        a = aww;
    }

    public final int getChangingConfigurations()
    {
        return 0;
    }

    public final Drawable newDrawable()
    {
        return new awr(this);
    }

    public final Drawable newDrawable(Resources resources)
    {
        return newDrawable();
    }
}
