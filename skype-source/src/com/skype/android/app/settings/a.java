// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.content.Intent;
import com.skype.android.app.mnv.MnvActivity;
import com.skype.android.app.mnv.MnvAddFriendsFragment;
import com.skype.android.app.mnv.MnvAddNumberActivity;
import com.skype.android.app.mnv.MnvEnterPinFragment;
import com.skype.android.app.mnv.MnvErrorFragment;
import com.skype.android.app.mnv.MnvLearnMoreFragment;
import com.skype.android.app.mnv.MnvStateData;
import com.skype.android.app.mnv.MnvVerifiedFragment;

abstract class a extends Enum
{

    private static final a $VALUES[];
    public static final a ADD_FRIENDS;
    public static final a CONNECTION_ERROR;
    public static final a LEARN_MORE;
    public static final a NUMBER_ENTRY;
    public static final a PIN_ENTRY;
    public static final a VALIDATION_ERROR;
    public static final a VERIFIED;
    private String title;

    private a(String s, int i, String s1)
    {
        super(s, i);
        title = s1;
    }


    public static a findState(String s)
    {
        a aa[] = values();
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            a a1 = aa[i];
            if (a1.getTitle().equals(s))
            {
                return a1;
            }
        }

        return null;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/skype/android/app/settings/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public String getTitle()
    {
        return title;
    }

    public abstract Intent launchActivity(Context context);

    static 
    {
        LEARN_MORE = new a("LEARN_MORE", 0, "Learn More") {

            public final Intent launchActivity(Context context)
            {
                context = new Intent(context, com/skype/android/app/mnv/MnvActivity);
                context.putExtra("fragmentClass", com/skype/android/app/mnv/MnvLearnMoreFragment);
                return context;
            }

        };
        VALIDATION_ERROR = new a("VALIDATION_ERROR", 1, "Validation Error") {

            public final Intent launchActivity(Context context)
            {
                context = new Intent(context, com/skype/android/app/mnv/MnvActivity);
                context.putExtra("fragmentClass", com/skype/android/app/mnv/MnvErrorFragment);
                MnvStateData mnvstatedata = new MnvStateData();
                mnvstatedata.setErrorState(com.skype.android.app.mnv.ProfileServicesErrors.ErrorState.UNABLE_TO_VERIFY);
                context.putExtra("mnvStateData", mnvstatedata);
                return context;
            }

        };
        ADD_FRIENDS = new a("ADD_FRIENDS", 2, "Add Friends") {

            public final Intent launchActivity(Context context)
            {
                context = new Intent(context, com/skype/android/app/mnv/MnvActivity);
                context.putExtra("fragmentClass", com/skype/android/app/mnv/MnvAddFriendsFragment);
                return context;
            }

        };
        CONNECTION_ERROR = new a("CONNECTION_ERROR", 3, "Connection Error") {

            public final Intent launchActivity(Context context)
            {
                context = new Intent(context, com/skype/android/app/mnv/MnvActivity);
                context.putExtra("fragmentClass", com/skype/android/app/mnv/MnvErrorFragment);
                MnvStateData mnvstatedata = new MnvStateData();
                mnvstatedata.setErrorState(com.skype.android.app.mnv.ProfileServicesErrors.ErrorState.CONNECTION_FAILED);
                context.putExtra("mnvStateData", mnvstatedata);
                return context;
            }

        };
        PIN_ENTRY = new a("PIN_ENTRY", 4, "Pin entry") {

            public final Intent launchActivity(Context context)
            {
                context = new Intent(context, com/skype/android/app/mnv/MnvActivity);
                context.putExtra("fragmentClass", com/skype/android/app/mnv/MnvEnterPinFragment);
                return context;
            }

        };
        NUMBER_ENTRY = new a("NUMBER_ENTRY", 5, "Number entry") {

            public final Intent launchActivity(Context context)
            {
                return new Intent(context, com/skype/android/app/mnv/MnvAddNumberActivity);
            }

        };
        VERIFIED = new a("VERIFIED", 6, "Verified") {

            public final Intent launchActivity(Context context)
            {
                context = new Intent(context, com/skype/android/app/mnv/MnvActivity);
                context.putExtra("fragmentClass", com/skype/android/app/mnv/MnvVerifiedFragment);
                return context;
            }

        };
        $VALUES = (new a[] {
            LEARN_MORE, VALIDATION_ERROR, ADD_FRIENDS, CONNECTION_ERROR, PIN_ENTRY, NUMBER_ENTRY, VERIFIED
        });
    }
}
