// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.OrientationEventListener;
import com.snapchat.android.SnapchatApplication;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class IS extends OrientationEventListener
{
    public static interface a
    {

        public abstract void a(int i);
    }


    public static final int OBSERVE_ALL_ROTATION = 4369;
    private static final String TAG = "ScreenRotationObserver";
    private static IS sInstance;
    private final int mReportRotation = 4369;
    public int mRotation;
    private final Set mScreenRotationListeners = new HashSet();

    private IS(Context context)
    {
        super(context);
        mRotation = 0;
    }

    public static IS a()
    {
        IS;
        JVM INSTR monitorenter ;
        IS is;
        if (sInstance == null)
        {
            sInstance = new IS(SnapchatApplication.get());
        }
        is = sInstance;
        IS;
        JVM INSTR monitorexit ;
        return is;
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean a(int i, int j, int k)
    {
        return j <= i && i <= k;
    }

    public final void a(a a1)
    {
        synchronized (mScreenRotationListeners)
        {
            mScreenRotationListeners.add(a1);
        }
        if (canDetectOrientation())
        {
            enable();
        }
        return;
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b(a a1)
    {
        synchronized (mScreenRotationListeners)
        {
            mScreenRotationListeners.remove(a1);
            if (mScreenRotationListeners.size() == 0)
            {
                disable();
                mRotation = 0;
            }
        }
        return;
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void onOrientationChanged(int i)
    {
        Set set;
        Exception exception;
        if (a(i, 338, 360) || a(i, 0, 22))
        {
            i = 1;
        } else
        if (a(i, 248, 292))
        {
            i = 16;
        } else
        if (a(i, 158, 202))
        {
            i = 256;
        } else
        if (a(i, 68, 112))
        {
            i = 4096;
        } else
        {
            i = 0;
        }
        if (i == mRotation || (mReportRotation & i) == 0) goto _L2; else goto _L1
_L1:
        mRotation = i;
        set = mScreenRotationListeners;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mScreenRotationListeners.iterator(); iterator.hasNext(); ((a)iterator.next()).a(i)) { }
        break MISSING_BLOCK_LABEL_158;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        set;
        JVM INSTR monitorexit ;
_L2:
    }
}
