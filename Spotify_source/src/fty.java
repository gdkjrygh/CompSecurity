// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.LinearLayout;

public final class fty extends LinearLayout
{

    final ftw a;

    public fty(ftw ftw, Context context)
    {
        a = ftw;
        super(context);
        setEnabled(false);
        setOnClickListener(null);
        setOrientation(0);
    }
}
