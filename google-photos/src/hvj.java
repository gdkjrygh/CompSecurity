// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class hvj extends mtf
{

    private hvi a;

    public hvj(hvi hvi1)
    {
        super("RejectFalsePositivesTask");
        a = hvi1;
    }

    protected final mue a(Context context)
    {
        hvh hvh1 = new hvh(context, a);
        hvh1.d();
        if (hvh1.l())
        {
            context = new mue(((nxx) (hvh1)).l, ((nxx) (hvh1)).n, null);
        } else
        if (!hvh1.a)
        {
            context = new mue(0, new Exception("`RejectFalsePositivesResponse.success` was 'false'."), context.getString(c.ex));
        } else
        {
            context = new mue(true);
        }
        context.a().putParcelableArrayList("extra_media_list_key", new ArrayList(a.b));
        return context;
    }
}
