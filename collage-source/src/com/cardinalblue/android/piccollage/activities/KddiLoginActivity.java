// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.model.j;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            KddiActivity

public class KddiLoginActivity extends KddiActivity
{

    public KddiLoginActivity()
    {
    }

    public void a()
    {
        byte byte0;
        if (j.a(this).c())
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        setResult(byte0);
        finish();
    }

    public void a(String s)
    {
        setResult(0);
        super.a(s);
    }
}
