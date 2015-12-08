// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

public class MobileRunSavedState
{
    public static final class AudioCue extends Enum
    {

        public static final AudioCue a;
        public static final AudioCue b;
        public static final AudioCue c;
        public static final AudioCue d;
        public static final AudioCue e;
        private static final AudioCue f[];

        public static AudioCue valueOf(String s)
        {
            return (AudioCue)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$AudioCue, s);
        }

        public static AudioCue[] values()
        {
            return (AudioCue[])f.clone();
        }

        static 
        {
            a = new AudioCue("Distance", 0);
            b = new AudioCue("Time", 1);
            c = new AudioCue("AveragePace", 2);
            d = new AudioCue("SplitPace", 3);
            e = new AudioCue("CalorieBurned", 4);
            f = (new AudioCue[] {
                a, b, c, d, e
            });
        }

        private AudioCue(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class DistanceFrequency extends Enum
    {

        public static final DistanceFrequency a;
        public static final DistanceFrequency b;
        public static final DistanceFrequency c;
        public static final DistanceFrequency d;
        public static final DistanceFrequency e;
        public static final DistanceFrequency f;
        public static final DistanceFrequency g;
        private static final DistanceFrequency h[];
        private final double distance;

        public static DistanceFrequency valueOf(String s)
        {
            return (DistanceFrequency)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$DistanceFrequency, s);
        }

        public static DistanceFrequency[] values()
        {
            return (DistanceFrequency[])h.clone();
        }

        public double a()
        {
            return distance;
        }

        static 
        {
            a = new DistanceFrequency("Half", 0, 0.5D);
            b = new DistanceFrequency("One", 1, 1.0D);
            c = new DistanceFrequency("OneHalf", 2, 1.5D);
            d = new DistanceFrequency("Two", 3, 2D);
            e = new DistanceFrequency("Three", 4, 3D);
            f = new DistanceFrequency("Four", 5, 4D);
            g = new DistanceFrequency("Five", 6, 5D);
            h = (new DistanceFrequency[] {
                a, b, c, d, e, f, g
            });
        }

        private DistanceFrequency(String s, int k, double d1)
        {
            super(s, k);
            distance = d1;
        }
    }

    public static final class FrequencyType extends Enum
    {

        public static final FrequencyType a;
        public static final FrequencyType b;
        private static final FrequencyType c[];

        public static FrequencyType valueOf(String s)
        {
            return (FrequencyType)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$FrequencyType, s);
        }

        public static FrequencyType[] values()
        {
            return (FrequencyType[])c.clone();
        }

        static 
        {
            a = new FrequencyType("Distance", 0);
            b = new FrequencyType("Time", 1);
            c = (new FrequencyType[] {
                a, b
            });
        }

