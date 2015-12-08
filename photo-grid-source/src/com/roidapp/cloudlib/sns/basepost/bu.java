// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.text.TextPaint;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            g

public class bu extends g
{

    private boolean d;
    private String e;

    public bu(String s, int i, int j, boolean flag)
    {
        d = flag;
        d = flag;
        e = s;
        b = i;
        c = j;
    }

    public final String a()
    {
        return e;
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
