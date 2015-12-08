// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import com.pandora.android.provider.b;
import com.pandora.radio.util.NetworkUtil;
import p.cw.c;

// Referenced classes of package com.pandora.android.data:
//            s, g

public class m extends s
{

    public m(g g)
    {
        super(g);
    }

    private String m()
    {
        if (b.a.b().u().c())
        {
            return "movie_hi.mp4";
        } else
        {
            return "movie_lo.mp4";
        }
    }

    public String d()
    {
        return (new StringBuilder()).append(super.d()).append(m()).toString();
    }

    public boolean h_()
    {
        return true;
    }
}
