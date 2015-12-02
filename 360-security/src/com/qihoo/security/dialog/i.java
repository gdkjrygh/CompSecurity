// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.view.View;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.dialog:
//            a

public class i extends a
{

    public i(Context context)
    {
        super(context);
    }

    public i(Context context, int j, int k)
    {
        this(context, ((CharSequence) (d.a().a(j))), ((CharSequence) (d.a().a(k))));
    }

    public i(Context context, CharSequence charsequence, CharSequence charsequence1)
    {
        this(context);
        setDialogMessage(charsequence1);
        setDialogTitle(charsequence);
    }

    protected View a()
    {
        return null;
    }
}
