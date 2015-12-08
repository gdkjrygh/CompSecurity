// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.BitmapFactory;

public final class nkd extends mzc
{

    private final Resources a;
    private final int b;

    public nkd(Resources resources, int i)
    {
        a = resources;
        b = i;
    }

    protected final Object a()
    {
        return BitmapFactory.decodeResource(a, b);
    }
}
