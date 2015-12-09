// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public abstract class fl
{

    final Object a;

    public fl()
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            a = new gg(new fn(this, (byte)0));
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new gd(new fm(this, (byte)0));
            return;
        } else
        {
            a = null;
            return;
        }
    }

    public void a()
    {
    }

    public boolean a(Intent intent)
    {
        return false;
    }

    public void b()
    {
    }

    public void c()
    {
    }

    public void d()
    {
    }
}
