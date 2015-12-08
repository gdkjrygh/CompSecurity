// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class iup
{

    public String a;
    public dui b;
    private final Intent c;
    private final ekq d;
    private final String e;
    private final int f;

    public iup(Context context, ekq ekq, int i)
    {
        c = a(context);
        d = ekq;
        e = null;
        f = i;
    }

    public iup(Context context, String s, int i)
    {
        c = a(context);
        d = null;
        e = s;
        f = i;
    }

    private static Intent a(Context context)
    {
        return new Intent(context, ((iuq)olm.a(context, iuq)).a());
    }

    public final Intent a()
    {
        c.putExtra("account_id", f);
        if (a != null)
        {
            c.putExtra("auth_key", a);
        }
        if (b != null)
        {
            c.putExtra("card_id", b);
        }
        if (d != null)
        {
            c.putExtra("story_media_collection", d);
        }
        if (e != null)
        {
            c.putExtra("story_media_key", e);
        }
        return c;
    }
}
