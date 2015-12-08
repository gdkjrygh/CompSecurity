// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            in, is, iu

public abstract class il
{

    protected final is He;
    private final String Hf;
    private iu Hg;

    protected il(String s, String s1, String s2)
    {
        in.aF(s);
        Hf = s;
        He = new is(s1);
        if (!TextUtils.isEmpty(s2))
        {
            He.aK(s2);
        }
    }

    public final void a(iu iu1)
    {
        Hg = iu1;
        if (Hg == null)
        {
            fV();
        }
    }

    protected final void a(String s, long l, String s1)
        throws IOException
    {
        He.a("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        Hg.a(Hf, s, l, s1);
    }

    public void aD(String s)
    {
    }

    public void b(long l, int i)
    {
    }

    protected final long fU()
    {
        return Hg.fS();
    }

    public void fV()
    {
    }

    public final String getNamespace()
    {
        return Hf;
    }
}
