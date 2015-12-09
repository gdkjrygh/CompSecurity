// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import a.a.bz;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.ui.a.d;
import com.appboy.ui.r;
import com.appboy.ui.s;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.appboy.ui.widget:
//            d, e

public abstract class c extends RelativeLayout
    implements Observer
{

    private static final String d;
    private static Boolean e;
    protected final Context a;
    protected com.appboy.d.a.c b;
    protected ImageSwitcher c;

    public c(Context context)
    {
        super(context);
        a = context;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(a(), this);
        c = (ImageSwitcher)findViewById(s.T);
        if (c != null)
        {
            c.setFactory(new com.appboy.ui.widget.d(this));
        }
        if (e == null)
        {
            int i = a.getResources().getIdentifier("com_appboy_newsfeed_unread_visual_indicator_on", "bool", com.appboy.f.c.a(context));
            if (i != 0)
            {
                e = Boolean.valueOf(context.getResources().getBoolean(i));
            } else
            {
                e = Boolean.valueOf(true);
            }
        }
        if (!e.booleanValue() && c != null)
        {
            c.setVisibility(8);
        }
    }

    protected static void a(Context context, com.appboy.d.a.c c1, d d1, String s1)
    {
        c1.n();
        if (d1 != null)
        {
            com.appboy.f.a.a(s1, String.format("Logged click for card %s", new Object[] {
                c1.j()
            }));
            c1.i();
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

    static void a(TextView textview, String s1)
    {
        if (s1 != null && !s1.trim().equals(""))
        {
            textview.setText(s1);
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setText("");
            textview.setVisibility(8);
            return;
        }
    }

    private void b()
    {
        if (b != null)
        {
            if (c != null)
            {
                int i;
                if (b.m())
                {
                    i = r.e;
                } else
                {
                    i = r.f;
                }
                c.setImageResource(i);
                c.setTag(String.valueOf(i));
                return;
            } else
            {
                com.appboy.f.a.a(d, "The imageSwitcher for the read/unread feature is null. Did you include it in your xml?");
                return;
            }
        } else
        {
            com.appboy.f.a.a(d, "The card is null.");
            return;
        }
    }

    protected abstract int a();

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

    final void a(ImageView imageview, String s1)
    {
        a(imageview, s1, 1.0F, true);
    }

    final void a(ImageView imageview, String s1, float f1, boolean flag)
    {
        if (s1 == null)
        {
            com.appboy.f.a.c(d, "The image url to render is null. Not setting the card image.");
        } else
        {
            if (f1 == 0.0F)
            {
                com.appboy.f.a.c(d, "The image aspect ratio is 0. Not setting the card image.");
                return;
            }
            if (!s1.equals(imageview.getTag()))
            {
                if (f1 != 1.0F)
                {
                    ViewTreeObserver viewtreeobserver = imageview.getViewTreeObserver();
                    if (viewtreeobserver.isAlive())
                    {
                        viewtreeobserver.addOnGlobalLayoutListener(new e(this, imageview, f1));
                    }
                }
                imageview.setImageResource(0x106000d);
                imageview.post(new bz(com.appboy.a.a(getContext()), s1, imageview, flag));
                imageview.setTag(s1);
                return;
            }
        }
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
        d = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/widget/c.getName()
        });
    }
}
