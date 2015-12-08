// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.cards.web.bd;
import com.kik.g.i;
import kik.android.chat.activity.FragmentWrapperActivity;

// Referenced classes of package kik.android.chat.fragment:
//            KikCardBrowserFragment

final class bk extends i
{

    final KikCardBrowserFragment a;

    bk(KikCardBrowserFragment kikcardbrowserfragment)
    {
        a = kikcardbrowserfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = a.getActivity();
        obj1 = a.j();
        if (((bd) (obj1)).canGoBack())
        {
            ((bd) (obj1)).goBack();
        } else
        if (obj instanceof FragmentWrapperActivity)
        {
            if (!((FragmentWrapperActivity)obj).a(true))
            {
                a.J();
                a.a(null);
                return;
            }
        } else
        {
            a.J();
            return;
        }
    }
}
