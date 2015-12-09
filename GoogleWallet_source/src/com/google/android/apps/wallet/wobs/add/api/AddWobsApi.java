// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add.api;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.api.InternalIntents;

public final class AddWobsApi
{
    public static final class ImageCaptureAnalyticsStrings
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static ImageCaptureAnalyticsStrings createFromParcel(Parcel parcel)
            {
                return new ImageCaptureAnalyticsStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            private static ImageCaptureAnalyticsStrings[] newArray(int i)
            {
                return new ImageCaptureAnalyticsStrings[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public final String buttonTapSkip;
        public final String field;
        public final String screen;
        public final String timing;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(screen);
            parcel.writeString(field);
            parcel.writeString(buttonTapSkip);
            parcel.writeString(timing);
        }


        public ImageCaptureAnalyticsStrings(String s, String s1, String s2, String s3)
        {
            screen = s;
            field = s1;
            buttonTapSkip = s2;
            timing = s3;
        }
    }


    public static Intent createCaptureImagesActivityIntent(Context context, ImageCaptureAnalyticsStrings imagecaptureanalyticsstrings, int i)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.wobs.add.CaptureImagesActivity").putExtra("extra_image_capture_analytics_strings", imagecaptureanalyticsstrings).putExtra("extra_is_initial_capture", true).putExtra("extra_wob_type", i);
    }

    public static Intent createCaptureImagesActivityIntentForRetake(Context context, int i, ImageCaptureAnalyticsStrings imagecaptureanalyticsstrings, int j)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.wobs.add.CaptureImagesActivity").putExtra("extra_image_capture_mode", i).putExtra("extra_image_capture_analytics_strings", imagecaptureanalyticsstrings).putExtra("extra_wob_type", j);
    }

    public static Intent createCustomizeProgramCardActivityIntent(Context context, String s, String s1, int ai[], int ai1[], int i, int ai2[], int ai3[], 
            int j)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.wobs.add.CustomizeProgramCardActivity").putExtra("primary_text", s).putExtra("secondary_text", s1).putExtra("program_icons", ai).putExtra("program_icon_names", ai1).putExtra("selected_icon_index", i).putExtra("color_options", ai2).putExtra("color_names", ai3).putExtra("selected_color_index", j);
    }
}
