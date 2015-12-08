// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class msn
{

    public final List a = new ArrayList();

    public msn()
    {
    }

    private void a(olm olm1)
    {
        List list = olm1.d(mso);
        for (int i = 0; i < list.size(); i++)
        {
            msm msm1 = ((mso)list.get(i)).r();
            a.add(msm1);
        }

        if (a.isEmpty() || !((msm)a.get(a.size() - 1)).a.b)
        {
            olm1 = (msl)olm1.b(msl);
            if (olm1 != null)
            {
                olm1 = olm1.r();
                if (olm1 != null)
                {
                    a.add(olm1);
                    if (Log.isLoggable("VisualElementPath", 3))
                    {
                        String.format(Locale.US, "Found VE: %s resulting path: %s", new Object[] {
                            olm1, toString()
                        });
                    }
                }
            }
        }
    }

    private void b(View view)
    {
        if (view instanceof mso)
        {
            view = ((mso)view).r();
        } else
        {
            view = b.d(view);
        }
        if (view != null)
        {
            a.add(view);
        }
    }

    public final msn a(Context context)
    {
        a(olm.b(context));
        return this;
    }

    public final msn a(Context context, am am)
    {
        a(olm.a(context, am));
        return this;
    }

    public final msn a(View view)
    {
        b(view);
        for (ViewParent viewparent = view.getParent(); viewparent != null; viewparent = viewparent.getParent())
        {
            if (viewparent instanceof View)
            {
                b((View)viewparent);
            }
        }

        a(view.getContext());
        return this;
    }

    public final msn a(msm msm1)
    {
        a.add(msm1);
        return this;
    }

    public final String toString()
    {
        return b.d(a);
    }
}
