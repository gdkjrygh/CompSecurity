// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.DialogInterface;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.b.a;
import com.roidapp.cloudlib.sns.b.b;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            w, at

final class aa
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final long b;
    final w c;

    aa(w w1, int i, long l1)
    {
        c = w1;
        a = i;
        b = l1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (!l.b(w.c(c)))
        {
            l.a(w.c(c), null);
            return;
        } else
        {
            ((a)com.roidapp.cloudlib.sns.basepost.w.b(c).get(a)).e = b.b;
            c.notifyDataSetChanged();
            com.roidapp.cloudlib.sns.basepost.w.a(c).a(b, ((a)com.roidapp.cloudlib.sns.basepost.w.b(c).get(a)).c);
            return;
        }
    }
}
