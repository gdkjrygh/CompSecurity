// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;

public class bxn extends mtf
{

    private static final String b = bxn.getSimpleName();
    public cyu a;
    private final cyt c;

    public bxn(String s, cyt cyt1)
    {
        String s1 = b;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        c = (cyt)b.a(cyt1, "producer", null);
    }

    protected final mue a(Context context)
    {
        String s;
        long l;
        try
        {
            l = System.nanoTime();
            context = c.a();
            l = System.nanoTime() - l;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, "exception while producing storyboard");
        }
        if (l <= 0x2faf080L)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = b;
        l /= 0xf4240L;
        Log.w(s, (new StringBuilder(52)).append("Took ").append(l).append(" ms to produce a storyboard").toString());
        a = context;
        return new mue(true);
    }

}
