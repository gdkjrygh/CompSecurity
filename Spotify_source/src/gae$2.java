// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class ang.Object
    implements android.view.nLongClickListener
{

    private Context a;
    private fuj b;
    private Object c;

    public final boolean onLongClick(View view)
    {
        fud.a(a, b, c);
        return true;
    }

    (Context context, fuj fuj, Object obj)
    {
        a = context;
        b = fuj;
        c = obj;
        super();
    }
}
