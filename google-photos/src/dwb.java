// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class dwb
    implements android.view.View.OnClickListener
{

    private dwi a;

    dwb(dwa dwa, dwi dwi1)
    {
        a = dwi1;
        super();
    }

    public final void onClick(View view)
    {
        a.b.a(view.getContext());
    }
}
