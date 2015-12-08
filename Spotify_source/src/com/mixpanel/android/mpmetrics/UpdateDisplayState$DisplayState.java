// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class <init>
    implements Parcelable
{

    public static final android.os.yState.DisplayState CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
            bundle.readFromParcel(parcel);
            parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
            bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
            class InAppNotificationState extends UpdateDisplayState.DisplayState
            {

                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel1)
                    {
                        Bundle bundle1 = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState.getClassLoader());
                        bundle1.readFromParcel(parcel1);
                        return new InAppNotificationState(bundle1, (byte)0);
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new InAppNotificationState[i];
                    }

                };
                private static String c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
                private static String d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
                public final InAppNotification a;
                public final int b;

                public final String a()
                {
                    return "InAppNotificationState";
                }

                public final int describeContents()
                {
                    return 0;
                }

                public final void writeToParcel(Parcel parcel1, int i)
                {
                    Bundle bundle1 = new Bundle();
                    bundle1.putParcelable(c, a);
                    bundle1.putInt(d, b);
                    parcel1.writeBundle(bundle1);
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

            if ("InAppNotificationState".equals(parcel))
            {
                return new InAppNotificationState(bundle, (byte)0);
            }
            class SurveyState extends UpdateDisplayState.DisplayState
            {

                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel1)
                    {
                        Bundle bundle1 = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
                        bundle1.readFromParcel(parcel1);
                        return new SurveyState(bundle1, (byte)0);
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new SurveyState[i];
                    }

                };
                public final Survey a;
                public final UpdateDisplayState.AnswerMap b;
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

                public final void writeToParcel(Parcel parcel1, int i)
                {
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY", d);
                    bundle1.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY", b);
                    byte abyte0[] = null;
                    if (c != null)
                    {
                        abyte0 = new ByteArrayOutputStream();
                        c.compress(android.graphics.Bitmap.CompressFormat.PNG, 20, abyte0);
                        abyte0 = abyte0.toByteArray();
                    }
                    bundle1.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", abyte0);
                    bundle1.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", a);
                    parcel1.writeBundle(bundle1);
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

            if ("SurveyState".equals(parcel))
            {
                return new SurveyState(bundle, (byte)0);
            } else
            {
                throw new RuntimeException((new StringBuilder("Unrecognized display state type ")).append(parcel).toString());
            }
        }

        public final volatile Object[] newArray(int i)
        {
            return new UpdateDisplayState.DisplayState[i];
        }

    };

    public abstract String a();


    private _cls1()
    {
    }

    _cls1(byte byte0)
    {
        this();
    }
}
