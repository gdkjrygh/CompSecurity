// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gch extends mtf
{

    private final gcf a;
    private final int b;

    public gch(gcf gcf1, int i)
    {
        super("com.google.android.apps.photos.metasync.Bootstrap.BootStrapTask");
        a = gcf1;
        b = i;
    }

    protected final mue a(Context context)
    {
        a.b(b);
        return new mue(true);
    }
}
