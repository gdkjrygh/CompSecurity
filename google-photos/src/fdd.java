// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fdd extends mtf
{

    private final int a;
    private final String b;

    public fdd(fdc fdc, int i, String s)
    {
        super("com.google.android.apps.photos.devicemanagement.assistant.DISMISS_TASK");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        ((fbw)olm.a(context, fbw)).b(a, b);
        return new mue(true);
    }
}
