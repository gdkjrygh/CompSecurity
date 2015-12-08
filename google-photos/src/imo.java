// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class imo
{

    public boolean a;
    public boolean b;
    private Uri c;
    private boolean d;

    public imo()
    {
    }

    public final imn a()
    {
        return new imn(c, d, a, b);
    }

    public final imo a(Uri uri)
    {
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "fileUri must not be empty.");
        c = uri;
        d = true;
        return this;
    }
}
