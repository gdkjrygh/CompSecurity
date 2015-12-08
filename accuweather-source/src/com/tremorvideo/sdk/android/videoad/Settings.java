// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Settings
{
    public static final class Education extends Enum
    {

        private static final Education $VALUES[];
        public static final Education CollegeBachelor;
        public static final Education CollegeMasters;
        public static final Education CollegePhd;
        public static final Education CollegeProfessional;
        public static final Education Highschool;
        public static final Education LessThanHighschool;
        public static final Education SomeCollege;
        public static final Education SomeHighschool;
        public static final Education Unknown;
        private String a;

        public static Education valueOf(String s)
        {
            return (Education)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$Education, s);
        }

        public static Education[] values()
        {
            return (Education[])$VALUES.clone();
        }

        public String toString()
        {
            return a;
        }

        static 
        {
            Unknown = new Education("Unknown", 0, "unknown");
            LessThanHighschool = new Education("LessThanHighschool", 1, "less than highschool");
            SomeHighschool = new Education("SomeHighschool", 2, "some highschool");
            Highschool = new Education("Highschool", 3, "highschool");
            SomeCollege = new Education("SomeCollege", 4, "some college");
            CollegeBachelor = new Education("CollegeBachelor", 5, "college bachelor");
            CollegeMasters = new Education("CollegeMasters", 6, "college masters");
            CollegeProfessional = new Education("CollegeProfessional", 7, "college professional");
            CollegePhd = new Education("CollegePhd", 8, "college phd");
            $VALUES = (new Education[] {
                Unknown, LessThanHighschool, SomeHighschool, Highschool, SomeCollege, CollegeBachelor, CollegeMasters, CollegeProfessional, CollegePhd
            });
        }

        private Education(String s, int i, String s1)
        {
            super(s, i);
            a = s1;
        }
    }

    public static final class Gender extends Enum
    {

        private static final Gender $VALUES[];
        public static final Gender Felmale;
        public static final Gender Male;
        public static final Gender Unknown;
        private String a;

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$Gender, s);
        }

        public static Gender[] values()
        {
            return (Gender[])$VALUES.clone();
        }

        public String toString()
        {
            return a;
        }

        static 
        {
            Unknown = new Gender("Unknown", 0, "unknown");
            Male = new Gender("Male", 1, "m");
            Felmale = new Gender("Felmale", 2, "f");
            $VALUES = (new Gender[] {
                Unknown, Male, Felmale
            });
        }

        private Gender(String s, int i, String s1)
        {
            super(s, i);
            a = s1;
        }
    }

    public static final class IncomeRange extends Enum
    {

        private static final IncomeRange $VALUES[];
        public static final IncomeRange Above250K;
        public static final IncomeRange Between100KAnd150K;
        public static final IncomeRange Between150KAnd200K;
        public static final IncomeRange Between200KAnd250K;
        public static final IncomeRange Between25KAnd50K;
        public static final IncomeRange Between50KAnd75K;
        public static final IncomeRange Between75KAnd100K;
        public static final IncomeRange LessThan25K;
        public static final IncomeRange Unknown;
        private String a;

        public static IncomeRange valueOf(String s)
        {
            return (IncomeRange)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$IncomeRange, s);
        }

        public static IncomeRange[] values()
        {
            return (IncomeRange[])$VALUES.clone();
        }

        public String toString()
        {
            return a;
        }

        static 
        {
            Unknown = new IncomeRange("Unknown", 0, "unknown");
            LessThan25K = new IncomeRange("LessThan25K", 1, "0-25");
            Between25KAnd50K = new IncomeRange("Between25KAnd50K", 2, "25-50");
            Between50KAnd75K = new IncomeRange("Between50KAnd75K", 3, "50-75");
            Between75KAnd100K = new IncomeRange("Between75KAnd100K", 4, "75-100");
            Between100KAnd150K = new IncomeRange("Between100KAnd150K", 5, "100-150");
            Between150KAnd200K = new IncomeRange("Between150KAnd200K", 6, "150-200");
            Between200KAnd250K = new IncomeRange("Between200KAnd250K", 7, "200-250");
            Above250K = new IncomeRange("Above250K", 8, "250+");
            $VALUES = (new IncomeRange[] {
                Unknown, LessThan25K, Between25KAnd50K, Between50KAnd75K, Between75KAnd100K, Between100KAnd150K, Between150KAnd200K, Between200KAnd250K, Above250K
            });
        }

        private IncomeRange(String s, int i, String s1)
        {
            super(s, i);
            a = s1;
        }
    }

    public static final class PreferredOrientation extends Enum
    {

        private static final PreferredOrientation $VALUES[];
        public static final PreferredOrientation Any;
        public static final PreferredOrientation Landscape;
        public static final PreferredOrientation Portraite;

        public static PreferredOrientation valueOf(String s)
        {
            return (PreferredOrientation)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$PreferredOrientation, s);
        }

        public static PreferredOrientation[] values()
        {
            return (PreferredOrientation[])$VALUES.clone();
        }

        static 
        {
            Any = new PreferredOrientation("Any", 0);
            Landscape = new PreferredOrientation("Landscape", 1);
            Portraite = new PreferredOrientation("Portraite", 2);
            $VALUES = (new PreferredOrientation[] {
                Any, Landscape, Portraite
            });
        }

        private PreferredOrientation(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Race extends Enum
    {

        private static final Race $VALUES[];
        public static final Race AlaskaNative;
        public static final Race AmericanIndian;
        public static final Race Asian;
        public static final Race Black;
        public static final Race Hispanic;
        public static final Race NativeHawaiian;
        public static final Race Other;
        public static final Race PacificIslander;
        public static final Race Unknown;
        public static final Race White;
        private String a;

        public static Race valueOf(String s)
        {
            return (Race)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$Race, s);
        }

        public static Race[] values()
        {
            return (Race[])$VALUES.clone();
        }

        public String toString()
        {
            return a;
        }

        static 
        {
            Unknown = new Race("Unknown", 0, "unknown");
            Asian = new Race("Asian", 1, "asian");
            White = new Race("White", 2, "white");
            Black = new Race("Black", 3, "black");
            Hispanic = new Race("Hispanic", 4, "hispanic");
            AmericanIndian = new Race("AmericanIndian", 5, "american indian");
            AlaskaNative = new Race("AlaskaNative", 6, "alaska native");
            NativeHawaiian = new Race("NativeHawaiian", 7, "native hawaiian");
            PacificIslander = new Race("PacificIslander", 8, "pacific islander");
            Other = new Race("Other", 9, "other");
            $VALUES = (new Race[] {
                Unknown, Asian, White, Black, Hispanic, AmericanIndian, AlaskaNative, NativeHawaiian, PacificIslander, Other
            });
        }

        private Race(String s, int i, String s1)
        {
            super(s, i);
            a = s1;
        }
    }


    public List adBlocks;
    public ArrayList category;
    public String contentDescription;
    public String contentID;
    public String contentTitle;
    public int maxAdTimeSeconds;
    public Map misc;
    public String policyID;
    public PreferredOrientation preferredOrientation;
    public int userAge;
    public String userCountry;
    public Education userEducation;
    public Gender userGender;
    public IncomeRange userIncomeRange;
    public List userInterests;
    public String userLanguage;
    public double userLatitude;
    public double userLongitude;
    public Race userRace;
    public String userZip;

    public Settings()
    {
        userAge = 0;
        userGender = Gender.Unknown;
        userLanguage = Locale.getDefault().getISO3Language();
        userCountry = Locale.getDefault().getISO3Country();
        userZip = "";
        userLongitude = 0.0D;
        userLatitude = 0.0D;
        userIncomeRange = IncomeRange.Unknown;
        userEducation = Education.Unknown;
        userRace = Race.Unknown;
        userInterests = new ArrayList();
        misc = new HashMap();
        preferredOrientation = PreferredOrientation.Any;
        policyID = "";
        category = new ArrayList();
        maxAdTimeSeconds = 0;
        contentID = "";
        contentTitle = "";
        contentDescription = "";
        adBlocks = new ArrayList();
    }

    public Settings(Settings settings)
    {
        userAge = settings.userAge;
        userGender = settings.userGender;
        userLanguage = settings.userLanguage;
        userCountry = settings.userCountry;
        userZip = settings.userZip;
        userLongitude = settings.userLongitude;
        userLatitude = settings.userLatitude;
        userIncomeRange = settings.userIncomeRange;
        userEducation = settings.userEducation;
        userRace = settings.userRace;
        userInterests = new ArrayList(settings.userInterests);
        misc = new HashMap(settings.misc);
        Locale locale = new Locale(userLanguage, userCountry);
        userLanguage = locale.getISO3Language();
        userCountry = locale.getISO3Country();
        policyID = settings.policyID;
        category = new ArrayList(settings.category);
        preferredOrientation = settings.preferredOrientation;
        maxAdTimeSeconds = settings.maxAdTimeSeconds;
        contentID = settings.contentID;
        contentTitle = settings.contentTitle;
        contentDescription = settings.contentDescription;
        adBlocks = new ArrayList(settings.adBlocks);
    }
}
