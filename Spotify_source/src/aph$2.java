// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ang.Object
    implements Runnable
{

    private Context a;
    private String b;

    public final void run()
    {
        aph.a(a, b, false);
    }

    (Context context, String s)
    {
        a = context;
        b = s;
        super();
    }
}
