// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahq;
import ahs;
import ahw;
import aiw;
import aje;
import ajo;
import ajr;
import aju;
import aks;
import aku;
import android.util.Log;
import java.util.HashMap;

// Referenced classes of package androidx.media.filterpacks.base:
//            MetaFilter, GraphInputSource

public class DispatchFilter extends MetaFilter
{

    private HashMap mOutputFrames;
    private aje mRunListener;
    private aiw mRunner;

    public DispatchFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mOutputFrames = null;
        mRunListener = new aks(this);
    }

    protected final void a(ahs ahs1, aju aju1)
    {
        ahs1 = m().a(ahs1);
        aju1.a(ahs1);
        aju1 = aju1.b;
        if (mOutputFrames == null)
        {
            mOutputFrames = new HashMap();
        }
        ahs ahs2 = (ahs)mOutputFrames.get(aju1);
        if (ahs2 != null)
        {
            ahs2.i();
        }
        mOutputFrames.put(aju1, ahs1.j());
    }

    protected final void a(GraphInputSource graphinputsource, ahs ahs1)
    {
        graphinputsource.b(ahs1);
        ahs1.i();
    }

    protected final void c()
    {
        mRunner = new aiw(super.mContext);
        mRunner.a(mRunListener);
    }

    protected final void e()
    {
        aku aku1 = mState;
        aku1;
        JVM INSTR monitorenter ;
        if (mState.a != 0) goto _L2; else goto _L1
_L1:
        y();
        z();
_L9:
        if (mState.a == 2)
        {
            B();
        }
        if (mState.a != 1) goto _L4; else goto _L3
_L3:
        Object aobj[];
        int j;
        aobj = super.mConnectedOutputPortArray;
        j = aobj.length;
        int i = 0;
_L10:
        if (i >= j) goto _L4; else goto _L5
_L5:
        Object obj = aobj[i];
        ahs ahs1 = (ahs)mOutputFrames.get(((aju) (obj)).b);
        if (ahs1 == null) goto _L7; else goto _L6
_L6:
        ((aju) (obj)).a(ahs1);
        break MISSING_BLOCK_LABEL_197;
_L2:
        aobj = super.mConnectedInputPortArray;
        j = aobj.length;
        i = 0;
        if (i >= j) goto _L9; else goto _L8
_L8:
        aobj[i].a();
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        obj = String.valueOf(obj);
        Log.w("DF", (new StringBuilder(String.valueOf(obj).length() + 30)).append("No output frame produced for ").append(((String) (obj))).append("!").toString());
        break MISSING_BLOCK_LABEL_197;
        Exception exception;
        exception;
        aku1;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        aku1;
        JVM INSTR monitorexit ;
        return;
        i++;
          goto _L10
    }

    protected final void f()
    {
        super.f();
        mOutputFrames = null;
    }

    protected final boolean x()
    {
        return j() && h() && p_();
    }

    protected final void y()
    {
        mInputFrames.clear();
        ahw ahw1 = mRunner.i;
        ajo aajo[] = super.mConnectedInputPortArray;
        int j = aajo.length;
        for (int i = 0; i < j; i++)
        {
            ajo ajo1 = aajo[i];
            ahs ahs1 = ahw1.a(ajo1.a());
            mInputFrames.put(ajo1.b, ahs1);
        }

        A();
    }

    protected final void z()
    {
        boolean flag = true;
        mState.a = 1;
        if (mOutputFrames == null)
        {
            flag = false;
        }
        mCurrentGraph.a(mRunner);
        mRunner.a(mCurrentGraph);
        if (!flag)
        {
            mRunner.b();
            mState.a = 2;
        }
    }
}
