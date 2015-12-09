// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

public final class dhp extends dhn
{

    public dhp(Context context)
    {
        super(context);
    }

    public final int a()
    {
        return 0;
    }

    public final void a(View view, float f, int i)
    {
        super.a(view, f, i);
        ((dgz)view.getTag(0x7f1100e1)).a = true;
        view.setAlpha(Math.max(0.0F, 1.0F - 1.5F * f));
    }

    public final void b(View view, float f, int i)
    {
        super.b(view, f, i);
        ((dgz)view.getTag(0x7f1100e1)).a = false;
    }
}
