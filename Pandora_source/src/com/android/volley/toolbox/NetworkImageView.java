// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import p.k.s;

// Referenced classes of package com.android.volley.toolbox:
//            h

public class NetworkImageView extends ImageView
{

    private String a;
    private int b;
    private int c;
    private h d;
    private h.c e;

    public NetworkImageView(Context context)
    {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static int a(NetworkImageView networkimageview)
    {
        return networkimageview.c;
    }

    private void a()
    {
        if (b != 0)
        {
            setImageResource(b);
            return;
        } else
        {
            setImageBitmap(null);
            return;
        }
    }

    static int b(NetworkImageView networkimageview)
    {
        return networkimageview.b;
    }

    void a(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        int l = getWidth();
        int k = getHeight();
        int i;
        int j;
        if (getLayoutParams() != null)
        {
            if (getLayoutParams().width == -2)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (getLayoutParams().height == -2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
        } else
        {
            i = 0;
            j = 0;
        }
        if (j == 0 || i == 0)
        {
            flag1 = false;
        }
        if (l != 0 || k != 0 || flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (TextUtils.isEmpty(a))
        {
            if (e != null)
            {
                e.a();
                e = null;
            }
            a();
            return;
        }
        if (e == null || e.c() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (e.c().equals(a))
        {
            continue; /* Loop/switch isn't completed */
        }
        e.a();
        a();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        if (j != 0)
        {
            j = 0;
        } else
        {
            j = l;
        }
        if (i != 0)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = k;
        }
        e = d.a(a, new h.d(flag) {

            final boolean a;
            final NetworkImageView b;

            public void a(h.c c1, boolean flag3)
            {
                if (flag3 && a)
                {
                    b.post(new Runnable(this, c1) {

                        final h.c a;
                        final _cls1 b;

                        public void run()
                        {
                            b.a(a, false);
                        }

            
            {
                b = _pcls1;
                a = c1;
                super();
            }
                    });
                } else
                {
                    if (c1.b() != null)
                    {
                        b.setImageBitmap(c1.b());
                        return;
                    }
                    if (NetworkImageView.b(b) != 0)
                    {
                        b.setImageResource(NetworkImageView.b(b));
                        return;
                    }
                }
            }

            public void a(s s)
            {
                if (NetworkImageView.a(b) != 0)
                {
                    b.setImageResource(NetworkImageView.a(b));
                }
            }

            
            {
                b = NetworkImageView.this;
                a = flag;
                super();
            }
        }, j, i);
        return;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    protected void onDetachedFromWindow()
    {
        if (e != null)
        {
            e.a();
            setImageBitmap(null);
            e = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        a(true);
    }

    public void setDefaultImageResId(int i)
    {
        b = i;
    }

    public void setErrorImageResId(int i)
    {
        c = i;
    }
}
