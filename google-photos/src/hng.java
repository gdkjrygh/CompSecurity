// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class hng
    implements android.view.View.OnClickListener
{

    private hnd a;

    hng(hnd hnd1)
    {
        a = hnd1;
        super();
    }

    public final void onClick(View view)
    {
        a.b(true);
    }
}
