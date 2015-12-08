// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.app.AlertDialog;
import android.content.Context;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ax, ay, bb

public final class aw
{

    private bb a;

    public aw(bb bb)
    {
        a = bb;
    }

    static bb a(aw aw1)
    {
        return aw1.a;
    }

    public final void a(Context context, int i, int j, int k, int l)
    {
        context = (new android.app.AlertDialog.Builder(context)).setCancelable(true);
        if (i != -1)
        {
            context.setTitle(i);
        }
        if (j != -1)
        {
            context.setMessage(j);
        }
        if (k != -1)
        {
            context.setPositiveButton(k, new ax(this));
        }
        if (l != -1)
        {
            context.setNegativeButton(l, new ay(this));
        }
        context = context.create();
        context.setCanceledOnTouchOutside(true);
        context.show();
    }
}
