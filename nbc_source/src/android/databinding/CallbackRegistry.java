// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.util.ArrayList;
import java.util.List;

public class CallbackRegistry
    implements Cloneable
{
    public static abstract class NotifierCallback
    {

        public abstract void onNotifyCallback(Object obj, Object obj1, int i, Object obj2);

        public NotifierCallback()
        {
        }
    }


    private static final String TAG = "CallbackRegistry";
    private List mCallbacks;
    private long mFirst64Removed;
    private int mNotificationLevel;
    private final NotifierCallback mNotifier;
    private long mRemainderRemoved[];

    public CallbackRegistry(NotifierCallback notifiercallback)
    {
        mCallbacks = new ArrayList();
        mFirst64Removed = 0L;
        mNotifier = notifiercallback;
    }

    private boolean isRemoved(int i)
    {
        if (i >= 64) goto _L2; else goto _L1
_L1:
        if ((mFirst64Removed & 1L << i) == 0L) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (mRemainderRemoved == null)
        {
            return false;
        }
        int j = i / 64 - 1;
        if (j >= mRemainderRemoved.length)
        {
            return false;
        }
        if ((mRemainderRemoved[j] & 1L << i % 64) == 0L)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void notifyCallbacks(Object obj, int i, Object obj1, int j, int k, long l)
    {
        long l1 = 1L;
        for (; j < k; j++)
        {
            if ((l & l1) == 0L)
            {
                mNotifier.onNotifyCallback(mCallbacks.get(j), obj, i, obj1);
            }
            l1 <<= 1;
        }

    }

    private void notifyFirst64(Object obj, int i, Object obj1)
    {
        notifyCallbacks(obj, i, obj1, 0, Math.min(64, mCallbacks.size()), mFirst64Removed);
    }

    private void notifyRecurse(Object obj, int i, Object obj1)
    {
        int k = mCallbacks.size();
        int j;
        if (mRemainderRemoved == null)
        {
            j = -1;
        } else
        {
            j = mRemainderRemoved.length - 1;
        }
        notifyRemainder(obj, i, obj1, j);
        notifyCallbacks(obj, i, obj1, (j + 2) * 64, k, 0L);
    }

    private void notifyRemainder(Object obj, int i, Object obj1, int j)
    {
        if (j < 0)
        {
            notifyFirst64(obj, i, obj1);
            return;
        } else
        {
            long l1 = mRemainderRemoved[j];
            int k = (j + 1) * 64;
            int l = Math.min(mCallbacks.size(), k + 64);
            notifyRemainder(obj, i, obj1, j - 1);
            notifyCallbacks(obj, i, obj1, k, l, l1);
            return;
        }
    }

    private void removeRemovedCallbacks(int i, long l)
    {
        long l1 = 0x8000000000000000L;
        for (int j = (i + 64) - 1; j >= i; j--)
        {
            if ((l & l1) != 0L)
            {
                mCallbacks.remove(j);
            }
            l1 >>>= 1;
        }

    }

    private void setRemovalBit(int i)
    {
        int j;
        if (i < 64)
        {
            mFirst64Removed = mFirst64Removed | 1L << i;
            return;
        }
        j = i / 64 - 1;
        if (mRemainderRemoved != null) goto _L2; else goto _L1
_L1:
        mRemainderRemoved = new long[mCallbacks.size() / 64];
_L4:
        long al[] = mRemainderRemoved;
        al[j] = al[j] | 1L << i % 64;
        return;
_L2:
        if (mRemainderRemoved.length < j)
        {
            long al1[] = new long[mCallbacks.size() / 64];
            System.arraycopy(mRemainderRemoved, 0, al1, 0, mRemainderRemoved.length);
            mRemainderRemoved = al1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void add(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        int i = mCallbacks.lastIndexOf(obj);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (!isRemoved(i))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        mCallbacks.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        if (mNotificationLevel != 0) goto _L2; else goto _L1
_L1:
        mCallbacks.clear();
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i;
        if (mCallbacks.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        i = mCallbacks.size() - 1;
_L4:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        setRemovalBit(i);
        i--;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public CallbackRegistry clone()
    {
        this;
        JVM INSTR monitorenter ;
        CallbackRegistry callbackregistry = null;
        CallbackRegistry callbackregistry1 = (CallbackRegistry)super.clone();
        callbackregistry = callbackregistry1;
        callbackregistry1.mFirst64Removed = 0L;
        callbackregistry = callbackregistry1;
        callbackregistry1.mRemainderRemoved = null;
        callbackregistry = callbackregistry1;
        callbackregistry1.mNotificationLevel = 0;
        callbackregistry = callbackregistry1;
        callbackregistry1.mCallbacks = new ArrayList();
        callbackregistry = callbackregistry1;
        int j = mCallbacks.size();
        int i = 0;
_L2:
        callbackregistry = callbackregistry1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        callbackregistry = callbackregistry1;
        if (isRemoved(i))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        callbackregistry = callbackregistry1;
        callbackregistry1.mCallbacks.add(mCallbacks.get(i));
        i++;
        if (true) goto _L2; else goto _L1
        CloneNotSupportedException clonenotsupportedexception;
        clonenotsupportedexception;
        clonenotsupportedexception.printStackTrace();
_L1:
        this;
        JVM INSTR monitorexit ;
        return callbackregistry;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public ArrayList copyListeners()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int j;
        arraylist = new ArrayList(mCallbacks.size());
        j = mCallbacks.size();
        int i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (!isRemoved(i))
        {
            arraylist.add(mCallbacks.get(i));
        }
        i++;
          goto _L3
_L2:
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isEmpty()
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag = mCallbacks.isEmpty();
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (mNotificationLevel == 0)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        int j = mCallbacks.size();
        int i = 0;
_L4:
        flag = flag1;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = isRemoved(i);
        if (!flag)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void notifyCallbacks(Object obj, int i, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        mNotificationLevel = mNotificationLevel + 1;
        notifyRecurse(obj, i, obj1);
        mNotificationLevel = mNotificationLevel - 1;
        if (mNotificationLevel != 0) goto _L2; else goto _L1
_L1:
        if (mRemainderRemoved == null) goto _L4; else goto _L3
_L3:
        i = mRemainderRemoved.length - 1;
_L9:
        if (i < 0) goto _L4; else goto _L5
_L5:
        long l = mRemainderRemoved[i];
        if (l == 0L) goto _L7; else goto _L6
_L6:
        removeRemovedCallbacks((i + 1) * 64, l);
        mRemainderRemoved[i] = 0L;
          goto _L7
_L4:
        if (mFirst64Removed != 0L)
        {
            removeRemovedCallbacks(0, mFirst64Removed);
            mFirst64Removed = 0L;
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
_L7:
        i--;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void remove(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (mNotificationLevel != 0) goto _L2; else goto _L1
_L1:
        mCallbacks.remove(obj);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = mCallbacks.lastIndexOf(obj);
        if (i < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        setRemovalBit(i);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }
}
