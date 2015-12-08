// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class ha
{

    final Object a;

    public ha()
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            a = new hy(new hc(this));
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new hw(new hb(this, (byte)0));
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
}
