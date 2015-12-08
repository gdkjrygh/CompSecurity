// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class fqn
    implements android.view.View.OnLongClickListener
{

    private fqm a;

    fqn(fqm fqm1)
    {
        a = fqm1;
        super();
    }

    public final boolean onLongClick(View view)
    {
        return fqm.a(a, view);
    }
}
