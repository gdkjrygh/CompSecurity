// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;

public final class nuk
{

    public String a;
    String b;
    public Collection c;
    public int d;
    private final Context e;
    private final int f;

    public nuk(Context context, int i)
    {
        e = context;
        f = i;
    }

    public final nuj a()
    {
        p.b(TextUtils.isEmpty(a) ^ TextUtils.isEmpty(b), "Exactly one of albumMediaKey or albumTitle must be set.");
        p.a(c);
        boolean flag;
        if (!c.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "mediaKeys cannot be empty.");
        return new nuj(e, f, null, a, b, c, null, d);
    }
}
