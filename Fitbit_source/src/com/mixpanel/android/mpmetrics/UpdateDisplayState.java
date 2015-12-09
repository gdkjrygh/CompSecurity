// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            g, InAppNotification, Survey

public class UpdateDisplayState
    implements Parcelable
{
    public static class AnswerMap
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public AnswerMap a(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap.getClassLoader());
                AnswerMap answermap = new AnswerMap();
                bundle.readFromParcel(parcel);
                String s;
                for (parcel = bundle.keySet().iterator(); parcel.hasNext(); answermap.a(Integer.valueOf(s), bundle.getString(s)))
                {
                    s = (String)parcel.next();
                }

                return answermap;
            }

            public AnswerMap[] a(int i1)
            {
                return new AnswerMap[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        private final HashMap a = new HashMap();

        public String a(Integer integer)
        {
            return (String)a.get(integer);
        }

        public void a(Integer integer, String s)
        {
            a.put(integer, s);
        }

        public boolean a(AnswerMap answermap)
        {
            return a.equals(answermap.a);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            Bundle bundle = new Bundle();
            java.util.Map.Entry entry;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); bundle.putString(Integer.toString(((Integer)entry.getKey()).intValue()), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            parcel.writeBundle(bundle);
        }


        public AnswerMap()
        {
        }
    }

    public static abstract class DisplayState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DisplayState a(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
                bundle.readFromParcel(parcel);
                parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
                bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
                if ("InAppNotificationState".equals(parcel))
                {
                    return new DisplayState.InAppNotificationState(bundle);
                }
                if ("SurveyState".equals(parcel))
                {
                    return new DisplayState.SurveyState(bundle);
                } else
                {
                    throw new RuntimeException((new StringBuilder()).append("Unrecognized display state type ").append(parcel).toString());
                }
            }

            public DisplayState[] a(int i1)
            {
                return new DisplayState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        public static final String a = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY";
        public static final String b = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY";

        public abstract String a();


        private DisplayState()
        {
        }

    }

    public static final class DisplayState.InAppNotificationState extends DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        public static final String c = "InAppNotificationState";
        private static String f = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
        private static String g = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
        private final InAppNotification d;
        private final int e;

        public String a()
        {
            return "InAppNotificationState";
        }

        public int b()
        {
            return e;
        }

        public InAppNotification c()
        {
            return d;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f, d);
            bundle.putInt(g, e);
            parcel.writeBundle(bundle);
        }


        private DisplayState.InAppNotificationState(Bundle bundle)
        {
            d = (InAppNotification)bundle.getParcelable(f);
            e = bundle.getInt(g);
        }


        public DisplayState.InAppNotificationState(InAppNotification inappnotification, int i1)
        {
            d = inappnotification;
            e = i1;
        }

        /* block-local class not found */
        class _cls1 {}

    }

    public static final class DisplayState.SurveyState extends DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DisplayState.SurveyState a(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
                bundle.readFromParcel(parcel);
                return new DisplayState.SurveyState(bundle);
            }

            public DisplayState.SurveyState[] a(int i1)
            {
                return new DisplayState.SurveyState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        public static final String c = "SurveyState";
        private static final String h = "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY";
        private static final String i = "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY";
        private static final String j = "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY";
        private static final String k = "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY";
        private final Survey d;
        private final AnswerMap e;
        private Bitmap f;
        private int g;

        public String a()
        {
            return "SurveyState";
        }

        public void a(int i1)
        {
            g = i1;
        }

        public void a(Bitmap bitmap)
        {
            f = bitmap;
        }

        public Bitmap b()
        {
            return f;
        }

        public AnswerMap c()
        {
            return e;
        }

        public int d()
        {
            return g;
        }

        public int describeContents()
        {
            return 0;
        }

        public Survey e()
        {
            return d;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY", g);
            bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY", e);
            byte abyte0[] = null;
            if (f != null)
            {
                abyte0 = new ByteArrayOutputStream();
                f.compress(android.graphics.Bitmap.CompressFormat.PNG, 20, abyte0);
                abyte0 = abyte0.toByteArray();
            }
            bundle.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", abyte0);
            bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", d);
            parcel.writeBundle(bundle);
        }


        private DisplayState.SurveyState(Bundle bundle)
        {
            g = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
            e = (AnswerMap)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
            byte abyte0[] = bundle.getByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY");
            if (abyte0 != null)
            {
                f = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            } else
            {
                f = null;
            }
            d = (Survey)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY");
        }


        public DisplayState.SurveyState(Survey survey)
        {
            d = survey;
            e = new AnswerMap();
            g = 0xff000000;
            f = null;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public UpdateDisplayState a(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState(bundle);
        }

        public UpdateDisplayState[] a(int i1)
        {
            return new UpdateDisplayState[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private static final ReentrantLock d = new ReentrantLock();
    private static long e = 0L;
    private static UpdateDisplayState f = null;
    private static int g = 0;
    private static int h = 0;
    private static final String i = "MixpanelAPI.UpDisplSt";
    private static final long j = 0x2932e00L;
    private static final String k = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY";
    private static final String l = "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY";
    private static final String m = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY";
    private final String a;
    private final String b;
    private final DisplayState c;

    private UpdateDisplayState(Bundle bundle)
    {
        a = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        b = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        c = (DisplayState)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }


    UpdateDisplayState(DisplayState displaystate, String s, String s1)
    {
        a = s;
        b = s1;
        c = displaystate;
    }

    static int a(DisplayState displaystate, String s, String s1)
    {
        int i1 = -1;
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        if (!b())
        {
            e = System.currentTimeMillis();
            f = new UpdateDisplayState(displaystate, s, s1);
            g++;
            i1 = g;
        } else
        if (g.b)
        {
            Log.v("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
            return -1;
        }
        return i1;
    }

    static ReentrantLock a()
    {
        return d;
    }

    public static void a(int i1)
    {
        d.lock();
        if (i1 == h)
        {
            h = -1;
            f = null;
        }
        d.unlock();
        return;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    public static UpdateDisplayState b(int i1)
    {
        d.lock();
        int j1;
        if (h <= 0)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        j1 = h;
        if (j1 != i1)
        {
            d.unlock();
            return null;
        }
        UpdateDisplayState updatedisplaystate = f;
        if (updatedisplaystate == null)
        {
            d.unlock();
            return null;
        }
        e = System.currentTimeMillis();
        h = i1;
        updatedisplaystate = f;
        d.unlock();
        return updatedisplaystate;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    static boolean b()
    {
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        long l1 = System.currentTimeMillis();
        long l2 = e;
        if (g > 0 && l1 - l2 > 0x2932e00L)
        {
            Log.i("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
            f = null;
        }
        return f != null;
    }

    public DisplayState c()
    {
        return c;
    }

    public String d()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return b;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", a);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", b);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", c);
        parcel.writeBundle(bundle);
    }

    static 
    {
        e = -1L;
        g = 0;
        h = -1;
    }
}
