// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import android.app.Activity;
import com.apptentive.android.sdk.module.engagement.EngagementModule;
import com.apptentive.android.sdk.module.rating.IRatingProvider;
import com.apptentive.android.sdk.module.rating.impl.GooglePlayRatingProvider;
import com.apptentive.android.sdk.module.survey.OnSurveyFinishedListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.apptentive.android.sdk:
//            Log

public class ApptentiveInternal
{
    public static final class PushAction extends Enum
    {

        private static final PushAction $VALUES[];
        public static final PushAction pmc;
        public static final PushAction unknown;

        public static PushAction parse(String s)
        {
            PushAction pushaction;
            try
            {
                pushaction = valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.d((new StringBuilder()).append("Error parsing unknown PushAction: ").append(s).toString(), new Object[0]);
                return unknown;
            }
            return pushaction;
        }

        public static PushAction valueOf(String s)
        {
            return (PushAction)Enum.valueOf(com/apptentive/android/sdk/ApptentiveInternal$PushAction, s);
        }

        public static PushAction[] values()
        {
            return (PushAction[])$VALUES.clone();
        }

        static 
        {
            pmc = new PushAction("pmc", 0);
            unknown = new PushAction("unknown", 1);
            $VALUES = (new PushAction[] {
                pmc, unknown
            });
        }

        private PushAction(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String PUSH_ACTION = "action";
    private static OnSurveyFinishedListener onSurveyFinishedListener;
    private static String pushCallbackActivityName;
    private static IRatingProvider ratingProvider;
    private static Map ratingProviderArgs;

    public ApptentiveInternal()
    {
    }

    public static OnSurveyFinishedListener getOnSurveyFinishedListener()
    {
        return onSurveyFinishedListener;
    }

    public static String getPushCallbackActivityName()
    {
        return pushCallbackActivityName;
    }

    public static IRatingProvider getRatingProvider()
    {
        if (ratingProvider == null)
        {
            ratingProvider = new GooglePlayRatingProvider();
        }
        return ratingProvider;
    }

    public static Map getRatingProviderArgs()
    {
        return ratingProviderArgs;
    }

    public static void onAppLaunch(Activity activity)
    {
        EngagementModule.engageInternal(activity, com.apptentive.android.sdk.model.Event.EventLabel.app__launch.getLabelName());
    }

    public static void putRatingProviderArg(String s, String s1)
    {
        if (ratingProviderArgs == null)
        {
            ratingProviderArgs = new HashMap();
        }
        ratingProviderArgs.put(s, s1);
    }

    public static void setMinimumLogLevel(int i)
    {
        Log.overrideLogLevel(i);
    }

    public static void setOnSurveyFinishedListener(OnSurveyFinishedListener onsurveyfinishedlistener)
    {
        onSurveyFinishedListener = onsurveyfinishedlistener;
    }

    public static void setPushCallbackActivity(Class class1)
    {
        pushCallbackActivityName = class1.getName();
        Log.d("Setting push callback activity name to %s", new Object[] {
            pushCallbackActivityName
        });
    }

    public static void setRatingProvider(IRatingProvider iratingprovider)
    {
        ratingProvider = iratingprovider;
    }
}
