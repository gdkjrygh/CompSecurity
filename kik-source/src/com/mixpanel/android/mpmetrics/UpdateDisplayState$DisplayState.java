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
//            UpdateDisplayState, an, ao, InAppNotification, 
//            ap, Survey

public static abstract class <init>
    implements Parcelable
{
    public static final class InAppNotificationState extends UpdateDisplayState.DisplayState
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


        private InAppNotificationState(Bundle bundle)
        {
            super((byte)0);
            a = (InAppNotification)bundle.getParcelable(c);
            b = bundle.getInt(d);
        }

        InAppNotificationState(Bundle bundle, byte byte0)
        {
            this(bundle);
        }

        public InAppNotificationState(InAppNotification inappnotification, int i)
        {
            super((byte)0);
            a = inappnotification;
            b = i;
        }
    }

    public static final class SurveyState extends UpdateDisplayState.DisplayState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ap();
        private final Survey a;
        private final UpdateDisplayState.AnswerMap b;
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

        public final UpdateDisplayState.AnswerMap c()
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


        private SurveyState(Bundle bundle)
        {
            super((byte)0);
            d = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
            b = (UpdateDisplayState.AnswerMap)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
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

        SurveyState(Bundle bundle, byte byte0)
        {
            this(bundle);
        }

        public SurveyState(Survey survey)
        {
            super((byte)0);
            a = survey;
            b = new UpdateDisplayState.AnswerMap();
            d = 0xff000000;
            c = null;
        }
    }


    public static final android.os.yState.DisplayState CREATOR = new an();

    public abstract String a();


    private SurveyState.c()
    {
    }

    SurveyState.c(byte byte0)
    {
        this();
    }
}
