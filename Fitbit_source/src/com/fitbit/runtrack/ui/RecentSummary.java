// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextPaint;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Types.e;
import com.artfulbits.aiCharts.Types.x;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.Type;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.bf;
import com.fitbit.util.fonts.FitbitFont;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            l

public class RecentSummary extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends Drawable
    {

        private final Paint a = new Paint();
        private final Paint b = new Paint();
        private final String c;
        private final String d;
        private final String e;
        private int f;
        private int g;
        private int h;

        public void draw(Canvas canvas)
        {
            canvas.drawText(c, 0.0F, f, a);
            canvas.drawText(d, 0.0F, g, b);
            canvas.drawText(e, 0.0F, h, b);
        }

        public int getOpacity()
        {
            return -3;
        }

        protected void onBoundsChange(Rect rect)
        {
            rect = new Rect();
            a.getTextBounds(c, 0, c.length(), rect);
            g = f * 2 + rect.height();
            b.getTextBounds(d, 0, d.length(), rect);
            int i1 = g;
            h = rect.height() + i1 + f;
        }

        public void setAlpha(int i1)
        {
            a.setAlpha(i1);
            b.setAlpha(i1);
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
            a.setColorFilter(colorfilter);
            b.setColorFilter(colorfilter);
        }

        public a(Context context, String s, String s1, String s2, boolean flag)
        {
            a.setTextSize(context.getResources().getDimension(0x7f0a00b4));
            b.setTextSize(context.getResources().getDimension(0x7f0a00b3));
            a.setColor(context.getResources().getColor(0x7f0f007a));
            b.setColor(0xff000000);
            a.setAntiAlias(true);
            b.setAntiAlias(true);
            a.setTextAlign(android.graphics.Paint.Align.CENTER);
            b.setTextAlign(android.graphics.Paint.Align.CENTER);
            if (flag)
            {
                a.setColor(0xff000000);
                a.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
                b.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
            } else
            {
                a.setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
                b.setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
            }
            c = s;
            d = s1;
            e = s2;
            f = (int)context.getResources().getDimension(0x7f0a00b8);
        }
    }


    private static final String a = com/fitbit/runtrack/ui/RecentSummary.getSimpleName();
    private static final String b = "session";
    private static final String c = "stats";
    private static final int d = 10;
    private static final int e = 5;
    private TextView f;
    private TextView g;
    private ChartView h;
    private ExerciseSession i;
    private View j;
    private View k;

    public RecentSummary()
    {
    }

    public static Fragment a(ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("session", exercisesession);
        bundle.putParcelable("stats", exercisestat);
        exercisesession = new RecentSummary();
        exercisesession.setArguments(bundle);
        return exercisesession;
    }

    private com.artfulbits.aiCharts.Base.ChartAxis.a a(int i1, ExerciseSession exercisesession, ExerciseStat exercisestat, boolean flag)
    {
        Object obj = new SimpleDateFormat("M/d", Locale.getDefault());
        com.fitbit.runtrack.ui.l l1 = new com.fitbit.runtrack.ui.l(an.a().b());
        Object obj1 = an.a().b();
        com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a("", i1);
        obj = ((SimpleDateFormat) (obj)).format(exercisesession.c());
        obj1 = l1.a(getActivity(), exercisestat.a().a(((Profile) (obj1)).t()).b());
        if (SupportedActivity.a(exercisesession) == SupportedActivity.d)
        {
            exercisesession = l1.b(getActivity(), exercisestat);
        } else
        {
            exercisesession = l1.a(getActivity(), exercisestat);
        }
        a1.a(new a(getActivity(), ((String) (obj)), ((String) (obj1)), exercisesession, flag));
        return a1;
    }

    static com.artfulbits.aiCharts.Base.ChartAxis.a a(RecentSummary recentsummary, int i1, ExerciseSession exercisesession, ExerciseStat exercisestat, boolean flag)
    {
        return recentsummary.a(i1, exercisesession, exercisestat, flag);
    }

    static ExerciseSession a(RecentSummary recentsummary)
    {
        return recentsummary.i;
    }

    static String a()
    {
        return a;
    }

    private void a(List list)
    {
        h.h().clear();
        h.g().clear();
        Object obj = an.a().b();
        ChartSeries chartseries = new ChartSeries(x.b);
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            Length length = ((ExerciseStat)((Pair)list.get(i1)).second).a().a(((Profile) (obj)).t());
            chartseries.F().a(i1, new double[] {
                length.b()
            });
        }

        obj = new com.artfulbits.aiCharts.Base.a("Recent Distances");
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a(new com.artfulbits.aiCharts.Base.ChartAxis.b() {

            final RecentSummary a;

            public void a(ChartAxis chartaxis, List list1)
            {
                chartaxis = chartaxis.a();
                list1.clear();
                com.fitbit.runtrack.ui.l l1 = new com.fitbit.runtrack.ui.l(an.a().b());
                for (int j1 = 0; j1 <= chartaxis.m(); j1++)
                {
                    double d1 = j1;
                    double d2 = chartaxis.i();
                    list1.add(new com.artfulbits.aiCharts.Base.ChartAxis.a(l1.a(a.getActivity(), d1 * d2), (double)j1 * chartaxis.i(), 2));
                }

            }

            
            {
                a = RecentSummary.this;
                super();
            }
        });
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().r().setColor(0);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().e(true);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().s().setColor(getResources().getColor(0x7f0f008a));
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().s().setStrokeWidth(getResources().getDimension(0x7f0a00ac));
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a(Alignment.c);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().k().setColor(getResources().getColor(0x7f0f007a));
        ((com.artfulbits.aiCharts.Base.a) (obj)).e().k().setTextSize(getResources().getDimension(0x7f0a00bb));
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a(new com.artfulbits.aiCharts.Base.ChartAxis.b(list) {

            final List a;
            final RecentSummary b;

            public void a(ChartAxis chartaxis, List list1)
            {
                list1.clear();
                chartaxis = a.iterator();
                int j1 = 0;
                while (chartaxis.hasNext()) 
                {
                    Object obj1 = (Pair)chartaxis.next();
                    RecentSummary recentsummary = b;
                    ExerciseSession exercisesession = (ExerciseSession)((Pair) (obj1)).first;
                    obj1 = (ExerciseStat)((Pair) (obj1)).second;
                    boolean flag;
                    if (j1 == a.size() - 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    list1.add(com.fitbit.runtrack.ui.RecentSummary.a(recentsummary, j1, exercisesession, ((ExerciseStat) (obj1)), flag));
                    j1++;
                }
            }

            
            {
                b = RecentSummary.this;
                a = list;
                super();
            }
        });
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a(Alignment.c);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a(false);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().b(15);
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().k().setColor(getResources().getColor(0x7f0f007a));
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().k().setTextSize(getResources().getDimension(0x7f0a00b4));
        ((com.artfulbits.aiCharts.Base.a) (obj)).d().a().a(-0.5D, (double)list.size() - 0.5D);
        ((com.artfulbits.aiCharts.Base.a) (obj)).a(0, (int)getResources().getDimension(0x7f0a00ba), 0, (int)getResources().getDimension(0x7f0a00b9));
        chartseries.e(((com.artfulbits.aiCharts.Base.a) (obj)).a());
        chartseries.a(getResources().getDrawable(0x7f020335));
        chartseries.a(e.i, Float.valueOf(getResources().getDimension(0x7f0a00ae)));
        h.h().add(chartseries);
        h.g().add(obj);
    }

    public void a(Loader loader, List list)
    {
        k.setVisibility(8);
        if (list.size() > 0)
        {
            j.setVisibility(0);
            a(list);
            return;
        }
        loader = null;
        static class _cls4
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[Type.values().length];
                try
                {
                    b[Type.MOBILE_RUN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[SupportedActivity.values().length];
                try
                {
                    a[SupportedActivity.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SupportedActivity.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SupportedActivity.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SupportedActivity.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.runtrack.ui._cls4.a[SupportedActivity.a(i).ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 97
    //                   2 108
    //                   3 119
    //                   4 130;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        g.setText(loader);
        g.setVisibility(0);
        return;
_L2:
        loader = getString(0x7f080422);
        continue; /* Loop/switch isn't completed */
_L3:
        loader = getString(0x7f080421);
        continue; /* Loop/switch isn't completed */
_L4:
        loader = getString(0x7f080423);
        continue; /* Loop/switch isn't completed */
_L5:
        loader = getString(0x7f080420);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new bf(getActivity()) {

            final RecentSummary a;

            protected List a()
            {
                Object obj;
                Object obj1;
                obj = Collections.emptyList();
                obj1 = Calendar.getInstance();
                ((Calendar) (obj1)).setTime(com.fitbit.runtrack.ui.RecentSummary.a(a).c());
                ((Calendar) (obj1)).add(5, 1);
                obj1 = new com.fitbit.data.bl.ActivityBusinessLogic.Request(((Calendar) (obj1)).getTime(), 0, 10, Integer.valueOf((int)com.fitbit.runtrack.ui.RecentSummary.a(a).h()));
                obj1 = new ArrayList(ActivityBusinessLogic.a().a(((com.fitbit.data.bl.ActivityBusinessLogic.Request) (obj1))));
                Iterator iterator = ((List) (obj1)).iterator();
_L2:
                obj = obj1;
                if (!iterator.hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                obj = (ActivityLogEntry)iterator.next();
                Date date = ((ActivityLogEntry) (obj)).e();
                if (!((ActivityLogEntry) (obj)).f() || date.after(com.fitbit.runtrack.ui.RecentSummary.a(a).c()))
                {
                    iterator.remove();
                }
                if (true) goto _L2; else goto _L1
                ServerCommunicationException servercommunicationexception;
                servercommunicationexception;
                obj = obj1;
                obj1 = servercommunicationexception;
_L4:
                com.fitbit.e.a.e(com.fitbit.runtrack.ui.RecentSummary.a(), "Communication error fetching recents", ((Throwable) (obj1)), new Object[0]);
_L1:
                Collections.sort(((List) (obj)), new Comparator(this) {

                    final _cls1 a;

                    public int a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
                    {
                        return activitylogentry.e().compareTo(activitylogentry1.e());
                    }

                    public int compare(Object obj, Object obj1)
                    {
                        return a((ActivityLogEntry)obj, (ActivityLogEntry)obj1);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                if (((List) (obj)).size() > 5)
                {
                    obj1 = ((List) (obj)).iterator();
                    for (; ((List) (obj)).size() > 5; ((Iterator) (obj1)).remove())
                    {
                        ((Iterator) (obj1)).next();
                    }

                }
                obj1 = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    ActivityLogEntry activitylogentry = (ActivityLogEntry)((Iterator) (obj1)).next();
                    if (activitylogentry.f() && activitylogentry.p() == null)
                    {
                        try
                        {
                            ActivityBusinessLogic.a().a(activitylogentry);
                            ActivityBusinessLogic.a().a(Collections.singletonList(activitylogentry));
                        }
                        catch (Exception exception)
                        {
                            com.fitbit.e.a.f(com.fitbit.runtrack.ui.RecentSummary.a(), "Error refreshing details.", exception, new Object[0]);
                        }
                    }
                } while (true);
                b b1 = new b();
                obj1 = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj2 = (ActivityLogEntry)((Iterator) (obj)).next();
                    if (((ActivityLogEntry) (obj2)).p() != null)
                    {
                        obj2 = ((ActivityLogEntry) (obj2)).p();
                        Type type = ((com.fitbit.data.domain.b) (obj2)).b();
                        switch (com.fitbit.runtrack.ui._cls4.b[type.ordinal()])
                        {
                        case 1: // '\001'
                            obj2 = b1.a(UUID.fromString(((com.fitbit.data.domain.b) (obj2)).a()));
                            if (obj2 != null)
                            {
                                ((List) (obj1)).add(Pair.create(obj2, b1.g(((ExerciseSession) (obj2))).first));
                            }
                            break;
                        }
                    }
                } while (true);
                if (((List) (obj1)).isEmpty())
                {
                    obj = null;
                } else
                {
                    obj = ((ExerciseSession)((Pair)((List) (obj1)).get(((List) (obj1)).size() - 1)).first).getUuid();
                }
                if (obj == null || !com.fitbit.runtrack.ui.RecentSummary.a(a).getUuid().equals(obj))
                {
                    obj = (ExerciseStat)a.getArguments().getParcelable("stats");
                    ((List) (obj1)).add(Pair.create(com.fitbit.runtrack.ui.RecentSummary.a(a), obj));
                    if (((List) (obj1)).size() > 5)
                    {
                        ((List) (obj1)).remove(0);
                    }
                }
                return ((List) (obj1));
                obj1;
                if (true) goto _L4; else goto _L3
_L3:
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                a = RecentSummary.this;
                super(context);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0400c4, viewgroup, false);
        i = (ExerciseSession)getArguments().getParcelable("session");
        k = viewgroup.findViewById(0x7f110102);
        j = viewgroup.findViewById(0x7f110255);
        f = (TextView)viewgroup.findViewById(0x7f1104a8);
        g = (TextView)viewgroup.findViewById(0x7f110254);
        layoutinflater = null;
        com.fitbit.runtrack.ui._cls4.a[SupportedActivity.a(i).ordinal()];
        JVM INSTR tableswitch 1 4: default 124
    //                   1 161
    //                   2 172
    //                   3 183
    //                   4 194;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        f.setText(layoutinflater);
        f.setCompoundDrawablesWithIntrinsicBounds(0x7f02028a, 0, 0, 0);
        h = (ChartView)viewgroup.findViewById(0x7f110234);
        return viewgroup;
_L2:
        layoutinflater = getString(0x7f08043f);
        continue; /* Loop/switch isn't completed */
_L3:
        layoutinflater = getString(0x7f08043e);
        continue; /* Loop/switch isn't completed */
_L4:
        layoutinflater = getString(0x7f080440);
        continue; /* Loop/switch isn't completed */
_L5:
        layoutinflater = getString(0x7f08043d);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getLoaderManager().initLoader(0x7f110234, bundle, this);
    }

}
