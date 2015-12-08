// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

public final class ojg
{

    public MotionEvent a;
    private final ojw b;

    public ojg(ojw ojw1)
    {
        b = ojw1;
    }

    private void a(MotionEvent motionevent, int i)
    {
        motionevent = MotionEvent.obtainNoHistory(motionevent);
        motionevent.setAction(i);
        b.a(motionevent);
        motionevent.recycle();
    }

    public final void a()
    {
        if (a != null)
        {
            a.setAction(3);
            b.a(a);
            a.recycle();
            a = null;
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        int l1;
label0:
        {
            int l = motionevent.getActionMasked();
            if (l == 3)
            {
                break MISSING_BLOCK_LABEL_205;
            }
            int i = motionevent.getPointerCount();
            if (l != 5)
            {
                l1 = i;
                if (l != 0)
                {
                    break label0;
                }
            }
            l1 = i - 1;
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = j;
        if (j == 0)
        {
            a(motionevent, 0);
            i1 = j + 1;
        }
        for (; i1 < l1; i1++)
        {
            a(motionevent, i1 << 8 | 5);
        }

        break MISSING_BLOCK_LABEL_205;
_L2:
        int i2 = a.getActionMasked();
        if (i2 == 3)
        {
            j = 0;
            continue; /* Loop/switch isn't completed */
        }
        int j1 = a.getPointerCount();
        if (i2 != 6)
        {
            j = j1;
            if (i2 != 1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = j1 - 1;
        if (true) goto _L4; else goto _L3
_L3:
        if (j > l1)
        {
            MotionEvent motionevent1 = a;
            for (int k1 = Math.max(l1, 1); j > k1;)
            {
                j--;
                a(motionevent1, j << 8 | 6);
            }

            if (l1 == 0)
            {
                a(motionevent1, 1);
            }
        }
        int k = motionevent.getActionMasked();
        boolean flag;
        if (k == 1 || k == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b();
        } else
        {
            a = MotionEvent.obtain(motionevent);
        }
        return b.a(motionevent);
    }

    public final void b()
    {
        if (a != null)
        {
            a.recycle();
            a = null;
        }
    }
}
