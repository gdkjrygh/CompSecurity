// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class kvm
    implements android.view.View.OnClickListener
{

    private kvl a;

    kvm(kvl kvl1)
    {
        a = kvl1;
        super();
    }

    public final void onClick(View view)
    {
        a.a(true);
    }
}
