// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            OpReorderer

class AdapterHelper
    implements OpReorderer.Callback
{
    static interface Callback
    {

        public abstract RecyclerView.ViewHolder findViewHolder(int i);

        public abstract void markViewHoldersUpdated(int i, int j);

        public abstract void offsetPositionsForAdd(int i, int j);

        public abstract void offsetPositionsForMove(int i, int j);

        public abstract void offsetPositionsForRemovingInvisible(int i, int j);

        public abstract void offsetPositionsForRemovingLaidOutOrNewView(int i, int j);

        public abstract void onDispatchFirstPass(UpdateOp updateop);

        public abstract void onDispatchSecondPass(UpdateOp updateop);
    }

    static class UpdateOp
    {

        static final int ADD = 0;
        static final int MOVE = 3;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 1;
        static final int UPDATE = 2;
        int cmd;
        int itemCount;
        int positionStart;

        String cmdToString()
        {
            switch (cmd)
            {
            default:
                return "??";

            case 0: // '\0'
                return "add";

            case 1: // '\001'
                return "rm";

            case 2: // '\002'
                return "up";

            case 3: // '\003'
                return "mv";
            }
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (UpdateOp)obj;
                if (cmd != ((UpdateOp) (obj)).cmd)
                {
                    return false;
                }
                if (cmd != 3 || Math.abs(itemCount - positionStart) != 1 || itemCount != ((UpdateOp) (obj)).positionStart || positionStart != ((UpdateOp) (obj)).itemCount)
                {
                    if (itemCount != ((UpdateOp) (obj)).itemCount)
                    {
                        return false;
                    }
                    if (positionStart != ((UpdateOp) (obj)).positionStart)
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        public int hashCode()
        {
            return (cmd * 31 + positionStart) * 31 + itemCount;
        }

        public String toString()
        {
            return (new StringBuilder()).append("[").append(cmdToString()).append(",s:").append(positionStart).append("c:").append(itemCount).append("]").toString();
        }

        UpdateOp(int i, int j, int k)
        {
            cmd = i;
            positionStart = j;
            itemCount = k;
        }
    }


    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final Callback mCallback;
    final boolean mDisableRecycler;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList mPendingUpdates;
    final ArrayList mPostponedList;
    private ci.a mUpdateOpPool;

    AdapterHelper(Callback callback)
    {
        this(callback, false);
    }

    AdapterHelper(Callback callback, boolean flag)
    {
        mUpdateOpPool = new ci.b(30);
        mPendingUpdates = new ArrayList();
        mPostponedList = new ArrayList();
        mCallback = callback;
        mDisableRecycler = flag;
        mOpReorderer = new OpReorderer(this);
    }

    private void applyAdd(UpdateOp updateop)
    {
        postponeAndUpdateViewHolders(updateop);
    }

    private void applyMove(UpdateOp updateop)
    {
        postponeAndUpdateViewHolders(updateop);
    }

    private void applyRemove(UpdateOp updateop)
    {
        int i1 = updateop.positionStart;
        int j = updateop.positionStart + updateop.itemCount;
        byte byte0 = -1;
        int i = updateop.positionStart;
        int l = 0;
        while (i < j) 
        {
            if (mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
            {
                UpdateOp updateop1;
                int k;
                boolean flag;
                if (byte0 == 0)
                {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(1, i1, l));
                    k = 1;
                } else
                {
                    k = 0;
                }
                byte0 = 1;
            } else
            {
                if (byte0 == 1)
                {
                    postponeAndUpdateViewHolders(obtainUpdateOp(1, i1, l));
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                flag = false;
                k = byte0;
                byte0 = flag;
            }
            if (k != 0)
            {
                k = i - l;
                i = j - l;
                j = 1;
            } else
            {
                l++;
                k = i;
                i = j;
                j = l;
            }
            l = j;
            j = i;
            i = k + 1;
        }
        updateop1 = updateop;
        if (l != updateop.itemCount)
        {
            recycleUpdateOp(updateop);
            updateop1 = obtainUpdateOp(1, i1, l);
        }
        if (byte0 == 0)
        {
            dispatchAndUpdateViewHolders(updateop1);
            return;
        } else
        {
            postponeAndUpdateViewHolders(updateop1);
            return;
        }
    }

    private void applyUpdate(UpdateOp updateop)
    {
        int k = updateop.positionStart;
        int l1 = updateop.positionStart;
        int i2 = updateop.itemCount;
        int i = updateop.positionStart;
        int k1 = -1;
        int j = 0;
        while (i < l1 + i2) 
        {
            int l;
            if (mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
            {
                l = j;
                int i1 = k;
                if (k1 == 0)
                {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, k, j));
                    l = 0;
                    i1 = i;
                }
                k = i1;
                j = 1;
            } else
            {
                l = j;
                int j1 = k;
                if (k1 == 1)
                {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, k, j));
                    l = 0;
                    j1 = i;
                }
                k = j1;
                j = 0;
            }
            i++;
            l++;
            k1 = j;
            j = l;
        }
        UpdateOp updateop1 = updateop;
        if (j != updateop.itemCount)
        {
            recycleUpdateOp(updateop);
            updateop1 = obtainUpdateOp(2, k, j);
        }
        if (k1 == 0)
        {
            dispatchAndUpdateViewHolders(updateop1);
            return;
        } else
        {
            postponeAndUpdateViewHolders(updateop1);
            return;
        }
    }

    private boolean canFindInPreLayout(int i)
    {
        int l = mPostponedList.size();
label0:
        for (int j = 0; j < l; j++)
        {
            UpdateOp updateop = (UpdateOp)mPostponedList.get(j);
            if (updateop.cmd == 3)
            {
                if (findPositionOffset(updateop.itemCount, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (updateop.cmd != 0)
            {
                continue;
            }
            int i1 = updateop.positionStart;
            int j1 = updateop.itemCount;
            int k = updateop.positionStart;
            do
            {
                if (k >= i1 + j1)
                {
                    continue label0;
                }
                if (findPositionOffset(k, j + 1) == i)
                {
                    return true;
                }
                k++;
            } while (true);
        }

        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateop)
    {
        int j;
        int j1;
        if (updateop.cmd == 0 || updateop.cmd == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = updatePositionWithPostponed(updateop.positionStart, updateop.cmd);
        j = updateop.positionStart;
        updateop.cmd;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 187
    //                   2 99;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("op should be remove or update.").append(updateop).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= updateop.itemCount)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        k1 = updatePositionWithPostponed(updateop.positionStart + k * l, updateop.cmd);
        updateop.cmd;
        JVM INSTR tableswitch 1 2: default 164
    //                   1 212
    //                   2 193;
           goto _L4 _L5 _L6
_L4:
        int i = 0;
_L9:
        if (i != 0)
        {
            i = i1 + 1;
        } else
        {
            UpdateOp updateop1 = obtainUpdateOp(updateop.cmd, j1, i1);
            dispatchFirstPassAndUpdateViewHolders(updateop1, j);
            recycleUpdateOp(updateop1);
            i = j;
            if (updateop.cmd == 2)
            {
                i = j + i1;
            }
            i1 = 1;
            j1 = k1;
            j = i;
            i = i1;
        }
        l++;
        i1 = i;
          goto _L7
_L2:
        k = 0;
          goto _L8
_L6:
        if (k1 == j1 + 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
_L5:
        if (k1 == j1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
        recycleUpdateOp(updateop);
        if (i1 > 0)
        {
            updateop = obtainUpdateOp(updateop.cmd, j1, i1);
            dispatchFirstPassAndUpdateViewHolders(updateop, j);
            recycleUpdateOp(updateop);
        }
        return;
          goto _L7
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateop)
    {
        mPostponedList.add(updateop);
        switch (updateop.cmd)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown update op type for ").append(updateop).toString());

        case 0: // '\0'
            mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
            return;

        case 3: // '\003'
            mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
            return;

        case 1: // '\001'
            mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateop.positionStart, updateop.itemCount);
            return;

        case 2: // '\002'
            mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount);
            return;
        }
    }

    private int updatePositionWithPostponed(int i, int j)
    {
        int l = mPostponedList.size() - 1;
        do
        {
            if (l >= 0)
            {
                UpdateOp updateop = (UpdateOp)mPostponedList.get(l);
                int k;
                if (updateop.cmd == 3)
                {
                    int i1;
                    if (updateop.positionStart < updateop.itemCount)
                    {
                        i1 = updateop.positionStart;
                        k = updateop.itemCount;
                    } else
                    {
                        i1 = updateop.itemCount;
                        k = updateop.positionStart;
                    }
                    if (i >= i1 && i <= k)
                    {
                        if (i1 == updateop.positionStart)
                        {
                            if (j == 0)
                            {
                                updateop.itemCount = updateop.itemCount + 1;
                            } else
                            if (j == 1)
                            {
                                updateop.itemCount = updateop.itemCount - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                updateop.positionStart = updateop.positionStart + 1;
                            } else
                            if (j == 1)
                            {
                                updateop.positionStart = updateop.positionStart - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < updateop.positionStart)
                    {
                        if (j == 0)
                        {
                            updateop.positionStart = updateop.positionStart + 1;
                            updateop.itemCount = updateop.itemCount + 1;
                        } else
                        if (j == 1)
                        {
                            updateop.positionStart = updateop.positionStart - 1;
                            updateop.itemCount = updateop.itemCount - 1;
                        }
                    }
                    k = i;
                } else
                if (updateop.positionStart <= i)
                {
                    if (updateop.cmd == 0)
                    {
                        k = i - updateop.itemCount;
                    } else
                    {
                        k = i;
                        if (updateop.cmd == 1)
                        {
                            k = i + updateop.itemCount;
                        }
                    }
                } else
                if (j == 0)
                {
                    updateop.positionStart = updateop.positionStart + 1;
                    k = i;
                } else
                {
                    k = i;
                    if (j == 1)
                    {
                        updateop.positionStart = updateop.positionStart - 1;
                        k = i;
                    }
                }
                l--;
                i = k;
                continue;
            }
            j = mPostponedList.size() - 1;
            while (j >= 0) 
            {
                UpdateOp updateop1 = (UpdateOp)mPostponedList.get(j);
                if (updateop1.cmd == 3)
                {
                    if (updateop1.itemCount == updateop1.positionStart || updateop1.itemCount < 0)
                    {
                        mPostponedList.remove(j);
                        recycleUpdateOp(updateop1);
                    }
                } else
                if (updateop1.itemCount <= 0)
                {
                    mPostponedList.remove(j);
                    recycleUpdateOp(updateop1);
                }
                j--;
            }
            return i;
        } while (true);
    }

    transient AdapterHelper addUpdateOp(UpdateOp aupdateop[])
    {
        Collections.addAll(mPendingUpdates, aupdateop);
        return this;
    }

    void consumePostponedUpdates()
    {
        int j = mPostponedList.size();
        for (int i = 0; i < j; i++)
        {
            mCallback.onDispatchSecondPass((UpdateOp)mPostponedList.get(i));
        }

        recycleUpdateOpsAndClearList(mPostponedList);
    }

    void consumeUpdatesInOnePass()
    {
        int i;
        int j;
        consumePostponedUpdates();
        j = mPendingUpdates.size();
        i = 0;
_L7:
        UpdateOp updateop;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        updateop = (UpdateOp)mPendingUpdates.get(i);
        updateop.cmd;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 87
    //                   1 117
    //                   2 147
    //                   3 177;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_177;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        if (mOnItemProcessedCallback != null)
        {
            mOnItemProcessedCallback.run();
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        mCallback.onDispatchSecondPass(updateop);
        mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
          goto _L8
_L3:
        mCallback.onDispatchSecondPass(updateop);
        mCallback.offsetPositionsForRemovingInvisible(updateop.positionStart, updateop.itemCount);
          goto _L8
_L4:
        mCallback.onDispatchSecondPass(updateop);
        mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount);
          goto _L8
        mCallback.onDispatchSecondPass(updateop);
        mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
          goto _L8
        recycleUpdateOpsAndClearList(mPendingUpdates);
        return;
    }

    void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateop, int i)
    {
        mCallback.onDispatchFirstPass(updateop);
        switch (updateop.cmd)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            mCallback.offsetPositionsForRemovingInvisible(i, updateop.itemCount);
            return;

        case 2: // '\002'
            mCallback.markViewHoldersUpdated(i, updateop.itemCount);
            break;
        }
    }

    int findPositionOffset(int i)
    {
        return findPositionOffset(i, 0);
    }

    int findPositionOffset(int i, int j)
    {
        int l;
        int i1;
        i1 = mPostponedList.size();
        l = j;
        j = i;
_L5:
        i = j;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        UpdateOp updateop = (UpdateOp)mPostponedList.get(l);
        if (updateop.cmd != 3) goto _L4; else goto _L3
_L3:
        if (updateop.positionStart == j)
        {
            i = updateop.itemCount;
        } else
        {
            int k = j;
            if (updateop.positionStart < j)
            {
                k = j - 1;
            }
            i = k;
            if (updateop.itemCount <= k)
            {
                i = k + 1;
            }
        }
_L7:
        l++;
        j = i;
          goto _L5
_L4:
        i = j;
        if (updateop.positionStart > j) goto _L7; else goto _L6
_L6:
        if (updateop.cmd != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= updateop.positionStart + updateop.itemCount) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - updateop.itemCount;
          goto _L7
        i = j;
        if (updateop.cmd == 0)
        {
            i = j + updateop.itemCount;
        }
          goto _L7
    }

    boolean hasPendingUpdates()
    {
        return mPendingUpdates.size() > 0;
    }

    public UpdateOp obtainUpdateOp(int i, int j, int k)
    {
        UpdateOp updateop = (UpdateOp)mUpdateOpPool.a();
        if (updateop == null)
        {
            return new UpdateOp(i, j, k);
        } else
        {
            updateop.cmd = i;
            updateop.positionStart = j;
            updateop.itemCount = k;
            return updateop;
        }
    }

    boolean onItemRangeChanged(int i, int j)
    {
        mPendingUpdates.add(obtainUpdateOp(2, i, j));
        return mPendingUpdates.size() == 1;
    }

    boolean onItemRangeInserted(int i, int j)
    {
        mPendingUpdates.add(obtainUpdateOp(0, i, j));
        return mPendingUpdates.size() == 1;
    }

    boolean onItemRangeMoved(int i, int j, int k)
    {
        boolean flag = true;
        if (i == j)
        {
            return false;
        }
        if (k != 1)
        {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        mPendingUpdates.add(obtainUpdateOp(3, i, j));
        if (mPendingUpdates.size() != 1)
        {
            flag = false;
        }
        return flag;
    }

    boolean onItemRangeRemoved(int i, int j)
    {
        mPendingUpdates.add(obtainUpdateOp(1, i, j));
        return mPendingUpdates.size() == 1;
    }

    void preProcess()
    {
        int i;
        int j;
        mOpReorderer.reorderOps(mPendingUpdates);
        j = mPendingUpdates.size();
        i = 0;
_L7:
        UpdateOp updateop;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        updateop = (UpdateOp)mPendingUpdates.get(i);
        updateop.cmd;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 95
    //                   1 103
    //                   2 111
    //                   3 119;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_119;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        if (mOnItemProcessedCallback != null)
        {
            mOnItemProcessedCallback.run();
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        applyAdd(updateop);
          goto _L8
_L3:
        applyRemove(updateop);
          goto _L8
_L4:
        applyUpdate(updateop);
          goto _L8
        applyMove(updateop);
          goto _L8
        mPendingUpdates.clear();
        return;
    }

    public void recycleUpdateOp(UpdateOp updateop)
    {
        if (!mDisableRecycler)
        {
            mUpdateOpPool.a(updateop);
        }
    }

    void recycleUpdateOpsAndClearList(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            recycleUpdateOp((UpdateOp)list.get(i));
        }

        list.clear();
    }

    void reset()
    {
        recycleUpdateOpsAndClearList(mPendingUpdates);
        recycleUpdateOpsAndClearList(mPostponedList);
    }
}
