// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.List;

class OpReorderer
{
    static interface Callback
    {

        public abstract AdapterHelper.UpdateOp obtainUpdateOp(int i, int j, int k, Object obj);

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
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (((AdapterHelper.UpdateOp)list.get(i)).cmd == 8)
            {
                if (flag)
                {
                    return i;
                }
            } else
            {
                flag = true;
            }
        }

        return -1;
    }

    private void swapMoveAdd(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        byte byte0 = 0;
        if (updateop.itemCount < updateop1.positionStart)
        {
            byte0 = -1;
        }
        int k = byte0;
        if (updateop.positionStart < updateop1.positionStart)
        {
            k = byte0 + 1;
        }
        if (updateop1.positionStart <= updateop.positionStart)
        {
            updateop.positionStart = updateop.positionStart + updateop1.itemCount;
        }
        if (updateop1.positionStart <= updateop.itemCount)
        {
            updateop.itemCount = updateop.itemCount + updateop1.itemCount;
        }
        updateop1.positionStart = k + updateop1.positionStart;
        list.set(i, updateop1);
        list.set(j, updateop);
    }

    private void swapMoveOp(List list, int i, int j)
    {
        AdapterHelper.UpdateOp updateop = (AdapterHelper.UpdateOp)list.get(i);
        AdapterHelper.UpdateOp updateop1 = (AdapterHelper.UpdateOp)list.get(j);
        switch (updateop1.cmd)
        {
        case 3: // '\003'
        default:
            return;

        case 2: // '\002'
            swapMoveRemove(list, i, updateop, j, updateop1);
            return;

        case 1: // '\001'
            swapMoveAdd(list, i, updateop, j, updateop1);
            return;

        case 4: // '\004'
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
        boolean flag1 = false;
        AdapterHelper.UpdateOp updateop2;
        boolean flag;
        int k;
        int l;
        int i1;
        if (updateop.positionStart < updateop.itemCount)
        {
            if (updateop1.positionStart == updateop.positionStart && updateop1.itemCount == updateop.itemCount - updateop.positionStart)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (updateop1.positionStart == updateop.itemCount + 1 && updateop1.itemCount == updateop.positionStart - updateop.itemCount)
        {
            flag1 = true;
            flag = true;
        } else
        {
            flag = false;
            flag1 = true;
        }
        if (updateop.itemCount >= updateop1.positionStart) goto _L2; else goto _L1
_L1:
        updateop1.positionStart = updateop1.positionStart - 1;
_L4:
        if (updateop.positionStart <= updateop1.positionStart)
        {
            updateop1.positionStart = updateop1.positionStart + 1;
            updateop2 = null;
        } else
        if (updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
        {
            k = updateop1.positionStart;
            l = updateop1.itemCount;
            i1 = updateop.positionStart;
            updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, (k + l) - i1, null);
            updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
        } else
        {
            updateop2 = null;
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
        updateop.cmd = 2;
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
        AdapterHelper.UpdateOp updateop3 = null;
        AdapterHelper.UpdateOp updateop2;
        if (updateop.itemCount < updateop1.positionStart)
        {
            updateop1.positionStart = updateop1.positionStart - 1;
            updateop2 = null;
        } else
        if (updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
        {
            updateop1.itemCount = updateop1.itemCount - 1;
            updateop2 = mCallback.obtainUpdateOp(4, updateop.positionStart, 1, updateop1.payload);
        } else
        {
            updateop2 = null;
        }
        if (updateop.positionStart <= updateop1.positionStart)
        {
            updateop1.positionStart = updateop1.positionStart + 1;
        } else
        if (updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
        {
            int k = (updateop1.positionStart + updateop1.itemCount) - updateop.positionStart;
            updateop3 = mCallback.obtainUpdateOp(4, updateop.positionStart + 1, k, updateop1.payload);
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
