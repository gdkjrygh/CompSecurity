// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kik.a.d.a.a;
import kik.a.h.e;
import kik.android.chat.KikApplication;
import kik.android.chat.b.b;
import kik.android.chat.b.d;
import kik.android.f.a.f;
import kik.android.gifs.view.GifView;
import kik.android.widget.ClampedContentPreviewView;
import kik.android.widget.MaskedFramelayout;
import kik.android.widget.c;

// Referenced classes of package kik.android.util:
//            cv, ae, aa, cq

public final class ac
{
    public static final class a
    {

        private final View a;
        private final View b;
        private final boolean c;
        private final String d;

        public final boolean a()
        {
            return c;
        }

        public final String b()
        {
            return d;
        }

        public final View c()
        {
            return a;
        }

        private a(View view, View view1, boolean flag, String s)
        {
            b = view;
            c = flag;
            d = s;
            a = view1;
        }

        a(View view, View view1, boolean flag, String s, byte byte0)
        {
            this(view, view1, flag, s);
        }
    }


    public static final cv.d a = new cv.d(KikApplication.e(0x7f0c0021));
    public static final cv.d b = new cv.d(0);

    private static TextView a(String s, View view, boolean flag)
    {
        view = (TextView)view.findViewById(0x7f0e00e5);
        kik.android.util.cv.b(new View[] {
            view
        });
        kik.android.util.cv.a(view);
        view.setText(s);
        if (flag)
        {
            kik.android.util.cv.a(view, a);
        }
        return view;
    }

    public static a a(Context context, ViewGroup viewgroup, kik.a.d.a.a a1)
    {
label0:
        {
            View view = LayoutInflater.from(context).inflate(0x7f030032, viewgroup, true);
            ImageView imageview = (ImageView)view.findViewById(0x7f0e00dd);
            if (a1.a("png-preview") == null)
            {
                a1 = a1.a("preview");
            } else
            {
                a1 = a1.a("png-preview");
            }
            if (a1 != null)
            {
                a1 = e.a().a(a1);
                if (a1 == null)
                {
                    break label0;
                }
                imageview.setImageBitmap(BitmapFactory.decodeByteArray(a1, 0, a1.length));
            }
            return new a(view, viewgroup.findViewById(0x7f0e00d7), true, null, (byte)0);
        }
        return new a(null, null, false, context.getString(0x7f090175), (byte)0);
    }

    public static a a(Context context, ViewGroup viewgroup, kik.a.d.a.a a1, d d1)
    {
        View view = LayoutInflater.from(context).inflate(0x7f030035, viewgroup, true);
        Object obj;
        MaskedFramelayout maskedframelayout;
        View view1;
        String s;
        if (kik.android.util.ae.a(a1) == null)
        {
            obj = "";
        } else
        {
            obj = kik.android.util.ae.a(a1);
        }
        maskedframelayout = (MaskedFramelayout)viewgroup.findViewById(0x7f0e00d7);
        maskedframelayout.a(0x7f020030);
        view1 = maskedframelayout.findViewById(0x7f0e00e3);
        viewgroup = (TextView)maskedframelayout.findViewById(0x7f0e00de);
        s = a1.g("title");
        if (s != null)
        {
            viewgroup.setVisibility(0);
            viewgroup.setMaxLines(2);
            viewgroup.setText(s.trim());
        } else
        {
            viewgroup.setVisibility(8);
        }
        obj = a(((String) (obj)), ((View) (maskedframelayout)), false);
        if (kik.android.util.ae.b(a1))
        {
            viewgroup.setTextColor(-1);
            ((TextView) (obj)).setTextColor(-1);
        } else
        {
            kik.android.chat.b.c.a(viewgroup, d1.d());
            kik.android.chat.b.c.a(((TextView) (obj)), d1.d());
            kik.android.util.cv.e(new View[] {
                viewgroup
            });
        }
        obj = (ClampedContentPreviewView)maskedframelayout.findViewById(0x7f0e00dd);
        if (a1.a("png-preview") == null)
        {
            viewgroup = a1.a("preview");
        } else
        {
            viewgroup = a1.a("png-preview");
        }
        if (viewgroup != null)
        {
            viewgroup = e.a().a(viewgroup);
            if (viewgroup != null)
            {
                context = BitmapFactory.decodeByteArray(viewgroup, 0, viewgroup.length);
                viewgroup = new c(context, kik.android.widget.c.a.c);
                viewgroup.b();
                if (kik.android.util.ae.b(a1) && kik.android.util.aa.a(context))
                {
                    viewgroup.b(KikApplication.e(0x7f0c0020));
                    view1.setBackgroundResource(0x7f02009d);
                }
                ((ClampedContentPreviewView) (obj)).b(viewgroup);
                if (!kik.android.util.ae.b(a1))
                {
                    kik.android.util.cv.a(view1, ((View) (obj)));
                    kik.android.util.cv.b(view1, -2);
                    kik.android.chat.b.c.a(view1, d1.d());
                    view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(view1.getResources().getDisplayMetrics().widthPixels, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(view1.getResources().getDisplayMetrics().heightPixels, 0x80000000));
                    int i = KikApplication.d(0x7f0d0008) - view1.getMeasuredHeight();
                    ((ClampedContentPreviewView) (obj)).setMaxHeight(i);
                    ((ClampedContentPreviewView) (obj)).setMinimumHeight(i);
                }
                a(((View) (maskedframelayout)), f.d(a1));
                a(a1, ((View) (maskedframelayout)));
                return new a(view, maskedframelayout, true, null, (byte)0);
            } else
            {
                return new a(null, null, false, context.getString(0x7f090175), (byte)0);
            }
        } else
        {
            return new a(null, null, false, context.getString(0x7f090175), (byte)0);
        }
    }

