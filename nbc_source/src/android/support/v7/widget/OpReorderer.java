// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.List;

class OpReorderer
{
    static interface Callback
    {

        public abstract AdapterHelper.UpdateOp obtainUpdateOp(int i, int j, int k);

        public abstract void recycleUpdateOp(AdapterHelper.UpdateOp updateop);
    }


    final Callback mCallback;

    public OpReorderer(Callback callback)
    {
        mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List list)
    {
        boolean flag = false;
        for (int i = list.size() - 1; i >= 0;)
        {
            boolean flag1;
            if (((AdapterHelper.UpdateOp)list.get(i)).cmd == 3)
            {
                flag1 = flag;
                if (flag)
                {
                    return i;
                }
            } else
            {
                flag1 = true;
            }
            i--;
            flag = flag1;
        }

        return -1;
    }

    private void swapMoveAdd(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        int k = 0;
        if (updateop.itemCount < updateop1.positionStart)
        {
            k = 0 - 1;
        }
        int l = k;
        if (updateop.positionStart < updateop1.positionStart)
        {
            l = k + 1;
        }
        if (updateop1.positionStart <= updateop.positionStart)
        {
            updateop.positionStart = updateop.positionStart + updateop1.itemCount;
        }
        if (updateop1.positionStart <= updateop.itemCount)
        {
            updateop.itemCount = updateop.itemCount + updateop1.itemCount;
        }
        updateop1.positionStart = updateop1.positionStart + l;
        list.set(i, updateop1);
        list.set(j, updateop);
    }

    private void swapMoveOp(List list, int i, int j)
    {
        AdapterHelper.UpdateOp updateop = (AdapterHelper.UpdateOp)list.get(i);
        AdapterHelper.UpdateOp updateop1 = (AdapterHelper.UpdateOp)list.get(j);
        switch (updateop1.cmd)
        {
        default:
            return;

        case 1: // '\001'
            swapMoveRemove(list, i, updateop, j, updateop1);
            return;

        case 0: // '\0'
            swapMoveAdd(list, i, updateop, j, updateop1);
            return;

        case 2: // '\002'
            swapMoveUpdate(list, i, updateop, j, updateop1);
            break;
        }
    }

    void reorderOps(List list)
    {
        do
        {
            int i = getLastMoveOutOfOrder(list);
            if (i != -1)
            {
                swapMoveOp(list, i, i + 1);
            } else
            {
                return;
            }
        } while (true);
    }

    void swapMoveRemove(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        AdapterHelper.UpdateOp updateop2;
        boolean flag1;
        updateop2 = null;
        boolean flag2 = false;
        boolean flag;
        if (updateop.positionStart < updateop.itemCount)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (updateop1.positionStart == updateop.positionStart)
            {
                flag1 = flag3;
                flag = flag2;
                if (updateop1.itemCount == updateop.itemCount - updateop.positionStart)
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
            if (updateop1.positionStart == updateop.itemCount + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (updateop1.itemCount == updateop.positionStart - updateop.itemCount)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (updateop.itemCount >= updateop1.positionStart) goto _L2; else goto _L1
_L1:
        updateop1.positionStart = updateop1.positionStart - 1;
_L4:
        if (updateop.positionStart <= updateop1.positionStart)
        {
            updateop1.positionStart = updateop1.positionStart + 1;
        } else
        if (updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
        {
            int k = updateop1.positionStart;
            int l = updateop1.itemCount;
            int i1 = updateop.positionStart;
            updateop2 = mCallback.obtainUpdateOp(1, updateop.positionStart + 1, (k + l) - i1);
            updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
        }
        if (flag)
        {
            list.set(i, updateop1);
            list.remove(j);
            mCallback.recycleUpdateOp(updateop);
        } else
        {
            if (flag1)
            {
                if (updateop2 != null)
                {
                    if (updateop.positionStart > updateop2.positionStart)
                    {
                        updateop.positionStart = updateop.positionStart - updateop2.itemCount;
                    }
                    if (updateop.itemCount > updateop2.positionStart)
                    {
                        updateop.itemCount = updateop.itemCount - updateop2.itemCount;
                    }
                }
                if (updateop.positionStart > updateop1.positionStart)
                {
                    updateop.positionStart = updateop.positionStart - updateop1.itemCount;
                }
                if (updateop.itemCount > updateop1.positionStart)
                {
                    updateop.itemCount = updateop.itemCount - updateop1.itemCount;
                }
            } else
            {
                if (updateop2 != null)
                {
                    if (updateop.positionStart >= updateop2.positionStart)
                    {
                        updateop.positionStart = updateop.positionStart - updateop2.itemCount;
                    }
                    if (updateop.itemCount >= updateop2.positionStart)
                    {
                        updateop.itemCount = updateop.itemCount - updateop2.itemCount;
                    }
                }
                if (updateop.positionStart >= updateop1.positionStart)
                {
                    updateop.positionStart = updateop.positionStart - updateop1.itemCount;
                }
                if (updateop.itemCount >= updateop1.positionStart)
                {
                    updateop.itemCount = updateop.itemCount - updateop1.itemCount;
                }
            }
            list.set(i, updateop1);
            if (updateop.positionStart != updateop.itemCount)
            {
                list.set(j, updateop);
            } else
            {
                list.remove(j);
            }
            if (updateop2 != null)
            {
                list.add(i, updateop2);
                return;
            }
        }
_L5:
        return;
_L2:
        if (updateop.itemCount >= updateop1.positionStart + updateop1.itemCount) goto _L4; else goto _L3
_L3:
        updateop1.itemCount = updateop1.itemCount - 1;
        updateop.cmd = 1;
        updateop.itemCount = 1;
        if (updateop1.itemCount == 0)
        {
            list.remove(j);
            mCallback.recycleUpdateOp(updateop1);
            return;
        }
          goto _L5
    }

    void swapMoveUpdate(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        AdapterHelper.UpdateOp updateop2 = null;
        AdapterHelper.UpdateOp updateop3 = null;
        if (updateop.itemCount < updateop1.positionStart)
        {
            updateop1.positionStart = updateop1.positionStart - 1;
        } else
        if (updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
        {
            updateop1.itemCount = updateop1.itemCount - 1;
            updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart, 1);
        }
        if (updateop.positionStart <= updateop1.positionStart)
        {
            updateop1.positionStart = updateop1.positionStart + 1;
        } else
        if (updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
        {
            int k = (updateop1.positionStart + updateop1.itemCount) - updateop.positionStart;
            updateop3 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, k);
            updateop1.itemCount = updateop1.itemCount - k;
        }
        list.set(j, updateop);
        if (updateop1.itemCount > 0)
        {
            list.set(i, updateop1);
        } else
        {
            list.remove(i);
            mCallback.recycleUpdateOp(updateop1);
        }
        if (updateop2 != null)
        {
            list.add(i, updateop2);
        }
        if (updateop3 != null)
        {
            list.add(i, updateop3);
        }
    }
}
