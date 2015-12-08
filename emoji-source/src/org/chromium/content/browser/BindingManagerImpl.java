// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.util.Log;
import android.util.SparseArray;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            BindingManager, ChildProcessConnection

class BindingManagerImpl
    implements BindingManager
{
    private class ManagedConnection
    {

        static final boolean $assertionsDisabled;
        private boolean mBoundForBackgroundPeriod;
        private ChildProcessConnection mConnection;
        private boolean mInForeground;
        private boolean mWasOomProtected;
        final BindingManagerImpl this$0;

        private void addStrongBinding()
        {
            ChildProcessConnection childprocessconnection = mConnection;
            if (childprocessconnection == null)
            {
                return;
            } else
            {
                childprocessconnection.addStrongBinding();
                return;
            }
        }

        private void dropBindings()
        {
            if (!$assertionsDisabled && !mIsLowMemoryDevice)
            {
                throw new AssertionError();
            }
            ChildProcessConnection childprocessconnection = mConnection;
            if (childprocessconnection == null)
            {
                return;
            } else
            {
                childprocessconnection.dropOomBindings();
                return;
            }
        }

        private void removeInitialBinding()
        {
            ChildProcessConnection childprocessconnection = mConnection;
            if (childprocessconnection == null || !childprocessconnection.isInitialBindingBound())
            {
                return;
            } else
            {
                ThreadUtils.postOnUiThreadDelayed(childprocessconnection. new Runnable() {

                    final ManagedConnection this$1;
                    final ChildProcessConnection val$connection;

                    public void run()
                    {
                        if (connection.isInitialBindingBound())
                        {
                            connection.removeInitialBinding();
                        }
                    }

            
            {
                this$1 = final_managedconnection;
                connection = ChildProcessConnection.this;
                super();
            }
                }, mRemoveInitialBindingDelay);
                return;
            }
        }

        private void removeStrongBinding()
        {
            Object obj = mConnection;
            if (obj == null || !((ChildProcessConnection) (obj)).isStrongBindingBound())
            {
                return;
            }
            obj = ((_cls2) (obj)). new Runnable() {

                final ManagedConnection this$1;
                final ChildProcessConnection val$connection;

                public void run()
                {
                    if (connection.isStrongBindingBound())
                    {
                        connection.removeStrongBinding();
                    }
                }

            
            {
                this$1 = final_managedconnection;
                connection = ChildProcessConnection.this;
                super();
            }
            };
            if (mIsLowMemoryDevice)
            {
                ((Runnable) (obj)).run();
                return;
            } else
            {
                ThreadUtils.postOnUiThreadDelayed(((Runnable) (obj)), mRemoveStrongBindingDelay);
                return;
            }
        }

        void clearConnection()
        {
            mWasOomProtected = mConnection.isOomProtectedOrWasWhenDied();
            mConnection = null;
        }

        boolean isConnectionCleared()
        {
            return mConnection == null;
        }

        boolean isOomProtected()
        {
            if (mConnection != null)
            {
                return mConnection.isOomProtectedOrWasWhenDied();
            } else
            {
                return mWasOomProtected;
            }
        }

        void setBoundForBackgroundPeriod(boolean flag)
        {
            if (mBoundForBackgroundPeriod || !flag) goto _L2; else goto _L1
_L1:
            addStrongBinding();
_L4:
            mBoundForBackgroundPeriod = flag;
            return;
_L2:
            if (mBoundForBackgroundPeriod && !flag)
            {
                removeStrongBinding();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        void setInForeground(boolean flag)
        {
            if (mInForeground || !flag) goto _L2; else goto _L1
_L1:
            addStrongBinding();
_L4:
            removeInitialBinding();
            mInForeground = flag;
            return;
_L2:
            if (mInForeground && !flag)
            {
                removeStrongBinding();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        static 
        {
            boolean flag;
            if (!org/chromium/content/browser/BindingManagerImpl.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }


        ManagedConnection(ChildProcessConnection childprocessconnection)
        {
            this$0 = BindingManagerImpl.this;
            super();
            mConnection = childprocessconnection;
        }
    }


    static final boolean $assertionsDisabled;
    private static final long DETACH_AS_ACTIVE_HIGH_END_DELAY_MILLIS = 1000L;
    private static final long REMOVE_INITIAL_BINDING_DELAY_MILLIS = 1000L;
    private static final String TAG = "BindingManager";
    private ManagedConnection mBoundForBackgroundPeriod;
    private final boolean mIsLowMemoryDevice;
    private ManagedConnection mLastInForeground;
    private final Object mLastInForegroundLock = new Object();
    private final SparseArray mManagedConnections = new SparseArray();
    private final long mRemoveInitialBindingDelay;
    private final long mRemoveStrongBindingDelay;

    private BindingManagerImpl(boolean flag, long l, long l1)
    {
        mIsLowMemoryDevice = flag;
        mRemoveInitialBindingDelay = l;
        mRemoveStrongBindingDelay = l1;
    }

    public static BindingManagerImpl createBindingManager()
    {
        return new BindingManagerImpl(SysUtils.isLowEndDevice(), 1000L, 1000L);
    }

    public static BindingManagerImpl createBindingManagerForTesting(boolean flag)
    {
        return new BindingManagerImpl(flag, 0L, 0L);
    }

    public void addNewConnection(int i, ChildProcessConnection childprocessconnection)
    {
        synchronized (mLastInForegroundLock)
        {
            if (mIsLowMemoryDevice && mLastInForeground != null)
            {
                mLastInForeground.dropBindings();
            }
        }
        synchronized (mManagedConnections)
        {
            mManagedConnections.put(i, new ManagedConnection(childprocessconnection));
        }
        return;
        childprocessconnection;
        obj;
        JVM INSTR monitorexit ;
        throw childprocessconnection;
        childprocessconnection;
        obj;
        JVM INSTR monitorexit ;
        throw childprocessconnection;
    }

    public void clearConnection(int i)
    {
        ManagedConnection managedconnection;
        synchronized (mManagedConnections)
        {
            managedconnection = (ManagedConnection)mManagedConnections.get(i);
        }
        if (managedconnection != null)
        {
            managedconnection.clearConnection();
        }
        return;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCleared(int i)
    {
        boolean flag;
        synchronized (mManagedConnections)
        {
            flag = ((ManagedConnection)mManagedConnections.get(i)).isConnectionCleared();
        }
        return flag;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isOomProtected(int i)
    {
        ManagedConnection managedconnection;
        synchronized (mManagedConnections)
        {
            managedconnection = (ManagedConnection)mManagedConnections.get(i);
        }
        if (managedconnection != null)
        {
            return managedconnection.isOomProtected();
        } else
        {
            return false;
        }
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onBroughtToForeground()
    {
        if (mBoundForBackgroundPeriod != null)
        {
            mBoundForBackgroundPeriod.setBoundForBackgroundPeriod(false);
            mBoundForBackgroundPeriod = null;
        }
    }

    public void onSentToBackground()
    {
        if (!$assertionsDisabled && mBoundForBackgroundPeriod != null)
        {
            throw new AssertionError();
        }
        synchronized (mLastInForegroundLock)
        {
            if (mLastInForeground != null)
            {
                mLastInForeground.setBoundForBackgroundPeriod(true);
                mBoundForBackgroundPeriod = mLastInForeground;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setInForeground(int i, boolean flag)
    {
        synchronized (mManagedConnections)
        {
            obj1 = (ManagedConnection)mManagedConnections.get(i);
        }
        if (obj1 == null)
        {
            Log.w("BindingManager", (new StringBuilder()).append("Cannot setInForeground() - never saw a connection for the pid: ").append(Integer.toString(i)).toString());
            return;
        }
        break MISSING_BLOCK_LABEL_63;
        obj1;
        sparsearray;
        JVM INSTR monitorexit ;
        throw obj1;
        Object obj = mLastInForegroundLock;
        obj;
        JVM INSTR monitorenter ;
        ((ManagedConnection) (obj1)).setInForeground(flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        mLastInForeground = ((ManagedConnection) (obj1));
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/BindingManagerImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



}
