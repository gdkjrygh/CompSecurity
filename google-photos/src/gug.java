// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class gug
{

    public int a;
    public ekq b;
    public ekp c;
    public Uri d;
    public Uri e;
    public byte f[];
    public Uri g;
    public gvl h;
    public boolean i;

    public gug()
    {
        a = -1;
    }

    public final gue a()
    {
        boolean flag1 = true;
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "media must be non-null");
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "collection must be non-null");
        if (!b.c(e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "processedMediaUri must be non-empty");
        if (f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "editListBytes must be non-null");
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "saveStrategy must be non-null");
        if (!b.c(d))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "originalUri must be non-null");
        return new gue(this);
    }

    public final gug a(gue gue1)
    {
        a = gue.a(gue1);
        b = gue.b(gue1);
        c = gue.c(gue1);
        d = gue1.d;
        e = gue1.e;
        f = gue1.f;
        g = gue1.g;
        h = gue1.h;
        return this;
    }
}
