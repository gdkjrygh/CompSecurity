// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import CE;
import Fe;
import Fj;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.snapchat.android.model.chat.ChatMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.snapchat.android.ui:
//            SnapchatResource

public class ImageResourceView extends ImageView
    implements Fj, SnapchatResource.a
{

    private static int h = -1;
    private AtomicBoolean a;
    public final List b;
    protected Fe c;
    protected int d;
    protected int e;
    protected SnapchatResource.ResourceStatus f;
    private AtomicBoolean g;
    private int i;

    public ImageResourceView(Context context)
    {
        super(context);
        b = new ArrayList();
        a = new AtomicBoolean(false);
        g = new AtomicBoolean(false);
        f = SnapchatResource.ResourceStatus.NOT_LOADED;
        if (h == -1)
        {
            h = getResources().getDimensionPixelSize(0x7f0a0144);
        }
        i = 255;
    }

    public ImageResourceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList();
        a = new AtomicBoolean(false);
        g = new AtomicBoolean(false);
        f = SnapchatResource.ResourceStatus.NOT_LOADED;
        if (h == -1)
        {
            h = getResources().getDimensionPixelSize(0x7f0a0144);
        }
        i = 255;
    }

    public ImageResourceView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new ArrayList();
        a = new AtomicBoolean(false);
        g = new AtomicBoolean(false);
        f = SnapchatResource.ResourceStatus.NOT_LOADED;
        if (h == -1)
        {
            h = getResources().getDimensionPixelSize(0x7f0a0144);
        }
        i = 255;
    }

    private void g()
    {
label0:
        {
            setImageDrawable(null);
            if (c != null)
            {
                if (c.c() == SnapchatResource.ResourceStatus.LOADING)
                {
                    break label0;
                }
                c.b = null;
                c = null;
            }
            return;
        }
        CE.a();
        CE.a(c.a());
    }

    public final void a()
    {
        if (c != null)
        {
            c.a(getContext());
        }
    }

    public void a(SnapchatResource.ResourceStatus resourcestatus)
    {
        f = resourcestatus;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((SnapchatResource.a)iterator.next()).a(resourcestatus)) { }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SnapchatResource.ResourceStatus.values().length];
                try
                {
                    a[SnapchatResource.ResourceStatus.LOADED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1.a[resourcestatus.ordinal()];
        JVM INSTR tableswitch 1 1: default 68
    //                   1 87;
           goto _L1 _L2
_L1:
        setImageResource(0x7f020045);
        getDrawable().setAlpha(0);
        invalidate();
        return;
_L2:
        if (c != null)
        {
            a.set(false);
            if (!g.get())
            {
                g();
                return;
            }
            resourcestatus = c.a(getContext());
            if (resourcestatus != null)
            {
                setImageBitmap(resourcestatus);
                getDrawable().setAlpha(i);
                return;
            }
            c.a(SnapchatResource.ResourceStatus.LOADING_FAILED);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return c != null && c.c() != SnapchatResource.ResourceStatus.LOADED && c.c() != SnapchatResource.ResourceStatus.LOADING;
    }

    public final boolean c()
    {
        return c != null && c.c() == SnapchatResource.ResourceStatus.LOADING;
    }

    public final boolean d()
    {
        return c != null && c.c() == SnapchatResource.ResourceStatus.LOADED;
    }

    public final boolean e()
    {
        return c == null || c.c() == SnapchatResource.ResourceStatus.LOADING_FAILED || c.c() == SnapchatResource.ResourceStatus.NOT_LOADED;
    }

    public final void f()
    {
        g.set(false);
        if (a.get())
        {
            return;
        } else
        {
            g();
            return;
        }
    }

    public void setChatMedia(ChatMedia chatmedia)
    {
        setChatMedia(chatmedia, null);
    }

    public void setChatMedia(ChatMedia chatmedia, SnapchatResource.a a1)
    {
label0:
        {
            g.set(true);
            if (chatmedia != null)
            {
                if (c != null && !TextUtils.equals(c.a(), chatmedia.d()))
                {
                    c.b = null;
                    b.clear();
                    c = null;
                }
                if (a1 != null)
                {
                    b.add(a1);
                }
                if (c == null || !TextUtils.equals(c.a(), chatmedia.d()))
                {
                    a.set(true);
                    c = new Fe(chatmedia, this);
                    c.a(getContext());
                }
                d = chatmedia.J();
                e = chatmedia.K();
                if (!chatmedia.Q() && !chatmedia.R())
                {
                    break label0;
                }
                i = 102;
            }
            return;
        }
        if (c.c() == SnapchatResource.ResourceStatus.LOADED && i != 255)
        {
            getDrawable().setAlpha(255);
        }
        i = 255;
    }

}
