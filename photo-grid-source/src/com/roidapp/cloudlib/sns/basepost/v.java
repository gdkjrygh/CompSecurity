// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.text.TextPaint;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            g

public class v extends g
{

    private boolean d;
    private long e;
    private int f;

    public v(int i, int j, long l, int k)
    {
        e = l;
        d = true;
        f = k;
        b = i;
        c = j;
    }

    public final int a()
    {
        return f;
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
