// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.bumptech.glide.d;
import com.bumptech.glide.load.b.e;
import com.roidapp.baselib.c.y;
import com.roidapp.baselib.e.l;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.g.f;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.upload.UploadProgressStatusView;
import com.roidapp.cloudlib.sns.upload.i;
import com.roidapp.cloudlib.sns.upload.j;
import com.roidapp.cloudlib.sns.z;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            j, p, n, o, 
//            k, i, m, l

public final class h extends com.roidapp.cloudlib.sns.basepost.h
    implements android.view.View.OnClickListener
{

    private TextView A;
    private View B;
    private View C;
    private RelativeLayout D;
    private ProgressBar E;
    private LinearLayout F;
    private View G;
    private boolean H;
    private long I;
    private boolean J;
    private x K;
    private c L;
    private boolean M;
    private String N;
    private boolean O;
    private com.roidapp.cloudlib.sns.b.a.e P;
    private o Q;
    private boolean R;
    private boolean S;
    private String T;
    private String U;
    private boolean V;
    private int W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private View ab;
    private View ac;
    private View ad;
    private TextView ae;
    private TextView af;
    private boolean ag;
    private j ah;
    private RoundImageView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private TextView z;

    public h()
    {
        N = "";
        ah = new com.roidapp.cloudlib.sns.h.j(this);
    }

    private void D()
    {
        int i1 = getResources().getDisplayMetrics().heightPixels;
        int j1 = getResources().getDimensionPixelSize(ap.b);
        int k1 = getResources().getDimensionPixelSize(ap.a);
        ab = LayoutInflater.from(getActivity()).inflate(as.al, b, false);
        android.widget.AbsListView.LayoutParams layoutparams = new android.widget.AbsListView.LayoutParams(-1, i1 - j1 * 3 - k1);
        ab.setLayoutParams(layoutparams);
        ae = (TextView)ab.findViewById(ar.bA);
        ac = ab.findViewById(ar.ci);
        ad = ab.findViewById(ar.cl);
        af = (TextView)ab.findViewById(ar.bI);
        c.b(ab);
    }

    private void E()
    {
        e = false;
        if (z())
        {
            if (X)
            {
                f.setEnabled(false);
            } else
            {
                f.setEnabled(true);
            }
            if (f.b())
            {
                f.a(false);
                return;
            }
        }
    }

    public static h a(long l1, String s, String s1)
    {
        h h1 = new h();
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", l1);
        bundle.putString("user_name", s);
        bundle.putString("user_photo_url", s1);
        h1.setArguments(bundle);
        return h1;
    }

    private static void a(TextView textview, int i1)
    {
        String s;
        if (i1 > 0x3b9ac9ff)
        {
            i1 /= 0x5f5e100;
            if (i1 % 10 > 0)
            {
                s = (new StringBuilder()).append(i1 / 10).append(".").append(i1 % 10).append("b").toString();
            } else
            {
                s = (new StringBuilder()).append(i1 / 10).append("b").toString();
            }
        } else
        if (i1 > 0xf423f)
        {
            i1 /= 0x186a0;
            if (i1 % 10 > 0)
            {
                s = (new StringBuilder()).append(i1 / 10).append(".").append(i1 % 10).append("m").toString();
            } else
            {
                s = (new StringBuilder()).append(i1 / 10).append("m").toString();
            }
        } else
        if (i1 > 0x1869f)
        {
            i1 /= 100;
            if (i1 % 10 > 0)
            {
                s = (new StringBuilder()).append(i1 / 10).append(".").append(i1 % 10).append("k").toString();
            } else
            {
                s = (new StringBuilder()).append(i1 / 10).append("k").toString();
            }
        } else
        if (i1 > 0)
        {
            s = String.valueOf(i1);
        } else
        {
            s = "0";
        }
        textview.setText(s);
    }

    private void a(x x1)
    {
        if (x1 == null) goto _L2; else goto _L1
_L1:
        I = x1.a;
        T = x1.b;
        U = x1.h;
        if (z()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if (J)
        {
            t.a(x1.b);
        }
        if (O || ag)
        {
            if (ag)
            {
                ag = false;
            }
            O = false;
            N = x1.h;
        }
        if (H)
        {
            com.roidapp.cloudlib.sns.g.b.a();
            f f1 = com.roidapp.cloudlib.sns.g.b.a(i.b);
            String s = com.roidapp.cloudlib.sns.g.f.a(f1);
            if (s != null)
            {
                com.bumptech.glide.h.a(this).a(com.roidapp.cloudlib.sns.g.f.b(f1, x1.h)).i().a(com.bumptech.glide.h.a(this).a(s).i()).a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(v));
            } else
            {
                com.bumptech.glide.h.a(this).a(com.roidapp.cloudlib.sns.g.f.b(f1, x1.h)).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(v));
            }
            w.setText(com.roidapp.cloudlib.sns.g.f.a(f1, x1.b));
            a(x, com.roidapp.cloudlib.sns.g.f.c(f1, x1.i));
            a(y, com.roidapp.cloudlib.sns.g.f.d(f1, x1.k));
            a(z, x1.j);
        } else
        {
            com.bumptech.glide.h.a(this).a(x1.h).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(v));
            com.roidapp.cloudlib.sns.g.b.a();
            f f2 = com.roidapp.cloudlib.sns.g.b.a(x1);
            w.setText(x1.b);
            a(x, x1.i);
            a(y, x1.k);
            a(z, com.roidapp.cloudlib.sns.g.f.a(f2, x1.j));
            L = com.roidapp.cloudlib.sns.g.f.a(f2, x1.q);
            if (L == c.b)
            {
                if (A.getVisibility() != 0)
                {
                    A.setVisibility(0);
                }
                E.setVisibility(8);
                A.setText(at.P);
                A.setTextColor(getResources().getColor(ao.a));
                A.setBackgroundResource(aq.K);
            } else
            if (L == c.c)
            {
                if (A.getVisibility() != 0)
                {
                    A.setVisibility(0);
                }
                E.setVisibility(8);
                A.setText(at.N);
                A.setTextColor(getResources().getColor(0x106000b));
                A.setBackgroundResource(aq.k);
            } else
            {
                if (A.getVisibility() != 0)
                {
                    A.setVisibility(0);
                }
                E.setVisibility(0);
                A.setText("");
                A.setBackgroundResource(aq.K);
            }
        }