    private static void a(View view, boolean flag)
    {
        if (view != null)
        {
            if ((view = (ImageView)view.findViewById(0x7f0e008c)) != null)
            {
                if (flag)
                {
                    kik.android.util.cv.b(new View[] {
                        view
                    });
                    return;
                } else
                {
                    kik.android.util.cv.e(new View[] {
                        view
                    });
                    return;
                }
            }
        }
    }

    private static void a(kik.a.d.a.a a1, View view)
    {
        a1 = (kik.a.d.d)a1.a("icon");
        view = (ImageView)view.findViewById(0x7f0e00e4);
        if (a1 != null)
        {
            a1 = e.a().a(a1);
            if (a1 != null)
            {
                view.setImageBitmap(BitmapFactory.decodeByteArray(a1, 0, a1.length));
            }
            return;
        } else
        {
            view.setImageBitmap(null);
            return;
        }
    }

    public static a b(Context context, ViewGroup viewgroup, kik.a.d.a.a a1)
    {
        Object obj;
        View view;
        MaskedFramelayout maskedframelayout;
        if (kik.android.util.ae.a(a1) == null)
        {
            obj = "";
        } else
        {
            obj = kik.android.util.ae.a(a1);
        }
        view = LayoutInflater.from(context).inflate(0x7f030033, viewgroup, true);
        maskedframelayout = (MaskedFramelayout)viewgroup.findViewById(0x7f0e00d7);
        maskedframelayout.a(0x7f020030);
        a(((String) (obj)), maskedframelayout, true);
        obj = (ClampedContentPreviewView)maskedframelayout.findViewById(0x7f0e00dd);
        if (a1.a("png-preview") == null)
        {
            viewgroup = a1.a("preview");
        } else
        {
            viewgroup = a1.a("png-preview");
        }
        if (viewgroup != null)
        {
            viewgroup = e.a().a(viewgroup);
            if (viewgroup != null)
            {
                context = new android.graphics.BitmapFactory.Options();
                context.inPurgeable = true;
                context = BitmapFactory.decodeByteArray(viewgroup, 0, viewgroup.length, context);
                viewgroup = new c(context, kik.android.widget.c.a.c);
                if (kik.android.util.aa.a(context))
                {
                    viewgroup.b(KikApplication.e(0x7f0c0020));
                    maskedframelayout.findViewById(0x7f0e00e0).setBackgroundResource(0x7f02009d);
                }
                ((ClampedContentPreviewView) (obj)).b(viewgroup);
                a(maskedframelayout, f.d(a1));
                a(a1, maskedframelayout);
                return new a(view, maskedframelayout, true, null, (byte)0);
            } else
            {
                return new a(null, null, false, context.getString(0x7f090175), (byte)0);
            }
        } else
        {
            ((ClampedContentPreviewView) (obj)).setVisibility(8);
            return new a(null, null, false, context.getString(0x7f090175), (byte)0);
        }
    }

