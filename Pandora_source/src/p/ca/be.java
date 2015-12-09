// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.n;
import com.pandora.android.ads.q;
import com.pandora.android.ads.r;
import com.pandora.android.data.s;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ak;
import com.pandora.radio.util.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p.cm.am;
import p.df.a;

// Referenced classes of package p.ca:
//            bf

public class be extends bf
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/ca/be$a, s1);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("CANCEL", 0);
            b = new a("SKIP", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int l)
        {
            super(s1, l);
        }
    }

    private static class b
        implements Runnable
    {

        private final WeakReference a;

        public void run()
        {
            be be1 = (be)a.get();
            if (be1 == null)
            {
                p.df.a.c("VIDEO AD", "VideoLoadErrorHandler: vxVideoAdFragment = null, skipping");
                return;
            } else
            {
                be1.u = true;
                be1.a("Timeout waiting for video to load", 1, -110);
                return;
            }
        }

        protected b(WeakReference weakreference)
        {
            a = weakreference;
        }
    }


    private View A;
    private int B;
    private TextView C;
    private boolean D;

    public be()
    {
        D = false;
    }

    private String a(int l)
    {
        return j.n().a(l);
    }

    public static be a(Bundle bundle)
    {
        be be1 = new be();
        be1.setArguments(bundle);
        return be1;
    }

    private void a(View view)
    {
        static class _cls5
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[bf.b.values().length];
                try
                {
                    b[p.ca.bf.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[p.ca.bf.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[bf.b.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[bf.b.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[bf.b.g.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[bf.b.d.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[bf.b.i.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[bf.b.c.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[bf.b.h.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[a.values().length];
                try
                {
                    a[p.ca.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.ca.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        ak ak1;
        if (view.getTag() != null)
        {
            view = (a)view.getTag();
        } else
        {
            view = p.ca.a.b;
        }
        ak1 = j.n();
        switch (p.ca._cls5.a[view.ordinal()])
        {
        default:
            a(p.ca.bf.b.b);
            return;

        case 1: // '\001'
            l();
            break;
        }
        view = getActivity();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(new ContextThemeWrapper(view, 0x1030073));
        builder.setMessage(ak1.f()).setCancelable(true).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final be a;

            public void onCancel(DialogInterface dialoginterface)
            {
                a.a(com.pandora.radio.util.k.p.u);
                a.m();
            }

            
            {
                a = be.this;
                super();
            }
        }).setPositiveButton(view.getString(0x7f080246), new android.content.DialogInterface.OnClickListener() {

            final be a;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                a.a(p.ca.bf.b.b);
                dialoginterface.dismiss();
            }

            
            {
                a = be.this;
                super();
            }
        }).setNegativeButton(view.getString(0x7f080225), new android.content.DialogInterface.OnClickListener() {

            final be a;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                a.a(com.pandora.radio.util.k.p.u);
                a.v.d();
                dialoginterface.cancel();
            }

            
            {
                a = be.this;
                super();
            }
        });
        builder.create().show();
        a(com.pandora.radio.util.k.p.t);
    }

    static void a(be be1, View view)
    {
        be1.a(view);
    }

    private boolean d(bf.b b1)
    {
        switch (p.ca._cls5.b[b1.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid Exit state : ").append(b1).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return D;

        case 7: // '\007'
            return true;

        case 8: // '\b'
        case 9: // '\t'
            return false;
        }
    }

    private void q()
    {
        D = true;
        String s1 = j.n().g();
        String s2 = j.n().e();
        if (s1 != null && s2 != null)
        {
            C.setText(s1);
            p.setText(s2);
            p.setTag(p.ca.a.b);
        }
        w.a(5000L);
    }

    private void r()
    {
        boolean flag = g.a("dontResumeMusicPlayback");
        String s1 = j.n().a();
        if (!com.pandora.android.util.s.a(s1))
        {
            j.b(s1, flag);
        }
    }

    private long s()
    {
        return (long)j.n().c() * 1000L;
    }

    protected View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        A = super.a(layoutinflater, viewgroup, bundle);
        return A;
    }

    protected void a()
    {
        q q1 = j.o();
        android.media.MediaPlayer mediaplayer;
        if (q1 != null)
        {
            mediaplayer = q1.a();
        } else
        {
            mediaplayer = null;
        }
        b = mediaplayer;
        if (b == null)
        {
            super.a();
            return;
        } else
        {
            p.df.a.a("VIDEO AD", "Using saved instance of MediaPlayer");
            z = true;
            q = true;
            r = q1.c();
            s = q1.d();
            a = q1.b();
            return;
        }
    }

    protected void a(Button button)
    {
        ak ak1 = j.n();
        button.setTag(p.ca.a.a);
        button.setText(ak1.b());
        button.setOnClickListener(new bf.a() {

            final be a;

            public void onClick(View view)
            {
                p.ca.be.a(a, view);
            }

            
            {
                a = be.this;
                super(be.this);
            }
        });
    }

    protected void a(com.pandora.android.ads.n.a a1)
    {
        v = new r(a1, w);
    }

    protected void a(String s1, int l, int i1)
    {
        p.df.a.c("VIDEO AD", s1);
        i.a(l, i1, g.d());
        if (i1 == -110)
        {
            a(com.pandora.radio.util.k.p.v, -1L, s1);
        } else
        {
            a(com.pandora.radio.util.k.p.i, -1L, s1);
        }
        a(bf.b.i);
    }

    protected void a(bf.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = t;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.a(b1);
        if (!d(b1)) goto _L4; else goto _L3
_L3:
        g();
          goto _L1
        b1;
        throw b1;
_L4:
        if (D || b1 != bf.b.e) goto _L1; else goto _L5
_L5:
        l();
        j.a(b, n, r, s);
        r();
        j.a((com.pandora.android.data.r)g);
          goto _L1
    }

    protected boolean a(boolean flag)
    {
        return flag;
    }

    protected boolean b()
    {
        return false;
    }

    protected boolean b(bf.b b1)
    {
        return D || b1 != bf.b.e;
    }

    protected int c()
    {
        return 0x7f0400b9;
    }

    protected void c(bf.b b1)
    {
        boolean flag;
        if (g.a("wasTrackPlaying") || g.a("playAfterVideo"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!D && b1 == bf.b.e)
        {
            g.u().put("dontResumeMusicPlayback", Boolean.valueOf(flag));
        } else
        {
            g.u().put("dontResumeMusicPlayback", Boolean.valueOf(false));
        }
        if (D)
        {
            b1 = p.bz.aa.a.b;
        } else
        {
            b1 = p.bz.aa.a.a;
        }
        h = b1;
    }

    protected void d()
    {
        int l = o();
        super.d();
        j();
        if (!D)
        {
            if (z && C.getVisibility() == 4 && l != j.o().b())
            {
                C.setVisibility(0);
            }
            l = B - l / 1000;
            if (l < 0)
            {
                q();
                return;
            }
            if (l > 0)
            {
                C.setText(a(l));
                return;
            }
            if (l == 0)
            {
                q();
                return;
            }
        }
    }

    protected int e()
    {
        if (getActivity().getResources().getConfiguration().orientation == 2)
        {
            return 0x7f0400ba;
        } else
        {
            return super.e();
        }
    }

    protected int f()
    {
        if (D)
        {
            return super.f();
        } else
        {
            return 0;
        }
    }

    protected void g()
    {
        if (g == null)
        {
            throw new IllegalStateException("attempt to start reward without reward data ");
        }
        if (!(g instanceof com.pandora.android.data.r))
        {
            throw new IllegalStateException("attempt to start reward with invalid data");
        }
        com.pandora.android.data.r r1 = (com.pandora.android.data.r)g;
        if (com.pandora.android.util.s.a(r1.r()))
        {
            throw new IllegalStateException("attempt to start reward with invalid data");
        }
        Object obj;
        JSONObject jsonobject;
        p.cw.c c1;
        String s1;
        com.pandora.radio.data.b b1;
        try
        {
            jsonobject = new JSONObject(r1.s());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException("attempt to start reward with invalid reward properties");
        }
        c1 = com.pandora.android.provider.b.a.b();
        s1 = r1.r();
        b1 = r1.c();
        if (D)
        {
            obj = p.cx.x.g.a;
        } else
        {
            obj = p.cx.x.g.b;
        }
        (new am(c1, s1, jsonobject, b1, null, null, ((p.cx.x.g) (obj)), r1.n())).execute(new Object[0]);
    }

    public boolean h()
    {
        a(p);
        return false;
    }

    protected void i()
    {
        x.postDelayed(new b(new WeakReference(this)), s());
    }

    protected void j()
    {
        super.j();
        if (!t)
        {
            x.postDelayed(new b(new WeakReference(this)), s());
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration = (ViewGroup)getView();
        RelativeLayout relativelayout = (RelativeLayout)configuration.findViewById(0x7f1002ff);
        relativelayout.removeAllViews();
        relativelayout.addView(LayoutInflater.from(getActivity()).inflate(e(), null));
        v.b(configuration, b);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        com.pandora.android.util.s.k();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        B = ((com.pandora.android.data.r)g).t();
        C = (TextView)A.findViewById(0x7f1002f2);
        int l;
        if (z)
        {
            l = B - a / 1000;
        } else
        {
            l = B;
        }
        C.setText(a(l));
        if (z)
        {
            C.setVisibility(4);
        }
    }
}
