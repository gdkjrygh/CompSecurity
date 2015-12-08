// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model:
//            InteractionCriteria, InteractionConfiguration, UpgradeMessageInteraction, EnjoymentDialogInteraction, 
//            RatingDialogInteraction, FeedbackDialogInteraction, MessageCenterInteraction, AppStoreRatingInteraction, 
//            SurveyInteraction

public abstract class Interaction extends JSONObject
    implements Comparable
{
    public static class Factory
    {

        public static Interaction parseInteraction(String s)
        {
            Type type;
            type = Type.unknown;
            JSONObject jsonobject = new JSONObject(s);
            if (jsonobject.has("type"))
            {
                type = Type.parse(jsonobject.getString("type"));
            }
            static class _cls1
            {

                static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[];

                static 
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type = new int[Type.values().length];
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.UpgradeMessage.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.EnjoymentDialog.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.RatingDialog.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.FeedbackDialog.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.MessageCenter.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.AppStoreRating.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.Survey.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[Type.unknown.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type[type.ordinal()];
            JVM INSTR tableswitch 1 7: default 149
        //                       1 84
        //                       2 93
        //                       3 102
        //                       4 111
        //                       5 120
        //                       6 129
        //                       7 138;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
            return new UpgradeMessageInteraction(s);
_L3:
            return new EnjoymentDialogInteraction(s);
_L4:
            return new RatingDialogInteraction(s);
_L5:
            return new FeedbackDialogInteraction(s);
_L6:
            return new MessageCenterInteraction(s);
_L7:
            return new AppStoreRatingInteraction(s);
_L8:
            s = new SurveyInteraction(s);
            return s;
_L1:
            return null;
            s;
            if (true) goto _L1; else goto _L9
_L9:
        }

        public Factory()
        {
        }
    }

    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type AppStoreRating;
        public static final Type EnjoymentDialog;
        public static final Type FeedbackDialog;
        public static final Type MessageCenter;
        public static final Type RatingDialog;
        public static final Type Survey;
        public static final Type UpgradeMessage;
        public static final Type unknown;

        public static Type parse(String s)
        {
            Type type;
            try
            {
                type = valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.v((new StringBuilder()).append("Error parsing unknown Interaction.Type: ").append(s).toString(), new Object[0]);
                return unknown;
            }
            return type;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/apptentive/android/sdk/module/engagement/interaction/model/Interaction$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            UpgradeMessage = new Type("UpgradeMessage", 0);
            EnjoymentDialog = new Type("EnjoymentDialog", 1);
            RatingDialog = new Type("RatingDialog", 2);
            FeedbackDialog = new Type("FeedbackDialog", 3);
            MessageCenter = new Type("MessageCenter", 4);
            AppStoreRating = new Type("AppStoreRating", 5);
            Survey = new Type("Survey", 6);
            unknown = new Type("unknown", 7);
            $VALUES = (new Type[] {
                UpgradeMessage, EnjoymentDialog, RatingDialog, FeedbackDialog, MessageCenter, AppStoreRating, Survey, unknown
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String KEY_CONFIGURATION = "configuration";
    private static final String KEY_CRITERIA = "criteria";
    private static final String KEY_ID = "id";
    public static final String KEY_NAME = "interaction";
    private static final String KEY_PRIORITY = "priority";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VERSION = "version";

    public Interaction(String s)
        throws JSONException
    {
        super(s);
    }

    public boolean canRun(Context context)
    {
        InteractionCriteria interactioncriteria = getCriteria();
        Log.v("=== Checking interaction %s ===", new Object[] {
            getType()
        });
        return interactioncriteria != null && isInRunnableState(context) && interactioncriteria.isMet(context);
    }

    public int compareTo(Object obj)
    {
        return getPriority().compareTo(((Interaction)obj).getPriority());
    }

    public InteractionConfiguration getConfiguration()
    {
        InteractionConfiguration interactionconfiguration;
        if (isNull("configuration"))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        interactionconfiguration = new InteractionConfiguration(getJSONObject("configuration").toString());
        return interactionconfiguration;
        JSONException jsonexception;
        jsonexception;
        return new InteractionConfiguration();
    }

    public InteractionCriteria getCriteria()
    {
        InteractionCriteria interactioncriteria;
        if (isNull("criteria"))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        interactioncriteria = new InteractionCriteria(getJSONObject("criteria").toString());
        return interactioncriteria;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getId()
    {
        String s;
        if (isNull("id"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("id");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public Integer getPriority()
    {
        int i;
        if (isNull("priority"))
        {
            break MISSING_BLOCK_LABEL_22;
        }
        i = getInt("priority");
        return Integer.valueOf(i);
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public Type getType()
    {
        Type type;
        if (isNull("type"))
        {
            break MISSING_BLOCK_LABEL_22;
        }
        type = Type.parse(getString("type"));
        return type;
        JSONException jsonexception;
        jsonexception;
        return Type.unknown;
    }

    public Integer getVersion()
    {
        int i;
        if (isNull("version"))
        {
            break MISSING_BLOCK_LABEL_22;
        }
        i = getInt("version");
        return Integer.valueOf(i);
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    protected boolean isInRunnableState(Context context)
    {
        return true;
    }
}
