// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import cxi;
import java.util.concurrent.locks.ReentrantLock;

public class UpdateDisplayState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState(bundle, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new UpdateDisplayState[i];
        }

    };
    private static final ReentrantLock d = new ReentrantLock();
    private static long e = -1L;
    private static UpdateDisplayState f = null;
    private static int g = 0;
    private static int h = -1;
    public final String a;
    public final String b;
    public final DisplayState c;

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

    public static int a(DisplayState displaystate, String s, String s1)
    {
        int i = -1;
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        if (!b())
        {
            e = System.currentTimeMillis();
            f = new UpdateDisplayState(displaystate, s, s1);
            i = g + 1;
            g = i;
        } else
        if (cxi.a)
        {
            Log.v("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
            return -1;
        }
        return i;
    }

    public static ReentrantLock a()
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

    public static boolean b()
    {
        if (!d.isHeldByCurrentThread())
        {
            throw new AssertionError();
        }
        long l = System.currentTimeMillis();
        long l1 = e;
        if (g > 0 && l - l1 > 0x2932e00L)
        {
            Log.i("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
            f = null;
        }
        return f != null;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", a);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", b);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", c);
        parcel.writeBundle(bundle);
    }


    private class DisplayState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
                bundle.readFromParcel(parcel);
                parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
                bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
                class InAppNotificationState extends DisplayState
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
                class SurveyState extends DisplayState
                {
                        private class AnswerMap
                            implements Parcelable
                        {

                            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                                public final Object createFromParcel(Parcel parcel)
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

                                public final volatile Object[] newArray(int i)
                                {
                                    return new AnswerMap[i];
                                }

                            };
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
                    public final AnswerMap b;
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

                        SurveyState(Bundle bundle, byte byte0)
                        {
                            this(bundle);
                        }

                        public SurveyState(Survey survey)
                        {
                            super((byte)0);
                            a = survey;
                            b = new AnswerMap();
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
                return new DisplayState[i];
            }

        };

        public abstract String a();


        private DisplayState()
        {
        }

        DisplayState(byte byte0)
        {
            this();
        }
    }

}
