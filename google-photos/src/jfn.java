// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;

public final class jfn extends am
{

    public jfq a;

    public jfn()
    {
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        c(true);
    }

    public void a(boolean flag)
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b(flag);
            a.j();
            return;
        }
    }

    public final boolean a(Uri uri)
    {
        return a != null && a.b.equals(uri);
    }

    public final void aj_()
    {
        super.aj_();
        if (!O_().isChangingConfigurations())
        {
            a(true);
        }
    }
}
