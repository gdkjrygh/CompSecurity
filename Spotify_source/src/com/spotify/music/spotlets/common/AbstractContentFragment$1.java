// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.common;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import eda;
import gnn;

// Referenced classes of package com.spotify.music.spotlets.common:
//            AbstractContentFragment

public final class a
    implements eda
{

    private AbstractContentFragment a;

    public final void a(SessionState sessionstate)
    {
label0:
        {
            boolean flag;
label1:
            {
                boolean flag1 = true;
                if (sessionstate == null)
                {
                    return;
                }
                AbstractContentFragment abstractcontentfragment = a;
                if (sessionstate.j || abstractcontentfragment.af == taRetrievingState.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                if (!a.b(a.ae))
                {
                    a.ab.a(a.ae);
                    return;
                }
                sessionstate = a;
                if (((AbstractContentFragment) (sessionstate)).af != taRetrievingState.c)
                {
                    flag = flag1;
                    if (((AbstractContentFragment) (sessionstate)).af != taRetrievingState.b)
                    {
                        break label1;
                    }
                }
                if (((AbstractContentFragment) (sessionstate)).af != taRetrievingState.c);
                flag = false;
            }
            if (flag)
            {
                a.P();
                return;
            } else
            {
                AbstractContentFragment.a(a).b(com.spotify.mobile.android.ui.stuff.State.d);
                return;
            }
        }
        AbstractContentFragment.a(sessionstate, AbstractContentFragment.a(a));
    }

    ntState(AbstractContentFragment abstractcontentfragment)
    {
        a = abstractcontentfragment;
        super();
    }
}
