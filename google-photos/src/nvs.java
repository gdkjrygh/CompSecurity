// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class nvs
    implements mfh
{

    volatile boolean a;
    volatile boolean b;

    nvs()
    {
    }

    public final void a(int i, Intent intent)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        a = true;
    }

    public final void c()
    {
        a = true;
    }
}
