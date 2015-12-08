// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventMetadata

final class SessionEvent
{
    static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type CRASH;
        public static final Type CREATE;
        public static final Type DESTROY;
        public static final Type ERROR;
        public static final Type INSTALL;
        public static final Type PAUSE;
        public static final Type RESUME;
        public static final Type SAVE_INSTANCE_STATE;
        public static final Type START;
        public static final Type STOP;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            CREATE = new Type("CREATE", 0);
            START = new Type("START", 1);
            RESUME = new Type("RESUME", 2);
            SAVE_INSTANCE_STATE = new Type("SAVE_INSTANCE_STATE", 3);
            PAUSE = new Type("PAUSE", 4);
            STOP = new Type("STOP", 5);
            DESTROY = new Type("DESTROY", 6);
            ERROR = new Type("ERROR", 7);
            CRASH = new Type("CRASH", 8);
            INSTALL = new Type("INSTALL", 9);
            $VALUES = (new Type[] {
                CREATE, START, RESUME, SAVE_INSTANCE_STATE, PAUSE, STOP, DESTROY, ERROR, CRASH, INSTALL
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public final Map details;
    public final SessionEventMetadata sessionEventMetadata;
    private String stringRepresentation;
    public final long timestamp;
    public final Type type;

    private SessionEvent(SessionEventMetadata sessioneventmetadata, long l, Type type1, Map map)
    {
        sessionEventMetadata = sessioneventmetadata;
        timestamp = l;
        type = type1;
        details = map;
    }

    public static SessionEvent buildActivityLifecycleEvent(SessionEventMetadata sessioneventmetadata, Type type1, Activity activity)
    {
        return buildEvent(sessioneventmetadata, type1, Collections.singletonMap("activity", activity.getClass().getName()));
    }

    public static SessionEvent buildCrashEvent(SessionEventMetadata sessioneventmetadata, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return buildEvent(sessioneventmetadata, Type.CRASH, s);
    }

    public static SessionEvent buildErrorEvent(SessionEventMetadata sessioneventmetadata, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return buildEvent(sessioneventmetadata, Type.ERROR, s);
    }

    public static SessionEvent buildEvent(SessionEventMetadata sessioneventmetadata, Type type1, Map map)
    {
        return new SessionEvent(sessioneventmetadata, System.currentTimeMillis(), type1, map);
    }

    public String toString()
    {
        if (stringRepresentation == null)
        {
            stringRepresentation = (new StringBuilder()).append("[").append(getClass().getSimpleName()).append(": appBundleId=").append(sessionEventMetadata.appBundleId).append(", executionId=").append(sessionEventMetadata.executionId).append(", installationId=").append(sessionEventMetadata.installationId).append(", androidId=").append(sessionEventMetadata.androidId).append(", advertisingId=").append(sessionEventMetadata.advertisingId).append(", betaDeviceToken=").append(sessionEventMetadata.betaDeviceToken).append(", buildId=").append(sessionEventMetadata.buildId).append(", osVersion=").append(sessionEventMetadata.osVersion).append(", deviceModel=").append(sessionEventMetadata.deviceModel).append(", appVersionCode=").append(sessionEventMetadata.appVersionCode).append(", appVersionName=").append(sessionEventMetadata.appVersionName).append(", timestamp=").append(timestamp).append(", type=").append(type).append(", details=").append(details.toString()).append("]").toString();
        }
        return stringRepresentation;
    }
}
