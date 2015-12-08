// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import ajo;
import ajr;
import ajw;

public class GraphOutputTarget extends ahn
{

    private ahs mFrame;
    public aif mType;

    public GraphOutputTarget(ajr ajr, String s)
    {
        super(ajr, s);
        mFrame = null;
        mType = aif.a();
    }

    public final ahs a()
    {
        if (mFrame != null)
        {
            ahs ahs1 = mFrame;
            mFrame = null;
            return ahs1;
        } else
        {
            return null;
        }
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).a("frame", 2, mType);
        ajw1.c = false;
        return ajw1;
    }

    protected final void e()
    {
        ahs ahs1 = a("frame").a();
        if (mFrame != null)
        {
            mFrame.i();
        }
        mFrame = ahs1.j();
    }

    protected final boolean k()
    {
        return super.k() && mFrame == null;
    }
}
