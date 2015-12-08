// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.photos.allphotos.fragment.month.MonthView;
import java.util.List;

public final class dqx
    implements hgo
{

    private final glq a;
    private final long b;
    private final int c;

    public dqx(int i)
    {
        c = i;
        a = null;
        b = 0L;
    }

    public dqx(glq glq1)
    {
        boolean flag;
        if (glq1.a.size() <= 28)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "month has too many media");
        a = glq1;
        b = glq1.b;
        c = 0;
    }

    public final int a()
    {
        return c.cd;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn1)
    {
        Object obj = (dqy)afn1;
        ((dqy) (obj)).o.setText(((ewz)olm.a(afn1.a.getContext(), ewz)).a(b, exa.e));
        ((dqy) (obj)).p.c = dqy.a(((dqy) (obj)));
        if (a != null)
        {
            afn1 = ((dqy) (obj)).p;
            obj = a.a;
            p.a(obj);
            if (((MonthView) (afn1)).b == null || !((MonthView) (afn1)).b.equals(obj))
            {
                afn1.b();
                afn1.b = ((List) (obj));
                afn1.a = ((List) (obj)).size();
                if (oiu.a(afn1))
                {
                    afn1.c();
                }
                afn1.a();
            }
            return;
        } else
        {
            afn1 = ((dqy) (obj)).p;
            afn1.a = c;
            afn1.b = null;
            afn1.b();
            afn1.a();
            return;
        }
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return -1L;
    }
}
