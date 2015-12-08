// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class guo
{

    public long a;
    public Uri b;
    public String c;
    public Uri d;
    public String e;
    public gup f;
    public byte g[];
    guq h;

    public guo()
    {
        d = null;
        e = null;
        f = gup.a;
        h = guq.a;
    }

    public final gum a()
    {
        boolean flag1 = true;
        boolean flag;
        if (!b.c(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set non-empty originalUri");
        if (!TextUtils.isEmpty(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set originalFingerprint");
        if (f != gup.a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set editorApplication");
        return new gum(this);
    }

    public final guo a(gum gum1)
    {
        a = gum1.a;
        b = gum1.b;
        c = gum1.c;
        d = gum1.d;
        e = gum1.e;
        f = gum1.f;
        g = gum1.g;
        h = gum1.h;
        return this;
    }
}
