// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            NetworkImageView

class b
    implements Runnable
{

    final b a;
    private final b b;

    public void run()
    {
        a.a(b, false);
    }

    ( ,  1)
    {
        a = ;
        b = 1;
        super();
    }

    // Unreferenced inner class com/android/volley/toolbox/NetworkImageView$1

/* anonymous class */
    class NetworkImageView._cls1
        implements g.d
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

        public void a(g.c c, boolean flag)
        {
            if (flag && b)
            {
                a.post(new NetworkImageView._cls1._cls1(this, c));
            } else
            {
                if (c.b() != null)
                {
                    a.setImageBitmap(c.b());
                    return;
                }
                if (NetworkImageView.b(a) != 0)
                {
                    a.setImageResource(NetworkImageView.b(a));
                    return;
                }
            }
        }

            
            {
                a = networkimageview;
                b = flag;
                super();
            }
    }

}
