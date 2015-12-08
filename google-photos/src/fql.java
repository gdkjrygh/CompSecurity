// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

public final class fql
    implements hgo
{

    private final long a;
    private final int b;

    public fql(long l, int i)
    {
        a = l;
        b = i;
    }

    public final int a()
    {
        return au.l;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn)
    {
        Object obj;
        View view;
        ViewStub viewstub;
        long l;
label0:
        {
            afn = (fqm)afn;
            obj = fqm.a(afn).getContext();
            if (a == 0L)
            {
                fqm.a(afn).setText(((Context) (obj)).getString(b.qg));
            } else
            {
                fqm.a(afn).setText(((ewz)olm.a(((Context) (obj)), ewz)).a(a, b));
            }
            afn.o = a;
            if (fqm.b(afn) != null)
            {
                obj = fqm.b(afn);
                view = ((fqm) (afn)).a;
                viewstub = fqm.c(afn);
                l = a;
                if (((fra) (obj)).c != null && ((fra) (obj)).d != null)
                {
                    break label0;
                }
            }
            return;
        }
        afn = (ImageView)view.findViewById(viewstub.getInflatedId());
        if (afn == null)
        {
            afn = (ImageView)viewstub.inflate();
        }
        afn.setVisibility(0);
        if (((fra) (obj)).c.a(l))
        {
            afn.setImageResource(fra.b);
        } else
        {
            afn.setImageResource(fra.a);
        }
        afn.setOnClickListener(new frb(((fra) (obj)), l));
        if (afn.getTag(au.k) != null)
        {
            afn.removeOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener)afn.getTag(au.k));
        }
        obj = new frc(l, afn, ((fra) (obj)).c, ((fra) (obj)).e);
        afn.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (obj)));
        afn.setTag(au.k, obj);
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return -a;
    }
}
