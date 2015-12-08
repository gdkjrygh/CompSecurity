// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Button;

public final class djc
{

    private final Context a;
    private final djj b;

    djc(Context context, djj djj1)
    {
        a = context;
        b = djj1;
    }

    private void a(Button button, int i, int j)
    {
        b.c = j;
        b.d = button;
        b.e = i;
    }

    public final djb a()
    {
        return a(null, 0);
    }

    public final djb a(Button button, int i)
    {
        a(button, i, 0);
        return new djb(a, b);
    }

    public final djb b()
    {
        return b(null, 0);
    }

    public final djb b(Button button, int i)
    {
        a(button, i, 1);
        return new djb(a, b);
    }
}
