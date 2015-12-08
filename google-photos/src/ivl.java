// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ivl
    implements android.view.View.OnClickListener
{

    private ivk a;

    ivl(ivk ivk1)
    {
        a = ivk1;
        super();
    }

    public final void onClick(View view)
    {
        if (a.a)
        {
            ((ivm)olm.a(view.getContext(), ivm)).a();
        }
    }
}
