// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.g.b;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bc

final class bn extends aa
{

    final View a;
    final n b;
    final bc c;

    bn(bc bc1, View view, n n1)
    {
        c = bc1;
        a = view;
        b = n1;
        super();
    }

    public final void a()
    {
        com.roidapp.cloudlib.sns.g.b.a().a(b.b, com.roidapp.cloudlib.sns.basepost.bc.c(c), c.c);
    }

    public final void b(int i, Exception exception)
    {
        an.a(bc.a(c), bc.a(c).getString(at.k));
        com.roidapp.cloudlib.sns.g.b.a().a(b.b, com.roidapp.cloudlib.sns.basepost.bc.c(c), c.c);
    }

    public final void c(Object obj)
    {
        if (bc.a(c) != null)
        {
            a.findViewById(ar.ai).setVisibility(8);
            obj = (TextView)a.findViewById(ar.aj);
            ((TextView) (obj)).setText(bc.a(c).getString(at.P));
            ((TextView) (obj)).setTextColor(bc.a(c).getResources().getColor(ao.a));
            ((TextView) (obj)).setBackgroundResource(aq.K);
        }
        com.roidapp.cloudlib.sns.g.b.a().a(b.b, com.roidapp.cloudlib.sns.basepost.bc.c(c));
    }
}
