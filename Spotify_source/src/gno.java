// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.view.View;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.music.spotlets.common.AbstractContentFragment;

public final class gno
    implements gnn
{

    private AbstractContentFragment a;

    private gno(AbstractContentFragment abstractcontentfragment)
    {
        a = abstractcontentfragment;
        super();
    }

    public gno(AbstractContentFragment abstractcontentfragment, byte byte0)
    {
        this(abstractcontentfragment);
    }

    public final void a()
    {
        AbstractContentFragment.a(a, com.spotify.music.spotlets.common.AbstractContentFragment.DataRetrievingState.d);
        AbstractContentFragment.a(a).c(true);
    }

    public final void a(Object obj)
    {
        obj = (Parcelable)obj;
        a.ae = ((Parcelable) (obj));
        AbstractContentFragment.a(a, com.spotify.music.spotlets.common.AbstractContentFragment.DataRetrievingState.c);
        if (a.q())
        {
            AbstractContentFragment.b(a).b();
            if (a.b(((Parcelable) (obj))))
            {
                AbstractContentFragment.a(a).b(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d);
            } else
            {
                AbstractContentFragment.a(a).b(null);
                obj = a;
                Parcelable parcelable = a.ae;
                boolean flag;
                if (parcelable == null || ((AbstractContentFragment) (obj)).ad.getTag(0x7f110026) == null || ((AbstractContentFragment) (obj)).ad.getTag(0x7f110026) != parcelable)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    a.ad.setTag(0x7f110026, a.ae);
                    a.a(a.ae, a.ad);
                    return;
                }
            }
        }
    }
}
