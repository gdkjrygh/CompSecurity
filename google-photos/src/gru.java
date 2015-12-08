// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class gru
    implements android.view.View.OnClickListener, omb, opp, opr, opv
{

    private final am a;
    private final nug b = new grv(this);
    private grg c;
    private gpp d;
    private TextView e;

    public gru(am am1, opd opd1)
    {
        a = am1;
        opd1.a(this);
    }

    static void a(gru gru1)
    {
        if (gru1.c.h == null || gru1.e == null)
        {
            return;
        }
        jgi jgi1 = (jgi)gru1.c.h.b(jgi);
        boolean flag;
        if (jgi1 != null && jgh.a(jgi1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            gru1.e.setVisibility(0);
            return;
        } else
        {
            gru1.e.setVisibility(8);
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (grg)olm1.a(grg);
        d = (gpp)olm1.a(gpp);
    }

    public final void al_()
    {
        e = (TextView)d.a(b.tN);
        e.setOnClickListener(this);
        c.a.a(b, true);
    }

    public final void am_()
    {
        c.a.a(b);
        e.setOnClickListener(null);
    }

    public final void onClick(View view)
    {
        grw.r().a(a.h(), "com.google.android.apps.photos.pager.slomo.message_dialog");
    }
}
