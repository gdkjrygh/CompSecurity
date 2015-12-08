// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class jbv extends mtf
{

    private final jby a;
    private final boolean b;

    public jbv(String s, jby jby1, boolean flag)
    {
        super(s);
        a = jby1;
        b = flag;
    }

    protected final mue a(Context context)
    {
        mue mue1;
        if (b)
        {
            context = a.b(context);
        } else
        {
            context = a.a(context);
        }
        mue1 = new mue(true);
        context.a();
        context = mue1;
_L2:
        context.a().putParcelable("com.google.android.apps.photos.undoaction.MediaUndoActionTask.Action", a);
        return context;
        context;
        context = new mue(0, context, null);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
