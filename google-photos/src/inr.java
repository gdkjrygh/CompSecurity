// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class inr
    implements android.view.View.OnClickListener
{

    private inl a;

    inr(inl inl1)
    {
        a = inl1;
        super();
    }

    public final void onClick(View view)
    {
        inl.b(a, false);
    }
}
