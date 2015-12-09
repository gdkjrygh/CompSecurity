// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gdk
{

    public boolean a;
    public int b;
    public int c;
    private gdl d;

    public gdk(gdl gdl1, int i)
    {
        this(gdl1, i, (byte)0);
    }

    private gdk(gdl gdl1, int i, byte byte0)
    {
        d = gdl1;
        b = i;
        a = false;
    }

    public final void a(Context context)
    {
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        d.a(context, this);
    }
}
