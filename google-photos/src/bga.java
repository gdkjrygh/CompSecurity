// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class bga extends mtf
{

    private final bdo a;
    private final int b;

    public bga(bdo bdo1, int i)
    {
        super("LooksTask");
        super.i = muf.a;
        a = bdo1;
        b = i;
    }

    public final mue a(Context context)
    {
        context = new mue(true);
        com.google.android.apps.consumerphotoeditor.core.Look alook[] = a.a(b);
        context.a().putParcelableArray("looks", alook);
        return context;
    }
}
