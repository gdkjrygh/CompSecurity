// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.fitbit.analytics.core.a;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.Scale;
import com.fitbit.home.ui.b;
import com.fitbit.home.ui.i;
import com.fitbit.home.ui.l;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.bi;
import com.fitbit.util.f;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity_, DeviceView, a

public class ScaleDetailsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends bi
    {

        public Pair b()
        {
            Object obj = null;
            List list;
            try
            {
                list = an.a().e();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                list = null;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                list = null;
            }
            return new Pair(list, obj);
        }

        protected Intent f()
        {
            return null;
        }

        public Object f_()
        {
            return b();
        }

        public a(FragmentActivity fragmentactivity)
        {
            super(fragmentactivity);
        }
    }

    private class b extends com.fitbit.util.f.a
    {

        private static final String b = "com.fitbit.device.ui.ScaleDetailsActivity.ARG_DEVICE_ID";
        private static final String c = "com.fitbit.device.ui.ScaleDetailsActivity.ARG_SCALE_NAME";
        private static final String d = "com.fitbit.device.ui.ScaleDetailsActivity.ARG_SCALE_UNITS";
        final ScaleDetailsActivity a;
        private Exception e;

        public void a(Context context)
        {
            context = g();
            PublicAPI publicapi = new PublicAPI(ServerGateway.a());
            try
            {
                publicapi.a(context.getString("com.fitbit.device.ui.ScaleDetailsActivity.ARG_DEVICE_ID"), context.getString("com.fitbit.device.ui.ScaleDetailsActivity.ARG_SCALE_NAME"), context.getString("com.fitbit.device.ui.ScaleDetailsActivity.ARG_SCALE_UNITS"), null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                e = context;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                e = context;
            }
        }

        public void a(Object obj)
        {
            b((Context)obj);
        }

        public void b(Context context)
        {
            super.a(context);
            if (e != null)
            {
                com.fitbit.device.ui.ScaleDetailsActivity.a(a).a(e);
                return;
            } else
            {
                com.fitbit.device.ui.ScaleDetailsActivity.a(a).d();
                return;
            }
        }

        public void b(Object obj)
        {
            a((Context)obj);
        }

        public b(Context context, Bundle bundle)
        {
            a = ScaleDetailsActivity.this;
            super(context, bundle);
        }
    }


    private static final String h = com/fitbit/device/ui/ScaleDetailsActivity.getSimpleName();
    protected String a;
    protected TextView b;
    protected EditText c;
    protected Spinner d;
    protected TextView e;
    protected ProgressBar f;
    protected View g;
    private Scale i;
    private Device j;
    private com.fitbit.home.ui.f k;
    private com.fitbit.home.ui.b l;
    private final i m = new i();

    public ScaleDetailsActivity()
    {
    }

    public static Intent a(Context context, Device device)
    {
        return com.fitbit.device.ui.ScaleDetailsActivity_.a(context).a(device.c()).a();
    }

    static com.fitbit.home.ui.b a(ScaleDetailsActivity scaledetailsactivity)
    {
        return scaledetailsactivity.l;
    }

    private void a(Scale scale)
    {
        b.setText(m.a(i.e(), this, 0x7f080157));
        c.setText(scale.F());
        e.setText(m.a(i.D(), this, 0x7f080157));
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < Scale.a.length)
                {
                    if (Scale.a[i1] != scale.J())
                    {
                        break label0;
                    }
                    d.setSelection(i1);
                }
                ((TextView)findViewById(0x7f110348)).setText(scale.j());
                TextView textview = (TextView)findViewById(0x7f110349);
                String s = m.a(scale.e(), this, 0x7f080157);
                textview.setText(String.format(getString(0x7f080316), new Object[] {
                    s
                }));
                com.fitbit.device.ui.DeviceView.a(scale, (TextView)findViewById(0x7f11034a));
                ((LoadablePicassoImageView)findViewById(0x7f1100ba)).setImageResource(0x7f020055);
                d.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                    final ScaleDetailsActivity a;
                    private boolean b;

                    public void onItemSelected(AdapterView adapterview, View view, int j1, long l1)
                    {
                        if (!b)
                        {
                            com.fitbit.device.ui.ScaleDetailsActivity.b(a);
                            return;
                        } else
                        {
                            b = false;
                            return;
                        }
                    }

                    public void onNothingSelected(AdapterView adapterview)
                    {
                    }

            
            {
                a = ScaleDetailsActivity.this;
                super();
                b = true;
            }
                });
                return;
            }
            i1++;
        } while (true);
    }

    static void b(ScaleDetailsActivity scaledetailsactivity)
    {
        scaledetailsactivity.g();
    }

    private void f()
    {
        Intent intent = getIntent();
        intent.putExtra("EXTRA_PENDING_MESSAGE", getString(0x7f08049d));
        setResult(0, intent);
        finish();
    }

    private void g()
    {
        String s = c.getText().toString();
        if (s.length() == 0)
        {
            s = null;
        }
        String s1 = ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)d.getSelectedItem()).getMeasurementSystem();
        l.c();
        com.fitbit.util.f.a(a(getApplicationContext(), a, s, s1));
    }

    public final b a(Context context, String s, String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.fitbit.device.ui.ScaleDetailsActivity.ARG_DEVICE_ID", s);
        bundle.putString("com.fitbit.device.ui.ScaleDetailsActivity.ARG_SCALE_NAME", s1);
        bundle.putString("com.fitbit.device.ui.ScaleDetailsActivity.ARG_SCALE_UNITS", s2);
        return new b(context, bundle);
    }

    public void a(Loader loader, Pair pair)
    {
        if (pair.second == null && pair.first != null && ((List)pair.first).size() != 0)
        {
            k.d();
            pair = ((List)pair.first).iterator();
            do
            {
                if (!pair.hasNext())
                {
                    break;
                }
                loader = (Scale)pair.next();
                if (!a.equals(loader.c()))
                {
                    continue;
                }
                i = loader;
                if (g.getVisibility() != 0)
                {
                    pair = AnimationUtils.loadAnimation(this, 0x10a0000);
                    g.startAnimation(pair);
                    g.setVisibility(0);
                }
                a(((Scale) (loader)));
                break;
            } while (true);
            return;
        } else
        if (pair.second != null)
        {
            k.a((Exception)pair.second);
            return;
        } else
        {
            k.d();
            f();
            return;
        }
    }

    protected void c()
    {
        g.setVisibility(8);
        k = new l(this, 0x7f1100a4, new com.fitbit.home.ui.l.a() {

            final ScaleDetailsActivity a;

            public void a(l l1)
            {
                l1.c();
                a.getSupportLoaderManager().restartLoader(210, null, a);
            }

            
            {
                a = ScaleDetailsActivity.this;
                super();
            }
        }, new android.content.DialogInterface.OnCancelListener() {

            final ScaleDetailsActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                a.getSupportLoaderManager().getLoader(210).stopLoading();
                a.finish();
            }

            
            {
                a = ScaleDetailsActivity.this;
                super();
            }
        });
        l = new com.fitbit.home.ui.b(this, new com.fitbit.home.ui.b.a() {

            final ScaleDetailsActivity a;

            public void a(com.fitbit.home.ui.b b1)
            {
                com.fitbit.device.ui.ScaleDetailsActivity.b(a);
            }

            
            {
                a = ScaleDetailsActivity.this;
                super();
            }
        });
        com.fitbit.device.ui.a.a(this, 0x7f1101a1, getResources().getString(0x7f08049c));
        j = an.a().a(a);
        if (j == null || j.g() != DeviceType.SCALE)
        {
            f();
            return;
        } else
        {
            ArrayAdapter arrayadapter = new ArrayAdapter(this, 0x1090008, 0x1020014, Scale.a) {

                final ScaleDetailsActivity a;

                public View getDropDownView(int i1, View view, ViewGroup viewgroup)
                {
                    view = super.getDropDownView(i1, view, viewgroup);
                    ((TextView)view.findViewById(0x1020014)).setText(Scale.b[i1]);
                    return view;
                }

                public View getView(int i1, View view, ViewGroup viewgroup)
                {
                    view = super.getView(i1, view, viewgroup);
                    ((TextView)view.findViewById(0x1020014)).setText(Scale.b[i1]);
                    return view;
                }

            
            {
                a = ScaleDetailsActivity.this;
                super(context, i1, j1, aweightunits);
            }
            };
            arrayadapter.setDropDownViewResource(0x1090009);
            d.setAdapter(arrayadapter);
            c.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final ScaleDetailsActivity a;

                public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
                {
                    if (i1 == 6)
                    {
                        com.fitbit.device.ui.ScaleDetailsActivity.b(a);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                a = ScaleDetailsActivity.this;
                super();
            }
            });
            setTitle(j.j());
            k.c();
            getSupportLoaderManager().initLoader(210, null, this);
            return;
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new a(this);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        k.d();
    }

    protected void onResume()
    {
        super.onResume();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.h);
        if (i != null)
        {
            b.setText(m.a(i.e(), this, 0x7f080157));
            e.setText(m.a(i.D(), this, 0x7f080157));
        }
    }

}
