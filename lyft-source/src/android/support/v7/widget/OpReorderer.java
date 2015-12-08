// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.List;

class OpReorderer
{

    final Callback a;

    public OpReorderer(Callback callback)
    {
        a = callback;
    }

    private void a(List list, int i, int j)
    {
        AdapterHelper.UpdateOp updateop = (AdapterHelper.UpdateOp)list.get(i);
        AdapterHelper.UpdateOp updateop1 = (AdapterHelper.UpdateOp)list.get(j);
        switch (updateop1.a)
        {
        default:
            return;

        case 1: // '\001'
            a(list, i, updateop, j, updateop1);
            return;

        case 0: // '\0'
            c(list, i, updateop, j, updateop1);
            return;

        case 2: // '\002'
            b(list, i, updateop, j, updateop1);
            break;
        }
    }

    private int b(List list)
    {
        boolean flag = false;
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (((AdapterHelper.UpdateOp)list.get(i)).a == 3)
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

    private void c(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        byte byte0 = 0;
        if (updateop.d < updateop1.b)
        {
            byte0 = -1;
        }
        int k = byte0;
        if (updateop.b < updateop1.b)
        {
            k = byte0 + 1;
        }
        if (updateop1.b <= updateop.b)
        {
            updateop.b = updateop.b + updateop1.d;
        }
        if (updateop1.b <= updateop.d)
        {
            updateop.d = updateop.d + updateop1.d;
        }
        updateop1.b = k + updateop1.b;
        list.set(i, updateop1);
        list.set(j, updateop);
    }

    void a(List list)
    {
        do
        {
            int i = b(list);
            if (i != -1)
            {
                a(list, i, i + 1);
            } else
            {
                return;
            }
        } while (true);
    }

    void a(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        boolean flag1 = false;
        AdapterHelper.UpdateOp updateop2;
        boolean flag;
        int k;
        int l;
        int i1;
        if (updateop.b < updateop.d)
        {
            if (updateop1.b == updateop.b && updateop1.d == updateop.d - updateop.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (updateop1.b == updateop.d + 1 && updateop1.d == updateop.b - updateop.d)
        {
            flag1 = true;
            flag = true;
        } else
        {
            flag = false;
            flag1 = true;
        }
        if (updateop.d >= updateop1.b) goto _L2; else goto _L1
_L1:
        updateop1.b = updateop1.b - 1;
_L4:
        if (updateop.b <= updateop1.b)
        {
            updateop1.b = updateop1.b + 1;
            updateop2 = null;
        } else
        if (updateop.b < updateop1.b + updateop1.d)
        {
            k = updateop1.b;
            l = updateop1.d;
            i1 = updateop.b;
            updateop2 = a.a(1, updateop.b + 1, (k + l) - i1, null);
            updateop1.d = updateop.b - updateop1.b;
        } else
        {
            updateop2 = null;
        }
        if (flag)
        {
            list.set(i, updateop1);
            list.remove(j);
            a.a(updateop);
        } else
        {
            if (flag1)
            {
                if (updateop2 != null)
                {
                    if (updateop.b > updateop2.b)
                    {
                        updateop.b = updateop.b - updateop2.d;
                    }
                    if (updateop.d > updateop2.b)
                    {
                        updateop.d = updateop.d - updateop2.d;
                    }
                }
                if (updateop.b > updateop1.b)
                {
                    updateop.b = updateop.b - updateop1.d;
                }
                if (updateop.d > updateop1.b)
                {
                    updateop.d = updateop.d - updateop1.d;
                }
            } else
            {
                if (updateop2 != null)
                {
                    if (updateop.b >= updateop2.b)
                    {
                        updateop.b = updateop.b - updateop2.d;
                    }
                    if (updateop.d >= updateop2.b)
                    {
                        updateop.d = updateop.d - updateop2.d;
                    }
                }
                if (updateop.b >= updateop1.b)
                {
                    updateop.b = updateop.b - updateop1.d;
                }
                if (updateop.d >= updateop1.b)
                {
                    updateop.d = updateop.d - updateop1.d;
                }
            }
            list.set(i, updateop1);
            if (updateop.b != updateop.d)
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
        if (updateop.d >= updateop1.b + updateop1.d) goto _L4; else goto _L3
_L3:
        updateop1.d = updateop1.d - 1;
        updateop.a = 1;
        updateop.d = 1;
        if (updateop1.d == 0)
        {
            list.remove(j);
            a.a(updateop1);
            return;
        }
          goto _L5
    }

    void b(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
    {
        AdapterHelper.UpdateOp updateop3 = null;
        AdapterHelper.UpdateOp updateop2;
        if (updateop.d < updateop1.b)
        {
            updateop1.b = updateop1.b - 1;
            updateop2 = null;
        } else
        if (updateop.d < updateop1.b + updateop1.d)
        {
            updateop1.d = updateop1.d - 1;
            updateop2 = a.a(2, updateop.b, 1, updateop1.c);
        } else
        {
            updateop2 = null;
        }
        if (updateop.b <= updateop1.b)
        {
            updateop1.b = updateop1.b + 1;
        } else
        if (updateop.b < updateop1.b + updateop1.d)
        {
            int k = (updateop1.b + updateop1.d) - updateop.b;
            updateop3 = a.a(2, updateop.b + 1, k, updateop1.c);
            updateop1.d = updateop1.d - k;
        }
        list.set(j, updateop);
        if (updateop1.d > 0)
        {
            list.set(i, updateop1);
        } else
        {
            list.remove(i);
            a.a(updateop1);
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

    private class Callback
    {

        public abstract AdapterHelper.UpdateOp a(int i, int j, int k, Object obj);

        public abstract void a(AdapterHelper.UpdateOp updateop);
    }

}
