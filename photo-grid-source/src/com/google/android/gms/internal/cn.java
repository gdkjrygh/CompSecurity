// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            cy, cq

public final class cn
{

    private String a;
    private int b;

    public cn()
    {
        this((String)cy.b.b(), (byte)0);
    }

    public cn(String s)
    {
        this(s, (byte)0);
    }

    private cn(String s, byte byte0)
    {
        b = -1;
        if (TextUtils.isEmpty(s))
        {
            s = (String)cy.b.b();
        }
        a = s;
        b = -1;
    }

    public final String a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }
}
