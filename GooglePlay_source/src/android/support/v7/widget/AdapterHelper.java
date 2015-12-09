// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            OpReorderer

final class AdapterHelper
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

    static final class UpdateOp
    {

        int cmd;
        int itemCount;
        int positionStart;

        public final boolean equals(Object obj)
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

        public final int hashCode()
        {
            return (cmd * 31 + positionStart) * 31 + itemCount;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("[");
            cmd;
            JVM INSTR tableswitch 0 3: default 44
        //                       0 85
        //                       1 91
        //                       2 97
        //                       3 103;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            String s = "??";
_L7:
            return stringbuilder.append(s).append(",s:").append(positionStart).append("c:").append(itemCount).append("]").toString();
_L2:
            s = "add";
            continue; /* Loop/switch isn't completed */
_L3:
            s = "rm";
            continue; /* Loop/switch isn't completed */
_L4:
            s = "up";
            continue; /* Loop/switch isn't completed */
_L5:
            s = "mv";
            if (true) goto _L7; else goto _L6
_L6:
        }

        UpdateOp(int i, int j, int k)
        {
            cmd = i;
            positionStart = j;
            itemCount = k;
        }
    }


    final Callback mCallback;
    final boolean mDisableRecycler;
    final OpReorderer mOpReorderer;
    final ArrayList mPendingUpdates;
    final ArrayList mPostponedList;
    private android.support.v4.util.Pools.Pool mUpdateOpPool;

    AdapterHelper(Callback callback)
    {
        this(callback, (byte)0);
    }

    private AdapterHelper(Callback callback, byte byte0)
    {
        mUpdateOpPool = new android.support.v4.util.Pools.SimplePool(30);
        mPendingUpdates = new ArrayList();
        mPostponedList = new ArrayList();
        mCallback = callback;
        mDisableRecycler = false;
        mOpReorderer = new OpReorderer(this);
    }

    private boolean canFindInPreLayout(int i)
    {
        int j;
        int l;
        l = mPostponedList.size();
        j = 0;
_L7:
        if (j >= l) goto _L2; else goto _L1
_L1:
        UpdateOp updateop = (UpdateOp)mPostponedList.get(j);
        if (updateop.cmd != 3) goto _L4; else goto _L3
_L3:
        if (findPositionOffset(updateop.itemCount, j + 1) != i)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return true;
_L4:
        if (updateop.cmd != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = updateop.positionStart;
        int j1 = updateop.itemCount;
        int k = updateop.positionStart;
        do
        {
            if (k >= i1 + j1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (findPositionOffset(k, j + 1) == i)
            {
                break;
            }
            k++;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
        j++;
          goto _L7
_L2:
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateop)
    {
        int i;
        int i1;
        int j1;
        if (updateop.cmd == 0 || updateop.cmd == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = updatePositionWithPostponed(updateop.positionStart, updateop.cmd);
        i1 = 1;
        i = updateop.positionStart;
        updateop.cmd;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 184
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(updateop).toString());
_L3:
        int k = 1;
_L8:
        int l = 1;
_L7:
        int j;
        int k1;
        if (l >= updateop.itemCount)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        k1 = updatePositionWithPostponed(updateop.positionStart + k * l, updateop.cmd);
        j = 0;
        updateop.cmd;
        JVM INSTR tableswitch 1 2: default 160
    //                   1 211
    //                   2 190;
           goto _L4 _L5 _L6
_L4:
        if (j != 0)
        {
            j = i1 + 1;
        } else
        {
            UpdateOp updateop1 = obtainUpdateOp(updateop.cmd, j1, i1);
            dispatchFirstPassAndUpdateViewHolders(updateop1, i);
            recycleUpdateOp(updateop1);
            j = i;
            if (updateop.cmd == 2)
            {
                j = i + i1;
            }
            j1 = k1;
            i1 = 1;
            i = j;
            j = i1;
        }
        l++;
        i1 = j;
          goto _L7
_L2:
        k = 0;
          goto _L8
_L6:
        if (k1 == j1 + 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
          goto _L4
_L5:
        if (k1 == j1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
          goto _L4
        recycleUpdateOp(updateop);
        if (i1 > 0)
        {
            updateop = obtainUpdateOp(updateop.cmd, j1, i1);
            dispatchFirstPassAndUpdateViewHolders(updateop, i);
            recycleUpdateOp(updateop);
        }
        return;
          goto _L7
    }

    private void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateop, int i)
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

    private int findPositionOffset(int i, int j)
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

    private void postponeAndUpdateViewHolders(UpdateOp updateop)
    {
        mPostponedList.add(updateop);
        switch (updateop.cmd)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(updateop).toString());

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

    private void recycleUpdateOpsAndClearList(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            recycleUpdateOp((UpdateOp)list.get(i));
        }

        list.clear();
    }

    private int updatePositionWithPostponed(int i, int j)
    {
        int k = mPostponedList.size() - 1;
        int l = i;
        do
        {
            if (k >= 0)
            {
                UpdateOp updateop = (UpdateOp)mPostponedList.get(k);
                if (updateop.cmd == 3)
                {
                    int i1;
                    if (updateop.positionStart < updateop.itemCount)
                    {
                        i1 = updateop.positionStart;
                        i = updateop.itemCount;
                    } else
                    {
                        i1 = updateop.itemCount;
                        i = updateop.positionStart;
                    }
                    if (l >= i1 && l <= i)
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
                            i = l + 1;
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
                            i = l - 1;
                        }
                    } else
                    {
                        i = l;
                        if (l < updateop.positionStart)
                        {
                            if (j == 0)
                            {
                                updateop.positionStart = updateop.positionStart + 1;
                                updateop.itemCount = updateop.itemCount + 1;
                                i = l;
                            } else
                            {
                                i = l;
                                if (j == 1)
                                {
                                    updateop.positionStart = updateop.positionStart - 1;
                                    updateop.itemCount = updateop.itemCount - 1;
                                    i = l;
                                }
                            }
                        }
                    }
                } else
                if (updateop.positionStart <= l)
                {
                    if (updateop.cmd == 0)
                    {
                        i = l - updateop.itemCount;
                    } else
                    {
                        i = l;
                        if (updateop.cmd == 1)
                        {
                            i = l + updateop.itemCount;
                        }
                    }
                } else
                if (j == 0)
                {
                    updateop.positionStart = updateop.positionStart + 1;
                    i = l;
                } else
                {
                    i = l;
                    if (j == 1)
                    {
                        updateop.positionStart = updateop.positionStart - 1;
                        i = l;
                    }
                }
                k--;
                l = i;
                continue;
            }
            i = mPostponedList.size() - 1;
            while (i >= 0) 
            {
                UpdateOp updateop1 = (UpdateOp)mPostponedList.get(i);
                if (updateop1.cmd == 3)
                {
                    if (updateop1.itemCount == updateop1.positionStart || updateop1.itemCount < 0)
                    {
                        mPostponedList.remove(i);
                        recycleUpdateOp(updateop1);
                    }
                } else
                if (updateop1.itemCount <= 0)
                {
                    mPostponedList.remove(i);
                    recycleUpdateOp(updateop1);
                }
                i--;
            }
            return l;
        } while (true);
    }

    final void consumePostponedUpdates()
    {
        int j = mPostponedList.size();
        for (int i = 0; i < j; i++)
        {
            mCallback.onDispatchSecondPass((UpdateOp)mPostponedList.get(i));
        }

        recycleUpdateOpsAndClearList(mPostponedList);
    }

    final void consumeUpdatesInOnePass()
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
            break MISSING_BLOCK_LABEL_191;
        }
        updateop = (UpdateOp)mPendingUpdates.get(i);
        updateop.cmd;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 71
    //                   1 101
    //                   2 131
    //                   3 161;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_161;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
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

    final int findPositionOffset(int i)
    {
        return findPositionOffset(i, 0);
    }

    final boolean hasPendingUpdates()
    {
        return mPendingUpdates.size() > 0;
    }

    public final UpdateOp obtainUpdateOp(int i, int j, int k)
    {
        UpdateOp updateop = (UpdateOp)mUpdateOpPool.acquire();
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

    final void preProcess()
    {
        OpReorderer opreorderer;
        ArrayList arraylist;
        opreorderer = mOpReorderer;
        arraylist = mPendingUpdates;
_L16:
        int i;
        int i1;
        i1 = 0;
        i = arraylist.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((UpdateOp)arraylist.get(i)).cmd != 3) goto _L4; else goto _L3
_L3:
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = i;
_L10:
        UpdateOp updateop4;
        UpdateOp updateop5;
        int i4;
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i4 = i1 + 1;
        updateop4 = (UpdateOp)arraylist.get(i1);
        updateop5 = (UpdateOp)arraylist.get(i4);
        updateop5.cmd;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 289
    //                   2 986;
           goto _L5 _L6 _L7 _L8
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (updateop4.itemCount < updateop5.positionStart)
        {
            i = -1;
        }
        int k1 = i;
        if (updateop4.positionStart < updateop5.positionStart)
        {
            k1 = i + 1;
        }
        if (updateop5.positionStart <= updateop4.positionStart)
        {
            updateop4.positionStart = updateop4.positionStart + updateop5.itemCount;
        }
        if (updateop5.positionStart <= updateop4.itemCount)
        {
            updateop4.itemCount = updateop4.itemCount + updateop5.itemCount;
        }
        updateop5.positionStart = k1 + updateop5.positionStart;
        arraylist.set(i1, updateop5);
        arraylist.set(i4, updateop4);
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 1;
        i--;
          goto _L9
_L2:
        i1 = -1;
          goto _L10
_L7:
        UpdateOp updateop;
        boolean flag1;
        updateop = null;
        boolean flag2 = false;
        boolean flag;
        if (updateop4.positionStart < updateop4.itemCount)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (updateop5.positionStart == updateop4.positionStart)
            {
                flag1 = flag3;
                flag = flag2;
                if (updateop5.itemCount == updateop4.itemCount - updateop4.positionStart)
                {
                    flag = true;
                    flag1 = flag3;
                }
            }
        } else
        {
            boolean flag4 = true;
            flag1 = flag4;
            flag = flag2;
            if (updateop5.positionStart == updateop4.itemCount + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (updateop5.itemCount == updateop4.positionStart - updateop4.itemCount)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (updateop4.itemCount >= updateop5.positionStart) goto _L12; else goto _L11
_L11:
        updateop5.positionStart = updateop5.positionStart - 1;
_L14:
        if (updateop4.positionStart <= updateop5.positionStart)
        {
            updateop5.positionStart = updateop5.positionStart + 1;
        } else
        if (updateop4.positionStart < updateop5.positionStart + updateop5.itemCount)
        {
            int j2 = updateop5.positionStart;
            int i3 = updateop5.itemCount;
            int j4 = updateop4.positionStart;
            updateop = opreorderer.mCallback.obtainUpdateOp(1, updateop4.positionStart + 1, (j2 + i3) - j4);
            updateop5.itemCount = updateop4.positionStart - updateop5.positionStart;
        }
        if (flag)
        {
            arraylist.set(i1, updateop5);
            arraylist.remove(i4);
            opreorderer.mCallback.recycleUpdateOp(updateop4);
        } else
        {
            if (flag1)
            {
                if (updateop != null)
                {
                    if (updateop4.positionStart > updateop.positionStart)
                    {
                        updateop4.positionStart = updateop4.positionStart - updateop.itemCount;
                    }
                    if (updateop4.itemCount > updateop.positionStart)
                    {
                        updateop4.itemCount = updateop4.itemCount - updateop.itemCount;
                    }
                }
                if (updateop4.positionStart > updateop5.positionStart)
                {
                    updateop4.positionStart = updateop4.positionStart - updateop5.itemCount;
                }
                if (updateop4.itemCount > updateop5.positionStart)
                {
                    updateop4.itemCount = updateop4.itemCount - updateop5.itemCount;
                }
            } else
            {
                if (updateop != null)
                {
                    if (updateop4.positionStart >= updateop.positionStart)
                    {
                        updateop4.positionStart = updateop4.positionStart - updateop.itemCount;
                    }
                    if (updateop4.itemCount >= updateop.positionStart)
                    {
                        updateop4.itemCount = updateop4.itemCount - updateop.itemCount;
                    }
                }
                if (updateop4.positionStart >= updateop5.positionStart)
                {
                    updateop4.positionStart = updateop4.positionStart - updateop5.itemCount;
                }
                if (updateop4.itemCount >= updateop5.positionStart)
                {
                    updateop4.itemCount = updateop4.itemCount - updateop5.itemCount;
                }
            }
            arraylist.set(i1, updateop5);
            if (updateop4.positionStart != updateop4.itemCount)
            {
                arraylist.set(i4, updateop4);
            } else
            {
                arraylist.remove(i4);
            }
            if (updateop != null)
            {
                arraylist.add(i1, updateop);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (updateop4.itemCount >= updateop5.positionStart + updateop5.itemCount) goto _L14; else goto _L13
_L13:
        updateop5.itemCount = updateop5.itemCount - 1;
        updateop4.cmd = 1;
        updateop4.itemCount = 1;
        if (updateop5.itemCount == 0)
        {
            arraylist.remove(i4);
            opreorderer.mCallback.recycleUpdateOp(updateop5);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        UpdateOp updateop1;
        updateop = null;
        updateop1 = null;
        if (updateop4.itemCount < updateop5.positionStart)
        {
            updateop5.positionStart = updateop5.positionStart - 1;
        } else
        if (updateop4.itemCount < updateop5.positionStart + updateop5.itemCount)
        {
            updateop5.itemCount = updateop5.itemCount - 1;
            updateop = opreorderer.mCallback.obtainUpdateOp(2, updateop4.positionStart, 1);
        }
_L25:
        if (updateop4.positionStart <= updateop5.positionStart)
        {
            updateop5.positionStart = updateop5.positionStart + 1;
        } else
        if (updateop4.positionStart < updateop5.positionStart + updateop5.itemCount)
        {
            int j = (updateop5.positionStart + updateop5.itemCount) - updateop4.positionStart;
            updateop1 = opreorderer.mCallback.obtainUpdateOp(2, updateop4.positionStart + 1, j);
            updateop5.itemCount = updateop5.itemCount - j;
        }
        arraylist.set(i4, updateop4);
        if (updateop5.itemCount > 0)
        {
            arraylist.set(i1, updateop5);
        } else
        {
            arraylist.remove(i1);
            opreorderer.mCallback.recycleUpdateOp(updateop5);
        }
        if (updateop != null)
        {
            arraylist.add(i1, updateop);
        }
        if (updateop1 != null)
        {
            arraylist.add(i1, updateop1);
        }
        if (true) goto _L16; else goto _L15
_L15:
        int l4;
        l4 = mPendingUpdates.size();
        i4 = 0;
_L24:
        if (i4 >= l4) goto _L18; else goto _L17
_L17:
        updateop = (UpdateOp)mPendingUpdates.get(i4);
        updateop.cmd;
        JVM INSTR tableswitch 0 3: default 1320
    //                   0 1329
    //                   1 1337
    //                   2 1577
    //                   3 1794;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        i4++;
          goto _L24
_L20:
        postponeAndUpdateViewHolders(updateop);
          goto _L19
_L21:
        int i5 = updateop.positionStart;
        int k = updateop.positionStart;
        int l1 = updateop.itemCount + k;
        byte byte1 = -1;
        k = updateop.positionStart;
        int j3 = 0;
        while (k < l1) 
        {
            byte byte0 = 0;
            int k2 = 0;
            if (mCallback.findViewHolder(k) != null || canFindInPreLayout(k))
            {
                if (byte1 == 0)
                {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(1, i5, j3));
                    k2 = 1;
                }
                byte0 = 1;
            } else
            {
                if (byte1 == 1)
                {
                    postponeAndUpdateViewHolders(obtainUpdateOp(1, i5, j3));
                    byte0 = 1;
                }
                byte1 = 0;
                k2 = byte0;
                byte0 = byte1;
            }
            if (k2 != 0)
            {
                k2 = k - j3;
                k = l1 - j3;
                l1 = 1;
            } else
            {
                j3++;
                k2 = k;
                k = l1;
                l1 = j3;
            }
            j3 = l1;
            l1 = k;
            k = k2 + 1;
            byte1 = byte0;
        }
        UpdateOp updateop2 = updateop;
        if (j3 != updateop.itemCount)
        {
            recycleUpdateOp(updateop);
            updateop2 = obtainUpdateOp(1, i5, j3);
        }
        if (byte1 == 0)
        {
            dispatchAndUpdateViewHolders(updateop2);
        } else
        {
            postponeAndUpdateViewHolders(updateop2);
        }
          goto _L19
_L22:
        int i2 = updateop.positionStart;
        int j5 = updateop.positionStart;
        int k5 = updateop.itemCount;
        int l = updateop.positionStart;
        int j1 = 0;
        int k4 = -1;
        while (l < j5 + k5) 
        {
            int l2;
            if (mCallback.findViewHolder(l) != null || canFindInPreLayout(l))
            {
                l2 = j1;
                int k3 = i2;
                if (k4 == 0)
                {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i2, j1));
                    l2 = 0;
                    k3 = l;
                }
                i2 = k3;
                j1 = 1;
            } else
            {
                l2 = j1;
                int l3 = i2;
                if (k4 == 1)
                {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i2, j1));
                    l2 = 0;
                    l3 = l;
                }
                i2 = l3;
                j1 = 0;
            }
            l++;
            l2++;
            k4 = j1;
            j1 = l2;
        }
        UpdateOp updateop3 = updateop;
        if (j1 != updateop.itemCount)
        {
            recycleUpdateOp(updateop);
            updateop3 = obtainUpdateOp(2, i2, j1);
        }
        if (k4 == 0)
        {
            dispatchAndUpdateViewHolders(updateop3);
        } else
        {
            postponeAndUpdateViewHolders(updateop3);
        }
          goto _L19
_L23:
        postponeAndUpdateViewHolders(updateop);
          goto _L19
_L18:
        mPendingUpdates.clear();
        return;
          goto _L25
    }

    public final void recycleUpdateOp(UpdateOp updateop)
    {
        mUpdateOpPool.release(updateop);
    }

    final void reset()
    {
        recycleUpdateOpsAndClearList(mPendingUpdates);
        recycleUpdateOpsAndClearList(mPostponedList);
    }
}