_L7:
        if (c(1) == 2)
        {
            E();
            return;
        }
          goto _L5
_L2:
        TextView textview;
        if (J)
        {
            if (TextUtils.isEmpty(T))
            {
                t.a("");
            } else
            {
                t.a(T);
            }
        }
        if (X)
        {
            U = "";
            textview = w;
            x1 = "";
        } else
        {
            textview = w;
            if (TextUtils.isEmpty(T))
            {
                x1 = "";
            } else
            {
                x1 = T;
            }
        }
        textview.setText(x1);
        if (O || !TextUtils.isEmpty(U) && !N.equals(U))
        {
            O = false;
            N = U;
            com.bumptech.glide.h.a(this).a(N).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(v));
        }
        x.setText("");
        y.setText("");
        z.setText("");
        if (!H)
        {
            E.setVisibility(8);
            if (A.getVisibility() != 8)
            {
                A.setVisibility(8);
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
_L5:
        if (true) goto _L3; else goto _L8
_L8:
    }

    static void a(h h1, int i1)
    {
        h1.a(i1);
    }

    static void a(h h1, com.roidapp.cloudlib.sns.b.a.e e1)
    {
        boolean flag = false;
        h1.Z = true;
        h1.X = false;
        h1.c(0);
        h1.R = true;
        h1.P = e1;
        h1.a(e1, true, true);
        h1.g(true);
        if (e1 == null || e1.size() < 10)
        {
            flag = true;
        }
        h1.aa = flag;
    }

    static void a(h h1, x x1)
    {
        if (x1 == null)
        {
            h1.X = true;
            h1.a(at.ah);
        } else
        {
            h1.X = false;
        }
        h1.S = true;
        h1.c(0);
        if (h1.H)
        {
            h1.K = x1;
            h1.h = x1;
            if (h1.getActivity() != null && com.roidapp.cloudlib.sns.b.q.a(h1.getActivity()).c() != null)
            {
                com.roidapp.cloudlib.sns.b.q.a(h1.getActivity()).c().b = x1;
            }
        } else
        {
            h1.K = x1;
        }
        h1.a(x1);
    }

    static void a(h h1, Exception exception)
    {
        h1.Z = true;
        h1.c(0);
        h1.R = false;
        if (exception instanceof z)
        {
            if (((z)exception).a() == 1006)
            {
                h1.X = true;
            } else
            {
                h1.X = false;
                h1.a(at.aD);
            }
        } else
        {
            h1.X = false;
            h1.a(at.aG);
        }
        h1.a(h1.P, true, false);
        h1.g(true);
    }

    static boolean a(h h1)
    {
        return h1.z();
    }

    static boolean a(h h1, long l1, int i1)
    {
        UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)h1.F.findViewWithTag(Long.valueOf(l1));
        if (uploadprogressstatusview != null)
        {
            uploadprogressstatusview.a(1);
            uploadprogressstatusview.b(i1);
            if (i1 == 100)
            {
                h1.F.removeView(uploadprogressstatusview);
                h1.onRefresh();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static h b(String s)
    {
        return a(-1L, s, "");
    }

    static SwipeRefreshLayout2 b(h h1)
    {
        return h1.f;
    }

    static void b(h h1, int i1)
    {
        h1.a(i1);
    }

    static void b(h h1, com.roidapp.cloudlib.sns.b.a.e e1)
    {
        boolean flag = false;
        h1.P = e1;
        h1.a(e1, true, true);
        h1.g(false);
        if (e1 == null || e1.size() < 10)
        {
            flag = true;
        }
        h1.aa = flag;
    }

    static void b(h h1, x x1)
    {
        if (h1.H)
        {
            h1.K = x1;
            h1.h = x1;
        } else
        {
            h1.K = x1;
        }
        h1.a(x1);
    }

    static void b(h h1, Exception exception)
    {
        h1.X = false;
        h1.S = false;
        h1.c(0);
        h1.a(h1.K);
        if (exception instanceof z)
        {
            h1.a(at.aD);
            return;
        } else
        {
            h1.a(at.aG);
            return;
        }
    }

    private int c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        W = W + 1;
        i1 = W;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    static SwipeRefreshLayout2 c(h h1)
    {
        return h1.f;
    }

    static void c(h h1, int i1)
    {
        h1.a(i1);
    }

    private void c(boolean flag)
    {
        o o1;
        if (H)
        {
            o1 = com.roidapp.cloudlib.sns.q.f(i.a, h.a, 1, new com.roidapp.cloudlib.sns.h.p(this, (byte)0));
        } else
        {
            o1 = com.roidapp.cloudlib.sns.q.a(i.a, h.a, I, 1, new com.roidapp.cloudlib.sns.h.p(this, (byte)0));
        }
        if (flag)
        {
            o1.l();
        }
        o1.a(this);
    }

    static SwipeRefreshLayout2 d(h h1)
    {
        return h1.f;
    }

    private void d(boolean flag)
    {
        o o1 = com.roidapp.cloudlib.sns.q.a(i.a, h.a, T, 1, new com.roidapp.cloudlib.sns.h.p(this, (byte)0));
        if (flag)
        {
            o1.l();
        }
        o1.a(this);
    }

    private void e(boolean flag)
    {
        o o1 = com.roidapp.cloudlib.sns.q.c(i.a, h.a, I, new n(this));
        if (flag)
        {
            o1.l();
        }
        o1.a(this);
    }

    static boolean e(h h1)
    {
        h1.e = false;
        return false;
    }

    private void f(boolean flag)
    {
        o o1 = com.roidapp.cloudlib.sns.q.a(true, T, new com.roidapp.cloudlib.sns.h.o(this));
        if (flag)
        {
            o1.l();
        }
        o1.a(this);
    }

    static boolean f(h h1)
    {
        h1.aa = true;
        return true;
    }

    static bc g(h h1)
    {
        return h1.d;
    }

    private void g(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (c(1) == 2)
        {
            E();
        }
        if (d != null)
        {
            d.a(false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static PinnedListView2 h(h h1)
    {
        return h1.b;
    }

    static SwipeRefreshLayout2 i(h h1)
    {
        return h1.f;
    }

    static o j(h h1)
    {
        h1.Q = null;
        return null;
    }

    static SwipeRefreshLayout2 k(h h1)
    {
        return h1.f;
    }

    static SwipeRefreshLayout2 l(h h1)
    {
        return h1.f;
    }

    static SwipeRefreshLayout2 m(h h1)
    {
        return h1.f;
    }

    static boolean n(h h1)
    {
        h1.e = false;
        return false;
    }

    static bc o(h h1)
    {
        return h1.d;
    }

    static LinearLayout p(h h1)
    {
        return h1.F;
    }

    static View q(h h1)
    {
        return h1.G;
    }

    static x r(h h1)
    {
        return h1.K;
    }

    public final long B()
    {
        return I;
    }

    public final void C()
    {
        J = true;
    }

    public final View a(Context context)
    {
        if (!J) goto _L2; else goto _L1
_L1:
        t = new ab(context);
        t.a(u);
        if (K == null) goto _L4; else goto _L3
_L3:
        t.a(K.b);
_L5:
        return t;
_L4:
        if (!TextUtils.isEmpty(T))
        {
            t.a(T);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    protected final void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(view, layoutinflater, viewgroup, bundle);
        M = true;
        O = true;
    }

    protected final void a(com.roidapp.cloudlib.sns.b.a.e e1, boolean flag, boolean flag1)
    {
        com.roidapp.cloudlib.sns.b.a.e e2 = e1;
        if (e1 == null)
        {
            e2 = new com.roidapp.cloudlib.sns.b.a.e();
        }
        super.a(e2, flag, flag1);
    }

    public final void a(com.roidapp.cloudlib.sns.g.e e1, Object obj)
    {
        if (isDetached()) goto _L2; else goto _L1
_L1:
        if (com.roidapp.cloudlib.sns.g.e.a != e1) goto _L4; else goto _L3
_L3:
        a(K);
_L2:
        return;
_L4:
        if (com.roidapp.cloudlib.sns.g.e.d != e1)
        {
            break; /* Loop/switch isn't completed */
        }
        a(K);
        if (d != null)
        {
            d.c();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (com.roidapp.cloudlib.sns.g.e.b != e1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d != null)
        {
            d.c();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (com.roidapp.cloudlib.sns.g.e.c != e1) goto _L2; else goto _L6
_L6:
        a(K);
        if (d != null)
        {
            d.e(((Integer)obj).intValue());
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final void a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            i i1 = (i)collection.next();
            long l1 = i1.e;
            byte byte0 = i1.f;
            UploadProgressStatusView uploadprogressstatusview = (UploadProgressStatusView)F.findViewWithTag(Long.valueOf(l1));
            if (uploadprogressstatusview == null)
            {
                uploadprogressstatusview = new UploadProgressStatusView(getActivity());
                uploadprogressstatusview.setTag(Long.valueOf(l1));
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
                uploadprogressstatusview.a(i1.a);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutparams.bottomMargin = 20;
                uploadprogressstatusview.setLayoutParams(layoutparams);
                F.addView(uploadprogressstatusview);
                uploadprogressstatusview.a(new k(this, uploadprogressstatusview, i1));
            } else
            {
                uploadprogressstatusview.a(byte0);
                uploadprogressstatusview.b(i1.d);
            }
        }

    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().a("UserCenter");
        if (Q != null)
        {
            Q.f();
            if (f.c())
            {
                f.a();
            }
            e = false;
        }
        if (!J)
        {
            al.g().b(getActivity(), "Personal page");
            com.roidapp.baselib.c.b.b("Personal page");
        }
        if (Y)
        {
            return;
        }
        if (flag)
        {
            a(new com.roidapp.cloudlib.sns.g.e[] {
                com.roidapp.cloudlib.sns.g.e.a
            });
            f.setEnabled(false);
            f.a(true);
            e = true;
            W = 0;
            if (V)
            {
                e(false);
                c(false);
                return;
            } else
            {
                f(false);
                d(false);
                return;
            }
        }
        W = 2;
        if (e)
        {
            e = false;
            if (Q != null)
            {
                Q.f();
            }
        }
        a(P, true, false);
        a(K);
        g(true);
    }

    protected final void b()
    {
        super.b();
        if (!J)
        {
            if (d != null)
            {
                if (d.i())
                {
                    com.roidapp.baselib.c.b.e("Personal page");
                }
                int i1 = g();
                if (i1 != -1)
                {
                    com.roidapp.baselib.c.b.b("Personal page", i1);
                }
            }
            com.roidapp.baselib.c.b.a("Personal page", a());
        }
    }

    public final void b(boolean flag)
    {
        if (ab != null && c.h() > 0 || !flag) goto _L2; else goto _L1
_L1:
        D();
_L8:
        super.b(flag);
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!Z) goto _L6; else goto _L5
_L5:
        if (H)
        {
            if (R)
            {
                ae.setVisibility(8);
                ac.setVisibility(0);
                ad.setOnClickListener(this);
            } else
            {
                ae.setText(at.X);
                ac.setVisibility(8);
                ae.setVisibility(0);
            }
        } else
        {
            if (R)
            {
                af.setText(at.af);
            } else
            if (!com.roidapp.baselib.e.l.b(getActivity()))
            {
                af.setText(getActivity().getString(at.e));
            } else
            {
                af.setText(at.X);
            }
            if (X)
            {
                af.setVisibility(4);
            } else
            {
                af.setVisibility(0);
            }
        }
        ab.setVisibility(0);
_L4:
        return;
_L2:
        if (!flag)
        {
            c.f();
            ab = null;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        ab.setVisibility(8);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void d()
    {
        ag = true;
        j = LayoutInflater.from(getActivity()).inflate(as.G, b, false);
        v = (RoundImageView)j.findViewById(ar.bD);
        w = (TextView)j.findViewById(ar.bC);
        if (H)
        {
            j.findViewById(ar.i).setVisibility(8);
            B = j.findViewById(ar.cj);
            B.setVisibility(0);
            B.setOnClickListener(this);
        } else
        {
            D = (RelativeLayout)j.findViewById(ar.i);
            D.setVisibility(0);
            A = (TextView)j.findViewById(ar.h);
            E = (ProgressBar)j.findViewById(ar.aR);
            C = j.findViewById(ar.ba);
            D.setOnClickListener(this);
        }
        x = (TextView)j.findViewById(ar.bN);
        y = (TextView)j.findViewById(ar.aW);
        z = (TextView)j.findViewById(ar.aV);
        j.findViewById(ar.bM).setOnClickListener(this);
        j.findViewById(ar.aX).setOnClickListener(this);
        j.findViewById(ar.aU).setOnClickListener(this);
        F = (LinearLayout)j.findViewById(ar.J);
        if (H)
        {
            a(com.roidapp.cloudlib.sns.upload.e.a().c());
            com.roidapp.cloudlib.sns.upload.e.a().a(ah);
        } else
        {
            com.roidapp.cloudlib.sns.upload.e.a().b(ah);
        }
        G = j.findViewById(ar.K);
        if (F != null && F.getChildCount() > 0)
        {
            G.setVisibility(0);
        } else
        {
            G.setVisibility(8);
        }
        c.a(j);
        D();
    }

    protected final void f()
    {
        r = true;
    }

    public final boolean j()
    {
        super.j();
        if (!aa) goto _L2; else goto _L1
_L1:
        if (d != null)
        {
            d.a();
        }
_L4:
        return false;
_L2:
        if (d == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (K == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (d.a() == K.i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aa = flag;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        if (!aa)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d != null && d.a() <= 0)
        {
            b(true);
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (d != null && d.a() <= 0)
        {
            onRefresh();
            return false;
        }
        if (!e)
        {
            e = true;
            com.roidapp.cloudlib.sns.h.i i1 = new com.roidapp.cloudlib.sns.h.i(this);
            if (V)
            {
                if (H)
                {
                    Q = com.roidapp.cloudlib.sns.q.f(i.a, h.a, d.f() + 1, i1);
                } else
                {
                    Q = com.roidapp.cloudlib.sns.q.a(i.a, h.a, I, d.f() + 1, i1);
                }
            } else
            {
                Q = com.roidapp.cloudlib.sns.q.a(i.a, h.a, T, d.f() + 1, i1);
            }
            Q.l();
            Q.a(this);
            return true;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected final void o()
    {
        super.o();
        if (d != null)
        {
            d.c();
        }
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
    }

    public final void onClick(View view)
    {
        if (view.getId() != ar.bM) goto _L2; else goto _L1
_L1:
        if (K != null && d != null && d.a() > 0)
        {
            b.a_(2);
        }
_L4:
        return;
_L2:
        if (view.getId() != ar.aX)
        {
            break; /* Loop/switch isn't completed */
        }
        getActivity();
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Profile/Following");
        al.g().a(getActivity(), "SNS", "click", "SNS/Profile/Following", Long.valueOf(1L));
        if (K != null)
        {
            view = new com.roidapp.cloudlib.sns.login.e();
            view.b(true);
            if (!H)
            {
                view.a(I);
                view.d();
            }
            a(view);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view.getId() != ar.aU)
        {
            break; /* Loop/switch isn't completed */
        }
        getActivity();
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Profile/Followers");
        al.g().a(getActivity(), "SNS", "click", "SNS/Profile/Followers", Long.valueOf(1L));
        if (K != null)
        {
            view = new com.roidapp.cloudlib.sns.login.e();
            view.b(false);
            if (!H)
            {
                view.a(I);
                view.d();
            }
            a(view);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (view.getId() != ar.i)
        {
            break; /* Loop/switch isn't completed */
        }
        if (K != null)
        {
            view = L;
            if (view == c.b)
            {
                view = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
                com.roidapp.cloudlib.sns.g.b.a().b(K, view);
                com.roidapp.cloudlib.sns.q.b(((p) (view)).a, ((p) (view)).b.a, I, new m(this, view)).a(this);
                return;
            }
            if (view == c.c)
            {
                view = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
                com.roidapp.cloudlib.sns.g.b.a().b(K, view);
                com.roidapp.cloudlib.sns.q.a(((p) (view)).a, ((p) (view)).b.a, I, new com.roidapp.cloudlib.sns.h.l(this, view)).a(this);
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (view.getId() == ar.cl)
        {
            y();
            return;
        }
        if (view.getId() == ar.cj)
        {
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Profile/Setting");
            al.g().a(getActivity(), "SNS", "click", "SNS/Profile/Setting", Long.valueOf(1L));
            A();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void onCreate(Bundle bundle)
    {
        boolean flag = true;
        super.onCreate(bundle);
        if (!com.roidapp.cloudlib.sns.af.a(getActivity()))
        {
            Y = true;
        } else
        {
            if (h == null)
            {
                i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
                if (i != null)
                {
                    h = i.b;
                }
            }
            if (h == null)
            {
                Y = true;
                return;
            }
            bundle = getArguments();
            if (bundle != null)
            {
                I = bundle.getLong("user_id", -1L);
                T = bundle.getString("user_name");
                U = bundle.getString("user_photo_url");
                V = true;
                if (I != -1L)
                {
                    if (h.a != I)
                    {
                        flag = false;
                    }
                    H = flag;
                } else
                if (!TextUtils.isEmpty(T))
                {
                    V = false;
                    H = h.b.equals(T);
                } else
                {
                    H = false;
                }
                if (H)
                {
                    K = h;
                    return;
                }
            }
        }
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        com.roidapp.cloudlib.sns.upload.e.a().b(ah);
    }

    public final void onRefresh()
    {
        super.onRefresh();
        while (Y || e) 
        {
            return;
        }
        if (Q != null)
        {
            Q.f();
            if (f.c())
            {
                f.a();
            }
        }
        e = true;
        if (!f.b())
        {
            f.a(true);
        }
        if (d != null)
        {
            d.d();
            d.a(true);
        }
        W = 0;
        if (V)
        {
            e(true);
            c(true);
        } else
        {
            f(true);
            d(true);
        }
        f.setEnabled(false);
    }
}
