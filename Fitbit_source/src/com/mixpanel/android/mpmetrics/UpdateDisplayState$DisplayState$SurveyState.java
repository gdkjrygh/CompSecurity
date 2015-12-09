// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, Survey

public static final class f extends f
{

    public static final android.os.ayState.SurveyState.d CREATOR = new android.os.Parcelable.Creator() {

        public UpdateDisplayState.DisplayState.SurveyState a(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState.DisplayState.SurveyState(bundle, null);
        }

        public UpdateDisplayState.DisplayState.SurveyState[] a(int l)
        {
            return new UpdateDisplayState.DisplayState.SurveyState[l];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int l)
        {
            return a(l);
        }

    };
    public static final String c = "SurveyState";
    private static final String h = "com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY";
    private static final String i = "com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY";
    private static final String j = "com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY";
    private static final String k = "com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY";
    private final Survey d;
    private final _cls1.a e;
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

    public f c()
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
            f.compress(android.graphics.e.SurveyState.f, 20, abyte0);
            abyte0 = abyte0.toByteArray();
        }
        bundle.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", abyte0);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", d);
        parcel.writeBundle(bundle);
    }


    private _cls1(Bundle bundle)
    {
        super(null);
        g = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
        e = (e)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
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

    d(Bundle bundle, d d1)
    {
        this(bundle);
    }

    public <init>(Survey survey)
    {
        super(null);
        d = survey;
        e = new e();
        g = 0xff000000;
        f = null;
    }
}
