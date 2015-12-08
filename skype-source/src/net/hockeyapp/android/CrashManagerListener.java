// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


public abstract class CrashManagerListener
{
    public static final class CrashHandlingPolicy extends Enum
    {

        private static final CrashHandlingPolicy $VALUES[];
        public static final CrashHandlingPolicy ASK_USER;
        public static final CrashHandlingPolicy DO_NOTHING;
        public static final CrashHandlingPolicy SEND_SILENTLY;

        public static CrashHandlingPolicy valueOf(String s)
        {
            return (CrashHandlingPolicy)Enum.valueOf(net/hockeyapp/android/CrashManagerListener$CrashHandlingPolicy, s);
        }

        public static CrashHandlingPolicy[] values()
        {
            return (CrashHandlingPolicy[])$VALUES.clone();
        }

        static 
        {
            DO_NOTHING = new CrashHandlingPolicy("DO_NOTHING", 0);
            SEND_SILENTLY = new CrashHandlingPolicy("SEND_SILENTLY", 1);
            ASK_USER = new CrashHandlingPolicy("ASK_USER", 2);
            $VALUES = (new CrashHandlingPolicy[] {
                DO_NOTHING, SEND_SILENTLY, ASK_USER
            });
        }

        private CrashHandlingPolicy(String s, int i)
        {
            super(s, i);
        }
    }


    public CrashManagerListener()
    {
    }

    public String getContact()
    {
        return null;
    }

    public String getDescription()
    {
        return null;
    }

    public String getUserID()
    {
        return null;
    }

    public Boolean ignoreDefaultHandler()
    {
        return Boolean.valueOf(false);
    }

    public CrashHandlingPolicy onCrashesFound()
    {
        return CrashHandlingPolicy.SEND_SILENTLY;
    }

    public void onCrashesNotSent()
    {
    }

    public void onCrashesSent()
    {
    }
}
