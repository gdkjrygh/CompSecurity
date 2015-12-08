// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public final class hwk
    implements efp, omb, opp, opr, opv
{

    efd a;
    private am b;

    public hwk(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            ((TextView)b.R.findViewById(c.eI)).setText(c.fe);
            ((TextView)b.R.findViewById(c.eE)).setVisibility(0);
            ((Button)b.R.findViewById(c.eH)).setVisibility(8);
            return;
        } else
        {
            ((TextView)b.R.findViewById(c.eI)).setText(c.fd);
            ((TextView)b.R.findViewById(c.eE)).setVisibility(8);
            Button button = (Button)b.R.findViewById(c.eH);
            button.setVisibility(0);
            button.setOnClickListener(new hwl(this));
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (efd)olm1.a(efd);
    }

    public final void a(eey eey1)
    {
        boolean flag;
        if (!eey1.a.equals(efb.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public final void al_()
    {
        boolean flag;
        if (!a.b.a.equals(efb.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        a.a(this);
    }

    public final void am_()
    {
        a.b(this);
    }
}
