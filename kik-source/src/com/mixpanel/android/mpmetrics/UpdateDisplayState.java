// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            al, t, am, an, 
//            ao, InAppNotification, ap, Survey

public class UpdateDisplayState
    implements Parcelable
{
    public static class AnswerMap
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new am();
        private final HashMap a = new HashMap();

        public final String a(Integer integer)
        {
            return (String)a.get(integer);
        }

        public final void a(Integer integer, String s)
        {
            a.put(integer, s);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
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

        public static final android.os.Parcelable.Creator CREATOR = new an();

        public abstract String a();


        private DisplayState()
        {
        }

        DisplayState(byte byte0)
        {
            this();
        }
    }

    public static final class DisplayState.InAppNotificationState extends DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ao();
        private static String c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
        private static String d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
        private final InAppNotification a;
        private final int b;

        public final String a()
        {
            return "InAppNotificationState";
        }

        public final int b()
        {
            return b;
        }

        public final InAppNotification c()
        {
            return a;
        }

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable(c, a);
            bundle.putInt(d, b);
            parcel.writeBundle(bundle);
        }


        private DisplayState.InAppNotificationState(Bundle bundle)
        {
            super((byte)0);
            a = (InAppNotification)bundle.getParcelable(c);
            b = bundle.getInt(d);
        }

        DisplayState.InAppNotificationState(Bundle bundle, byte byte0)
        {
            this(bundle);
        }

        public DisplayState.InAppNotificationState(InAppNotification inappnotification, int i)
        {
            super((byte)0);
            a = inappnotification;
            b = i;
        }
    }

    public static final class DisplayState.SurveyState extends DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ap();
        private final Survey a;
        private final AnswerMap b;
        private Bitmap c;
        private int d;

        public final String a()
        {
            return "SurveyState";
        }

        public final void a(int i)
        {
            d = i;
        }

        public final void a(Bitmap bitmap)
        {
            c = bitmap;
        }

        public final Bitmap b()
        {
            return c;
        }

        public final AnswerMap c()
        {
            return b;
        }

        public final Survey d()
        {
            return a;
        }

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY", d);
            bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY", b);
            byte abyte0[] = null;
            if (c != null)
            {
                abyte0 = new ByteArrayOutputStream();
                c.compress(android.graphics.Bitmap.CompressFormat.PNG, 20, abyte0);
                abyte0 = abyte0.toByteArray();
            }
            bundle.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", abyte0);
            bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", a);
            parcel.writeBundle(bundle);
        }


        private DisplayState.SurveyState(Bundle bundle)
        {
            super((byte)0);
            d = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
            b = (AnswerMap)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
            byte abyte0[] = bundle.getByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY");
            if (abyte0 != null)
            {
                c = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            } else
            {
                c = null;
            }
            a = (Survey)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY");
        }

        DisplayState.SurveyState(Bundle bundle, byte byte0)
        {
            this(bundle);
        }

        public DisplayState.SurveyState(Survey survey)
        {
            super((byte)0);
            a = survey;
            b = new AnswerMap();
            d = 0xff000000;
            c = null;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new al();
    private static final ReentrantLock d = new ReentrantLock();
    private static long e = -1L;
    private static UpdateDisplayState f = null;
    private static int g = 0;
    private static int h = -1;
    private final String a;
    private final String b;
    private final DisplayState c;

    private UpdateDisplayState(Bundle bundle)
    {
        a = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        b = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        c = (DisplayState)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }

    UpdateDisplayState(Bundle bundle, byte byte0)
    {
        this(bundle);
    }

    private UpdateDisplayState(DisplayState displaystate, String s, String s1)
    {
        a = s;
        b = s1;
        c = displaystate;
    }

    static int a(DisplayState displaystate, String s, String s1)
    {
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        if (!b())
        {
            e = System.currentTimeMillis();
            f = new UpdateDisplayState(displaystate, s, s1);
            int i = g + 1;
            g = i;
            return i;
        } else
        {
            boolean flag = t.a;
            return -1;
        }
    }

    static ReentrantLock a()
    {
        return d;
    }

    public static void a(int i)
    {
        d.lock();
        if (i == h)
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

    public static UpdateDisplayState b(int i)
    {
        d.lock();
        int j;
        if (h <= 0)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        j = h;
        if (j != i)
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
        h = i;
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
        long l = System.currentTimeMillis();
        long l1 = e;
        if (g > 0 && l - l1 > 0x2932e00L)
        {
            f = null;
        }
        return f != null;
    }

    public final DisplayState c()
    {
        return c;
    }

    public final String d()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return b;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", a);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", b);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", c);
        parcel.writeBundle(bundle);
    }

}
