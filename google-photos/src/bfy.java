// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.ExecutionException;

public final class bfy extends mtf
{

    private final bdo a;

    public bfy(bdo bdo1)
    {
        super("LoadFullSizePhotoTask");
        a = bdo1;
    }

    public final mue a(Context context)
    {
        bdo bdo1;
        bdo1 = a;
        bdo1.l = b.a(context, bdo1.i, null, true);
        boolean flag;
        if (bdo1.l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bdo1.s = flag;
        if (!a.s)
        {
            return new mue(false);
        } else
        {
            return new mue(true);
        }
        context;
_L2:
        return new mue(0, context, null);
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
