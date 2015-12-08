// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.e.a;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.util.bf;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.o;
import com.fitbit.util.threading.c;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImpactSummary extends ListFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static final class Impactable extends Enum
    {

        public static final Impactable a;
        public static final Impactable b;
        public static final Impactable c;
        public static final Impactable d;
        private static final Impactable e[];
        final int symbol;
        final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType type;

        public static Impactable valueOf(String s)
        {
            return (Impactable)Enum.valueOf(com/fitbit/runtrack/ui/ImpactSummary$Impactable, s);
        }

        public static Impactable[] values()
        {
            return (Impactable[])e.clone();
        }

        static 
        {
            a = new Impactable("Steps", 0, 0x7f020279, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS);
            b = new Impactable("Calories", 1, 0x7f020277, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES);
            c = new Impactable("ActiveMinutes", 2, 0x7f020276, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE);
            d = new Impactable("Stairs", 3, 0x7f020278, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS);
            e = (new Impactable[] {
                a, b, c, d
            });
        }

        private Impactable(String s, int j, int k, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            super(s, j);
            symbol = k;
            type = timeseriesresourcetype;
        }
    }

    private static class a extends ShapeDrawable
    {

        int a[];
        int b;
        float c;
        final float d;
        final Paint e = new Paint();

        public void a(int j, float f1)
        {
            c = f1;
            b = j;
        }

        public transient void a(int ai[])
        {
            a = ai;
        }

        public void draw(Canvas canvas)
        {
            Rect rect = getBounds();
            e.setStyle(android.graphics.Paint.Style.STROKE);
            e.setStrokeWidth(c);
            e.setColor(b);
            float f1 = (float)rect.width() / 2.1F;
            canvas.drawCircle(rect.centerX(), rect.centerY(), f1, e);
            e.setStyle(android.graphics.Paint.Style.FILL);
            f1 = (Math.min(d, getLevel()) / d) * f1;
            float f2 = f1 / (float)a.length;
            int ai[] = a;
            int k = ai.length;
            for (int j = 0; j < k; j++)
            {
                int l = ai[j];
                e.setColor(l);
                canvas.drawCircle(rect.centerX(), rect.centerY(), f1, e);
                f1 -= f2;
                e.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }

        }

        public a(int j)
        {
            d = j;
            e.setAntiAlias(true);
        }
    }

    private static class b extends com.fitbit.ui.a.c
    {

        private final SparseArray a;
        private final SparseArray b;
        private final NumberFormat c = NumberFormat.getIntegerInstance();

        private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a(Impactable impactable)
        {
            static class _cls2
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[Impactable.values().length];
                    try
                    {
                        b[com.fitbit.runtrack.ui.Impactable.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        b[com.fitbit.runtrack.ui.Impactable.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        b[Impactable.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[Impactable.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    a = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                    try
                    {
                        a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2.b[impactable.ordinal()])
            {
            default:
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS;

            case 1: // '\001'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS;

            case 2: // '\002'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE;

            case 3: // '\003'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES;
            }
        }

        public void a(Impactable impactable, Number number)
        {
            a.put(impactable.type.ordinal(), Double.valueOf(number.doubleValue()));
            com.fitbit.e.a.a(com.fitbit.runtrack.ui.ImpactSummary.a(), String.format("%s being update to %s", new Object[] {
                impactable, number
            }), new Object[0]);
        }

        public boolean areAllItemsEnabled()
        {
            return false;
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            View view1;
            Object obj;
            Object obj1;
            view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04017c, viewgroup, false);
                view1.setTag(new a(view1));
            }
            viewgroup = (a)view1.getTag();
            obj = (Impactable)getItem(j);
            ((a) (viewgroup)).a.setImageResource(((Impactable) (obj)).symbol);
            obj1 = a(((Impactable) (obj)));
            view = (Double)a.get(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj1)).ordinal());
            if (view == null || view.doubleValue() < 1.0D)
            {
                view = (Double)b.get(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj1)).ordinal());
            }
            double d1 = ((Double)b.get(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj1)).ordinal())).doubleValue();
            obj1 = Double.valueOf(Math.max(view.doubleValue(), d1));
            ((a) (viewgroup)).a.getBackground().setLevel((int)((d1 / ((Double) (obj1)).doubleValue()) * 100D));
            ((a) (viewgroup)).b.setText(String.format("+%s", new Object[] {
                c.format(Math.round(d1))
            }));
            _cls2.b[((Impactable) (obj)).ordinal()];
            JVM INSTR tableswitch 1 4: default 248
        //                       1 402
        //                       2 416
        //                       3 409
        //                       4 423;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            j = 0;