        private FrequencyType(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class TimeFrequency extends Enum
    {

        public static final TimeFrequency a;
        public static final TimeFrequency b;
        public static final TimeFrequency c;
        public static final TimeFrequency d;
        public static final TimeFrequency e;
        public static final TimeFrequency f;
        public static final TimeFrequency g;
        public static final TimeFrequency h;
        public static final TimeFrequency i;
        private static final TimeFrequency j[];
        private final int time;

        public static TimeFrequency valueOf(String s)
        {
            return (TimeFrequency)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$TimeFrequency, s);
        }

        public static TimeFrequency[] values()
        {
            return (TimeFrequency[])j.clone();
        }

        public long a(TimeUnit timeunit)
        {
            return timeunit.convert(time, TimeUnit.MINUTES);
        }

        static 
        {
            a = new TimeFrequency("Two", 0, 2);
            b = new TimeFrequency("Three", 1, 3);
            c = new TimeFrequency("Four", 2, 4);
            d = new TimeFrequency("Five", 3, 5);
            e = new TimeFrequency("Ten", 4, 10);
            f = new TimeFrequency("Fifteen", 5, 15);
            g = new TimeFrequency("Twenty", 6, 20);
            h = new TimeFrequency("TwentyFive", 7, 25);
            i = new TimeFrequency("Thirty", 8, 30);
            j = (new TimeFrequency[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private TimeFrequency(String s, int k, int l)
        {
            super(s, k);
            time = l;
        }
    }

    public static final class TrackType extends Enum
    {

        public static final TrackType a;
        public static final TrackType b;
        public static final TrackType c;
        public static final TrackType d;
        private static final TrackType e[];

        public static TrackType valueOf(String s)
        {
            return (TrackType)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$TrackType, s);
        }

        public static TrackType[] values()
        {
            return (TrackType[])e.clone();
        }

        static 
        {
            a = new TrackType("Run", 0);
            b = new TrackType("Walk", 1);
            c = new TrackType("Hike", 2);
            d = new TrackType("Bike", 3);
            e = (new TrackType[] {
                a, b, c, d
            });
        }

        private TrackType(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class VolumeSetting extends Enum
    {

        public static final VolumeSetting a;
        public static final VolumeSetting b;
        public static final VolumeSetting c;
        public static final VolumeSetting d;
        private static final VolumeSetting e[];
        private final float volume;

        public static VolumeSetting valueOf(String s)
        {
            return (VolumeSetting)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$VolumeSetting, s);
        }

        public static VolumeSetting[] values()
        {
            return (VolumeSetting[])e.clone();
        }

        public float a()
        {
            return volume;
        }

        static 
        {
            a = new VolumeSetting("Low", 0, 0.2F);
            b = new VolumeSetting("Medium", 1, 0.4F);
            c = new VolumeSetting("Normal", 2, 0.6F);
            d = new VolumeSetting("High", 3, 0.8F);
            e = (new VolumeSetting[] {
                a, b, c, d
            });
        }

        private VolumeSetting(String s, int k, float f1)
        {
            super(s, k);
            volume = f1;
        }
    }


    public static final float a = 0.8F;
    private static final String b = "voiceCues";
    private static final String c = "volume";
    private static final String d = "volumeSetting";
    private static final String e = "cues";
    private static final String f = "frequency";
    private static final String g = "frequencyType";
    private static final String h = "trackType";
    private static final String i[] = {
        "voiceCues", "volume", "volumeSetting", "cues", "frequency", "frequencyType", "trackType"
    };

    public MobileRunSavedState()
    {
    }

    public static void a()
    {
        android.content.SharedPreferences.Editor editor = j();
        String as[] = i;
        int l = as.length;
        for (int k = 0; k < l; k++)
        {
            editor.remove(as[k]);
        }

        editor.apply();
    }

    public static void a(DistanceFrequency distancefrequency)
    {
        j().putString("frequency", distancefrequency.name()).apply();
    }

    public static void a(FrequencyType frequencytype)
    {
        j().putString("frequencyType", frequencytype.name()).apply();
    }

    public static void a(TimeFrequency timefrequency)
    {
        j().putString("frequency", timefrequency.name()).apply();
    }

    public static void a(TrackType tracktype)
    {
        j().putString("trackType", tracktype.name()).apply();
    }

    public static void a(EnumSet enumset)
    {
        enumset = TextUtils.join(",", enumset);
        j().putString("cues", enumset).apply();
    }

    public static void a(boolean flag)
    {
        j().putBoolean("voiceCues", flag).apply();
    }

    public static TrackType b()
    {
        Object obj = i().getString("trackType", TrackType.a.name());
        try
        {
            obj = TrackType.valueOf(((String) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return TrackType.a;
        }
        return ((TrackType) (obj));
    }

    public static FrequencyType c()
    {
        FrequencyType frequencytype1 = null;
        String s = i().getString("frequencyType", "");
        FrequencyType frequencytype = frequencytype1;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                frequencytype = FrequencyType.valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                illegalargumentexception = frequencytype1;
            }
        }
        frequencytype1 = frequencytype;
        if (frequencytype == null)
        {
            frequencytype1 = FrequencyType.a;
            a(frequencytype1);
        }
        return frequencytype1;
    }

    public static DistanceFrequency d()
    {
        String s = i().getString("frequency", "");
        if (s.isEmpty())
        {
            a(DistanceFrequency.b);
            return DistanceFrequency.b;
        } else
        {
            return DistanceFrequency.valueOf(s);
        }
    }

    public static TimeFrequency e()
    {
        String s = i().getString("frequency", "");
        if (s.isEmpty())
        {
            a(TimeFrequency.a);
            return TimeFrequency.a;
        } else
        {
            return TimeFrequency.valueOf(s);
        }
    }

    public static long f()
    {
        FrequencyType frequencytype = c();
        if (frequencytype == null)
        {
            return 0L;
        }
        if (frequencytype == FrequencyType.a)
        {
            Profile profile = an.a().b();
            return Math.round((new Length(d().a(), profile.t())).a(com.fitbit.data.domain.Length.LengthUnits.METERS).b());
        } else
        {
            return e().a(TimeUnit.MILLISECONDS);
        }
    }

    public static EnumSet g()
    {
        String s = i().getString("cues", "");
        EnumSet enumset1 = EnumSet.noneOf(com/fitbit/savedstate/MobileRunSavedState$AudioCue);
        String as[] = s.split(",");
        int l = as.length;
        int k = 0;
        while (k < l) 
        {
            String s1 = as[k];
            EnumSet enumset;
            try
            {
                enumset1.add(AudioCue.valueOf(s1));
            }
            catch (IllegalArgumentException illegalargumentexception) { }
            k++;
        }
        enumset = enumset1;
        if (enumset1.isEmpty())
        {
            enumset = EnumSet.of(AudioCue.a, AudioCue.b, AudioCue.c);
            a(enumset);
        }
        return enumset;
    }

    public static boolean h()
    {
        return i().getBoolean("voiceCues", false);
    }

    private static SharedPreferences i()
    {
        return PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
    }

    private static android.content.SharedPreferences.Editor j()
    {
        return i().edit();
    }

}
