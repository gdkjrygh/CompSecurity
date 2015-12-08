// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.Application;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.b;
import com.pandora.android.util.e;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import com.pandora.radio.util.i;
import java.lang.ref.WeakReference;
import p.cb.c;

// Referenced classes of package p.ca:
//            ax, ai, e, g

public class aj extends c
    implements android.widget.SeekBar.OnSeekBarChangeListener
{
    private static class a
    {

        private WeakReference a;

        public void onAlarmUpdated(p.bz.b b1)
        {
            aj aj1 = (aj)a.get();
            if (aj1 != null)
            {
                aj1.a(b1);
            }
        }

        public a(aj aj1)
        {
            a = new WeakReference(aj1);
        }
    }


    private AlarmData a;
    private Button b;
    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private SeekBar h;
    private a j;
    private AsyncTask k;

    public aj()
    {
    }

    private AlarmData a(Bundle bundle)
    {
        if (bundle != null)
        {
            return (AlarmData)bundle.getParcelable("intent_alarm_data");
        } else
        {
            return (AlarmData)getArguments().getParcelable("intent_alarm_data");
        }
    }

    static AlarmData a(aj aj1)
    {
        return aj1.a;
    }

    public static aj a(AlarmData alarmdata)
    {
        aj aj1 = new aj();
        Bundle bundle = new Bundle();
        if (alarmdata == null)
        {
            alarmdata = null;
        } else
        {
            alarmdata = alarmdata.a();
        }
        bundle.putParcelable("intent_alarm_data", alarmdata);
        aj1.setArguments(bundle);
        return aj1;
    }

    private void a(y y1)
    {
        a.b(y1.d());
        a.a(y1.c());
        g();
    }

    static void a(aj aj1, y y1)
    {
        aj1.a(y1);
    }

    private void g()
    {
        if (b != null && a != null)
        {
            Application application = b.a.h();
            b.setText(a.b(application));
            c.setText(a.j());
            d.setText(a.a(application, true));
            e.setText(a.c(application));
            h.setProgress(a.m());
            if (s.a(a.i()))
            {
                e();
                return;
            }
        }
    }

    void a(p.bz.b b1)
    {
        if (b1.b == null) goto _L2; else goto _L1
_L1:
        a = b1.b;
_L4:
        g();
        return;
_L2:
        if (a == null && b1.a)
        {
            a = new AlarmData();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public CharSequence d()
    {
        return getString(0x7f080231);
    }

    public void e()
    {
        if (k != null)
        {
            k.cancel(true);
            k = null;
        }
        k = (new AsyncTask() {

            final aj a;

            protected transient y a(Void avoid[])
            {
                return i.b();
            }

            protected void a(y y1)
            {
                if (y1 != null)
                {
                    aj.a(a, y1);
                }
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((y)obj);
            }

            
            {
                a = aj.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public void f()
    {
        a.a(true);
        FragmentActivity fragmentactivity;
        boolean flag;
        flag = com.pandora.android.util.e.a(getActivity()).a(getActivity(), a);
        fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (flag)
        {
            try
            {
                s.a(fragmentactivity, a.d(getActivity()));
                fragmentactivity.onBackPressed();
                return;
            }
            catch (com.pandora.android.data.AlarmData.a a1)
            {
                s.a(getActivity(), 0x7f08008b);
            }
            break MISSING_BLOCK_LABEL_78;
        }
        s.a(fragmentactivity, 0x7f080174, false);
        return;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        g();
        if (a != null && s.a(a.i()))
        {
            e();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = a(bundle);
        j = new a(this);
        b.a.e().c(j);
        b.a.b().b(j);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04008f, viewgroup, false);
        b = (Button)layoutinflater.findViewById(0x7f10023e);
        c = (Button)layoutinflater.findViewById(0x7f10023f);
        d = (Button)layoutinflater.findViewById(0x7f100240);
        e = (Button)layoutinflater.findViewById(0x7f100241);
        f = (Button)layoutinflater.findViewById(0x7f10009f);
        g = (Button)layoutinflater.findViewById(0x7f1000a0);
        h = (SeekBar)layoutinflater.findViewById(0x7f100242);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public void onClick(View view)
            {
                ax.a(aj.a(a)).show(a.getFragmentManager(), "dialog");
            }

            
            {
                a = aj.this;
                super();
            }
        });
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public void onClick(View view)
            {
                ai.a(aj.a(a)).show(a.getFragmentManager(), null);
            }

            
            {
                a = aj.this;
                super();
            }
        });
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public void onClick(View view)
            {
                p.ca.e.a(aj.a(a)).show(a.getActivity().f(), "dialog");
            }

            
            {
                a = aj.this;
                super();
            }
        });
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public void onClick(View view)
            {
                p.ca.g.a(aj.a(a)).show(a.getActivity().f(), "dialog");
            }

            
            {
                a = aj.this;
                super();
            }
        });
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public void onClick(View view)
            {
                if (aj.a(a) == null || !aj.a(a).d())
                {
                    b.a.e().a(new p.bz.b(null, true));
                }
                a.getActivity().onBackPressed();
            }

            
            {
                a = aj.this;
                super();
            }
        });
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final aj a;

            public void onClick(View view)
            {
                a.f();
            }

            
            {
                a = aj.this;
                super();
            }
        });
        int i = ((AudioManager)b.a.h().getSystemService("audio")).getStreamMaxVolume(4);
        h.setMax(0);
        h.setMax(i);
        h.setOnSeekBarChangeListener(this);
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (k != null)
        {
            k.cancel(true);
            k = null;
        }
        super.onDestroy();
        b.a.b().c(j);
        b.a.e().b(j);
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        a.e(i);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("intent_alarm_data", a);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.M;
    }
}
