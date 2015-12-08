// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.content.Context;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ao

public class a extends VideoView
{

    public boolean a;
    final ao b;
    private int c;
    private int d;

    public void a()
    {
        c = 0;
        d = 0;
    }

    public void a(int i, int j)
    {
        c = i;
        d = j;
    }

    public int getId()
    {
        return 48879;
    }

    protected void onMeasure(int i, int j)
    {
        if (c == 0 || d == 0)
        {
            super.onMeasure(i, j);
            return;
        } else
        {
            setMeasuredDimension(c, d);
            return;
        }
    }

    (ao ao1, Context context)
    {
        b = ao1;
        super(context);
        c = 0;
        d = 0;
        a = false;
    }
}
