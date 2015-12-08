// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.text.TextPaint;
import android.view.View;
import com.roidapp.cloudlib.sns.b.x;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            g

public class av extends g
{

    private long d;
    private x e;
    private boolean f;
    private String g;

    public av(int i, int j, x x1)
    {
        f = true;
        e = x1;
        if (x1 != null)
        {
            d = x1.a;
            g = x1.b;
        }
        b = i;
        c = j;
    }

    public av(int i, int j, String s, boolean flag)
    {
        g = s;
        f = flag;
        b = i;
        c = j;
    }

    public final x a()
    {
        return e;
    }

    public final String b()
    {
        return g;
    }

    public void onClick(View view)
    {
    }

    public void updateDrawState(TextPaint textpaint)
    {
        if (a)
        {
            textpaint.setColor(c);
            return;
        } else
        {
            textpaint.setColor(b);
            return;
        }
    }
}
