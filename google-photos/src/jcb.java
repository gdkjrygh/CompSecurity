// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class jcb
    implements android.view.View.OnClickListener
{

    private jby a;
    private jbz b;

    jcb(jbz jbz1, jby jby)
    {
        b = jbz1;
        a = jby;
        super();
    }

    public final void onClick(View view)
    {
        view = b;
        Object obj = a;
        jcc jcc1 = view.b(((jby) (obj)));
        if (jcc1 != null)
        {
            jcc1.b(((jby) (obj)));
        }
        obj = new jbv("UndoableActionManager-Undo", ((jby) (obj)), true);
        ((jbz) (view)).a.a(((mtf) (obj)));
    }
}
