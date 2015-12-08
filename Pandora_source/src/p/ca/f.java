// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.content.i;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.Main;
import com.pandora.android.PandoraService;
import com.pandora.android.data.AlarmData;
import com.pandora.android.util.e;
import com.pandora.android.util.s;
import com.pandora.android.util.y;
import com.pandora.radio.data.aa;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import p.an.h;
import p.cw.c;
import p.cx.p;
import p.dd.bh;
import p.df.a;
import p.l.d;
import p.l.g;
import p.l.j;
import p.s.b;

public class f extends Fragment
    implements android.support.v4.app.n.a, com.pandora.android.util.y.b
{
    public static class a extends android.support.v4.content.a
    {

        private int f;
        private boolean g;
        private b h;

        public void a(b b1)
        {
            super.deliverResult(b1);
            h = b1;
        }

        public Object c()
        {
            return e();
        }

        public void deliverResult(Object obj)
        {
            a((b)obj);
        }

        public b e()
        {
            AlarmData alarmdata = com.pandora.android.provider.a.a().a(f);
            com.pandora.radio.data.y y1 = null;
            if (alarmdata != null)
            {
                y1 = com.pandora.android.provider.b.a.b().y().a(getContext(), alarmdata.i());
                com.pandora.android.provider.b.a.b().w().d().a("CURRENT_STATION_TOKEN", alarmdata.i());
            }
            return new b(alarmdata, y1, g);
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            if (h != null)
            {
                a(h);
                return;
            } else
            {
                forceLoad();
                return;
            }
        }

        public a(Context context, int i1, boolean flag)
        {
            super(context);
            f = i1;
            g = flag;
        }
    }

    public static class b
    {

        public final AlarmData a;
        public final com.pandora.radio.data.y b;
        public final boolean c;

        public b(AlarmData alarmdata, com.pandora.radio.data.y y1, boolean flag)
        {
            a = alarmdata;
            b = y1;
            c = flag;
        }
    }

    private static class c
        implements Runnable
    {

        private float a;
        private float b;
        private float c;
        private float d;
        private WeakReference e;

        public void run()
        {
            ImageView imageview = (ImageView)e.get();
            if (imageview == null)
            {
                return;
            }
            float f1;
            Object obj;
            int i1;
            if (c > d)
            {
                f1 = (c * b) / a - d;
                obj = "scrollY";
            } else
            {
                f1 = (d * a) / b - c;
                obj = "scrollX";
            }
            i1 = Math.round(f1 / 2.0F);
            obj = ObjectAnimator.ofInt(imageview, ((String) (obj)), new int[] {
                -i1, i1
            });
            ((ObjectAnimator) (obj)).setDuration(25000L);
            ((ObjectAnimator) (obj)).setRepeatCount(-1);
            ((ObjectAnimator) (obj)).setRepeatMode(2);
            ((ObjectAnimator) (obj)).start();
        }

        public c(ImageView imageview, float f1, float f2, float f3, float f4)
        {
            e = new WeakReference(imageview);
            a = f1;
            b = f2;
            c = f3;
            d = f4;
        }
    }


    private static com.pandora.android.util.n a;
    private ImageButton b;
    private ImageButton c;
    private ImageView d;
    private TextView e;
    private AlarmData f;
    private Handler g;
    private y h;
    private com.pandora.radio.data.y i;
    private boolean j;
    private boolean k;
    private bh l;
    private Runnable m;

    public f()
    {
        m = new Runnable() {

            final f a;

            public void run()
            {
                p.ca.f.a(a, false);
                com.pandora.android.util.e.a("response time out", p.ca.f.a(a));
            }

            
            {
                a = f.this;
                super();
            }
        };
    }

    static AlarmData a(f f1)
    {
        return f1.f;
    }

    public static f a(int i1)
    {
        f f1 = new f();
        Bundle bundle = new Bundle();
        bundle.putInt("intent_alarm_id", i1);
        f1.setArguments(bundle);
        return f1;
    }

    private void a(View view)
    {
        b = (ImageButton)view.findViewById(0x7f1000cc);
        c = (ImageButton)view.findViewById(0x7f1000cb);
        e = (TextView)view.findViewById(0x7f1000ce);
        d = (ImageView)view.findViewById(0x7f1000ca);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final f a;

            public void onClick(View view1)
            {
                p.ca.f.a(a, true);
                com.pandora.android.util.e.a("stop", p.ca.f.a(a));
            }

            
            {
                a = f.this;
                super();
            }
        });
        e();
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final f a;

            public void onClick(View view1)
            {
                p.ca.f.b(a);
                com.pandora.android.util.e.a("snooze", p.ca.f.a(a));
            }

            
            {
                a = f.this;
                super();
            }
        });
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final f a;

            public void onClick(View view1)
            {
                p.ca.f.a(a, false);
                com.pandora.android.util.e.a("keep listening", p.ca.f.a(a));
            }

            
            {
                a = f.this;
                super();
            }
        });
    }

    private void a(aa aa1)
    {
        if (e == null || aa1 == null)
        {
            return;
        }
        if (aa1.M())
        {
            e.setText(0x7f08007d);
            return;
        } else
        {
            a(getString(0x7f080096, new Object[] {
                aa1.s(), aa1.t()
            }), aa1.s().length());
            return;
        }
    }

    private void a(String s1)
    {
        p.df.a.c("AlarmRingerFragment", "FRAGMENT [%d] %s", new Object[] {
            Integer.valueOf(hashCode()), s1
        });
    }

    private void a(String s1, int i1)
    {
        if (s1 == null || i1 == -1)
        {
            return;
        }
        s1 = new SpannableStringBuilder(s1);
        s1.setSpan(new StyleSpan(1), 0, i1, 18);
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            s1.setSpan(new TypefaceSpan("sans-serif-light"), i1, s1.length(), 34);
        }
        e.setText(s1);
    }

    static void a(f f1, boolean flag)
    {
        f1.a(flag);
    }

    private void a(boolean flag)
    {
        startActivity(new Intent(getActivity(), com/pandora/android/Main));
        getActivity().finish();
        if (flag)
        {
            k();
        }
    }

    private void b(aa aa1)
    {
        p.l.g.a(this).a(aa1.v()).h().a(p.s.b.c).a(new h() {

            final f a;

            public void a(Bitmap bitmap, p.am.c c1)
            {
                p.ca.f.c(a).setImageBitmap(bitmap);
                c1 = a.getView();
                p.ca.f.c(a).post(new c(p.ca.f.c(a), bitmap.getWidth(), bitmap.getHeight(), c1.getWidth(), c1.getHeight()));
            }

            public volatile void a(Object obj, p.am.c c1)
            {
                a((Bitmap)obj, c1);
            }

            
            {
                a = f.this;
                super();
            }
        });
    }

    static void b(f f1)
    {
        f1.j();
    }

    private void b(boolean flag)
    {
        a("initializing loader");
        Bundle bundle = new Bundle();
        bundle.putBoolean("playRadioAfterLoading", flag);
        getLoaderManager().a(0, bundle, this).startLoading();
    }

    static ImageView c(f f1)
    {
        return f1.d;
    }

    private void d()
    {
        e();
        if (f.k() == 0)
        {
            g();
        }
    }

    private void e()
    {
        if (f != null && b != null && f.k() == 0)
        {
            b.setEnabled(false);
        }
    }

    private void f()
    {
        if (f != null && f.k() == 0)
        {
            return;
        }
        if (h == null)
        {
            h = new y(this);
        }
        h.a(getActivity());
    }

    private void g()
    {
        if (h != null)
        {
            h.a();
            h = null;
        }
    }

    private int h()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            int i1 = bundle.getInt("intent_alarm_id", -1);
            if (i1 != -1)
            {
                return i1;
            }
        }
        throw new IllegalArgumentException("Unable to get alarm from id");
    }

    private void i()
    {
        if (k)
        {
            return;
        } else
        {
            k = true;
            AudioManager audiomanager = (AudioManager)com.pandora.android.provider.b.a.h().getSystemService("audio");
            int i1 = audiomanager.getStreamMaxVolume(3);
            int j1 = f.m();
            int k1 = audiomanager.getStreamMaxVolume(4);
            float f1 = (float)j1 / (float)k1;
            audiomanager.setStreamVolume(3, Math.max(2, (int)Math.ceil((float)i1 * f1)), 0);
            return;
        }
    }

    private void j()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            com.pandora.android.util.e.a(fragmentactivity).e(fragmentactivity, f);
            m();
            com.pandora.android.provider.b.a.b().z().e();
            k();
            com.pandora.android.provider.b.a.e().a(new p.bz.a(f.k()));
            j = false;
            k = false;
        }
    }

    private void k()
    {
        s.d();
        com.pandora.android.provider.b.a.b().d().b(p.cw.b.c.a);
        if (a != null)
        {
            a.b();
        }
    }

    private void l()
    {
        g.postDelayed(m, 0x493e0L);
    }

    private void m()
    {
        g.removeCallbacks(m);
    }

    public void a()
    {
        if (f == null || i == null)
        {
            getLoaderManager().a(0);
            b(true);
        } else
        {
            a("playing radio");
            p.cw.b b1 = com.pandora.android.provider.b.a.b().d();
            b1.y();
            i();
            if (!b1.o() && b1.a(i))
            {
                b1.a(p.cw.b.c.b);
                return;
            }
            if (!b1.a(i))
            {
                com.pandora.android.activity.a.a(i, null, false, true, p.cw.b.b.a, null);
                return;
            }
        }
    }

    public void a(i i1, b b1)
    {
label0:
        {
            a("load finished");
            f = b1.a;
            i = b1.b;
            d();
            if (l != null)
            {
                onTrackStateChange(l);
                l = null;
            }
            if (b1.c)
            {
                if (i == null)
                {
                    break label0;
                }
                a();
            }
            return;
        }
        b();
    }

    public void b()
    {
        if (a != null && a.c())
        {
            a("Default tone already playing, skipping request.");
            return;
        }
        a("playing default tone");
        i();
        com.pandora.android.util.n n1 = new com.pandora.android.util.n(com.pandora.android.provider.b.a.b());
        try
        {
            n1.a(getActivity().getAssets().openFd("Alarm-ItsTime.mp3"), null, getActivity());
            a = n1;
            com.pandora.android.util.e.a("fired default", f);
            return;
        }
        catch (IOException ioexception)
        {
            a(ioexception.getMessage());
        }
    }

    public void c()
    {
        j();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        a("AlarmRingerFragment - onActivityCreated");
        g = new Handler();
        l();
        f();
        com.pandora.android.provider.b.a.a(getActivity(), new Intent(getActivity(), com/pandora/android/PandoraService));
        if (bundle != null)
        {
            j = bundle.getBoolean("statsCallMade");
            a((new StringBuilder()).append("Restored mFiredStationStatsCallMade: ").append(j).toString());
            k = bundle.getBoolean("alarmInitialVolumeSet");
        }
        com.pandora.android.provider.b.a.b().b(this);
        com.pandora.android.provider.b.a.e().c(this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            f = (AlarmData)bundle.getParcelable("intent_alarm_data");
            i = (com.pandora.radio.data.y)bundle.getSerializable("intent_station_data");
        }
        if (f == null)
        {
            b(false);
            return;
        } else
        {
            d();
            return;
        }
    }

    public i onCreateLoader(int i1, Bundle bundle)
    {
        boolean flag = bundle.getBoolean("playRadioAfterLoading");
        return new a(getActivity(), h(), flag);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040023, viewgroup, false);
        a(layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        a("AlarmRingerFragment - onDestroy");
        if (getActivity().isFinishing() && a != null)
        {
            a.b();
            a = null;
        }
    }

    public void onDestroyView()
    {
        com.pandora.android.provider.b.a.b().c(this);
        com.pandora.android.provider.b.a.e().b(this);
        super.onDestroyView();
    }

    public void onLoadFinished(i i1, Object obj)
    {
        a(i1, (b)obj);
    }

    public void onLoaderReset(i i1)
    {
    }

    public void onOnePlaylistEnded(p.dd.aa aa1)
    {
        if (aa1.b)
        {
            a("CC station expired, deleting station to force reload");
            i = null;
        }
    }

    public void onPause()
    {
        super.onPause();
        g();
        m();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("statsCallMade", j);
        bundle.putBoolean("alarmInitialVolumeSet", k);
        bundle.putParcelable("intent_alarm_data", f);
        bundle.putSerializable("intent_station_data", i);
    }

    public void onTrackStateChange(bh bh1)
    {
        a((new StringBuilder()).append("onTrackStateChange ").append(bh1.a).toString());
        if (i != null) goto _L2; else goto _L1
_L1:
        l = bh1;
_L4:
        return;
_L2:
        static class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 4;
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

        switch (p.ca._cls6.a[bh1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onTrackStateChange called with unknown trackState: ").append(bh1.a).toString());

        case 1: // '\001'
        case 2: // '\002'
            p.cw.b b1 = com.pandora.android.provider.b.a.b().d();
            a((new StringBuilder()).append("mStationData: ").append(i).toString());
            if (b1.a(i))
            {
                a("Playing correct station");
                a(bh1.b);
                b(bh1.b);
                if (!j)
                {
                    a("stats call not made yet");
                    com.pandora.android.util.e.a("fired station", f);
                    j = true;
                    return;
                } else
                {
                    a("Stats call already made");
                    return;
                }
            } else
            {
                a("Playing incorrect station");
                return;
            }

        case 3: // '\003'
        case 4: // '\004'
            e.setText("");
            return;

        case 5: // '\005'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
