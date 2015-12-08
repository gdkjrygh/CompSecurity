// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class msk
    implements android.view.View.OnLongClickListener
{

    private final android.view.View.OnLongClickListener a;

    public msk(android.view.View.OnLongClickListener onlongclicklistener)
    {
        a = onlongclicklistener;
    }

    public final boolean onLongClick(View view)
    {
        mry.a(view, 31);
        return a.onLongClick(view);
    }
}
