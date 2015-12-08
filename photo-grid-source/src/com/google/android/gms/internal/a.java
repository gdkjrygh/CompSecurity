// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            xm, pl

public final class a extends xm
{

    private Intent b;

    public a()
    {
    }

    public a(pl pl)
    {
        super(pl);
    }

    public final String getMessage()
    {
        if (b != null)
        {
            return "User needs to (re)enter credentials.";
        } else
        {
            return super.getMessage();
        }
    }
}
