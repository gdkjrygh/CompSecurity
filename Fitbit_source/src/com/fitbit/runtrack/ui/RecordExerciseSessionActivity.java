// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.animation.Animator;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.e.a;
import com.fitbit.maps.CameraPosition;
import com.fitbit.maps.FitbitMapOptions;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.e;
import com.fitbit.maps.g;
import com.fitbit.maps.h;
import com.fitbit.maps.l;
import com.fitbit.runtrack.AudioCueBroadcastReceiver;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.ExerciseLocationService;
import com.fitbit.runtrack.SpeechService;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.runtrack.j;
import com.fitbit.savedstate.ActivityLoggingState;
import com.fitbit.savedstate.MobileRunSavedState;
import com.fitbit.savedstate.s;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.d;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.ap;
import com.fitbit.util.threading.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.runtrack.ui:
//            n, ExerciseSessionStateBroadcaster, PathTrackingMapFragment, a, 
//            LiveExerciseTrackingFragment, ExerciseDetailsActivity

public class RecordExerciseSessionActivity extends FitbitActivity
    implements android.animation.Animator.AnimatorListener, android.view.View.OnClickListener, android.view.View.OnTouchListener, android.widget.CompoundButton.OnCheckedChangeListener, com.fitbit.maps.g.a, com.fitbit.maps.g.b, l, com.fitbit.util.SimpleConfirmDialogFragment.a
{
    private static class a extends FragmentStatePagerAdapter
    {

        final ExerciseSession a;
        final Context b;
        final com.fitbit.runtrack.data.b c;
        final ExerciseSessionStateBroadcaster d;
        final g e;
        private LiveExerciseTrackingFragment f;
        private PathTrackingMapFragment g;

        static PathTrackingMapFragment a(a a1)
        {
            return a1.g;
        }

        public LiveExerciseTrackingFragment a()
        {
            if (f == null)
            {
                LiveExerciseTrackingFragment liveexercisetrackingfragment = d();
                f = liveexercisetrackingfragment;
                return liveexercisetrackingfragment;
            } else
            {
                return f;
            }
        }

        public PathTrackingMapFragment b()
        {
            if (g == null)
            {
                PathTrackingMapFragment pathtrackingmapfragment = c();
                g = pathtrackingmapfragment;
                return pathtrackingmapfragment;
            } else
            {
                return g;
            }
        }

        public PathTrackingMapFragment c()
        {
            Object obj = com.fitbit.runtrack.ui.PathTrackingMapFragment.a();
            Location location = e.e();
            if (location != null)
            {
                ((FitbitMapOptions) (obj)).a(CameraPosition.a(new LatLng(location.getLatitude(), location.getLongitude()), 20F));
            }
            obj = (new PathTrackingMapFragment.c()).a(((FitbitMapOptions) (obj))).b().a().c();
            ((PathTrackingMapFragment) (obj)).a(new Runnable(this) {

                final a a;

                public void run()
                {
                    com.fitbit.e.a.a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), "Registering Session State Callbacks for live mapview", new Object[0]);
                    a.d.a(com.fitbit.runtrack.ui.a.a(a), a.c);
                }

            
            {
                a = a1;
                super();
            }
            });
            return ((PathTrackingMapFragment) (obj));
        }

        public LiveExerciseTrackingFragment d()
        {
            Location location = null;
            LiveExerciseTrackingFragment liveexercisetrackingfragment = new LiveExerciseTrackingFragment();
            liveexercisetrackingfragment.a(new Runnable(this, liveexercisetrackingfragment) {

                final LiveExerciseTrackingFragment a;
                final a b;

                public void run()
                {
                    com.fitbit.e.a.a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), "Registering Session State Callbacks for live stats view", new Object[0]);
                    b.d.a(a, b.c);
                }

            
            {
                b = a1;
                a = liveexercisetrackingfragment;
                super();
            }
            });
            com.fitbit.runtrack.data.b b1 = new com.fitbit.runtrack.data.b();
            Object obj = b();
            if (obj != null)
            {
                obj = ((PathTrackingMapFragment) (obj)).b();
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                location = ((h) (obj)).l();
            }
            b1.a(a, location);
            b.startService(ExerciseLocationService.a(b, a));
            if (MobileRunSavedState.h())
            {
                obj = MobileRunSavedState.c();
                if (com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b.equals(obj))
                {
                    (new j(b)).a(a);
                } else
                if (com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a.equals(obj))
                {
                    LocalBroadcastManager.getInstance(b).registerReceiver(RecordExerciseSessionActivity.i(), new IntentFilter("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE"));
                    return liveexercisetrackingfragment;
                }
            }
            return liveexercisetrackingfragment;
        }

        public int getCount()
        {
            return 2;
        }

        public Fragment getItem(int i1)
        {
            if (i1 == 0)
            {
                return a();
            } else
            {
                return b();
            }
        }

        public a(Context context, FragmentManager fragmentmanager, com.fitbit.runtrack.data.b b1, ExerciseSessionStateBroadcaster exercisesessionstatebroadcaster, g g1, ExerciseSession exercisesession)
        {
            super(fragmentmanager);
            b = context;
            c = b1;
            d = exercisesessionstatebroadcaster;
            e = g1;
            a = exercisesession;
        }
    }

    private static final class b extends AsyncTask
    {

        private static final String a = "RECORD ACTIVITY";
        private final c b;
        private final ExerciseSession c;

        protected transient Void a(ActivityLogEntry aactivitylogentry[])
        {
            ActivityLogEntry activitylogentry = aactivitylogentry[0];
            SupportedActivity supportedactivity = SupportedActivity.a(c);
            try
            {
                aactivitylogentry = supportedactivity.a();
            }
            // Misplaced declaration of an exception variable
            catch (ActivityLogEntry aactivitylogentry[])
            {
                com.fitbit.e.a.e("RECORD ACTIVITY", String.format("Have no local data for %s, assuming defaults until next sync", new Object[] {
                    supportedactivity.name()
                }), aactivitylogentry, new Object[0]);
                aactivitylogentry = new ActivityItem();
                aactivitylogentry.a(supportedactivity.name);
                aactivitylogentry.a(true);
                aactivitylogentry.setServerId(supportedactivity.id);
                aactivitylogentry.b(false);
                aactivitylogentry.a(1.0D);
                aactivitylogentry = ActivityBusinessLogic.a().a(aactivitylogentry);
            }
            activitylogentry.a(aactivitylogentry);
            if (aactivitylogentry == null)
            {
                aactivitylogentry = "";
            } else
            {
                aactivitylogentry = aactivitylogentry.a();
            }
            activitylogentry.c(aactivitylogentry);
            ActivityBusinessLogic.a().a(activitylogentry, FitBitApplication.a());
            return null;
        }

        protected void a(Void void1)
        {
            b.a();
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((ActivityLogEntry[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Void)obj);
        }

        public b(c c1, ExerciseSession exercisesession)
        {
            b = c1;
            c = exercisesession;
        }
    }

    public static interface c
    {

        public abstract void a();
    }

    public static class d
        implements Interpolator
    {

        private float a(float f1)
        {
            float f2 = 1.0F;
            if (f1 < 0.04166667F)
            {
                f2 = 0.0F;
            } else
            {
                if (f1 < 0.08333334F)
                {
                    return -0.0192037F;
                }
                if ((double)f1 < 0.125D)
                {
                    return -0.05487037F;
                }
                if (f1 < 0.1666667F)
                {
                    return -0.07407407F;
                }
                if (f1 < 0.2083333F)
                {
                    return 0.008916667F;
                }
                if ((double)f1 < 0.25D)
                {
                    return 0.2163889F;
                }
                if (f1 < 0.2916667F)
                {
                    return 0.4861111F;
                }
                if (f1 < 0.3333333F)
                {
                    return 0.7558333F;
                }
                if ((double)f1 < 0.375D)
                {
                    return 0.9633055F;
                }
                if (f1 < 0.4166667F)
                {
                    return 1.046296F;
                }
                if (f1 < 0.4583333F)
                {
                    return 1.0455F;
                }
                if ((double)f1 < 0.5D)
                {
                    return 1.041741F;
                }
                if (f1 < 0.5416667F)
                {
                    return 1.0315F;
                }
                if (f1 < 0.5833333F)
                {
                    return 1.020981F;
                }
                if (f1 < 0.625F)
                {
                    return 1.014546F;
                }
                if (f1 < 0.6666667F)
                {
                    return 1.010315F;
                }
                if (f1 < 0.7083333F)
                {
                    return 1.007315F;
                }
                if (f1 < 0.75F)
                {
                    return 1.005111F;
                }
                if (f1 < 0.7916667F)
                {
                    return 1.003472F;
                }
                if (f1 < 0.8333333F)
                {
                    return 1.002241F;
                }
                if (f1 < 0.875F)
                {
                    return 1.001352F;
                }
                if (f1 < 0.9166667F)
                {
                    return 1.000713F;
                }
                if (f1 < 0.9583333F)
                {
                    return 1.000306F;
                }
                if (f1 < 1.0F)
                {
                    return 1.000074F;
                }
            }
            return f2;
        }

        public float getInterpolation(float f1)
        {
            float f2 = a(f1);
            float f3 = Math.min(1.0F, (float)((int)(24F * f1) + 1) / 24F);
            float f4 = Math.min((float)(int)(24F * f1) / 24F, 1.0F);
            f4 = (f1 - f4) / (f3 - f4);
            f1 = f2;
            if (!Double.isNaN(f4))
            {
                f1 = f2 + (a(f3) - f2) * f4;
            }
            return f1;
        }

        public d()
        {
        }
    }

    public static class e
        implements Interpolator
    {

        private final float a;
        private final float b;
        private final float c;

        public float getInterpolation(float f1)
        {
            float f2 = 1.0F;
            if (f1 < a)
            {
                f2 = f1 / a;
            } else
            if (f1 < 1.0F)
            {
                double d1 = (double)b * 3.1415926535897931D * 2D;
                double d2 = 1.0F / a;
                return 1.0F + (float)((Math.sin((double)(f1 - a) * d1) / Math.exp(c * (f1 - a)) / d1) * d2);
            }
            return f2;
        }

        public e(float f1, float f2, float f3)
        {
            a = f1;
            b = f2;
            c = f3;
        }
    }

    public static final class f extends AsyncTask
    {

        private static final String a = "wireId";
        private final Activity b;
        private final PathTrackingMapFragment c;
        private final SupportedActivity d;
        private boolean e;

        protected transient ExerciseSession a(Void avoid[])
        {
            if (TextUtils.isEmpty(com.fitbit.savedstate.s.a()))
            {
                try
                {
                    avoid = dg.d().a().D();
                    if (avoid.has("wireId"))
                    {
                        com.fitbit.savedstate.s.a(avoid.getString("wireId"));
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    com.fitbit.e.a.f(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), avoid.getMessage(), avoid, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    com.fitbit.e.a.f(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), avoid.getMessage(), avoid, new Object[0]);
                }
            }
            return new ExerciseSession(d.id);
        }

        protected void a(ExerciseSession exercisesession)
        {
            super.onPostExecute(exercisesession);
            b.startActivity(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.a(b, exercisesession));
            if (e)
            {
                b.finish();
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((ExerciseSession)obj);
        }

        public f(Activity activity, PathTrackingMapFragment pathtrackingmapfragment, SupportedActivity supportedactivity)
        {
            this(activity, pathtrackingmapfragment, supportedactivity, false);
        }

        public f(Activity activity, PathTrackingMapFragment pathtrackingmapfragment, SupportedActivity supportedactivity, boolean flag)
        {
            d = supportedactivity;
            c = pathtrackingmapfragment;
            b = activity;
            e = flag;
        }
    }


    private static final int c = 850;
    private static final String d = "session_paused";
    private static final String e = "session";
    private static final String f = "recent_segment";
    private static final String g = "no_activity_dialog";
    private static final String h = com/fitbit/runtrack/ui/RecordExerciseSessionActivity.getSimpleName();
    private static final int i = 10;
    private static final IntentFilter j = new IntentFilter("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE");
    private static final BroadcastReceiver z = new AudioCueBroadcastReceiver();
    private final com.fitbit.util.threading.c A = new com.fitbit.util.threading.c() {

        final RecordExerciseSessionActivity a;

        protected void a(Intent intent)
        {
            if (TextUtils.equals("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE", intent.getAction()))
            {
                Object obj = com.fitbit.runtrack.c.e(intent);
                if (obj != null)
                {
                    com.fitbit.runtrack.ui.RecordExerciseSessionActivity.a(a, ((ExerciseStat) (obj)));
                }
                List list1 = com.fitbit.runtrack.c.d(intent);
                List list = com.fitbit.runtrack.c.a(intent);
                a.a(list);
                LiveExerciseTrackingFragment liveexercisetrackingfragment = com.fitbit.runtrack.ui.RecordExerciseSessionActivity.a(a).a();
                if (liveexercisetrackingfragment != null && liveexercisetrackingfragment.isVisible())
                {
                    if (obj != null && list1 != null)
                    {
                        liveexercisetrackingfragment.a(((ExerciseStat) (obj)), list1);
                    }
                    liveexercisetrackingfragment.a(list);
                }
                intent = com.fitbit.runtrack.c.b(intent);
                obj = com.fitbit.runtrack.ui.RecordExerciseSessionActivity.a(a).b();
                if (intent != null && obj != null && ((PathTrackingMapFragment) (obj)).isVisible())
                {
                    ((PathTrackingMapFragment) (obj)).a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.b(a), intent, list);
                }
            }
        }

            
            {
                a = RecordExerciseSessionActivity.this;
                super();
            }
    };
    private com.fitbit.runtrack.data.b k;
    private ExerciseSession l;
    private TextView m;
    private TextView n;
    private ExerciseSessionStateBroadcaster o;
    private ViewPager p;
    private a q;
    private g r;
    private boolean s;
    private ExerciseSegment t;
    private boolean u;
    private View v;
    private TextView w;
    private View x;
    private ExerciseStat y;

    public RecordExerciseSessionActivity()
    {
    }

    private float a(float f1)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i1 = displaymetrics.widthPixels;
        int j1 = displaymetrics.heightPixels;
        return (float)(Math.sqrt(j1 * j1 + i1 * i1) / (double)f1);
    }

    public static Intent a(Context context, ExerciseSession exercisesession)
    {
        context = new Intent(context, com/fitbit/runtrack/ui/RecordExerciseSessionActivity);
        context.putExtra("session", exercisesession);
        return context;
    }

    static ExerciseStat a(RecordExerciseSessionActivity recordexercisesessionactivity, ExerciseStat exercisestat)
    {
        recordexercisesessionactivity.y = exercisestat;
        return exercisestat;
    }

    static a a(RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        return recordexercisesessionactivity.q;
    }

    private String a(SupportedActivity supportedactivity, double d1, double d2)
    {
        Random random = new Random();
        ArrayList arraylist = new ArrayList();
        if (d2 < 3D)
        {
            arraylist.addAll(Arrays.asList(getResources().getStringArray(0x7f09000d)));
            return (String)arraylist.get(random.nextInt(arraylist.size()));
        }
        if (supportedactivity.type == com.fitbit.savedstate.MobileRunSavedState.TrackType.a || d1 > 5D)
        {
            List list = a(d1);
            arraylist.addAll(list);
            if (supportedactivity.type == com.fitbit.savedstate.MobileRunSavedState.TrackType.a)
            {
                arraylist.addAll(list);
            }
        }
        arraylist.addAll(b(d2));
        arraylist.addAll(Arrays.asList(getResources().getStringArray(0x7f09000e)));
        return (String)arraylist.get(random.nextInt(arraylist.size()));
    }

    private List a(double d1)
    {
        int i1;
        if (d1 < 2D)
        {
            i1 = 0x7f090000;
        } else
        if (d1 < 3D)
        {
            i1 = 0x7f090001;
        } else
        if (d1 < 3.2000000000000002D)
        {
            i1 = 0x7f090005;
        } else
        if (d1 < 4.9000000000000004D)
        {
            i1 = 0x7f090006;
        } else
        if (d1 < 6.0999999999999996D)
        {
            i1 = 0x7f090007;
        } else
        if (d1 < 6.5D)
        {
            i1 = 0x7f090008;
        } else
        if (d1 < 10D)
        {
            i1 = 0x7f090009;
        } else
        if (d1 < 13D)
        {
            i1 = 0x7f09000a;
        } else
        if (d1 < 14D)
        {
            i1 = 0x7f09000b;
        } else
        if (d1 < 20D)
        {
            i1 = 0x7f09000c;
        } else
        if (d1 < 26D)
        {
            i1 = 0x7f090002;
        } else
        if (d1 < 27.199999999999999D)
        {
            i1 = 0x7f090003;
        } else
        {
            i1 = 0x7f090004;
        }
        return Arrays.asList(getResources().getStringArray(i1));
    }

    private void a(l l1)
    {
        if (l1 != null)
        {
            r.b(l1);
            return;
        } else
        {
            com.fitbit.e.a.a(h, "location updates removal failed because listener was null", new Object[0]);
            return;
        }
    }

    private void a(ExerciseSession exercisesession)
    {
        (new AsyncTask() {

            final RecordExerciseSessionActivity a;

            protected transient Pair a(ExerciseSession aexercisesession[])
            {
                return Pair.create(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.b(a).e(aexercisesession[0]), com.fitbit.runtrack.ui.RecordExerciseSessionActivity.b(a).g(aexercisesession[0]));
            }

            protected void a(Pair pair)
            {
                super.onPostExecute(pair);
                com.fitbit.e.a.a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), "Finishing Exercise Session", new Object[0]);
                List list = (List)pair.first;
                double d1 = ((ExerciseStat)((Pair)pair.second).first).a().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b();
                if (list.isEmpty() || list.size() < 2 || Double.isNaN(d1) || d1 <= 10D)
                {
                    pair = SimpleConfirmDialogFragment.a(a, 0x7f080485, 0x7f080160, 0x7f080416, 0x7f080415);
                    ad.a(a.getSupportFragmentManager(), "no_activity_dialog", pair);
                    return;
                } else
                {
                    com.fitbit.runtrack.ui.RecordExerciseSessionActivity.c(a);
                    return;
                }
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((ExerciseSession[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Pair)obj);
            }

            
            {
                a = RecordExerciseSessionActivity.this;
                super();
            }
        }).execute(new ExerciseSession[] {
            exercisesession
        });
    }

    private void a(boolean flag)
    {
        n n1;
        n1 = (new n(flag)).a().a(SupportedActivity.a(l));
        if (y != null)
        {
            n1.a(y.a()).a(y.c());
        }
        flag = MobileRunSavedState.h();
        n1.a(flag);
        if (!flag) goto _L2; else goto _L1
_L1:
        java.util.EnumSet enumset;
        com.fitbit.savedstate.MobileRunSavedState.FrequencyType frequencytype;
        enumset = MobileRunSavedState.g();
        n1.a(0.8F);
        frequencytype = MobileRunSavedState.c();
        if (frequencytype != com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a) goto _L4; else goto _L3
_L3:
        n1.a(MobileRunSavedState.d(), com.fitbit.data.domain.Length.LengthUnits.MILES);
_L6:
        n1.a((com.fitbit.savedstate.MobileRunSavedState.AudioCue[])enumset.toArray(new com.fitbit.savedstate.MobileRunSavedState.AudioCue[enumset.size()]));
        n1.f();
_L2:
        return;
_L4:
        if (frequencytype == com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b)
        {
            n1.a(MobileRunSavedState.e());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static com.fitbit.runtrack.data.b b(RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        return recordexercisesessionactivity.k;
    }

    private List b(double d1)
    {
        int i1;
        if (d1 < 25D)
        {
            i1 = 0x7f09000f;
        } else
        if (d1 < 35D)
        {
            i1 = 0x7f090010;
        } else
        if (d1 < 40D)
        {
            i1 = 0x7f090011;
        } else
        if (d1 < 50D)
        {
            i1 = 0x7f090012;
        } else
        if (d1 < 60D)
        {
            i1 = 0x7f090013;
        } else
        if (d1 < 120D)
        {
            i1 = 0x7f090014;
        } else
        {
            i1 = 0x7f090015;
        }
        return Arrays.asList(getResources().getStringArray(i1));
    }

    static void c(RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        recordexercisesessionactivity.j();
    }

    static com.fitbit.util.threading.c d(RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        return recordexercisesessionactivity.A;
    }

    static String g()
    {
        return h;
    }

    static IntentFilter h()
    {
        return j;
    }

    static BroadcastReceiver i()
    {
        return z;
    }

    private void j()
    {
        f();
        o.a(l);
        ActivityLogEntry activitylogentry = new ActivityLogEntry();
        activitylogentry.a(l.h());
        activitylogentry.a(new com.fitbit.data.domain.ActivityLogEntry.a(l.c()));
        activitylogentry.setLogDate(l.c());
        y = (ExerciseStat)k.g(l).first;
        activitylogentry.a(l.e().getTime() - l.c().getTime(), TimeUnit.MILLISECONDS);
        activitylogentry.a(new Length(y.a().b(), com.fitbit.data.domain.Length.LengthUnits.METERS));
        activitylogentry.a(new com.fitbit.runtrack.data.a(l));
        a(true);
        (new b(new c(activitylogentry) {

            final ActivityLogEntry a;
            final RecordExerciseSessionActivity b;

            public void a()
            {
                ActivityLoggingState.a(com.fitbit.savedstate.ActivityLoggingState.LoggingType.b);
                b.startActivity(com.fitbit.runtrack.ui.ExerciseDetailsActivity.a(b, a, true));
                b.finish();
            }

            
            {
                b = RecordExerciseSessionActivity.this;
                a = activitylogentry;
                super();
            }
        }, l)).execute(new ActivityLogEntry[] {
            activitylogentry
        });
    }

    private void k()
    {
        if (!s)
        {
            e e1 = new e(0.1F, 5F, 11F);
            float f1 = ap.b(75F);
            n.animate().setDuration(850L).translationX(f1).setInterpolator(e1);
            A.d();
            m.animate().setDuration(850L).translationX(-f1).setInterpolator(e1).setListener(new android.animation.Animator.AnimatorListener() {

                final RecordExerciseSessionActivity a;

                public void onAnimationCancel(Animator animator)
                {
                    com.fitbit.runtrack.ui.RecordExerciseSessionActivity.d(a).a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.h());
                }

                public void onAnimationEnd(Animator animator)
                {
                    com.fitbit.runtrack.ui.RecordExerciseSessionActivity.d(a).a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.h());
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = RecordExerciseSessionActivity.this;
                super();
            }
            });
            m.setText(0x7f080488);
            m.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203d3, 0, 0);
            n.setText(0x7f0801bf);
            n.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203d0, 0, 0);
        }
        s = true;
    }

    private void l()
    {
        if (s)
        {
            A.d();
            n.animate().translationX(0.0F).setDuration(850L).setInterpolator(new d());
            m.animate().translationX(0.0F).setDuration(850L).setInterpolator(new d()).setListener(new android.animation.Animator.AnimatorListener() {

                final RecordExerciseSessionActivity a;

                public void onAnimationCancel(Animator animator)
                {
                    com.fitbit.runtrack.ui.RecordExerciseSessionActivity.d(a).a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.h());
                }

                public void onAnimationEnd(Animator animator)
                {
                    com.fitbit.runtrack.ui.RecordExerciseSessionActivity.d(a).a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.h());
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = RecordExerciseSessionActivity.this;
                super();
            }
            });
            m.setText(0x7f080441);
            m.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203d2, 0, 0);
        }
        s = false;
    }

    private void m()
    {
        startService(ExerciseLocationService.b(this));
        o.a(l);
        k.h(l);
    }

    private h n()
    {
        Object obj = null;
        h h1 = obj;
        if (q != null)
        {
            PathTrackingMapFragment pathtrackingmapfragment = q.b();
            h1 = obj;
            if (pathtrackingmapfragment != null)
            {
                h1 = pathtrackingmapfragment.b();
            }
        }
        return h1;
    }

    private void o()
    {
        PathTrackingMapFragment pathtrackingmapfragment = q.b();
        if (pathtrackingmapfragment != null)
        {
            r.a(pathtrackingmapfragment, 10000L);
        }
    }

    public void a(Location location)
    {
        h h1 = n();
        if (h1 != null)
        {
            LatLng latlng = new LatLng(location.getLatitude(), location.getLongitude());
            com.fitbit.maps.d d2 = com.fitbit.maps.e.a(latlng);
            com.fitbit.maps.d d1 = d2;
            if (location.hasAccuracy())
            {
                d1 = d2;
                if (location.getAccuracy() < 60F)
                {
                    a(((l) (this)));
                    d1 = com.fitbit.maps.e.a(latlng, h1.b() - 1.0F);
                }
            }
            h1.b(d1);
            if (q != null && q.b() != null)
            {
                q.b().a(location);
            }
        }
    }

    public void a(Bundle bundle)
    {
        if (p == null)
        {
            setContentView(0x7f04002f);
        }
        o();
        r.a(this, 1000L, 20);
    }

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        m();
        (new f(this, q.b(), SupportedActivity.a(MobileRunSavedState.b()), true)).execute(new Void[0]);
    }

    public void a(String s1)
    {
        com.fitbit.e.a.e(h, String.format("Could not connect to the Google Play Services. Maps may not work - %s ", new Object[] {
            s1
        }), new Object[0]);
    }

    public void a(List list)
    {
label0:
        {
            boolean flag = s;
            if (b(list))
            {
                l();
            } else
            {
                k();
            }
            if (flag != s)
            {
                t = (ExerciseSegment)list.get(list.size() - 1);
                if (!s)
                {
                    break label0;
                }
                o.b(l, t);
            }
            return;
        }
        o.a(l, t);
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        a(false);
        m();
        finish();
    }

    public boolean b(List list)
    {
        return !((ExerciseSegment)list.get(list.size() - 1)).a();
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void e()
    {
        if (s)
        {
            startService(ExerciseLocationService.c(this, l));
            return;
        } else
        {
            startService(ExerciseLocationService.b(this, l));
            return;
        }
    }

    public void f()
    {
        startService(ExerciseLocationService.b(this));
        k.a(l);
    }

    public void h_(int i1)
    {
    }

    public void onAnimationCancel(Animator animator)
    {
        animator.removeAllListeners();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (u)
        {
            a(l);
            return;
        }
        u = true;
        v.animate().scaleXBy(2.0F).scaleYBy(2.0F).setDuration(300L);
        if (Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage()))
        {
            animator = (ExerciseStat)k.g(l).first;
            animator = a(SupportedActivity.a(l), animator.a().a(com.fitbit.data.domain.Length.LengthUnits.MILES).b(), animator.c().a(TimeUnit.MINUTES));
            w.setText(animator);
        } else
        {
            x.setVisibility(0);
        }
        w.animate().alpha(1.0F);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    public void onBackPressed()
    {
        if (l != null)
        {
            startService(ExerciseLocationService.b(this, l));
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton.getId();
        JVM INSTR tableswitch 2131820858 2131820858: default 24
    //                   2131820858 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        MobileRunSavedState.a(flag);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        startService(SpeechService.a(this, Locale.getDefault(), getString(0x7f08057a), 3, 0.8F));
        compoundbutton = MobileRunSavedState.c();
        if (com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b.equals(compoundbutton))
        {
            (new j(this)).a(l);
            return;
        }
        if (com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a.equals(compoundbutton))
        {
            LocalBroadcastManager.getInstance(this).registerReceiver(z, new IntentFilter("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE"));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        compoundbutton = MobileRunSavedState.c();
        if (com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b.equals(compoundbutton))
        {
            ((AlarmManager)getSystemService("alarm")).cancel(PendingIntent.getBroadcast(this, 0, AudioCueBroadcastReceiver.a(this, l), 0x10000000));
            return;
        }
        if (com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a.equals(compoundbutton))
        {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(z);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131820861: 
            e();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        s = false;
        u = false;
        r = new g(this, this, this);
        k = new com.fitbit.runtrack.data.b();
        l = (ExerciseSession)getIntent().getParcelableExtra("session");
        if (bundle != null)
        {
            s = bundle.getBoolean("session_paused");
            t = (ExerciseSegment)bundle.getParcelable("recent_segment");
        }
        o = new ExerciseSessionStateBroadcaster(l, t);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        A.d();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(z);
        o.a();
    }

    protected void onPause()
    {
        super.onPause();
        if (r.b())
        {
            a(this);
            PathTrackingMapFragment pathtrackingmapfragment;
            if (q != null)
            {
                pathtrackingmapfragment = q.b();
            } else
            {
                pathtrackingmapfragment = null;
            }
            if (pathtrackingmapfragment != null)
            {
                a(pathtrackingmapfragment);
            }
        }
        r.d();
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        r.a();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("session_paused", s);
        bundle.putParcelable("recent_segment", t);
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        Object obj = (ToggleButton)findViewById(0x7f11013a);
        com.fitbit.runtrack.ui.a a1 = new com.fitbit.runtrack.ui.a(0.29F);
        a1.b(getResources().getColorStateList(0x7f0f0198));
        a1.a(1.0F);
        ((ToggleButton) (obj)).setBackgroundDrawable(a1);
        ((ToggleButton) (obj)).setChecked(MobileRunSavedState.h());
        ((ToggleButton) (obj)).setOnCheckedChangeListener(this);
        p = (ViewPager)findViewById(0x7f11009e);
        q = new a(this, getSupportFragmentManager(), k, o, r, l);
        p.setAdapter(q);
        obj = new com.fitbit.ui.d(getResources().getColor(0x7f0f012e), getResources().getColor(0x7f0f0168));
        ((com.fitbit.ui.d) (obj)).a().add(findViewById(0x7f11013e));
        ((com.fitbit.ui.d) (obj)).a().add(findViewById(0x7f11013f));
        ((com.fitbit.ui.d) (obj)).a(1);
        p.setOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (obj)));
        n = (TextView)findViewById(0x7f11013c);
        v = findViewById(0x7f110141);
        w = (TextView)findViewById(0x7f110142);
        x = findViewById(0x7f110143);
        m = (TextView)findViewById(0x7f11013d);
        m.setOnClickListener(this);
        n.setOnTouchListener(this);
        o.a(l, t);
        A.a(j);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = true;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 34
    //                   1 106;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L5:
        return flag;
_L2:
        v.clearAnimation();
        float f1 = 0.8F * a((float)n.getWidth() / 2.0F);
        v.animate().scaleX(f1).scaleY(f1).setDuration(850L).setListener(this).setInterpolator(new AccelerateInterpolator());
        v.setVisibility(0);
        return true;
_L3:
        if (!u)
        {
            n.setText(0x7f08025c);
            n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            v.clearAnimation();
            v.animate().scaleX(0.0F).scaleY(0.0F).setDuration(300L).setListener(null).setInterpolator(null);
            return true;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void startActivity(Intent intent)
    {
        getWindow().clearFlags(1024);
        super.startActivity(intent);
    }

}
