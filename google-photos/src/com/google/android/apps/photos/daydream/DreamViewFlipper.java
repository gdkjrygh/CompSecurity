// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.daydream;

import ame;
import amh;
import aml;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import awl;
import ayt;
import azb;
import azn;
import b;
import eke;
import ekk;
import ekm;
import ekp;
import ekq;
import ekv;
import ekw;
import eky;
import elb;
import elt;
import euv;
import ezp;
import ezq;
import ezr;
import ezs;
import ezt;
import ezu;
import ezw;
import fli;
import java.util.ArrayList;
import java.util.List;
import olm;
import u;

// Referenced classes of package com.google.android.apps.photos.daydream:
//            PhotosDreamService

public class DreamViewFlipper extends FrameLayout
{

    private static final ekw a;
    private static final ekk b = (new ekm()).a(elt).a();
    private ImageView c;
    private ImageView d;
    private ArrayList e;
    private int f;
    private int g;
    private List h;
    private final Handler i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final Runnable m;
    private final Runnable n;
    private azb o;
    private azb p;
    private amh q;
    private ayt r;

    public DreamViewFlipper(Context context)
    {
        super(context);
        i = new Handler();
        m = new ezp(this);
        n = new ezq(this);
        b(context);
    }

    public DreamViewFlipper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new Handler();
        m = new ezp(this);
        n = new ezq(this);
        b(context);
    }

    public DreamViewFlipper(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = new Handler();
        m = new ezp(this);
        n = new ezq(this);
        b(context);
    }

    public static int a(DreamViewFlipper dreamviewflipper, int i1)
    {
        dreamviewflipper.g = 0;
        return 0;
    }

    public static ImageView a(DreamViewFlipper dreamviewflipper, ImageView imageview)
    {
        dreamviewflipper.c = imageview;
        return imageview;
    }

    public static ArrayList a(DreamViewFlipper dreamviewflipper, ArrayList arraylist)
    {
        dreamviewflipper.e = arraylist;
        return arraylist;
    }

    public static List a(DreamViewFlipper dreamviewflipper, ekq ekq1)
    {
        return dreamviewflipper.b(ekq1);
    }

    public static List a(DreamViewFlipper dreamviewflipper, List list)
    {
        dreamviewflipper.h = list;
        return list;
    }

    private void a(ekq ekq1)
    {
        (new ezs(this)).execute(new ekq[] {
            ekq1
        });
    }

    public static boolean a(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.l;
    }

    public static boolean a(DreamViewFlipper dreamviewflipper, boolean flag)
    {
        dreamviewflipper.k = flag;
        return flag;
    }

    public static int b(DreamViewFlipper dreamviewflipper, int i1)
    {
        dreamviewflipper.f = 0;
        return 0;
    }

    public static ImageView b(DreamViewFlipper dreamviewflipper, ImageView imageview)
    {
        dreamviewflipper.d = imageview;
        return imageview;
    }

    private List b(ekq ekq1)
    {
        ekv ekv1 = b.a(getContext(), ekq1);
        try
        {
            ekq1 = (List)ekv1.a(ekq1, a, b).a();
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq1)
        {
            Toast.makeText(getContext(), b.nD, 1).show();
            return new ArrayList();
        }
        return ekq1;
    }

    private void b(Context context)
    {
        q = (amh)olm.a(context, amh);
        r = (ayt)((fli)olm.a(context, fli)).b().b(context);
    }

    public static void b(DreamViewFlipper dreamviewflipper, ekq ekq1)
    {
        dreamviewflipper.a(ekq1);
    }

    public static boolean b(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.j;
    }

    public static boolean b(DreamViewFlipper dreamviewflipper, boolean flag)
    {
        dreamviewflipper.j = true;
        return true;
    }

    public static void c(DreamViewFlipper dreamviewflipper)
    {
        ViewPropertyAnimator viewpropertyanimator = dreamviewflipper.c.animate().alpha(0.0F).setDuration(1000L).withEndAction(new ezr(dreamviewflipper));
        dreamviewflipper = dreamviewflipper.d.animate().alpha(1.0F).setDuration(1000L);
        viewpropertyanimator.start();
        dreamviewflipper.start();
    }

    public static void c(DreamViewFlipper dreamviewflipper, ImageView imageview)
    {
        dreamviewflipper.j = false;
        Object obj = ((elt)((ekp)dreamviewflipper.h.get(dreamviewflipper.g)).a(elt)).e();
        dreamviewflipper.q.a(dreamviewflipper.p);
        obj = dreamviewflipper.q.a(obj).a(dreamviewflipper.r).a((new awl()).a(azn.a()));
        if (imageview == dreamviewflipper.d)
        {
            imageview = new ezt(dreamviewflipper, imageview);
        } else
        {
            imageview = new azb(imageview);
        }
        dreamviewflipper.p = (azb)((ame) (obj)).a(imageview);
        dreamviewflipper.g = dreamviewflipper.g + 1;
    }

    public static void d(DreamViewFlipper dreamviewflipper)
    {
        if (dreamviewflipper.e.isEmpty())
        {
            dreamviewflipper.a();
            return;
        } else
        {
            dreamviewflipper.f = (dreamviewflipper.f + 1) % dreamviewflipper.e.size();
            dreamviewflipper.a((ekq)dreamviewflipper.e.get(dreamviewflipper.f));
            return;
        }
    }

    public static ImageView e(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.c;
    }

    public static ImageView f(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.d;
    }

    public static void g(DreamViewFlipper dreamviewflipper)
    {
        azb azb1 = dreamviewflipper.o;
        dreamviewflipper.o = dreamviewflipper.p;
        dreamviewflipper.p = azb1;
    }

    public static int h(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.g;
    }

    public static List i(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.h;
    }

    public static Runnable j(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.m;
    }

    public static Handler k(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.i;
    }

    public static Runnable l(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.n;
    }

    public static boolean m(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.k;
    }

    public static int n(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.f;
    }

    public static ArrayList o(DreamViewFlipper dreamviewflipper)
    {
        return dreamviewflipper.e;
    }

    public final void a()
    {
        l = false;
        k = false;
        i.removeCallbacks(m);
        i.removeCallbacks(n);
        if (h != null)
        {
            h = null;
        }
    }

    public final void a(Context context)
    {
        if (l)
        {
            return;
        } else
        {
            l = true;
            k = false;
            (new ezw(context, new ezu(this))).execute(new Integer[] {
                Integer.valueOf(PhotosDreamService.a(context))
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (ImageView)findViewById(u.d);
        d = (ImageView)findViewById(u.a);
    }

    static 
    {
        a = (new eky()).a(euv.b).a();
    }
}
