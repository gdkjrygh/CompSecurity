// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.p;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pandora.android.eureka.a;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import java.net.URL;
import p.dd.bh;

public class c extends p
{

    private ImageView a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Drawable f;
    private Drawable g;
    private Context h;
    private boolean i;
    private View j;
    private Uri k;
    private ProgressBar l;
    private bh m;
    private boolean n;

    public c(Context context)
    {
        super(context);
        n = false;
        h = context;
        f = context.getResources().getDrawable(0x7f020231);
        g = context.getResources().getDrawable(0x7f020234);
        b.a.b().b(this);
    }

    static Uri a(c c1)
    {
        return c1.k;
    }

    private void a()
    {
        if (n && m != null)
        {
            aa aa1 = m.b;
            if (aa1 != null)
            {
                if (!m.b.M())
                {
                    c.setText(aa1.s());
                    d.setText((new StringBuilder()).append(aa1.t()).append(" - ").append(aa1.u()).toString());
                } else
                {
                    String s = b.a.h().getString(0x7f08007d);
                    c.setText(s);
                }
                a(Uri.parse(aa1.v()));
            }
        }
    }

    private void a(View view)
    {
        a = (ImageView)view.findViewById(0x7f100166);
        j = view.findViewById(0x7f100165);
        b = (ImageView)view.findViewById(0x7f100167);
        c = (TextView)view.findViewById(0x7f10016a);
        d = (TextView)view.findViewById(0x7f10016b);
        l = (ProgressBar)view.findViewById(0x7f100168);
        e = (TextView)view.findViewById(0x7f10016c);
        n = true;
    }

    private void a(bh bh1)
    {
        aa aa1;
        if (m == null || m.b == null || !m.b.M() || m.a != p.dd.bh.a.b)
        {
            if ((aa1 = bh1.b) != null)
            {
                boolean flag;
                if (m == null || aa1 != null && !aa1.equals(m.b))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                m = bh1;
                if (flag && n)
                {
                    a();
                    return;
                }
            }
        }
    }

    static Context b(c c1)
    {
        return c1.h;
    }

    private void b()
    {
label0:
        {
label1:
            {
label2:
                {
                    static class _cls5
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[p.dd.bh.a.values().length];
                            try
                            {
                                a[p.dd.bh.a.a.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            try
                            {
                                a[p.dd.bh.a.e.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[p.dd.bh.a.b.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[p.dd.bh.a.c.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[p.dd.bh.a.d.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    if (n && m != null)
                    {
                        switch (com.pandora.android.eureka.dialog._cls5.a[m.a.ordinal()])
                        {
                        default:
                            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(m.a).toString());

                        case 3: // '\003'
                            break label2;

                        case 4: // '\004'
                            break label1;

                        case 5: // '\005'
                            break label0;

                        case 1: // '\001'
                        case 2: // '\002'
                            c.setText("");
                            d.setText("");
                            b.setImageDrawable(g);
                            break;
                        }
                    }
                    return;
                }
                b.setImageDrawable(f);
                return;
            }
            b.setImageDrawable(f);
            return;
        }
        b.setImageDrawable(g);
    }

    static boolean c(c c1)
    {
        return c1.i;
    }

    static ImageView d(c c1)
    {
        return c1.a;
    }

    public View a(Bundle bundle)
    {
        bundle = getLayoutInflater().inflate(0x7f040051, null);
        a(((View) (bundle)));
        a();
        b();
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final c a;

            public void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = c.this;
                super();
            }
        });
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final c a;

            public void onClick(View view)
            {
                view = b.a.b().d();
                if (view.m())
                {
                    view.b(p.cw.b.c.a);
                    return;
                } else
                {
                    view.a(p.cw.b.c.a);
                    return;
                }
            }

            
            {
                a = c.this;
                super();
            }
        });
        return bundle;
    }

    public void a(Uri uri)
    {
        if (k != null && k.equals(uri))
        {
            return;
        }
        k = uri;
        if (uri == null)
        {
            uri = BitmapFactory.decodeResource(h.getResources(), 0x7f0200e9);
            a.setImageBitmap(uri);
            return;
        } else
        {
            (new Thread(new Runnable() {

                Bitmap a;
                final c b;

                public void run()
                {
                    try
                    {
                        a = BitmapFactory.decodeStream((new URL(com.pandora.android.eureka.dialog.c.a(b).toString())).openStream());
                    }
                    catch (Exception exception)
                    {
                        a = BitmapFactory.decodeResource(com.pandora.android.eureka.dialog.c.b(b).getResources(), 0x7f0200e9);
                    }
                    if (c.c(b))
                    {
                        return;
                    } else
                    {
                        c.d(b).post(new Runnable(this) {

                            final _cls4 a;

                            public void run()
                            {
                                c.d(a.b).setImageBitmap(a.a);
                            }

            
            {
                a = _pcls4;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                b = c.this;
                super();
                a = null;
            }
            })).start();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((Button)findViewById(0x7f1001b8)).setOnClickListener(new android.view.View.OnClickListener() {

            final c a;

            public void onClick(View view)
            {
                b.a.c().f();
                a.dismiss();
            }

            
            {
                a = c.this;
                super();
            }
        });
        a(false);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        i = true;
    }

    public void onTrackState(bh bh1)
    {
        a(bh1);
        if (n)
        {
            b();
        }
    }
}
