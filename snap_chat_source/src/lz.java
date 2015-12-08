// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class lz
{

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public lz(Intent intent)
    {
        a = intent.getIntExtra("level", -1);
        b = intent.getIntExtra("scale", -1);
        c = intent.getIntExtra("voltage", -1);
        d = intent.getIntExtra("plugged", -1);
        intent.getIntExtra("health", -1);
        intent.getIntExtra("status", -1);
        intent.getIntExtra("temperature", -1);
        intent.getStringExtra("technology");
        e = ((float)a / (float)b) * 100F;
    }

    public final boolean a()
    {
        return a != -1 && b != -1 && d != -1;
    }

    public final float b()
    {
        if (!a())
        {
            return -1F;
        } else
        {
            return e;
        }
    }

    public final boolean c()
    {
        return d == 0;
    }

    public final String toString()
    {
        float f = b();
        String s;
        if (c())
        {
            s = "on battery";
        } else
        {
            s = "not on battery";
        }
        return String.format("%.2f%% %s with voltage %d", new Object[] {
            Float.valueOf(f), s, Integer.valueOf(c)
        });
    }
}
