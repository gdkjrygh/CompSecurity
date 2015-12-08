// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.widget.HeaderView;

final class ng.Object
    implements Runnable
{

    private fir a;
    private fig b;

    public final void run()
    {
        boolean flag1 = false;
        if (fig.k(b) == null) goto _L2; else goto _L1
_L1:
        fig.g(b).onRestoreInstanceState(fig.k(b));
        fig.l(b);
        fig.a(b, null);
        fig.m(b);
        fig.i(b);
        fig.j(b);
_L4:
        if (!fig.q(b))
        {
            if (fig.r(b) != null)
            {
                fig.r(b).setText(fig.s(b));
            }
            if (!fig.c(b))
            {
                fig.t(b).a(fig.s(b));
                fig.u(b).a(fig.s(b));
            }
        }
        return;
_L2:
        if (!TextUtils.isEmpty(fig.n(b)))
        {
            boolean flag2 = b.g().getBoolean("auto_play", false);
            int i = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i < ((fio[])a.getItems()).length)
                    {
                        fio fio1 = ((fio[])a.getItems())[i];
                        if (!fig.n(b).equals(fio1.b()))
                        {
                            break label0;
                        }
                        flag = flag1;
                        if (fio1.j())
                        {
                            flag = true;
                            if (flag2)
                            {
                                fig.a(b, i);
                                fig.a(b, i);
                                fig.o(b);
                                fig.b(b, fig.n(b));
                            } else
                            {
                                fig.b(b, i);
                            }
                        }
                    }
                    if (!flag)
                    {
                        fig.i(b);
                        fig.j(b);
                    }
                    fig.a(b, null);
                    fig.m(b);
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
        if (!fig.p(b))
        {
            fig.i(b);
            fig.h(b);
            fig.j(b);
        } else
        {
            fig.i(b);
            fig.j(b);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ng(fig fig1, fir fir1)
    {
        b = fig1;
        a = fir1;
        super();
    }
}
