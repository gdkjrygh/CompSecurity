// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.unveil.env.af;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            b, f, c, d

public class DebugView extends View
{

    public final ArrayList a = new ArrayList();
    private final af b = new af();
    private f c;

    public DebugView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)iterator.next()).a(canvas)) { }
        break MISSING_BLOCK_LABEL_42;
        canvas;
        throw canvas;
        if (c == null) goto _L2; else goto _L1
_L1:
        f f1 = c;
        if (f1.b < 0) goto _L2; else goto _L3
_L3:
        List list;
        int j;
        list = f1.a();
        j = list.size();
        int i = 0;
_L22:
        if (i >= list.size()) goto _L5; else goto _L4
_L4:
        Vector vector;
        c c2;
        boolean flag;
        int k;
        int l;
        int j1;
        if (f1.b == j || i == f1.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        synchronized ((c)list.get(i))
        {
            c1.b(canvas);
        }
          goto _L7
        canvas;
        c1;
        JVM INSTR monitorexit ;
        throw canvas;
_L5:
        if (f1.b == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = canvas.getClipBounds().bottom;
        j = 0;
_L21:
        if (j >= list.size()) goto _L2; else goto _L8
_L8:
        c2 = (c)list.get(j);
        if (flag) goto _L10; else goto _L9
_L9:
        if (j != f1.b) goto _L11; else goto _L10
_L19:
        if (k == 0) goto _L13; else goto _L12
_L12:
        c2;
        JVM INSTR monitorenter ;
        vector = c2.g();
        c2;
        JVM INSTR monitorexit ;
_L20:
        j1 = canvas.getWidth();
        if (!flag) goto _L15; else goto _L14
_L14:
        i = Math.min(2, vector.size());
        break MISSING_BLOCK_LABEL_608;
_L23:
        if (k != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = (i1 + i) * 20 + 28;
        i1 = l - k1;
        f1.c.setColor(0xff000000);
        f1.c.setAlpha(100);
        canvas.drawRect(new Rect(0, i1, j1 + 0, k1 + i1), f1.c);
        f1.c.setAlpha(255);
        f1.c.setAntiAlias(true);
        obj = f1.c;
        if (k != 0)
        {
            l = 0xff00ffff;
        } else
        {
            l = 0xff0000ff;
        }
        ((Paint) (obj)).setColor(l);
        f1.c.setTextSize(20F);
        l = i1 + 24;
        obj = c2.getClass().getSimpleName();
        if (((String) (obj)).length() <= 0)
        {
            obj = "<anonymous>";
        }
        canvas.drawText(((String) (obj)), 0.0F, l, f1.c);
        if (k == 0) goto _L17; else goto _L16
_L16:
        f1.c.setColor(-1);
        f1.c.setTextSize(16F);
        l += 20;
        canvas.drawText(c2.b.toString(), 0.0F, l, f1.c);
        k = 0;
_L18:
        if (k >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        l += 20;
        canvas.drawText((String)vector.get(k), 0.0F, l, f1.c);
        k++;
        if (true) goto _L18; else goto _L17
_L11:
        k = 0;
          goto _L19
        canvas;
        c2;
        JVM INSTR monitorexit ;
        throw canvas;
_L13:
        vector = f1.d;
          goto _L20
_L15:
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_619;
        }
        i = vector.size();
        break MISSING_BLOCK_LABEL_608;
_L17:
        j++;
        l = i1;
          goto _L21
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        i++;
          goto _L22
_L10:
        k = 1;
          goto _L19
        i = 0;
          goto _L23
    }

    public void setCallback(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        c = f1;
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }
}