    public static a b(Context context, ViewGroup viewgroup, kik.a.d.a.a a1, d d1)
    {
        Object obj;
        TextView textview;
        TextView textview1;
        Object obj1;
        String s;
        if (kik.android.util.ae.a(a1) == null)
        {
            obj = "";
        } else
        {
            obj = kik.android.util.ae.a(a1);
        }
        context = LayoutInflater.from(context).inflate(0x7f030030, viewgroup, true);
        viewgroup = viewgroup.findViewById(0x7f0e00d7);
        obj1 = a1.g("title");
        s = a1.g("text");
        textview = (TextView)viewgroup.findViewById(0x7f0e00db);
        textview1 = (TextView)viewgroup.findViewById(0x7f0e00da);
        if (!kik.android.util.cq.c(((String) (obj1))))
        {
            textview1.setText(((String) (obj1)).trim());
        } else
        {
            kik.android.util.cv.e(new View[] {
                textview1
            });
        }
        if (!kik.android.util.cq.c(s))
        {
            textview.setText(s.trim());
        } else
        {
            kik.android.util.cv.e(new View[] {
                textview
            });
        }
        obj1 = (MaskedFramelayout)viewgroup.findViewById(0x7f0e00d9);
        ((MaskedFramelayout) (obj1)).a(0x7f020030);
        kik.android.chat.b.c.a(((View) (obj1)), d1.c());
        obj = a(((String) (obj)), viewgroup, false);
        textview.setTextColor(d1.c().b());
        textview.setLinkTextColor(d1.c().b());
        kik.android.util.cv.a(textview, 165);
        kik.android.util.cv.b(textview, 165);
        kik.android.chat.b.c.a(((TextView) (obj)), d1.c());
        kik.android.chat.b.c.a(textview1, d1.c());
        a(a1, viewgroup);
        return new a(context, viewgroup, true, null, (byte)0);
    }

    public static a c(Context context, ViewGroup viewgroup, kik.a.d.a.a a1)
    {
        View view;
        GifView gifview;
        view = LayoutInflater.from(context).inflate(0x7f030034, viewgroup, true);
        viewgroup = (MaskedFramelayout)viewgroup.findViewById(0x7f0e00d7);
        viewgroup.a(0x7f020030);
        gifview = (GifView)viewgroup.findViewById(0x7f0e00e2);
        context = a1.a("preview");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        context = e.a().a(context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        context = BitmapFactory.decodeByteArray(context, 0, context.length, options);
_L1:
        if (context == null)
        {
            context = null;
        } else
        {
            context = new c(context, kik.android.widget.c.a.c);
        }
        if (context != null)
        {
            gifview.b(context);
        }
        gifview.a(a1.a(kik.a.d.a.a.c.a), kik.android.gifs.a.c);
        return new a(view, viewgroup, true, null, (byte)0);
        context = null;
          goto _L1
    }

    public static a c(Context context, ViewGroup viewgroup, kik.a.d.a.a a1, d d1)
    {
        String s;
        View view;
        View view1;
        TextView textview;
        ClampedContentPreviewView clampedcontentpreviewview;
        String s1;
        if (kik.android.util.ae.a(a1) == null)
        {
            s = "";
        } else
        {
            s = kik.android.util.ae.a(a1);
        }
        view = LayoutInflater.from(context).inflate(0x7f030031, viewgroup, true);
        view1 = viewgroup.findViewById(0x7f0e00d7);
        clampedcontentpreviewview = (ClampedContentPreviewView)viewgroup.findViewById(0x7f0e00dd);
        viewgroup = a1.g("title");
        s1 = a1.g("text");
        textview = (TextView)view1.findViewById(0x7f0e00df);
        if (!kik.android.util.cq.c(viewgroup))
        {
            TextView textview1 = (TextView)view1.findViewById(0x7f0e00de);
            textview1.setText(viewgroup);
            kik.android.util.cv.a(textview1, a);
            clampedcontentpreviewview.b(KikApplication.e(0x7f0c0005));
        }
        if (s1 != null)
        {
            textview.setText(s1.trim());
        }
        if (a1.a("png-preview") == null)
        {
            viewgroup = a1.a("preview");
        } else
        {
            viewgroup = a1.a("png-preview");
        }
        if (viewgroup != null)
        {
            context = e.a().a(viewgroup);
            if (context != null)
            {
                clampedcontentpreviewview.d(BitmapFactory.decodeByteArray(context, 0, context.length));
            }
            clampedcontentpreviewview.setVisibility(0);
            context = (MaskedFramelayout)view1.findViewById(0x7f0e00dc);
            context.a(0x7f020030);
            kik.android.chat.b.c.a(context, d1.c());
            a(s, view1, false).setTextColor(d1.c().b());
            textview.setTextColor(d1.c().b());
            textview.setLinkTextColor(d1.c().b());
            a(a1, view1);
            return new a(view, view1, true, null, (byte)0);
        } else
        {
            return new a(null, null, false, context.getString(0x7f090175), (byte)0);
        }
    }

}
