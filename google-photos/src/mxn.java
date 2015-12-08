// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class mxn
{

    byte a[];
    ArrayList b;
    final ByteOrder c;
    public byte d[];
    private final mxy e[] = new mxy[5];

    mxn(ByteOrder byteorder)
    {
        b = new ArrayList();
        c = byteorder;
    }

    protected final mxx a(mxx mxx1)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (mxx1 != null)
        {
            int i = mxx1.e;
            obj = obj1;
            if (mxx1 != null)
            {
                obj = obj1;
                if (mxx.a(i))
                {
                    mxy mxy1 = e[i];
                    obj = mxy1;
                    if (mxy1 == null)
                    {
                        obj = new mxy(i);
                        e[i] = ((mxy) (obj));
                    }
                    obj = ((mxy) (obj)).a(mxx1);
                }
            }
        }
        return ((mxx) (obj));
    }

    protected final mxx a(short word0, int i)
    {
        mxy mxy1 = e[i];
        if (mxy1 == null)
        {
            return null;
        } else
        {
            return mxy1.a(word0);
        }
    }

    protected final void a(mxy mxy1)
    {
        e[mxy1.a] = mxy1;
    }

    protected final boolean a()
    {
        return a != null;
    }

    protected final byte[] a(int i)
    {
        return (byte[])b.get(i);
    }

    protected final mxy b(int i)
    {
        if (mxx.a(i))
        {
            return e[i];
        } else
        {
            return null;
        }
    }

    protected final void b(short word0, int i)
    {
        mxy mxy1 = e[i];
        if (mxy1 == null)
        {
            return;
        } else
        {
            mxy1.b(word0);
            return;
        }
    }

    protected final boolean b()
    {
        return !b.isEmpty();
    }

    protected final List c()
    {
        ArrayList arraylist1 = new ArrayList();
        mxy amxy[] = e;
        int j = amxy.length;
        for (int i = 0; i < j; i++)
        {
            mxy mxy1 = amxy[i];
            if (mxy1 == null)
            {
                continue;
            }
            mxx amxx[] = mxy1.b();
            if (amxx != null)
            {
                Collections.addAll(arraylist1, amxx);
            }
        }

        ArrayList arraylist = arraylist1;
        if (arraylist1.isEmpty())
        {
            arraylist = null;
        }
        return arraylist;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!(obj instanceof mxn)) goto _L4; else goto _L5
_L5:
        obj = (mxn)obj;
        flag = flag1;
        if (((mxn) (obj)).c != c) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (((mxn) (obj)).b.size() != b.size()) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!Arrays.equals(((mxn) (obj)).a, a)) goto _L4; else goto _L8
_L8:
        int i = 0;
_L10:
        if (i >= b.size())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        flag = flag1;
        if (!Arrays.equals((byte[])((mxn) (obj)).b.get(i), (byte[])b.get(i))) goto _L4; else goto _L9
_L9:
        i++;
          goto _L10
        i = 0;
_L14:
        if (i >= 5) goto _L12; else goto _L11
_L11:
        mxy mxy1;
        mxy mxy2;
        mxy1 = ((mxn) (obj)).b(i);
        mxy2 = b(i);
        if (mxy1 == mxy2 || mxy1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!mxy1.equals(mxy2)) goto _L4; else goto _L13
_L13:
        i++;
          goto _L14
_L12:
        return true;
    }

    public final int hashCode()
    {
        return (((c.hashCode() + 527) * 31 + b.hashCode()) * 31 + Arrays.hashCode(a)) * 31 + Arrays.hashCode(e);
    }
}
