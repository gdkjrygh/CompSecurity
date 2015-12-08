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

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, InAppNotification, Survey

public static abstract class <init>
    implements Parcelable
{
    public static final class InAppNotificationState extends UpdateDisplayState.DisplayState
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

        public void writeToParcel(Parcel parcel, int i)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f, d);
            bundle.putInt(g, e);
            parcel.writeBundle(bundle);
        }


        private InAppNotificationState(Bundle bundle)
        {
            super(null);
            d = (InAppNotification)bundle.getParcelable(f);
            e = bundle.getInt(g);
        }

        InAppNotificationState(Bundle bundle, UpdateDisplayState._cls1 _pcls1)
        {
            this(bundle);
        }

        public InAppNotificationState(InAppNotification inappnotification, int i)
        {
            super(null);
            d = inappnotification;
            e = i;
        }

        /* block-local class not found */
        class _cls1 {}

    }

    public static final class SurveyState extends UpdateDisplayState.DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SurveyState a(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
                bundle.readFromParcel(parcel);
                return new SurveyState(bundle, null);
            }

            public SurveyState[] a(int i)
            {
                return new SurveyState[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        public static final String c = "SurveyState";
        private static final String h = "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY";
        private static final String i = "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY";
        private static final String j = "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY";
        private static final String k = "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY";
        private final Survey d;
        private final UpdateDisplayState.AnswerMap e;
        private Bitmap f;
        private int g;

        public String a()
        {
            return "SurveyState";
        }

        public void a(int l)
        {
            g = l;
        }

        public void a(Bitmap bitmap)
        {
            f = bitmap;
        }

        public Bitmap b()
        {
            return f;
        }

        public UpdateDisplayState.AnswerMap c()
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

        public void writeToParcel(Parcel parcel, int l)
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


        private SurveyState(Bundle bundle)
        {
            super(null);
            g = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
            e = (UpdateDisplayState.AnswerMap)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
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

        SurveyState(Bundle bundle, UpdateDisplayState._cls1 _pcls1)
        {
            this(bundle);
        }

        public SurveyState(Survey survey)
        {
            super(null);
            d = survey;
            e = new UpdateDisplayState.AnswerMap();
            g = 0xff000000;
            f = null;
        }
    }


    public static final android.os.yState.DisplayState CREATOR = new android.os.Parcelable.Creator() {

        public UpdateDisplayState.DisplayState a(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
            bundle.readFromParcel(parcel);
            parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
            bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
            if ("InAppNotificationState".equals(parcel))
            {
                return new InAppNotificationState(bundle, null);
            }
            if ("SurveyState".equals(parcel))
            {
                return new SurveyState(bundle, null);
            } else
            {
                throw new RuntimeException((new StringBuilder()).append("Unrecognized display state type ").append(parcel).toString());
            }
        }

        public UpdateDisplayState.DisplayState[] a(int i)
        {
            return new UpdateDisplayState.DisplayState[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static final String a = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY";
    public static final String b = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY";

    public abstract String a();


    private _cls1()
    {
    }

    _cls1(_cls1 _pcls1)
    {
        this();
    }
}
