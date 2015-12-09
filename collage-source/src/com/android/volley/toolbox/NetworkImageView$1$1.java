// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.r;

// Referenced classes of package com.android.volley.toolbox:
//            NetworkImageView

class a
    implements Runnable
{

    final a a;
    final a b;

    public void run()
    {
        b.b(a, false);
    }

    ( ,  1)
    {
        b = ;
        a = 1;
        super();
    }

    // Unreferenced inner class com/android/volley/toolbox/NetworkImageView$1

/* anonymous class */
    class NetworkImageView._cls1
        implements h.d
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

        public void a(h.c c, boolean flag)
        {
            if (flag && a)
            {
                b.post(new NetworkImageView._cls1._cls1(this, c));
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

            
            {
                b = networkimageview;
                a = flag;
                super();
            }
    }

}
