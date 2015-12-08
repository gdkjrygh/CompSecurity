// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.a;
import com.appboy.d;
import com.appboy.ui.d.b;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.appboy.ui.widget:
//            d, e

public abstract class c extends RelativeLayout
    implements Observer
{

    private static final String e;
    private static Boolean f;
    protected final Context a;
    protected com.appboy.d.a.c b;
    protected ImageSwitcher c;
    final boolean d;

    public c(Context context)
    {
        super(context);
        d = com.appboy.ui.d.b.a(context);
        a = context;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(a(), this);
        c = (ImageSwitcher)findViewById(com.appboy.ui.n.c.com_appboy_newsfeed_item_read_indicator_image_switcher);
        if (c != null)
        {
            c.setFactory(new com.appboy.ui.widget.d(this));
        }
        if (f == null)
        {
            int i = a.getResources().getIdentifier("com_appboy_newsfeed_unread_visual_indicator_on", "bool", com.appboy.f.c.a(context));
            if (i != 0)
            {
                f = Boolean.valueOf(context.getResources().getBoolean(i));
            } else
            {
                f = Boolean.valueOf(true);
            }
        }
        if (!f.booleanValue() && c != null)
        {
            c.setVisibility(8);
        }
    }

    protected static void a(Context context, com.appboy.d.a.c c1, com.appboy.ui.a.d d1)
    {
        c1.g();
        if (d1 != null)
        {
            String.format("Logged click for card %s", new Object[] {
                c1.c()
            });
            c1.b();
            d1.a(context);
        }
    }

    public static void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    static void a(TextView textview, String s)
    {
        if (s != null && !s.trim().equals(""))
        {
            textview.setText(s);
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setText("");
            textview.setVisibility(8);
            return;
        }
    }

    static void a(SimpleDraweeView simpledraweeview, String s, float f1, boolean flag)
    {
        if (s == null)
        {
            return;
        } else
        {
            com.appboy.ui.d.b.a(simpledraweeview, s, f1, flag);
            return;
        }
    }

    private void b()
    {
        if (b != null && c != null)
        {
            int i;
            if (b.f())
            {
                i = com.appboy.ui.n.b.icon_read;
            } else
            {
                i = com.appboy.ui.n.b.icon_unread;
            }
            c.setImageResource(i);
            c.setTag(String.valueOf(i));
        }
    }

    protected abstract int a();

    final View a(int i)
    {
        ((ViewStub)findViewById(i)).inflate();
        if (d)
        {
            return findViewById(com.appboy.ui.n.c.com_appboy_stubbed_feed_drawee_view);
        } else
        {
            return findViewById(com.appboy.ui.n.c.com_appboy_stubbed_feed_image_view);
        }
    }

    final void a(Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            setBackgroundDrawable(drawable);
            return;
        } else
        {
            setBackground(drawable);
            return;
        }
    }

    final void a(ImageView imageview, String s)
    {
        a(imageview, s, 1.0F, true);
    }

    final void a(ImageView imageview, String s, float f1, boolean flag)
    {
        while (s == null || f1 == 0.0F || s.equals(imageview.getTag())) 
        {
            return;
        }
        if (f1 != 1.0F)
        {
            ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.addOnGlobalLayoutListener(new e(this, imageview, f1));
            }
        }
        imageview.setImageResource(0x106000d);
        imageview.post(new bo.app.d(com.appboy.a.a(getContext()), s, imageview, flag));
        imageview.setTag(s);
    }

    protected abstract void a(com.appboy.d.a.c c1);

    public final void b(com.appboy.d.a.c c1)
    {
        b = c1;
        a(c1);
        c1.addObserver(this);
        b();
    }

    public void update(Observable observable, Object obj)
    {
        b();
    }

    static 
    {
        e = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/widget/c.getName()
        });
    }
}
