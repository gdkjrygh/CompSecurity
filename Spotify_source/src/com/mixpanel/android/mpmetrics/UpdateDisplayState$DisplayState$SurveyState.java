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
//            Survey

public final class c extends c
{

    public static final android.os.ayState.SurveyState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState.DisplayState.SurveyState(bundle, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new UpdateDisplayState.DisplayState.SurveyState[i];
        }

    };
    public final Survey a;
    public final _cls1 b;
    public Bitmap c;
    public int d;

    public final String a()
    {
        return "SurveyState";
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
            c.compress(android.graphics.e.SurveyState.c, 20, abyte0);
            abyte0 = abyte0.toByteArray();
        }
        bundle.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", abyte0);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", a);
        parcel.writeBundle(bundle);
    }


    private _cls1(Bundle bundle)
    {
        super((byte)0);
        d = bundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
        b = (b)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY");
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

    a(Bundle bundle, byte byte0)
    {
        this(bundle);
    }

    public <init>(Survey survey)
    {
        super((byte)0);
        a = survey;
        b = new b();
        d = 0xff000000;
        c = null;
    }
}
