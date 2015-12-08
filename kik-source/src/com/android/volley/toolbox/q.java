// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.w;

// Referenced classes of package com.android.volley.toolbox:
//            r, NetworkImageView

final class q
    implements i.d
{

    final boolean a = true;
    final NetworkImageView b;

    q(NetworkImageView networkimageview)
    {
        b = networkimageview;
        super();
    }

    public final void a(i.c c, boolean flag)
    {
        if (flag && a)
        {
            b.post(new r(this, c));
        } else
        {
            if (c.b() != null)
            {
                b.setImageBitmap(c.b());
                return;
            }
            if (NetworkImageView.b(b) != 0)
            {
                b.setImageResource(NetworkImageView.b(b));
                return;
            }
        }
    }

    public final void a(w w)
    {
        if (NetworkImageView.a(b) != 0)
        {
            b.setImageResource(NetworkImageView.a(b));
        }
    }
}
