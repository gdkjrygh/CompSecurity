// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import ajr;
import aju;
import ajw;

public class GraphInputSource extends ahn
{

    private ahs mFrame;

    public GraphInputSource(ajr ajr, String s)
    {
        super(ajr, s);
        mFrame = null;
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).b("frame", 2, aif.a());
        ajw1.c = false;
        return ajw1;
    }

    public final void b(ahs ahs1)
    {
        if (mFrame != null)
        {
            mFrame.i();
        }
        if (ahs1 == null)
        {
            throw new RuntimeException("Attempting to assign null-frame!");
        } else
        {
            mFrame = ahs1.j();
            return;
        }
    }

    protected final void e()
    {
        if (mFrame != null)
        {
            b("frame").a(mFrame);
            mFrame.i();
            mFrame = null;
        }
    }

    protected final void g()
    {
        if (mFrame != null)
        {
            mFrame.i();
            mFrame = null;
        }
    }

    protected final boolean k()
    {
        return super.k() && mFrame != null;
    }
}
