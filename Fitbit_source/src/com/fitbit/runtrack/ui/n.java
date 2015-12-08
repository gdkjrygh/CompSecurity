// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLevel;
import com.fitbit.data.domain.Length;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.util.format.DistanceDecimalFormat;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            i

public class n extends i
{

    private static final String a = "!ACTIVITY_NAME";
    private static final String b = "!TYPE";
    private static final String c = "!DISTANCE";
    private static final String d = "!ELAPSED_TIME";
    private static final String e = "!COMPLETED";
    private static final String f = "!AUDIO_CUES_ON";
    private static final String g = "!AUDIO_CUES_VOLUME";
    private static final String h = "!AUDIO_CUES_FREQUENCY";
    private static final String i = "!AUDIO_CUES_CONTENT";
    private static final String j = "!INTENSITY";
    private static final String k = "Runs Tracked";
    private static final String l = "Walks Tracked";
    private static final String m = "Hikes Tracked";
    private final boolean n;

    public n(boolean flag)
    {
        super("Exercise: Track Exercise");
        n = flag;
        b(flag);
    }

    private n b(boolean flag)
    {
        a("!COMPLETED", Boolean.toString(flag));
        return this;
    }

    public n a()
    {
        a("!TYPE", "Live");
        return this;
    }

    public n a(float f1)
    {
        a("!AUDIO_CUES_VOLUME", String.format("%s%%", new Object[] {
            Float.valueOf(100F * f1)
        }));
        return this;
    }

    public n a(ActivityItem activityitem)
    {
        a("!ACTIVITY_NAME", activityitem.a());
        return this;
    }

    public n a(ActivityLevel activitylevel)
    {
        a("!INTENSITY", activitylevel.d());
        return this;
    }

    public n a(Length length)
    {
        if (length != null)
        {
            length = length.a(com.fitbit.data.domain.Length.LengthUnits.METERS);
            DistanceDecimalFormat distancedecimalformat = new DistanceDecimalFormat((com.fitbit.data.domain.Length.LengthUnits)length.a());
            distancedecimalformat.setMaximumFractionDigits(1);
            a("!DISTANCE", distancedecimalformat.format(length.b()));
        }
        return this;
    }

    public n a(Duration duration)
    {
        if (duration != null)
        {
            a("!ELAPSED_TIME", String.format("%s:%02d", new Object[] {
                Long.valueOf(duration.a()), Integer.valueOf(duration.f())
            }));
        }
        return this;
    }

    public n a(SupportedActivity supportedactivity)
    {
    /* anonymous class not found */
    class _anm1 {}

        _cls1.a[supportedactivity.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 38
    //                   2 61
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        return this;
_L2:
        a("!ACTIVITY_NAME", "Hike");
        if (n)
        {
            a("Hikes Tracked");
            return this;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a("!ACTIVITY_NAME", "Run");
        if (n)
        {
            a("Runs Tracked");
            return this;
        }
        if (true) goto _L1; else goto _L4
_L4:
        a("!ACTIVITY_NAME", "Walk");
        if (n)
        {
            a("Walks Tracked");
            return this;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public n a(com.fitbit.savedstate.MobileRunSavedState.DistanceFrequency distancefrequency, com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        if (distancefrequency != null && lengthunits != null)
        {
            distancefrequency = (new Length(distancefrequency.a(), lengthunits)).a(com.fitbit.data.domain.Length.LengthUnits.METERS);
            lengthunits = new DistanceDecimalFormat(com.fitbit.data.domain.Length.LengthUnits.METERS);
            lengthunits.setMaximumFractionDigits(1);
            a("!AUDIO_CUES_FREQUENCY", lengthunits.format(distancefrequency.b()));
        }
        return this;
    }

    public n a(com.fitbit.savedstate.MobileRunSavedState.TimeFrequency timefrequency)
    {
        if (timefrequency != null)
        {
            a("!AUDIO_CUES_FREQUENCY", String.format("%s minutes", new Object[] {
                Long.valueOf(timefrequency.a(TimeUnit.MINUTES))
            }));
        }
        return this;
    }

    public n a(boolean flag)
    {
        a("!AUDIO_CUES_ON", Boolean.toString(flag));
        return this;
    }

    public transient n a(com.fitbit.savedstate.MobileRunSavedState.AudioCue aaudiocue[])
    {
        HashSet hashset;
        int i1;
        int j1;
        hashset = new HashSet();
        j1 = aaudiocue.length;
        i1 = 0;
_L8:
        com.fitbit.savedstate.MobileRunSavedState.AudioCue audiocue;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        audiocue = aaudiocue[i1];
        _cls1.b[audiocue.ordinal()];
        JVM INSTR tableswitch 1 5: default 68
    //                   1 77
    //                   2 89
    //                   3 101
    //                   4 113
    //                   5 125;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_125;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L9:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
        hashset.add("Average Pace");
          goto _L9
_L3:
        hashset.add("Calories Burned");
          goto _L9
_L4:
        hashset.add("Distance");
          goto _L9
_L5:
        hashset.add("Time");
          goto _L9
        hashset.add("Split Pace");
          goto _L9
        a("!AUDIO_CUES_CONTENT", ((java.util.List) (new LinkedList(hashset))));
        return this;
    }

    public n b()
    {
        a("!TYPE", "Previous");
        return this;
    }
}
