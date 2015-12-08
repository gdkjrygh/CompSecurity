// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class boc extends mtf
{

    private static String a = boc.getSimpleName();
    private final noj b;
    private final bod c;
    private final int j;
    private final String k;

    boc(String s, Context context, noj noj1, bod bod1, String s1)
    {
        String s2 = a;
        super((new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(s).length())).append(s2).append("|").append(s).toString());
        b.a(context, "context", null);
        b = (noj)b.a(noj1, "provider", null);
        c = (bod)b.a(bod1, "listener", null);
        j = noj1.c(context);
        k = (String)b.a(s1, "mediaKey", null);
    }

    protected final mue a(Context context)
    {
        context = b.c(context, j, k);
        if (context == null)
        {
            return new mue(false);
        }
        c.a((Bitmap)context.get());
        return new mue(true);
        context;
_L2:
        return new mue(false);
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
