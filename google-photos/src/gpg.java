// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class gpg
    implements gpf, omb, opv
{

    private final gph a;
    private final gpe b;
    private final Context c;
    private hyy d;

    public gpg(am am1, opd opd1, gph gph, gpe gpe1)
    {
        a = gph;
        b = gpe1;
        c = am1.O_();
        opd1.a(this);
    }

    public final gpg a(olm olm1)
    {
        olm1.a(gpf, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (hyy)olm1.a(hyy);
    }

    public final boolean a(PointF pointf, float f, float f1)
    {
        iws iws1;
        if (d.b())
        {
            return false;
        }
        Iterator iterator = ((iwt)((nwm)olm.a(c, nwm)).ai_().a(iwt)).a().iterator();
        float f2;
        View view;
        int i;
        do
        {
            int ai[];
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_195;
                }
                iws1 = (iws)iterator.next();
                view = iws1.a;
                ai = new int[2];
                view.getLocationOnScreen(ai);
            } while (pointf.x < (float)ai[0] || pointf.x > (float)(ai[0] + view.getWidth()) || pointf.y < (float)ai[1]);
            f2 = pointf.y;
            i = ai[1];
        } while (f2 > (float)(view.getHeight() + i));
_L1:
        if (iws1 != null)
        {
            b.a(iws1.b, iws1.a, a, pointf, f, f1);
            return true;
        } else
        {
            return false;
        }
        iws1 = null;
          goto _L1
    }
}
