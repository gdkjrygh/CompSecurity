// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.pandora.android.Main;
import com.pandora.android.util.e;
import com.pandora.android.view.CountdownDial;
import p.df.a;

// Referenced classes of package p.ca:
//            k

public class h extends k
{
    public static class a extends f
    {

        private android.content.DialogInterface.OnClickListener a;

        static android.content.DialogInterface.OnClickListener a(a a1)
        {
            return a1.a;
        }

        public static a a()
        {
            return new a();
        }

        public void a(android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a = onclicklistener;
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(getActivity());
            bundle.setMessage(0x7f080083).setNegativeButton(0x7f080084, null).setPositiveButton(0x7f080085, new android.content.DialogInterface.OnClickListener(this) {

                final a a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (p.ca.a.a(a) != null)
                    {
                        p.ca.a.a(a).onClick(dialoginterface, i);
                    }
                }

            
            {
                a = a1;
                super();
            }
            });
            return bundle.create();
        }

        public a()
        {
        }
    }


    android.content.DialogInterface.OnClickListener a;
    private CountdownDial b;
    private TextView c;
    private long d;
    private long e;
    private int f;

    public h()
    {
        a = new android.content.DialogInterface.OnClickListener() {

            final h a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                p.ca.h.a(a);
            }

            
            {
                a = h.this;
                super();
            }
        };
    }

    public static long a(int i)
    {
        return System.currentTimeMillis() + 60000L * (long)i;
    }

    public static h a(int i, int j)
    {
        h h1 = new h();
        Bundle bundle = new Bundle();
        bundle.putLong("snoozeStartTime", System.currentTimeMillis());
        bundle.putLong("snoozeEndTime", a(j));
        bundle.putInt("intent_alarm_id", i);
        h1.setArguments(bundle);
        return h1;
    }

    static void a(h h1)
    {
        h1.c();
    }

    static int b(h h1)
    {
        return h1.f;
    }

    private void b()
    {
        b.a(e, d);
        b.a();
    }

    private void c()
    {
        (new AsyncTask() {

            final h a;

            protected transient Void a(Void avoid[])
            {
                avoid = com.pandora.android.provider.a.a().a(h.b(a));
                com.pandora.android.util.e.a(a.getActivity()).d(a.getActivity(), avoid);
                return null;
            }

            protected void a(Void void1)
            {
                p.df.a.a("AlarmSnoozeFragment", "AlarmSnoozeFragment - alarm dismissed, finishing activity and starting Main");
                a.startActivity(new Intent(a.getActivity(), com/pandora/android/Main));
                a.getActivity().finish();
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Void)obj);
            }

            
            {
                a = h.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public void a()
    {
        a a1 = p.ca.a.a();
        a1.a(a);
        a1.show(getFragmentManager(), "dismissDialog");
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        p.df.a.a("AlarmSnoozeFragment", "AlarmSnoozeFragment - onActivityCreated");
        bundle = getArguments();
        f = bundle.getInt("intent_alarm_id");
        d = bundle.getLong("snoozeEndTime");
        e = bundle.getLong("snoozeStartTime");
        bundle = getView();
        b = (CountdownDial)bundle.findViewById(0x7f1000cf);
        c = (TextView)bundle.findViewById(0x7f1000d0);
        java.text.DateFormat dateformat = DateFormat.getTimeFormat(getActivity());
        c.setText(dateformat.format(Long.valueOf(d)));
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final h a;

            public void onClick(View view)
            {
                a.a();
            }

            
            {
                a = h.this;
                super();
            }
        });
        bundle = (a)getFragmentManager().a("dismissDialog");
        if (bundle != null)
        {
            bundle.a(a);
        }
        b();
        com.pandora.android.activity.a.g(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f040024, viewgroup, false);
    }
}
