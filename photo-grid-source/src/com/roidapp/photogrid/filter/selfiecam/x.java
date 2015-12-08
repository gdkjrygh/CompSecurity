// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.widget.TextView;
import com.roidapp.photogrid.release.hw;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            v

final class x
    implements v
{

    private final TextView a;
    private final String b[] = {
        ".JPG", ".PNG"
    };
    private int c;

    private x(TextView textview)
    {
        a = textview;
    }

    x(TextView textview, byte byte0)
    {
        this(textview);
    }

    public final int a()
    {
        return b.length;
    }

    public final String a(int i)
    {
        return b[i];
    }

    public final int b()
    {
        return c;
    }

    public final void b(int i)
    {
        c = i;
        String s = b[i];
        a.setText(s);
        if (i == 0)
        {
            hw.a(a.getContext(), false);
            return;
        } else
        {
            hw.a(a.getContext(), true);
            return;
        }
    }
}
