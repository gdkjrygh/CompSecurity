// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.widget.TextView;
import com.roidapp.photogrid.release.hw;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            v

final class aa
    implements v
{

    private final int a[];
    private final TextView b;
    private int c;

    public aa(int ai[], TextView textview)
    {
        a = ai;
        b = textview;
    }

    public final int a()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.length;
        }
    }

    public final String a(int i)
    {
        return String.valueOf(a[i]).concat("P");
    }

    public final int b()
    {
        return c;
    }

    public final void b(int i)
    {
        c = i;
        String s = a(i);
        b.setText(s);
        hw.a(b.getContext(), a[i]);
    }
}
