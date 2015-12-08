// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahq;
import ahs;
import aiw;
import ajc;
import ajj;
import ajk;
import ajo;
import ajr;
import aju;
import akt;
import aku;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

// Referenced classes of package androidx.media.filterpacks.base:
//            GraphOutputTarget, GraphInputSource

public class MetaFilter extends ahn
    implements ajk
{

    private static final boolean DEBUG = false;
    public ahq mCurrentGraph;
    public akt mGraphProvider;
    public HashMap mInputFrames;
    public aku mState;

    public MetaFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mState = new aku();
        mInputFrames = new HashMap();
    }

    protected void A()
    {
        mCurrentGraph = mGraphProvider.a();
        java.util.Map.Entry entry;
        for (Iterator iterator = mInputFrames.entrySet().iterator(); iterator.hasNext(); a(mCurrentGraph.d((String)entry.getKey()), (ahs)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    protected void B()
    {
        aju aaju[] = super.mConnectedOutputPortArray;
        int j = aaju.length;
        for (int i = 0; i < j; i++)
        {
            aju aju1 = aaju[i];
            Object obj = aju1.b;
            obj = mCurrentGraph.c(((String) (obj))).a();
            if (obj != null)
            {
                a(((ahs) (obj)), aju1);
                ((ahs) (obj)).i();
            }
        }

        mState.a = 0;
    }

    public final void a()
    {
        if (mState.a == 1)
        {
            mState.a = 2;
        }
    }

    public final void a(ahq ahq1)
    {
        if (!n())
        {
            mGraphProvider = new akt(ahq1);
            return;
        } else
        {
            throw new IllegalStateException("Cannot set FilterGraphProvider while MetaFilter is running!");
        }
    }

    protected void a(ahs ahs1, aju aju1)
    {
        aju1.a(ahs1);
    }

    protected void a(GraphInputSource graphinputsource, ahs ahs1)
    {
        graphinputsource.b(ahs1);
    }

    protected final void d()
    {
        mState.a = 0;
    }

    protected void e()
    {
        if (mState.a == 0)
        {
            y();
            z();
        } else
        if (mState.a == 2)
        {
            B();
            return;
        }
    }

    protected void f()
    {
        mState.a = 0;
    }

    protected final boolean k()
    {
        return x();
    }

    protected boolean x()
    {
        return j() && (h() || mState.a == 2) && p_();
    }

    protected void y()
    {
        mInputFrames.clear();
        ajo aajo[] = super.mConnectedInputPortArray;
        int j = aajo.length;
        for (int i = 0; i < j; i++)
        {
            ajo ajo1 = aajo[i];
            mInputFrames.put(ajo1.b, ajo1.a());
        }

        A();
    }

    protected void z()
    {
        mState.a = 1;
        Object obj = aiw.a();
        ahq ahq1 = mCurrentGraph;
        if (Thread.currentThread() != ((aiw) (obj)).h)
        {
            throw new RuntimeException("enterSubGraph must be called from the runner's thread!");
        }
        obj = ((aiw) (obj)).g;
        if (((ajc) (obj)).a.b(4))
        {
            ((ajc) (obj)).a(ahq1);
            ((ajc) (obj)).d.push(this);
        }
    }
}
