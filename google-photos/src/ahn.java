// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ahn
{

    public static final int PRIORITY_HIGH = 75;
    public static final int PRIORITY_LOW = 25;
    public static final int PRIORITY_NORMAL = 50;
    private static final int REQUEST_FLAG_CLOSE = 1;
    private static final int REQUEST_FLAG_NONE = 0;
    private ArrayList mAutoReleaseFrames;
    public ajo mConnectedInputPortArray[];
    HashMap mConnectedInputPorts;
    public aju mConnectedOutputPortArray[];
    HashMap mConnectedOutputPorts;
    public ajr mContext;
    long mCurrentTimestamp;
    ahq mFilterGraph;
    public boolean mIsActive;
    public AtomicBoolean mIsSleeping;
    private long mLastScheduleTime;
    public int mMinimumAvailableInputs;
    private int mMinimumAvailableOutputs;
    public String mName;
    private int mRequests;
    int mScheduleCount;
    private aho mState;

    public ahn(ajr ajr, String s1)
    {
        mState = new aho();
        mRequests = 0;
        mMinimumAvailableInputs = 1;
        mMinimumAvailableOutputs = 1;
        mScheduleCount = 0;
        mLastScheduleTime = 0L;
        mIsActive = true;
        mIsSleeping = new AtomicBoolean(false);
        mCurrentTimestamp = -1L;
        mConnectedInputPorts = new HashMap();
        mConnectedOutputPorts = new HashMap();
        mConnectedInputPortArray = null;
        mConnectedOutputPortArray = null;
        mAutoReleaseFrames = new ArrayList();
        mName = s1;
        mContext = ajr;
    }

    private void a()
    {
        synchronized (mState)
        {
            if (mState.a == 3)
            {
                f();
                mIsSleeping.set(false);
                mState.a = 4;
                mCurrentTimestamp = -1L;
            }
        }
        return;
        exception;
        aho1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ajo a(String s1)
    {
        return (ajo)mConnectedInputPorts.get(s1);
    }

    final void a(ahs ahs1)
    {
        mAutoReleaseFrames.add(ahs1);
    }

    public void a(ajo ajo1)
    {
    }

    public void a(aju aju1)
    {
    }

    final void a(String s1, ahn ahn1, String s2)
    {
        if (b(s1) != null)
        {
            ahn1 = String.valueOf(this);
            throw new RuntimeException((new StringBuilder(String.valueOf(s1).length() + 67 + String.valueOf(ahn1).length())).append("Attempting to connect already connected output port '").append(s1).append("' of filter ").append(ahn1).append("'!").toString());
        }
        if (ahn1.a(s2) != null)
        {
            s1 = String.valueOf(ahn1);
            throw new RuntimeException((new StringBuilder(String.valueOf(s2).length() + 66 + String.valueOf(s1).length())).append("Attempting to connect already connected input port '").append(s2).append("' of filter ").append(s1).append("'!").toString());
        }
        Object obj = (ajo)ahn1.mConnectedInputPorts.get(s2);
        if (obj == null)
        {
            obj = ahn1.b();
            aju aju1;
            if (((ajw) (obj)).a != null)
            {
                obj = (ajx)((ajw) (obj)).a.get(s2);
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                obj = new ajx();
            }
            obj = new ajo(ahn1, s2, ((ajx) (obj)));
            ahn1.mConnectedInputPorts.put(s2, obj);
        }
        aju1 = (aju)mConnectedOutputPorts.get(s1);
        s2 = aju1;
        if (aju1 == null)
        {
            s2 = b();
            if (((ajw) (s2)).b != null)
            {
                s2 = (ajx)((ajw) (s2)).b.get(s1);
            } else
            {
                s2 = null;
            }
            if (s2 == null)
            {
                s2 = new ajx();
            }
            s2 = new aju(this, s1, s2);
            mConnectedOutputPorts.put(s1, s2);
        }
        s2.g = ((ajo) (obj));
        obj.h = s2;
        ahn1.a(((ajo) (obj)));
        a(((aju) (s2)));
        w();
    }

    public final aju b(String s1)
    {
        return (aju)mConnectedOutputPorts.get(s1);
    }

    public ajw b()
    {
        return new ajw();
    }

    public void b(ajo ajo1)
    {
    }

    final void b(aju aju1)
    {
        if (aju1.e != null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        Object obj = new aic();
        ajo ajo1 = aju1.g;
        aju1.d = ((aic) (obj));
        aju1.d.b = aju1.c.a;
        ajo1.a(((aic) (obj)));
        Object obj1 = ajo1.a;
        String s1 = mName;
        String s2 = aju1.b;
        obj1 = ((ahn) (obj1)).mName;
        String s3 = ajo1.b;
        s1 = (new StringBuilder(String.valueOf(s1).length() + 8 + String.valueOf(s2).length() + String.valueOf(obj1).length() + String.valueOf(s3).length())).append(s1).append("[").append(s2).append("] -> ").append(((String) (obj1))).append("[").append(s3).append("]").toString();
        obj = new aib(((aic) (obj)).a(), s1);
        obj.getClass();
        obj.a = new aie(((aib) (obj)));
        aju1.e = ((aib) (obj));
        aju1.d = null;
        ajo1.e = ((aib) (obj));
        ajo1.d = null;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        aju1 = String.valueOf(aju1);
        throw new RuntimeException((new StringBuilder(String.valueOf(aju1).length() + 28)).append("Could not open output port ").append(aju1).append("!").toString(), runtimeexception);
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public abstract void e();

    public void f()
    {
    }

    public void g()
    {
    }

    public final boolean h()
    {
        if (mConnectedInputPortArray.length <= 0) goto _L2; else goto _L1
_L1:
        int i;
        int i1;
        i = 0;
        i1 = 0;
_L7:
        if (i >= mConnectedInputPortArray.length) goto _L4; else goto _L3
_L3:
        ajo ajo1 = mConnectedInputPortArray[i];
        boolean flag;
        if (!ajo1.f || ajo1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        return false;
_L6:
        int j1 = i1;
        if (mConnectedInputPortArray[i].b())
        {
            j1 = i1 + 1;
        }
        i++;
        i1 = j1;
          goto _L7
_L4:
        if (i1 < mMinimumAvailableInputs) goto _L5; else goto _L2
_L2:
        return true;
    }

    public final boolean j()
    {
        return mIsActive && !mState.a(4);
    }

    public boolean k()
    {
        return j() && h() && p_();
    }

    public int l()
    {
        return 50;
    }

    public final ahw m()
    {
        if (mFilterGraph.d != null)
        {
            return mFilterGraph.d.i;
        } else
        {
            return null;
        }
    }

    public final boolean n()
    {
        return mFilterGraph != null && mFilterGraph.d != null && mFilterGraph.d.d();
    }

    public final void o()
    {
        mRequests = mRequests | 1;
    }

    public final void p()
    {
        mIsSleeping.set(true);
    }

    public final boolean p_()
    {
        if (mConnectedOutputPortArray.length <= 0) goto _L2; else goto _L1
_L1:
        int i;
        int i1;
        i = 0;
        i1 = 0;
_L7:
        if (i >= mConnectedOutputPortArray.length) goto _L4; else goto _L3
_L3:
        aju aju1 = mConnectedOutputPortArray[i];
        boolean flag;
        if (!aju1.f || aju1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        return false;
_L6:
        int j1 = i1;
        if (mConnectedOutputPortArray[i].a())
        {
            j1 = i1 + 1;
        }
        i++;
        i1 = j1;
          goto _L7
_L4:
        if (i1 < mMinimumAvailableOutputs) goto _L5; else goto _L2
_L2:
        return true;
    }

    public final void q()
    {
        if (mIsSleeping.getAndSet(false) && n())
        {
            ajc ajc1 = mFilterGraph.d.g;
            aiz aiz = aiw.d;
            if (ajc1.c.isEmpty())
            {
                ajc1.a(aiz);
            }
        }
    }

    public final boolean r()
    {
        return mFilterGraph.d.f();
    }

    final void s()
    {
        synchronized (mState)
        {
            if (mState.a == 1)
            {
                c();
                mState.a = 2;
            }
        }
        return;
        exception;
        aho1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void t()
    {
        boolean flag = false;
        aho aho1 = mState;
        aho1;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i < mConnectedInputPortArray.length)
        {
            ajo ajo1 = mConnectedInputPortArray[i];
            if (ajo1.b() && ajo1.g)
            {
                mConnectedInputPortArray[i].a();
            }
            break MISSING_BLOCK_LABEL_247;
        }
        mLastScheduleTime = SystemClock.elapsedRealtime();
        if (mState.a == 1)
        {
            c();
            mState.a = 2;
        }
        if (mState.a != 2)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        for (Iterator iterator = mConnectedOutputPorts.values().iterator(); iterator.hasNext(); b((aju)iterator.next())) { }
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        aho1;
        JVM INSTR monitorexit ;
        throw exception;
        d();
        mState.a = 3;
        if (mState.a == 3)
        {
            e();
            if (mRequests != 0 && (mRequests & 1) != 0)
            {
                a();
                mRequests = 0;
            }
        }
        aho1;
        JVM INSTR monitorexit ;
        for (i = ((flag) ? 1 : 0); i < mAutoReleaseFrames.size(); i++)
        {
            ((ahs)mAutoReleaseFrames.get(i)).i();
        }

        mAutoReleaseFrames.clear();
        mScheduleCount = mScheduleCount + 1;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String toString()
    {
        String s1 = mName;
        String s2 = String.valueOf(getClass().getSimpleName());
        return (new StringBuilder(String.valueOf(s1).length() + 3 + String.valueOf(s2).length())).append(s1).append(" (").append(s2).append(")").toString();
    }

    final void u()
    {
        synchronized (mState)
        {
            a();
            if (mState.a == 4)
            {
                mState.a = 2;
            }
        }
        return;
        exception;
        aho1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void v()
    {
        aho aho1 = mState;
        aho1;
        JVM INSTR monitorenter ;
        if (mState.a == 3)
        {
            String s1 = String.valueOf(this);
            throw new RuntimeException((new StringBuilder(String.valueOf(s1).length() + 58)).append("Attempting to tear-down filter ").append(s1).append(" which is in an open state!").toString());
        }
        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        aho1;
        JVM INSTR monitorexit ;
        throw exception;
        if (mState.a != 5 && mState.a != 1)
        {
            g();
            mState.a = 5;
        }
        aho1;
        JVM INSTR monitorexit ;
    }

    final void w()
    {
        mConnectedInputPortArray = (ajo[])mConnectedInputPorts.values().toArray(new ajo[0]);
        mConnectedOutputPortArray = (aju[])mConnectedOutputPorts.values().toArray(new aju[0]);
    }
}
