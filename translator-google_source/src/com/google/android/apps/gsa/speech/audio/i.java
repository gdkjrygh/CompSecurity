// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.util.m;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            b, f, g, h

public class i
    implements b
{

    public final int a;
    public final int b = 16;
    public final boolean c = false;
    public final h d = null;
    public final boolean e = false;
    public final int f = 0;
    public final boolean g = true;
    public final int h = -1;

    public i(int j)
    {
        a = j;
    }

    private int b()
    {
        if (a == 48000)
        {
            return a << 1 << 1;
        } else
        {
            return a << 1 << 3;
        }
    }

    public InputStream a()
    {
        if (m.a >= 16)
        {
            return new f(a, b(), b, c, d, e, f, g);
        } else
        {
            return new g(a, b(), b, c, d, e);
        }
    }
}
