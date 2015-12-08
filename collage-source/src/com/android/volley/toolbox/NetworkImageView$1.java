// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.r;

// Referenced classes of package com.android.volley.toolbox:
//            NetworkImageView

class a
    implements a
{

    final boolean a;
    final NetworkImageView b;

    public void a(r r)
    {
        if (NetworkImageView.a(b) != 0)
        {
            b.setImageResource(NetworkImageView.a(b));
        }
    }

    public void a(b b1, boolean flag)
    {
        if (flag && a)
        {
            b.post(new Runnable(b1) {

                final h.c a;
                final NetworkImageView._cls1 b;

                public void run()
                {
                    b.a(a, false);
                }

            
            {
                b = NetworkImageView._cls1.this;
                a = c;
                super();
            }
            });
        } else
        {
            if (b1.a() != null)
            {
                b.setImageBitmap(b1.tImageBitmap());
                return;
            }
            if (NetworkImageView.b(b) != 0)
            {
                b.setImageResource(NetworkImageView.b(b));
                return;
            }
        }
    }

    _cls1.a(NetworkImageView networkimageview, boolean flag)
    {
        b = networkimageview;
        a = flag;
        super();
    }
}