_L7:
            view = ((a) (viewgroup)).c.getContext();
            obj = SpannableString.valueOf(Html.fromHtml(view.getResources().getQuantityString(j, ((Double) (obj1)).intValue(), new Object[] {
                c.format(((Double) (obj1)).intValue())
            })));
            StyleSpan astylespan[] = (StyleSpan[])((SpannableString) (obj)).getSpans(0, ((SpannableString) (obj)).length(), android/text/style/StyleSpan);
            int k = astylespan.length;
            for (j = 0; j < k; j++)
            {
                StyleSpan stylespan = astylespan[j];
                int l = ((SpannableString) (obj)).getSpanEnd(stylespan);
                int i1 = ((SpannableString) (obj)).getSpanStart(stylespan);
                int j1 = ((SpannableString) (obj)).getSpanFlags(stylespan);
                ((SpannableString) (obj)).setSpan(new TypefaceSpan(this, "bold", FitbitFont.g.a(view, Typeface.DEFAULT)) {

                    final Typeface a;
                    final b b;

                    private void a(TextPaint textpaint)
                    {
                        boolean flag;
                        if ((a.getStyle() & 1) != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        textpaint.setFakeBoldText(flag);
                        textpaint.setTypeface(a);
                    }

                    public void updateDrawState(TextPaint textpaint)
                    {
                        a(textpaint);
                    }

                    public void updateMeasureState(TextPaint textpaint)
                    {
                        a(textpaint);
                    }

            
            {
                b = b1;
                a = typeface;
                super(s);
            }
                }, i1, l, j1);
            }

            break; /* Loop/switch isn't completed */
_L2:
            j = 0x7f0b0013;
            continue; /* Loop/switch isn't completed */
_L4:
            j = 0x7f0b0011;
            continue; /* Loop/switch isn't completed */
_L3:
            j = 0x7f0b0010;
            continue; /* Loop/switch isn't completed */
_L5:
            j = 0x7f0b0012;
            if (true) goto _L7; else goto _L6
_L6:
            ((a) (viewgroup)).c.setText(((CharSequence) (obj)));
            return view1;
        }

        public boolean isEnabled(int j)
        {
            return false;
        }

        public b(Profile profile, SparseArray sparsearray, SparseArray sparsearray1)
        {
            b = sparsearray;
            a = sparsearray1;
            profile = Impactable.values();
            int k = profile.length;
            for (int j = 0; j < k; j++)
            {
                sparsearray = profile[j];
                com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = a(sparsearray);
                if (((Double)sparsearray1.get(timeseriesresourcetype.ordinal(), Double.valueOf(0.0D))).doubleValue() > 0.0D && ((Double)b.get(timeseriesresourcetype.ordinal(), Double.valueOf(0.0D))).doubleValue() > 0.0D)
                {
                    add(sparsearray);
                }
            }

        }
    }

    private static class b.a
    {

        public final ImageView a;
        public final TextView b;
        public final TextView c;

        public b.a(View view)
        {
            a = (ImageView)view.findViewById(0x7f1100c4);
            b = (TextView)view.findViewById(0x7f110429);
            c = (TextView)view.findViewById(0x7f11042a);
            a a1 = new a(100);
            view = view.getContext();
            a1.a(view.getResources().getColor(0x7f0f008d), 5F);
            int ai[] = new int[4];
            int[] _tmp = ai;
            ai[0] = 0x30000;
            ai[1] = 0x40000;
            ai[2] = 0x20000;
            ai[3] = 0x70000;
            int ai1[] = new int[7];
            ai1[0] = view.getResources().getColor(0x7f0f008c);
            for (int j = 1; j < ai1.length; j++)
            {
                ai1[j] = ai1[j - 1] + ai[(j - 1) % ai.length];
            }

            a1.a(ai1);
            a.setBackgroundDrawable(a1);
        }
    }

    public static class c extends bf
    {

        private static final String a = com/fitbit/runtrack/ui/ImpactSummary.getSimpleName();
        private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType b[];
        private final Date c;
        private final Date d;
        private SparseArray e;
        private final String g;

        private static com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            switch (com.fitbit.runtrack.ui._cls2.a[timeseriesresourcetype.ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY;

            case 2: // '\002'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY;

            case 3: // '\003'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY;

            case 4: // '\004'
                return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY;
            }
        }

        protected Pair a()
        {
            ArrayList arraylist;
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[];
            int j;
            int k;
            arraylist = new ArrayList(b.length);
            atimeseriesresourcetype = b;
            k = atimeseriesresourcetype.length;
            j = 0;
_L8:
            if (j >= k) goto _L2; else goto _L1
_L1:
            double d1;
            Object obj;
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype;
            timeseriesresourcetype = atimeseriesresourcetype[j];
            obj = fs.a().a(timeseriesresourcetype, c);
            if (obj == null)
            {
                com.fitbit.e.a.d(a, String.format("Did not find data locally for %s, loading from site", new Object[] {
                    timeseriesresourcetype
                }), new Object[0]);
                double d2;
                try
                {
                    arraylist.addAll(fs.a().b(timeseriesresourcetype, o.a(c), o.e(c)));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    com.fitbit.e.a.e(a, "Error talking to the server", ((Throwable) (obj)), new Object[0]);
                }
            } else
            {
                com.fitbit.e.a.d(a, String.format("Found Data for %s, the value of the data is %s%s", new Object[] {
                    timeseriesresourcetype, Double.valueOf(((TimeSeriesObject) (obj)).b()), ((TimeSeriesObject) (obj)).d()
                }), new Object[0]);
                arraylist.add(obj);
            }
            if (e.get(timeseriesresourcetype.ordinal(), null) != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            com.fitbit.e.a.d(a, String.format("Did not have precomputed Total for duration for %s between %s and %s", new Object[] {
                timeseriesresourcetype, c, d
            }), new Object[0]);
            if (timeseriesresourcetype != com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES || g == null) goto _L4; else goto _L3
_L3:
            obj = fs.a().a(a(timeseriesresourcetype), c, d, g);
_L7:
            obj = ((List) (obj)).iterator();
            d1 = 0.0D;
_L6:
            if (!((Iterator) (obj)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            d2 = ((TimeSeriesObject)((Iterator) (obj)).next()).b();
            d1 = d2 + d1;
            if (true) goto _L6; else goto _L5
_L4:
            obj = fs.a().d(a(timeseriesresourcetype), c, d);
              goto _L7
_L5:
            try
            {
                com.fitbit.e.a.d(a, String.format("Found total for duration of impact to be %s", new Object[] {
                    Double.valueOf(d1)
                }), new Object[0]);
                e.put(timeseriesresourcetype.ordinal(), Double.valueOf(d1));
            }
            catch (ServerCommunicationException servercommunicationexception)
            {
                com.fitbit.e.a.f(a, "Error talking to server when computing total", servercommunicationexception, new Object[0]);
            }
            j++;
              goto _L8
_L2:
            return Pair.create(arraylist, e);
        }

        protected Object f_()
        {
            return a();
        }


        public transient c(Context context, Date date, Date date1, SparseArray sparsearray, String s, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[])
        {
            super(context);
            b = atimeseriesresourcetype;
            c = date;
            d = date1;
            e = sparsearray;
            g = s;
        }
    }


    private static final String a = com/fitbit/runtrack/ui/ImpactSummary.getSimpleName();
    private static final String b = "start_time";
    private static final String c = "end_time";
    private static final String d = "calorie_link";
    private static final String e = "percomputed_keys";
    private static final String f = "percomputed_values";
    private b g;
    private View h;
    private com.fitbit.util.threading.c i;

    public ImpactSummary()
    {
        i = new com.fitbit.util.threading.c() {

            final ImpactSummary a;

            protected void a(Intent intent)
            {
                if (TextUtils.equals("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED", intent.getAction()) && com.fitbit.runtrack.ui.ImpactSummary.a(a) != null)
                {
                    intent = (LiveDataPacket)intent.getParcelableExtra("com.fitbit.livedata.LiveDataBroadcaster.EXTRA_LIVE_DATA_PACKET");
                    com.fitbit.runtrack.ui.ImpactSummary.a(a).a(com.fitbit.runtrack.ui.Impactable.a, Integer.valueOf(intent.a()));
                    com.fitbit.runtrack.ui.ImpactSummary.a(a).a(Impactable.d, Double.valueOf(intent.c()));
                    com.fitbit.runtrack.ui.ImpactSummary.a(a).a(Impactable.b, Integer.valueOf(intent.b()));
                    com.fitbit.runtrack.ui.ImpactSummary.a(a).notifyDataSetChanged();
                }
            }

            
            {
                a = ImpactSummary.this;
                super();
            }
        };
    }

    private static double a(ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        exercisestat = exercisestat.a();
        exercisesession = SupportedActivity.a(exercisesession).a(an.a().b());
        double d1 = exercisestat.b() / exercisesession.a((com.fitbit.data.domain.Length.LengthUnits)exercisestat.a()).b();
        com.fitbit.e.a.a(a, String.format("Steps: %s", new Object[] {
            Double.valueOf(d1)
        }), new Object[0]);
        return d1;
    }

    public static Fragment a(ActivityLogEntry activitylogentry)
    {
        Bundle bundle = new Bundle();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(activitylogentry.e());
        calendar.add(13, activitylogentry.a(TimeUnit.SECONDS));
        bundle.putLong("start_time", activitylogentry.e().getTime());
        bundle.putLong("end_time", calendar.getTimeInMillis());
        a(bundle, activitylogentry, null, null);
        activitylogentry = new ImpactSummary();
        activitylogentry.setArguments(bundle);
        return activitylogentry;
    }

    public static Fragment a(ExerciseSession exercisesession, ExerciseStat exercisestat, ActivityLogEntry activitylogentry)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("start_time", exercisesession.c().getTime());
        bundle.putLong("end_time", exercisesession.e().getTime());
        a(bundle, activitylogentry, exercisesession, exercisestat);
        exercisesession = new ImpactSummary();
        exercisesession.setArguments(bundle);
        return exercisesession;
    }

    static b a(ImpactSummary impactsummary)
    {
        return impactsummary.g;
    }

    static String a()
    {
        return a;
    }

    private static void a(Bundle bundle, ActivityLogEntry activitylogentry, ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[];
        int j;
        int k;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        atimeseriesresourcetype = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values();
        k = atimeseriesresourcetype.length;
        j = 0;
_L7:
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        timeseriesresourcetype = atimeseriesresourcetype[j];
        com.fitbit.runtrack.ui._cls2.a[timeseriesresourcetype.ordinal()];
        JVM INSTR tableswitch 1 4: default 84
    //                   1 93
    //                   2 173
    //                   3 253
    //                   4 292;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_292;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        if (activitylogentry.getServerId() != -1L)
        {
            arraylist.add(Integer.toString(timeseriesresourcetype.ordinal()));
            arraylist1.add(Integer.toString(activitylogentry.c()));
        } else
        if (exercisesession != null && exercisestat != null)
        {
            arraylist.add(Integer.toString(timeseriesresourcetype.ordinal()));
            arraylist1.add(Double.toString(a(exercisesession, exercisestat)));
        }
          goto _L8
_L3:
        if (activitylogentry.getServerId() != -1L)
        {
            arraylist.add(Integer.toString(timeseriesresourcetype.ordinal()));
            arraylist1.add(Integer.toString(activitylogentry.n()));
        } else
        if (exercisesession != null && exercisestat != null)
        {
            arraylist.add(Integer.toString(timeseriesresourcetype.ordinal()));
            arraylist1.add(Double.toString(b(exercisesession, exercisestat)));
        }
          goto _L8
_L4:
        if (exercisesession != null && exercisestat != null)
        {
            arraylist.add(Integer.toString(timeseriesresourcetype.ordinal()));
            arraylist1.add(Double.toString(c(exercisesession, exercisestat)));
        }
          goto _L8
        if (activitylogentry.getServerId() != -1L)
        {
            arraylist.add(Integer.toString(timeseriesresourcetype.ordinal()));
            arraylist1.add(Integer.toString(activitylogentry.w() + activitylogentry.x()));
        }
          goto _L8
        bundle.putStringArrayList("percomputed_keys", arraylist);
        bundle.putStringArrayList("percomputed_values", arraylist1);
        return;
    }

    private static double b(ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        double d1 = com.fitbit.activity.a.a(exercisestat.b(), exercisesession.c());
        com.fitbit.e.a.a(a, String.format("Calories calculated %s", new Object[] {
            Double.valueOf(d1)
        }), new Object[0]);
        return d1;
    }

    private static double c(ExerciseSession exercisesession, ExerciseStat exercisestat)
    {
        return exercisestat.d().b();
    }

    public void a(Loader loader, Pair pair)
    {
        h.setVisibility(8);
        SparseArray sparsearray = (SparseArray)pair.second;
        SparseArray sparsearray1 = new SparseArray();
        double d1;
        double d2;
        TimeSeriesObject timeseriesobject;
        for (Iterator iterator = ((List)pair.first).iterator(); iterator.hasNext(); sparsearray1.put(timeseriesobject.d().ordinal(), Double.valueOf(d1 + d2)))
        {
            timeseriesobject = (TimeSeriesObject)iterator.next();
            pair = (Double)sparsearray1.get(timeseriesobject.d().ordinal(), null);
            loader = pair;
            if (pair == null)
            {
                loader = Double.valueOf(0.0D);
            }
            d1 = loader.doubleValue();
            d2 = timeseriesobject.b();
        }

        loader = new b(an.a().b(), sparsearray, sparsearray1);
        g = loader;
        setListAdapter(loader);
        if (o.i(new Date(getArguments().getLong("start_time"))))
        {
            i.a(new IntentFilter("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED"));
        }
    }

    public Loader onCreateLoader(int j, Bundle bundle)
    {
        Date date = new Date(bundle.getLong("start_time"));
        Date date1 = new Date(bundle.getLong("end_time"));
        String s = bundle.getString("calorie_link");
        SparseArray sparsearray = new SparseArray();
        ArrayList arraylist = bundle.getStringArrayList("percomputed_keys");
        bundle = bundle.getStringArrayList("percomputed_values");
        if (arraylist != null && bundle != null)
        {
            int k = Math.min(arraylist.size(), bundle.size());
            for (j = 0; j < k; j++)
            {
                com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values()[Integer.valueOf((String)arraylist.get(j)).intValue()];
                double d1 = Double.parseDouble((String)bundle.get(j));
                sparsearray.put(timeseriesresourcetype.ordinal(), Double.valueOf(d1));
            }

        }
        return new c(getActivity(), date, date1, sparsearray, s, new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[] {
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400a9, viewgroup, false);
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        h = layoutinflater.findViewById(0x7f110102);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f1104a8);
        viewgroup.setText(0x7f080280);
        viewgroup.setCompoundDrawablesWithIntrinsicBounds(0x7f020275, 0, 0, 0);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        i.d();
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getLoaderManager().initLoader(0x7f110429, getArguments(), this);
    }

}
