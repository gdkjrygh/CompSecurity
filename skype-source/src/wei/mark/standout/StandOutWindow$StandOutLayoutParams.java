// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout;

import android.view.Display;
import android.view.WindowManager;
import wei.mark.standout.a.a;

// Referenced classes of package wei.mark.standout:
//            StandOutWindow, b, c

public class y extends android.view.rams
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    final StandOutWindow f;

    public final void a(boolean flag)
    {
        if (flag)
        {
            flags = flags ^ 8;
            return;
        } else
        {
            flags = flags | 8;
            return;
        }
    }

    private (StandOutWindow standoutwindow, int i)
    {
        f = standoutwindow;
        super(200, 200, 2002, 0x40020, -3);
        int j = standoutwindow.getFlags(i);
        a(false);
        if (!wei.mark.standout.b.a(j, a.j))
        {
            flags = flags | 0x200;
        }
        j = width;
        int k = f.mWindowManager.getDefaultDisplay().getWidth();
        x = (StandOutWindow.sWindowCache.a() * 100 + i * 100) % (k - j);
        j = height;
        standoutwindow = f.mWindowManager.getDefaultDisplay();
        k = standoutwindow.getWidth();
        int l = standoutwindow.getHeight();
        int i1 = StandOutWindow.sWindowCache.a();
        int j1 = x;
        y = ((i * 100 * 200) / (k - width) + j1 + i1 * 100) % (l - j);
        gravity = 51;
        a = 10;
        c = 0;
        b = 0;
        e = 0x7fffffff;
        d = 0x7fffffff;
    }

    private d(StandOutWindow standoutwindow, int i, int j, int k)
    {
        this(standoutwindow, i);
        width = j;
        height = k;
    }

    public height(StandOutWindow standoutwindow, int i, int j, int k, int l, int i1)
    {
        this(standoutwindow, i, j, k);
        if (l != 0x80000001)
        {
            x = l;
        }
        if (i1 != 0x80000001)
        {
            y = i1;
        }
        standoutwindow = standoutwindow.mWindowManager.getDefaultDisplay();
        i = standoutwindow.getWidth();
        l = standoutwindow.getHeight();
        if (x != 0x7fffffff) goto _L2; else goto _L1
_L1:
        x = i - j;
_L8:
        if (y != 0x7fffffff) goto _L4; else goto _L3
_L3:
        y = l - k;
_L6:
        return;
_L2:
        if (x == 0x80000000)
        {
            x = (i - j) / 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (y != 0x80000000) goto _L6; else goto _L5
_L5:
        y = (l - k) / 2;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
