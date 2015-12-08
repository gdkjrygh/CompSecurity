// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.auth:
//            a

public class d extends a
{

    private final Intent a;

    public d(String s, Intent intent)
    {
        super(s);
        a = intent;
    }

    public Intent a()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return new Intent(a);
        }
    }
}
