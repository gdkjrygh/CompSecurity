// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;

final class its
    implements android.view.View.OnClickListener
{

    private itf a;

    its(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void onClick(View view)
    {
        if (view.getId() == s.cf)
        {
            ((am) (a)).R.findViewById(s.cg).setVisibility(0);
            view = (LinearLayout)((am) (a)).R.findViewById(s.ch);
            view.setAlpha(0.0F);
            view.setVisibility(0);
            view.animate().alpha(1.0F).setDuration(150L).setListener(null).start();
        } else
        {
            if (view.getId() == s.ck)
            {
                itf.d(a);
                return;
            }
            if (view.getId() == s.cl)
            {
                itf.e(a);
                return;
            }
        }
    }
}
