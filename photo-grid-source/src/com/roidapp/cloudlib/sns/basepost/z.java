// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.DialogInterface;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            w, at

final class z
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final long b;
    final w c;

    z(w w1, int i, long l)
    {
        c = w1;
        a = i;
        b = l;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        w.b(c).remove(a);
        c.notifyDataSetChanged();
        w.a(c).a(b);
    }
}
