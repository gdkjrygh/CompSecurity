// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            Settings

public static final class a extends Enum
{

    private static final CollegePhd $VALUES[];
    public static final CollegePhd CollegeBachelor;
    public static final CollegePhd CollegeMasters;
    public static final CollegePhd CollegePhd;
    public static final CollegePhd CollegeProfessional;
    public static final CollegePhd Highschool;
    public static final CollegePhd LessThanHighschool;
    public static final CollegePhd SomeCollege;
    public static final CollegePhd SomeHighschool;
    public static final CollegePhd Unknown;
    private String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$Education, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        Unknown = new <init>("Unknown", 0, "unknown");
        LessThanHighschool = new <init>("LessThanHighschool", 1, "less than highschool");
        SomeHighschool = new <init>("SomeHighschool", 2, "some highschool");
        Highschool = new <init>("Highschool", 3, "highschool");
        SomeCollege = new <init>("SomeCollege", 4, "some college");
        CollegeBachelor = new <init>("CollegeBachelor", 5, "college bachelor");
        CollegeMasters = new <init>("CollegeMasters", 6, "college masters");
        CollegeProfessional = new <init>("CollegeProfessional", 7, "college professional");
        CollegePhd = new <init>("CollegePhd", 8, "college phd");
        $VALUES = (new .VALUES[] {
            Unknown, LessThanHighschool, SomeHighschool, Highschool, SomeCollege, CollegeBachelor, CollegeMasters, CollegeProfessional, CollegePhd
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
