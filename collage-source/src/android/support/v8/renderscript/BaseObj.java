// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package android.support.v8.renderscript:
//            RenderScript, RSIllegalArgumentException, RSInvalidStateException, RSRuntimeException

public class BaseObj
{

    private boolean mDestroyed;
    private long mID;
    RenderScript mRS;

    BaseObj(long l, RenderScript renderscript)
    {
        renderscript.validate();
        mRS = renderscript;
        mID = l;
        mDestroyed = false;
    }

    private void helpDestroy()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (mDestroyed)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        mDestroyed = true;
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readlock = mRS.mRWLock.readLock();
            readlock.lock();
            if (mRS.isAlive())
            {
                mRS.nObjDestroy(mID);
            }
            readlock.unlock();
            mRS = null;
            mID = 0L;
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L1
    }

    void checkValid()
    {
        if (mID == 0L && getNObj() == null)
        {
            throw new RSIllegalArgumentException("Invalid object.");
        } else
        {
            return;
        }
    }

    public void destroy()
    {
        if (mDestroyed)
        {
            throw new RSInvalidStateException("Object already destroyed.");
        } else
        {
            helpDestroy();
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BaseObj)obj;
            if (mID != ((BaseObj) (obj)).mID)
            {
                return false;
            }
        }
        return true;
    }

    protected void finalize()
        throws Throwable
    {
        helpDestroy();
        super.finalize();
    }

    long getID(RenderScript renderscript)
    {
        mRS.validate();
        if (mDestroyed)
        {
            throw new RSInvalidStateException("using a destroyed object.");
        }
        if (mID == 0L)
        {
            throw new RSRuntimeException("Internal error: Object id 0.");
        }
        if (renderscript != null && renderscript != mRS)
        {
            throw new RSInvalidStateException("using object with mismatched context.");
        } else
        {
            return mID;
        }
    }

    android.renderscript.BaseObj getNObj()
    {
        return null;
    }

    public int hashCode()
    {
        return (int)(mID & 0xfffffffL ^ mID >> 32);
    }

    void setID(long l)
    {
        if (mID != 0L)
        {
            throw new RSRuntimeException("Internal Error, reset of object ID.");
        } else
        {
            mID = l;
            return;
        }
    }
}
