// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Set;

public final class gqi
    implements android.view.View.OnClickListener, nug, omb, opp, opr, opv
{

    private final am a;
    private grg b;
    private gpp c;
    private TextView d;

    public gqi(am am1, opd opd1)
    {
        a = am1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (grg)olm1.a(grg);
        c = (gpp)olm1.a(gpp);
    }

    public final void al_()
    {
        d = (TextView)c.a(b.tG);
        d.setOnClickListener(this);
        b.a.a(this, true);
    }

    public final void am_()
    {
        b.a.a(this);
        d.setOnClickListener(null);
    }

    public final void b_(Object obj)
    {
label0:
        {
            Object obj1 = ((grg)obj).h;
            if (obj1 != null)
            {
                obj = (gax)((ekp) (obj1)).b(gax);
                obj1 = (eft)((ekp) (obj1)).b(eft);
                if (obj != null && !((gax) (obj)).q().contains(gav.b) && obj1 != null && ((eft) (obj1)).c() == euu.e)
                {
                    break label0;
                }
                d.setVisibility(8);
            }
            return;
        }
        d.setVisibility(0);
    }

    public final void onClick(View view)
    {
        gqj.r().a(a.B, "com.google.android.apps.photos.pager.autobackup.error_message_dialog");
    }
}
