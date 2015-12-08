// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;

public final class mqz extends mtf
{

    public mqv a;
    private final mqw b;
    private final int c;
    private final String j;
    private final Collection k;

    public mqz(Context context, int i, String s, Collection collection)
    {
        super(context, "StartUploadTask");
        c = i;
        j = s;
        k = collection;
        b = (mqw)olm.a(context, mqw);
    }

    protected final mue a()
    {
        long l = b.a(c, j, k, a);
        mue mue1;
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mue1 = new mue(flag);
        mue1.a().putLong("batch_id", l);
        return mue1;
    }
}
