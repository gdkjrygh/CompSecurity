// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

class cuq extends mtf
{

    static final String a = cuq.getSimpleName();
    private final Context b;
    private final noj c;
    private final int j;

    public cuq(Context context, noj noj1)
    {
        super(context, a);
        b = (Context)b.a(context, "context", null);
        c = (noj)b.a(noj1, "movieMakerProvider", null);
        j = c.c(b);
    }

    protected final mue a()
    {
        mue mue1 = new mue(true);
        mue1.a().putSerializable("authentication_headers", new HashMap(c.b(j)));
        return mue1;
    }

}
