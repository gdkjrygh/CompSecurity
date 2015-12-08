// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import com.roidapp.imagelib.i;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            p, o

public class TemplateClipView extends HorizontalScrollView
    implements android.view.View.OnClickListener
{

    public int a[][];
    public int b[][];
    private Context c;
    private LayoutInflater d;
    private p e;
    private View f;
    private int g;
    private int h;
    private List i;
    private int j[];
    private Handler k;

    public TemplateClipView(Context context)
    {
        super(context);
        g = 0;
        h = -1;
        i = new ArrayList();
        k = new Handler();
        a = (new int[][] {
            new int[] {
                f.w, f.H, f.S, f.W, f.X, f.Y, f.Z, f.aa, f.ab, f.x, 
                f.y, f.z, f.A, f.B, f.C, f.D, f.E, f.F, f.G, f.I
            }, new int[] {
                f.J, f.K, f.L, f.M, f.N, f.O, f.P, f.Q, f.R, f.T, 
                f.U, f.V
            }
        });
        int l = i.L;
        int i1 = i.W;
        int j1 = i.ah;
        int k1 = i.al;
        int l1 = i.am;
        int i2 = i.an;
        int j2 = i.ao;
        int k2 = i.ap;
        int l2 = i.aq;
        int i3 = i.M;
        int j3 = i.N;
        int k3 = i.O;
        int l3 = i.P;
        int i4 = i.Q;
        int j4 = i.R;
        int k4 = i.S;
        int l4 = i.T;
        int i5 = i.U;
        int j5 = i.V;
        int k5 = i.X;
        int ai[] = {
            i.Y, i.Z, i.aa, i.ab, i.ac, i.ad, i.ae, i.af, i.ag, i.ai, 
            i.aj, i.ak
        };
        b = (new int[][] {
            new int[] {
                l, i1, j1, k1, l1, i2, j2, k2, l2, i3, 
                j3, k3, l3, i4, j4, k4, l4, i5, j5, k5
            }, ai
        });
        c = context;
        d = (LayoutInflater)c.getSystemService("layout_inflater");
        f = d.inflate(h.o, this, true);
        j = new int[2];
        j[0] = -1;
        j[1] = -1;
    }

    public TemplateClipView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 0;
        h = -1;
        i = new ArrayList();
        k = new Handler();
        int l = f.w;
        int i1 = f.H;
        int j1 = f.S;
        int k1 = f.W;
        int l1 = f.X;
        int i2 = f.Y;
        int j2 = f.Z;
        int k2 = f.aa;
        int l2 = f.ab;
        int i3 = f.x;
        int j3 = f.y;
        int k3 = f.z;
        int l3 = f.A;
        int i4 = f.B;
        int j4 = f.C;
        int k4 = f.D;
        int l4 = f.E;
        int i5 = f.F;
        int j5 = f.G;
        int k5 = f.I;
        context = (new int[] {
            f.J, f.K, f.L, f.M, f.N, f.O, f.P, f.Q, f.R, f.T, 
            f.U, f.V
        });
        a = (new int[][] {
            new int[] {
                l, i1, j1, k1, l1, i2, j2, k2, l2, i3, 
                j3, k3, l3, i4, j4, k4, l4, i5, j5, k5
            }, context
        });
        b = (new int[][] {
            new int[] {
                i.L, i.W, i.ah, i.al, i.am, i.an, i.ao, i.ap, i.aq, i.M, 
                i.N, i.O, i.P, i.Q, i.R, i.S, i.T, i.U, i.V, i.X
            }, new int[] {
                i.Y, i.Z, i.aa, i.ab, i.ac, i.ad, i.ae, i.af, i.ag, i.ai, 
                i.aj, i.ak
            }
        });
    }

    static List a(TemplateClipView templateclipview)
    {
        return templateclipview.i;
    }

    static int[] b(TemplateClipView templateclipview)
    {
        return templateclipview.j;
    }

    static int c(TemplateClipView templateclipview)
    {
        return templateclipview.g;
    }

    public final void a()
    {
        h = -1;
    }

    public final void a(int l)
    {
        ViewGroup viewgroup;
        int ai1[];
        android.widget.FrameLayout.LayoutParams layoutparams;
        int i1;
        if (h == l)
        {
            if (j[g] != -1 && !i.isEmpty())
            {
                ((ImageView)((View)i.get(j[g])).findViewById(g.o)).setVisibility(8);
                e.a(-1);
                j[g] = -1;
            }
            return;
        }
        g = l;
        b();
        viewgroup = (ViewGroup)f.findViewById(g.aR);
        l = (int)getResources().getDimension(e.j);
        ai1 = a[g];
        i1 = ai1.length;
        layoutparams = new android.widget.FrameLayout.LayoutParams(l, l);
        List list = i;
        list;
        JVM INSTR monitorenter ;
        l = 0;
_L1:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        View view;
        ImageView imageview;
        view = d.inflate(h.p, null);
        imageview = (ImageView)view.findViewById(g.c);
        imageview.setImageBitmap(((BitmapDrawable)c.getResources().getDrawable(ai1[l])).getBitmap());
_L2:
        view.setLayoutParams(layoutparams);
        view.setTag(Integer.valueOf(l));
        viewgroup.addView(view);
        view.setOnClickListener(this);
        i.add(view);
        l++;
          goto _L1
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        System.gc();
        System.gc();
        imageview.setImageBitmap(((BitmapDrawable)c.getResources().getDrawable(ai1[l])).getBitmap());
        outofmemoryerror.printStackTrace();
          goto _L2
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        if (j[g] == -1)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        ((ImageView)((View)i.get(j[g])).findViewById(g.o)).setVisibility(0);
        int ai[] = b[g];
        e.a(ai[j[g]]);
_L3:
        list;
        JVM INSTR monitorexit ;
        k.postDelayed(new o(this), 50L);
        h = g;
        return;
        e.a(-1);
          goto _L3
    }

    public final void a(Fragment fragment)
    {
        if (fragment instanceof p)
        {
            e = (p)fragment;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(fragment.toString()).append(" must implemenet ImageEditFreeCropFragment.OnTemplateClipListener").toString());
        }
    }

    public final void b()
    {
        ((ViewGroup)f.findViewById(g.aR)).removeAllViews();
        synchronized (i)
        {
            i.clear();
        }
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onClick(View view)
    {
        if (e.b())
        {
            return;
        }
        synchronized (i)
        {
            int l = ((Integer)view.getTag()).intValue();
            view = b[g];
            if (j[g] != -1)
            {
                ((ImageView)((View)i.get(j[g])).findViewById(g.o)).setVisibility(8);
            }
            ((ImageView)((View)i.get(l)).findViewById(g.o)).setVisibility(0);
            e.a(view[l]);
            j[g] = l;
        }
        return;
        view;
        list;
        JVM INSTR monitorexit ;
        throw view;
    }
}
