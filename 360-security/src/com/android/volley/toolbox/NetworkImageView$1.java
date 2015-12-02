// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            NetworkImageView

class b
    implements b
{

    final NetworkImageView a;
    private final boolean b;

    public void a(VolleyError volleyerror)
    {
        if (NetworkImageView.a(a) != 0)
        {
            a.setImageResource(NetworkImageView.a(a));
        }
    }

    public void a(a a1, boolean flag)
    {
        if (flag && b)
        {
            a.post(new Runnable(a1) {

                final NetworkImageView._cls1 a;
                private final g.c b;

                public void run()
                {
                    a.a(b, false);
                }

            
            {
                a = NetworkImageView._cls1.this;
                b = c;
                super();
            }
            });
        } else
        {
            if (a1.b() != null)
            {
                a.setImageBitmap(a1.tImageBitmap());
                return;
            }
            if (NetworkImageView.b(a) != 0)
            {
                a.setImageResource(NetworkImageView.b(a));
                return;
            }
        }
    }

    _cls1.b(NetworkImageView networkimageview, boolean flag)
    {
        a = networkimageview;
        b = flag;
        super();
    }
}
