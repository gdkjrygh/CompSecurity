// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jo;
import PI;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.discover.model.ChannelPage;
import dI;
import vA;
import vS;

public class ChannelView extends FrameLayout
{

    public FrameLayout a;
    public ChannelPage b;
    boolean c;
    private final vA d;
    private final vS e;
    private ImageView f;
    private ProgressBar g;
    private PI h;
    private boolean i;
    private String j;

    public ChannelView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = false;
        d = vA.a();
        e = new vS();
        e.d = new wm.a() {

            private ChannelView a;

            public final void a(ImageView imageview, Drawable drawable, Bundle bundle, boolean flag)
            {
                a.a();
            }

            
            {
                a = ChannelView.this;
                super();
            }
        };
        a();
    }

    protected ChannelView(Context context, vS vs, vA va)
    {
        super(context);
        i = false;
        e = vs;
        d = va;
    }

    private boolean a(ChannelPage channelpage)
    {
        if (channelpage != null)
        {
            boolean flag = d.b(channelpage.d);
            if (channelpage.i == 0 || channelpage.f() && flag || !channelpage.j)
            {
                return true;
            }
        }
        return false;
    }

    private void d()
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (b == null || !b.k || j == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (h.c()) goto _L1; else goto _L3
_L3:
        ((TextView)h.a()).setText(j);
        h.a(0);
        return;
        if (!h.c()) goto _L1; else goto _L4
_L4:
        h.a(4);
        return;
    }

    protected final void a()
    {
        if (!b())
        {
            setAlpha(0.5F);
            return;
        } else
        {
            setAlpha(1.0F);
            setProgressBarVisibility(false);
            return;
        }
    }

    public final boolean b()
    {
        return b != null && b.f() && e.c;
    }

    public final void c()
    {
        c = false;
        invalidate();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (!c)
        {
            if (i)
            {
                setAlpha(1.0F);
                setProgressBarVisibility(false);
                super.dispatchDraw(canvas);
                return;
            }
            super.dispatchDraw(canvas);
            if (f != null && b != null)
            {
                e.a(f, b, a(b));
                a();
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        a = (FrameLayout)findViewById(0x7f0d012e);
        f = (ImageView)findViewById(0x7f0d012f);
        g = (ProgressBar)findViewById(0x7f0d0130);
        findViewById(0x7f0d0131);
        h = new PI(this, 0x7f0d0132, 0x7f0d04b7);
        d();
    }

    public void setChannelPage(ChannelPage channelpage)
    {
        boolean flag2 = true;
        if (!i) goto _L2; else goto _L1
_L1:
        b = channelpage;
_L4:
        return;
_L2:
        ChannelPage channelpage1;
        boolean flag;
        channelpage1 = b;
        if (channelpage1 != null || channelpage == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
_L5:
        b = channelpage;
        setTag(channelpage.c);
        d();
        if (flag)
        {
            channelpage = e;
            channelpage.a = null;
            channelpage.b = null;
            channelpage.c = false;
            invalidate();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        dI di = dI.a().a(channelpage1.a, channelpage.a).a(Boolean.valueOf(channelpage1.j), Boolean.valueOf(channelpage.j)).a(Boolean.valueOf(channelpage1.f()), Boolean.valueOf(channelpage.f())).a(Boolean.valueOf(a(channelpage1)), Boolean.valueOf(a(channelpage))).a(channelpage1.g, channelpage.g).a(channelpage1.h, channelpage.h);
        boolean flag1;
        boolean flag3;
        boolean flag4;
        if (channelpage1.i == 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (channelpage.i == 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (di.a(Boolean.valueOf(flag3), Boolean.valueOf(flag4)).b() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag2;
        if (!flag1)
        {
            flag = flag2;
            if (TextUtils.equals(channelpage1.h(), channelpage.h()))
            {
                flag = flag2;
                if (TextUtils.equals(channelpage1.i(), channelpage.i()))
                {
                    flag = flag2;
                    if (TextUtils.equals(channelpage1.j(), channelpage.j()))
                    {
                        flag = flag2;
                        if (TextUtils.equals(channelpage1.g(), channelpage.g()))
                        {
                            flag = false;
                        }
                    }
                }
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setIsFromDeepLinkNotification(boolean flag)
    {
        i = flag;
    }

    public void setProgressBarVisibility(boolean flag)
    {
        if (flag)
        {
            Jo.a(g, 0);
            return;
        } else
        {
            Jo.a(g, 4);
            return;
        }
    }

    public void setSponsoredText(String s)
    {
        j = s;
    }
}
