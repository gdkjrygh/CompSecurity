// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class fhj extends mtf
{

    private final int a;
    private final String b;

    public fhj(int i, String s)
    {
        super("com.google.android.apps.photos.envelope.asyncClearEnvelopeMediaTask");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        int i = ((est)olm.a(context, est)).b(a, b);
        context = new mue(true);
        context.a().putInt("num_removed", i);
        return context;
    }
}
