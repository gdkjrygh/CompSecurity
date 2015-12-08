// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class fqt
    implements android.view.View.OnLongClickListener
{

    private fqm a;

    fqt(fqm fqm1)
    {
        a = fqm1;
        super();
    }

    public final boolean onLongClick(View view)
    {
        if (fqm.d(a).b())
        {
            return false;
        } else
        {
            return fqm.a(a, view);
        }
    }
}
