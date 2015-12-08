// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module;

import android.app.Activity;
import com.apptentive.android.sdk.Log;

public abstract class ActivityContent
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ABOUT;
        public static final Type INTERACTION;
        public static final Type MESSAGE_CENTER;
        public static final Type unknown;

        public static Type parse(String s)
        {
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            Type type1 = valueOf(s);
            return type1;
            IllegalArgumentException illegalargumentexception;
            illegalargumentexception;
            Log.v((new StringBuilder()).append("Error parsing unknown ActivityContent.Type: ").append(s).toString(), new Object[0]);
            return unknown;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/apptentive/android/sdk/module/ActivityContent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            ABOUT = new Type("ABOUT", 0);
            MESSAGE_CENTER = new Type("MESSAGE_CENTER", 1);
            INTERACTION = new Type("INTERACTION", 2);
            unknown = new Type("unknown", 3);
            $VALUES = (new Type[] {
                ABOUT, MESSAGE_CENTER, INTERACTION, unknown
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String KEY = "activityContent";
    protected Type type;

    public ActivityContent()
    {
    }

    public Type getType()
    {
        return type;
    }

    public abstract boolean onBackPressed(Activity activity);

    public abstract void onStop();

    public abstract void show(Activity activity);
}
