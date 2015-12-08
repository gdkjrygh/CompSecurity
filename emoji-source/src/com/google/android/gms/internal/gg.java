// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            gi, gn, gp

public abstract class gg
{

    protected final gn BD;
    private final String BE;
    private gp BF;

    protected gg(String s, String s1, String s2)
    {
        gi.ak(s);
        BE = s;
        BD = new gn(s1);
        if (!TextUtils.isEmpty(s2))
        {
            BD.ap(s2);
        }
    }

    public void a(long l, int i)
    {
    }

    public final void a(gp gp1)
    {
        BF = gp1;
        if (BF == null)
        {
            ee();
        }
    }

    protected final void a(String s, long l, String s1)
        throws IOException
    {
        BD.a("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        BF.a(BE, s, l, s1);
    }

    public void ai(String s)
    {
    }

    protected final long ed()
    {
        return BF.eb();
    }

    public void ee()
    {
    }

    public final String getNamespace()
    {
        return BE;
    }
}
