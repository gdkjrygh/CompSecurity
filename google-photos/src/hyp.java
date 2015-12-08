// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import java.util.Set;

final class hyp
    implements omb, opv
{

    private final am a;
    private final Activity b;
    private hzh c;
    private Context d;

    hyp(am am1, opd opd1)
    {
        a = am1;
        b = null;
        opd1.a(this);
    }

    hyp(Activity activity, opd opd1)
    {
        b = activity;
        a = null;
        opd1.a(this);
    }

    final void a()
    {
        Object obj;
        View view;
        if (a != null)
        {
            obj = a.R;
        } else
        {
            obj = null;
        }
        view = ((View) (obj));
        if (obj == null)
        {
            view = ((View) (obj));
            if (b != null)
            {
                view = b.findViewById(0x1020002);
            }
        }
        if (view != null && c.b(d))
        {
            obj = d.getResources();
            int i = c.b.a.size();
            view.announceForAccessibility(((Resources) (obj)).getQuantityString(b.yp, i, new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        c = (hzh)olm1.a(hzh);
    }
}
