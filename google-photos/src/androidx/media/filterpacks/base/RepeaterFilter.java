// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;

public final class RepeaterFilter extends ahn
{

    ahs mCachedFrame;
    int mRepeat;

    public RepeaterFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mCachedFrame = null;
        mRepeat = 0;
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, aif.a()).a("repeat", 2, aif.a(Integer.TYPE)).b("output", 2, aif.a()).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("input"))
        {
            ajo1.a(b("output"));
        }
    }

    protected final void e()
    {
        ajo ajo1 = a("repeat");
        ajo ajo2 = a("input");
        if (mRepeat <= 1)
        {
            if (mCachedFrame != null)
            {
                mCachedFrame.i();
            }
            mCachedFrame = ajo2.a().j();
        }
        mRepeat = ((Integer)ajo1.a().d().m()).intValue();
        boolean flag;
        if (mRepeat > 1)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        ajo2.f = flag;
        if (mRepeat > 0)
        {
            b("output").a(mCachedFrame);
        }
    }

    protected final void g()
    {
        if (mCachedFrame != null)
        {
            mCachedFrame.i();
        }
    }
}
