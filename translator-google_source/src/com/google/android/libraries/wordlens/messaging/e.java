// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.messaging;

import com.google.android.libraries.wordlens.util.f;

// Referenced classes of package com.google.android.libraries.wordlens.messaging:
//            a

public final class e extends a
{

    public float c;
    public boolean d;

    public e(int i, byte abyte0[])
    {
        boolean flag = false;
        super(i, abyte0);
        c = 0.0F;
        d = false;
        c = f.b(super.b);
        if (f.a(super.b, 4) != 0)
        {
            flag = true;
        }
        d = flag;
    }
}
