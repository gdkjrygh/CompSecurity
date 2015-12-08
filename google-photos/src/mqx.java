// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class mqx extends mtf
{

    private final mqm a;
    private final mqw b;

    public mqx(Context context, mqm mqm)
    {
        super(context, "CancelUploadTask");
        a = mqm;
        b = (mqw)olm.a(context, mqw);
    }

    protected final mue a()
    {
        int i = b.a(a);
        mue mue1 = new mue(true);
        mue1.a().putInt("num_cancelled", i);
        return mue1;
    }
}
